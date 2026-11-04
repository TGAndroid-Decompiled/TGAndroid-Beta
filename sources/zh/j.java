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
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.g9;
import org.telegram.ui.s4;
import org.telegram.ui.wm;
public final class j extends Dialog {
    public final i E;
    public final k F;
    public final int f60569a;
    public final int f60570b;
    public final Drawable f60571c;
    public final TextView d;
    public final TextView f60572e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f60573f;
    public final vf0 h;
    public final h f60574n;
    public TLRPC.TL_chatInviteImporter f60575r;
    public ValueAnimator f60576s;
    public k9 f60577w;
    public BitmapDrawable f60578x;
    public float f60579y;

    public j(k kVar, Activity activity, tj0 tj0Var, e6 e6Var, boolean z10) {
        super(activity, 2131755353);
        int i3;
        this.F = kVar;
        Drawable mutate = getContext().getResources().getDrawable(2131232563).mutate();
        this.f60571c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f60572e = textView2;
        i iVar = new i(this, getContext());
        this.E = iVar;
        setCancelable(true);
        iVar.setVisibility(4);
        int i10 = k6.G8;
        d2 d2Var = kVar.f60585g;
        k6.w0(i10, d2Var.getResourceProvider());
        r6.y(iVar, mutate, i10, d2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(iVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f60569a = rect.top;
        this.f60570b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, e6Var);
        this.f60573f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        r6.i(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, d2Var.getResourceProvider());
        iVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? s4Var = new s4(getContext());
        this.f60574n = s4Var;
        vf0 vf0Var = new vf0(activity, d2Var.getActionBar(), tj0Var, s4Var);
        this.h = vf0Var;
        vf0Var.setCreateThumbFromParent(true);
        iVar.addView(vf0Var);
        s4Var.setProfileGalleryView(vf0Var);
        iVar.addView(s4Var);
        textView.setMaxLines(1);
        r6.V(textView, k6.G6, d2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        iVar.addView(textView);
        r6.V(textView2, k6.f28273y6, d2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        iVar.addView(textView2);
        y0 y0Var = new y0(0, activity, e6Var, true, false);
        int i11 = k6.E8;
        int i12 = k6.F8;
        y0Var.c(i11, i12);
        int i13 = k6.I5;
        y0Var.h(1.0f, i13);
        if (z10) {
            i3 = 2131754378;
        } else {
            i3 = 2131754373;
        }
        y0Var.j(bd.M0(i3, null), 2131232340, null);
        y0Var.setOnClickListener(new View.OnClickListener(this) {
            public final j f60564b;

            {
                this.f60564b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f60564b;
                        k kVar2 = jVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f60575r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f60596s.e(false);
                        kVar2.f60595r = null;
                        return;
                    case 1:
                        j.a(this.f60564b);
                        return;
                    default:
                        j jVar2 = this.f60564b;
                        k kVar3 = jVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f60575r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f60596s.e(false);
                        kVar3.f60595r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
        y0 y0Var2 = new y0(0, activity, e6Var, false, false);
        y0Var2.c(i11, i12);
        y0Var2.h(1.0f, i13);
        y0Var2.j(bd.M0(2131745611, null), 2131232255, null);
        y0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j f60564b;

            {
                this.f60564b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f60564b;
                        k kVar2 = jVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f60575r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f60596s.e(false);
                        kVar2.f60595r = null;
                        return;
                    case 1:
                        j.a(this.f60564b);
                        return;
                    default:
                        j jVar2 = this.f60564b;
                        k kVar3 = jVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f60575r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f60596s.e(false);
                        kVar3.f60595r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
        y0 y0Var3 = new y0(0, activity, e6Var, false, true);
        y0Var3.c(k6.f28122q7, k6.f28102p7);
        y0Var3.h(1.0f, i13);
        y0Var3.j(bd.M0(2131751369, null), 2131232328, null);
        y0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final j f60564b;

            {
                this.f60564b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f60564b;
                        k kVar2 = jVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f60575r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f60596s.e(false);
                        kVar2.f60595r = null;
                        return;
                    case 1:
                        j.a(this.f60564b);
                        return;
                    default:
                        j jVar2 = this.f60564b;
                        k kVar3 = jVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f60575r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f60596s.e(false);
                        kVar3.f60595r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
    }

    public static void a(j jVar) {
        k kVar = jVar.F;
        if (jVar.f60575r != null) {
            kVar.f60581b = true;
            d2 d2Var = kVar.f60585g;
            super.dismiss();
            d2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", jVar.f60575r.user_id);
            d2Var.presentFragment(new wm(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + g0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f60572e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + g0.L(4.0f);
        }
        return this.f60573f.getMeasuredHeight() + g0.L(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f60576s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.f60577w.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        vf0 vf0Var = this.h;
        float width = (this.f60577w.getWidth() * 1.0f) / vf0Var.getMeasuredWidth();
        float width2 = (this.f60577w.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        float left = iArr[0] - (vf0Var.getLeft() + ((int) ((vf0Var.getMeasuredWidth() * f12) / 2.0f)));
        float top = iArr[1] - (vf0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        int i3 = (-this.f60573f.getTop()) / 2;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f60576s = ofFloat;
        ofFloat.addUpdateListener(new g9(this, width, left, top, width2, i3, 1));
        this.f60576s.addListener(new sk0(this, z10, width, 1));
        this.f60576s.setDuration(220L);
        this.f60576s.setInterpolator(xq.f40452f);
        this.f60576s.start();
    }

    public final void f() {
        int i3;
        BitmapDrawable bitmapDrawable = this.f60578x;
        if (bitmapDrawable != null) {
            i3 = bitmapDrawable.getAlpha();
        } else {
            i3 = 255;
        }
        Resources resources = getContext().getResources();
        i iVar = this.E;
        int measuredWidth = (int) (iVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (iVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        d2 d2Var = this.F.f60585g;
        ((LaunchActivity) d2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = d2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f60578x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i3);
        getWindow().setBackgroundDrawable(this.f60578x);
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
        int i3 = attributes.flags & (-3);
        attributes.flags = i3;
        attributes.gravity = 51;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i3 | (-2147417856);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        g0.i3(new xf.c(this, 9), 80L);
    }
}
