package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.x9;
import org.telegram.ui.bn;
import org.telegram.ui.q4;
import v4.p;
public final class k extends Dialog {
    public final j E;
    public final l F;
    public final int f62039a;
    public final int f62040b;
    public final Drawable f62041c;
    public final TextView d;
    public final TextView f62042e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f62043f;
    public final hg0 h;
    public final i f62044n;
    public TLRPC.TL_chatInviteImporter f62045r;
    public ValueAnimator f62046s;
    public q9 f62047w;
    public BitmapDrawable f62048x;
    public float f62049y;

    public k(l lVar, Activity activity, ek0 ek0Var, h6 h6Var, boolean z10) {
        super(activity, 2131755353);
        int i7;
        this.F = lVar;
        Drawable mutate = getContext().getResources().getDrawable(2131232567).mutate();
        this.f62041c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f62042e = textView2;
        j jVar = new j(this, getContext());
        this.E = jVar;
        setCancelable(true);
        jVar.setVisibility(4);
        int i10 = m6.G8;
        g2 g2Var = lVar.f62055g;
        m6.w0(i10, g2Var.getResourceProvider());
        t6.x(jVar, mutate, i10, g2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(jVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f62039a = rect.top;
        this.f62040b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, h6Var);
        this.f62043f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        t6.h(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, g2Var.getResourceProvider());
        jVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f62044n = q4Var;
        hg0 hg0Var = new hg0(activity, g2Var.getActionBar(), ek0Var, q4Var);
        this.h = hg0Var;
        hg0Var.setCreateThumbFromParent(true);
        jVar.addView(hg0Var);
        q4Var.setProfileGalleryView(hg0Var);
        jVar.addView(q4Var);
        textView.setMaxLines(1);
        t6.U(textView, m6.G6, g2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        jVar.addView(textView);
        t6.U(textView2, m6.f29770y6, g2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        jVar.addView(textView2);
        y0 y0Var = new y0(0, activity, h6Var, true, false);
        int i11 = m6.E8;
        int i12 = m6.F8;
        y0Var.c(i11, i12);
        int i13 = m6.I5;
        y0Var.h(1.0f, i13);
        if (z10) {
            i7 = 2131754375;
        } else {
            i7 = 2131754370;
        }
        y0Var.j(gd.N0(i7, null), 2131232342, null);
        y0Var.setOnClickListener(new View.OnClickListener(this) {
            public final k f62034b;

            {
                this.f62034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f62034b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f62045r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f62066s.e(false);
                        lVar2.f62065r = null;
                        return;
                    case 1:
                        k.a(this.f62034b);
                        return;
                    default:
                        k kVar2 = this.f62034b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f62045r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f62066s.e(false);
                        lVar3.f62065r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
        y0 y0Var2 = new y0(0, activity, h6Var, false, false);
        y0Var2.c(i11, i12);
        y0Var2.h(1.0f, i13);
        y0Var2.j(gd.N0(2131745405, null), 2131232257, null);
        y0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k f62034b;

            {
                this.f62034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f62034b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f62045r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f62066s.e(false);
                        lVar2.f62065r = null;
                        return;
                    case 1:
                        k.a(this.f62034b);
                        return;
                    default:
                        k kVar2 = this.f62034b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f62045r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f62066s.e(false);
                        lVar3.f62065r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
        y0 y0Var3 = new y0(0, activity, h6Var, false, true);
        y0Var3.c(m6.f29619q7, m6.f29599p7);
        y0Var3.h(1.0f, i13);
        y0Var3.j(gd.N0(2131751356, null), 2131232330, null);
        y0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final k f62034b;

            {
                this.f62034b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f62034b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f62045r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f62066s.e(false);
                        lVar2.f62065r = null;
                        return;
                    case 1:
                        k.a(this.f62034b);
                        return;
                    default:
                        k kVar2 = this.f62034b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f62045r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f62066s.e(false);
                        lVar3.f62065r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
    }

    public static void a(k kVar) {
        l lVar = kVar.F;
        if (kVar.f62045r != null) {
            lVar.f62051b = true;
            g2 g2Var = lVar.f62055g;
            super.dismiss();
            g2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", kVar.f62045r.user_id);
            g2Var.presentFragment(new bn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + g0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f62042e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + g0.L(4.0f);
        }
        return this.f62043f.getMeasuredHeight() + g0.L(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f62046s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.f62047w.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        hg0 hg0Var = this.h;
        float width = (this.f62047w.getWidth() * 1.0f) / hg0Var.getMeasuredWidth();
        float width2 = (this.f62047w.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        float left = iArr[0] - (hg0Var.getLeft() + ((int) ((hg0Var.getMeasuredWidth() * f12) / 2.0f)));
        float top = iArr[1] - (hg0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        int i7 = (-this.f62043f.getTop()) / 2;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f62046s = ofFloat;
        ofFloat.addUpdateListener(new x9(this, width, left, top, width2, i7, 1));
        this.f62046s.addListener(new dl0(this, z10, width, 1));
        this.f62046s.setDuration(220L);
        this.f62046s.setInterpolator(nr.f37956f);
        this.f62046s.start();
    }

    public final void f() {
        int i7;
        BitmapDrawable bitmapDrawable = this.f62048x;
        if (bitmapDrawable != null) {
            i7 = bitmapDrawable.getAlpha();
        } else {
            i7 = 255;
        }
        Resources resources = getContext().getResources();
        j jVar = this.E;
        int measuredWidth = (int) (jVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (jVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        g2 g2Var = this.F.f62055g;
        ((LaunchActivity) g2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = g2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f62048x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i7);
        getWindow().setBackgroundDrawable(this.f62048x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(2131755178);
        setContentView(this.E, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.flags = i7;
        attributes.gravity = 51;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i7 | (-2147417856);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        g0.h3(new p(this, 15), 80L);
    }
}
