package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class wx extends ScrollView {
    public final int f42500a;

    public wx(Context context, int i10) {
        super(context);
        this.f42500a = i10;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f42500a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i11), Math.min(AndroidUtilities.displaySize.y * 0.35f, AndroidUtilities.dp(400.0f))), View.MeasureSpec.getMode(i11)));
                return;
            case 1:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                return;
        }
    }

    @Override
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.f42500a) {
            case 1:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f42500a) {
            case 1:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = AndroidUtilities.dp(20.0f) + rect.top;
                rect.bottom = AndroidUtilities.dp(50.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }
}
