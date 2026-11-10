package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class rm extends TextView implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.y f49444a;
    public int f49445b;
    public boolean f49446c;
    public final cn d;

    public rm(cn cnVar, Activity activity) {
        super(activity);
        this.d = cnVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.Gi, cnVar.getResourceProvider());
        int themedColor = cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.Ci);
        this.f49445b = themedColor;
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(themedColor, 16.0f);
        this.f49444a = e10;
        setBackground(e10);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.g0.o());
        setGravity(17);
        setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), (int) (org.telegram.messenger.g0.f22567q.x * 0.45f)), Integer.MIN_VALUE), i10);
    }

    @Override
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.m6.Ci);
            if (themedColor == this.f49445b && this.f49446c == org.telegram.ui.ActionBar.m6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.f49444a;
            if (background == yVar) {
                this.f49446c = org.telegram.ui.ActionBar.m6.I.q();
                org.telegram.ui.ActionBar.m6.H1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.m6.H1(yVar, org.telegram.ui.ActionBar.b6.b(themedColor), true);
                this.f49445b = themedColor;
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
