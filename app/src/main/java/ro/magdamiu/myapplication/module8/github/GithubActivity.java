package ro.magdamiu.myapplication.module8.github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import ro.magdamiu.myapplication.R;
import ro.magdamiu.myapplication.utils.Logging;

public class GithubActivity extends AppCompatActivity {

    private UsersRepository mUsersRepository;

    private TextView mTextViewGithubUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        mTextViewGithubUser = findViewById(R.id.text_view_github_users);

        mUsersRepository = UsersRepository.getInstance();

        mUsersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> users) {
                Logging.show(getString(R.string.github_users), users.toString());
                for (User user : users) {
                    mTextViewGithubUser.append(user.toString() + " ");
                }
            }

            @Override
            public void onError() {
                Logging.show(getString(R.string.error_github), getString(R.string.check_code));
                mTextViewGithubUser.setText(getString(R.string.check_code));
            }
        });
    }
}
