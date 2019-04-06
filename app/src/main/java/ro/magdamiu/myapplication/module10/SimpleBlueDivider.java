package ro.magdamiu.myapplication.module10;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import ro.magdamiu.myapplication.R;

public class SimpleBlueDivider extends RecyclerView.ItemDecoration {
    private Drawable mDivider;

    public SimpleBlueDivider(Context context) {
        mDivider = context.getResources().getDrawable(R.drawable.divider_blue);
    }

    @Override
    public void onDrawOver(Canvas canvas, RecyclerView parent,
                           RecyclerView.State state) {

        int dividerLeft = parent.getPaddingLeft();
        int dividerRight = parent.getWidth() - parent.getPaddingRight();

        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int dividerTop = child.getBottom() + params.bottomMargin;
            int dividerBottom = dividerTop + mDivider.getIntrinsicHeight();

            mDivider.setBounds(dividerLeft, dividerTop, dividerRight, dividerBottom);
            mDivider.draw(canvas);
        }
    }
}
