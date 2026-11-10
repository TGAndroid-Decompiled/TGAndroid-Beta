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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.i9;
import org.telegram.ui.cn;
import org.telegram.ui.q4;
import wg.a0;
public final class l extends Dialog {
    public final k D;
    public final m E;
    public final int f59539a;
    public final int f59540b;
    public final Drawable f59541c;
    public final TextView d;
    public final TextView f59542e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f59543f;
    public final sf0 h;
    public final j f59544n;
    public TLRPC.TL_chatInviteImporter f59545r;
    public ValueAnimator f59546s;
    public k9 f59547w;
    public BitmapDrawable f59548x;
    public float f59549y;

    public l(m mVar, Activity activity, pj0 pj0Var, h6 h6Var, boolean z9) {
        super(activity, 2131755353);
        int i7;
        this.E = mVar;
        Drawable mutate = getContext().getResources().getDrawable(2131232565).mutate();
        this.f59541c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f59542e = textView2;
        k kVar = new k(this, getContext());
        this.D = kVar;
        setCancelable(true);
        kVar.setVisibility(4);
        int i10 = m6.G8;
        f2 f2Var = mVar.f59555g;
        m6.w0(i10, f2Var.getResourceProvider());
        t6.x(kVar, mutate, i10, f2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(kVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f59539a = rect.top;
        this.f59540b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, h6Var);
        this.f59543f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        t6.h(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, f2Var.getResourceProvider());
        kVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f59544n = q4Var;
        sf0 sf0Var = new sf0(activity, f2Var.getActionBar(), pj0Var, q4Var);
        this.h = sf0Var;
        sf0Var.setCreateThumbFromParent(true);
        kVar.addView(sf0Var);
        q4Var.setProfileGalleryView(sf0Var);
        kVar.addView(q4Var);
        textView.setMaxLines(1);
        t6.U(textView, m6.G6, f2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        kVar.addView(textView);
        t6.U(textView2, m6.f28282y6, f2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        kVar.addView(textView2);
        z0 z0Var = new z0(0, activity, h6Var, true, false);
        int i11 = m6.E8;
        int i12 = m6.F8;
        z0Var.c(i11, i12);
        int i13 = m6.I5;
        z0Var.h(1.0f, i13);
        if (z9) {
            i7 = 2131754378;
        } else {
            i7 = 2131754373;
        }
        z0Var.j(id.M0(i7, null), 2131232340, null);
        z0Var.setOnClickListener(new View.OnClickListener(this) {
            public final l f59534b;

            {
                this.f59534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l lVar = this.f59534b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f59545r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.f59566s.e(false);
                        mVar2.f59565r = null;
                        return;
                    case 1:
                        l.a(this.f59534b);
                        return;
                    default:
                        l lVar2 = this.f59534b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.f59545r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.f59566s.e(false);
                        mVar3.f59565r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        z0 z0Var2 = new z0(0, activity, h6Var, false, false);
        z0Var2.c(i11, i12);
        z0Var2.h(1.0f, i13);
        z0Var2.j(id.M0(2131745601, null), 2131232255, null);
        z0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final l f59534b;

            {
                this.f59534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l lVar = this.f59534b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f59545r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.f59566s.e(false);
                        mVar2.f59565r = null;
                        return;
                    case 1:
                        l.a(this.f59534b);
                        return;
                    default:
                        l lVar2 = this.f59534b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.f59545r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.f59566s.e(false);
                        mVar3.f59565r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        z0 z0Var3 = new z0(0, activity, h6Var, false, true);
        z0Var3.c(m6.f28131q7, m6.f28111p7);
        z0Var3.h(1.0f, i13);
        z0Var3.j(id.M0(2131751368, null), 2131232328, null);
        z0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final l f59534b;

            {
                this.f59534b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l lVar = this.f59534b;
                        m mVar2 = lVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f59545r;
                        if (tL_chatInviteImporter != null) {
                            mVar2.d(tL_chatInviteImporter, true);
                        }
                        mVar2.f59566s.e(false);
                        mVar2.f59565r = null;
                        return;
                    case 1:
                        l.a(this.f59534b);
                        return;
                    default:
                        l lVar2 = this.f59534b;
                        m mVar3 = lVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = lVar2.f59545r;
                        if (tL_chatInviteImporter2 != null) {
                            mVar3.d(tL_chatInviteImporter2, false);
                        }
                        mVar3.f59566s.e(false);
                        mVar3.f59565r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
    }

    public static void a(l lVar) {
        m mVar = lVar.E;
        if (lVar.f59545r != null) {
            mVar.f59551b = true;
            f2 f2Var = mVar.f59555g;
            super.dismiss();
            f2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", lVar.f59545r.user_id);
            f2Var.presentFragment(new cn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + g0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f59542e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + g0.L(4.0f);
        }
        return this.f59543f.getMeasuredHeight() + g0.L(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.f59546s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.f59547w.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        sf0 sf0Var = this.h;
        float width = (this.f59547w.getWidth() * 1.0f) / sf0Var.getMeasuredWidth();
        float width2 = (this.f59547w.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        float left = iArr[0] - (sf0Var.getLeft() + ((int) ((sf0Var.getMeasuredWidth() * f12) / 2.0f)));
        float top = iArr[1] - (sf0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        int i7 = (-this.f59543f.getTop()) / 2;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z9) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f59546s = ofFloat;
        ofFloat.addUpdateListener(new i9(this, width, left, top, width2, i7, 1));
        this.f59546s.addListener(new ok0(this, z9, width, 1));
        this.f59546s.setDuration(220L);
        this.f59546s.setInterpolator(wq.f40046f);
        this.f59546s.start();
    }

    public final void f() {
        int i7;
        BitmapDrawable bitmapDrawable = this.f59548x;
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
        f2 f2Var = this.E.f59555g;
        ((LaunchActivity) f2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = f2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f59548x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i7);
        getWindow().setBackgroundDrawable(this.f59548x);
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
