package yh;

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
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.f9;
import org.telegram.ui.cn;
import org.telegram.ui.q4;
import wg.a0;
public final class l extends Dialog {
    public final k D;
    public final m E;
    public final int f59541a;
    public final int f59542b;
    public final Drawable f59543c;
    public final TextView d;
    public final TextView f59544e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f59545f;
    public final tf0 h;
    public final j f59546n;
    public TLRPC.TL_chatInviteImporter f59547r;
    public ValueAnimator f59548s;
    public l9 f59549w;
    public BitmapDrawable f59550x;
    public float f59551y;

    public l(m mVar, Activity activity, qj0 qj0Var, g6 g6Var, boolean z9) {
        super(activity, 2131755353);
        int i7;
        this.E = mVar;
        Drawable mutate = getContext().getResources().getDrawable(2131232565).mutate();
        this.f59543c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f59544e = textView2;
        k kVar = new k(this, getContext());
        this.D = kVar;
        setCancelable(true);
        kVar.setVisibility(4);
        int i10 = l6.G8;
        f2 f2Var = mVar.f59557g;
        l6.w0(i10, f2Var.getResourceProvider());
        s6.x(kVar, mutate, i10, f2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(kVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f59541a = rect.top;
        this.f59542b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, g6Var);
        this.f59545f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        s6.h(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, f2Var.getResourceProvider());
        kVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f59546n = q4Var;
        tf0 tf0Var = new tf0(activity, f2Var.getActionBar(), qj0Var, q4Var);
        this.h = tf0Var;
        tf0Var.setCreateThumbFromParent(true);
        kVar.addView(tf0Var);
        q4Var.setProfileGalleryView(tf0Var);
        kVar.addView(q4Var);
        textView.setMaxLines(1);
        s6.U(textView, l6.G6, f2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        kVar.addView(textView);
        s6.U(textView2, l6.f28257y6, f2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        kVar.addView(textView2);
        z0 z0Var = new z0(0, activity, g6Var, true, false);
        int i11 = l6.E8;
        int i12 = l6.F8;
        z0Var.c(i11, i12);
        int i13 = l6.I5;
        z0Var.h(1.0f, i13);
        if (z9) {
            i7 = 2131754378;
        } else {
            i7 = 2131754373;
        }
        z0Var.j(id.M0(i7, null), 2131232340, null);
        z0Var.setOnClickListener(new View.OnClickListener(this) {
            public final l f59536b;

            {
                this.f59536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l lVar = this.f59536b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f59547r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.f59568s.e(false);
                        mVar2.f59567r = null;
                        return;
                    case 1:
                        l.a(this.f59536b);
                        return;
                    default:
                        l lVar2 = this.f59536b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.f59547r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.f59568s.e(false);
                        mVar3.f59567r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        z0 z0Var2 = new z0(0, activity, g6Var, false, false);
        z0Var2.c(i11, i12);
        z0Var2.h(1.0f, i13);
        z0Var2.j(id.M0(2131745601, null), 2131232255, null);
        z0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final l f59536b;

            {
                this.f59536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l lVar = this.f59536b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f59547r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.f59568s.e(false);
                        mVar2.f59567r = null;
                        return;
                    case 1:
                        l.a(this.f59536b);
                        return;
                    default:
                        l lVar2 = this.f59536b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.f59547r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.f59568s.e(false);
                        mVar3.f59567r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        z0 z0Var3 = new z0(0, activity, g6Var, false, true);
        z0Var3.c(l6.f28106q7, l6.f28086p7);
        z0Var3.h(1.0f, i13);
        z0Var3.j(id.M0(2131751368, null), 2131232328, null);
        z0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final l f59536b;

            {
                this.f59536b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l lVar = this.f59536b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f59547r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.f59568s.e(false);
                        mVar2.f59567r = null;
                        return;
                    case 1:
                        l.a(this.f59536b);
                        return;
                    default:
                        l lVar2 = this.f59536b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.f59547r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.f59568s.e(false);
                        mVar3.f59567r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
    }

    public static void a(l lVar) {
        m mVar = lVar.E;
        if (lVar.f59547r != null) {
            mVar.f59553b = true;
            f2 f2Var = mVar.f59557g;
            super.dismiss();
            f2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", lVar.f59547r.user_id);
            f2Var.presentFragment(new cn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + g0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f59544e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + g0.L(4.0f);
        }
        return this.f59545f.getMeasuredHeight() + g0.L(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.f59548s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.f59549w.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        tf0 tf0Var = this.h;
        float width = (this.f59549w.getWidth() * 1.0f) / tf0Var.getMeasuredWidth();
        float width2 = (this.f59549w.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        float left = iArr[0] - (tf0Var.getLeft() + ((int) ((tf0Var.getMeasuredWidth() * f12) / 2.0f)));
        float top = iArr[1] - (tf0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        int i7 = (-this.f59545f.getTop()) / 2;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z9) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f59548s = ofFloat;
        ofFloat.addUpdateListener(new f9(this, width, left, top, width2, i7, 1));
        this.f59548s.addListener(new pk0(this, z9, width, 1));
        this.f59548s.setDuration(220L);
        this.f59548s.setInterpolator(xq.f40458f);
        this.f59548s.start();
    }

    public final void f() {
        int i7;
        BitmapDrawable bitmapDrawable = this.f59550x;
        if (bitmapDrawable != null) {
            i7 = bitmapDrawable.getAlpha();
        } else {
            i7 = 255;
        }
        Resources resources = getContext().getResources();
        k kVar = this.D;
        int measuredWidth = (int) (kVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (kVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        f2 f2Var = this.E.f59557g;
        ((LaunchActivity) f2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = f2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f59550x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i7);
        getWindow().setBackgroundDrawable(this.f59550x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(2131755178);
        setContentView(this.D, new ViewGroup.LayoutParams(-1, -1));
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
        g0.i3(new a0(this, 2), 80L);
    }
}
