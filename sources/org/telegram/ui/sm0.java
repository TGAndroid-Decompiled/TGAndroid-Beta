package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class sm0 extends org.telegram.ui.ActionBar.f2 {
    public Bitmap f49892a;
    public BitmapDrawable f49893b;
    public rm0 f49894c;
    public qm0 d;
    public boolean f49895e;
    public boolean f49896f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.E(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.G(-1, false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751698, null));
        this.actionBar.setActionBarMenuOnItemClick(new xx(this, 23));
        this.actionBar.s().h(1, 2131231242, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.id.M0(2131751354, null));
        qm0 qm0Var = new qm0(this, context);
        this.d = qm0Var;
        this.fragmentView = qm0Var;
        qm0Var.G = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int max;
        if (this.f49892a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !a8.p0.B(string)) {
                return false;
            }
            if (org.telegram.messenger.g0.Q1()) {
                max = org.telegram.messenger.g0.L(520.0f);
            } else {
                Point point = org.telegram.messenger.g0.f22567q;
                max = Math.max(point.x, point.y);
            }
            float f10 = max;
            Bitmap K = org.telegram.messenger.gc.K(string, uri, f10, f10, true);
            this.f49892a = K;
            if (K == null) {
                return false;
            }
        }
        this.f49893b = new BitmapDrawable(this.f49892a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f49892a;
        if (bitmap != null && !this.f49895e) {
            bitmap.recycle();
            this.f49892a = null;
        }
        this.f49893b = null;
    }
}
