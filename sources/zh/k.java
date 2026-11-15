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
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.j9;
import org.telegram.ui.an;
import org.telegram.ui.q4;
import vg.o;
public final class k extends Dialog {
    public final j E;
    public final l F;
    public final int f61431a;
    public final int f61432b;
    public final Drawable f61433c;
    public final TextView d;
    public final TextView f61434e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f61435f;
    public final vf0 h;
    public final i f61436n;
    public TLRPC.TL_chatInviteImporter f61437r;
    public ValueAnimator f61438s;
    public i9 f61439w;
    public BitmapDrawable f61440x;
    public float f61441y;

    public k(l lVar, Activity activity, uj0 uj0Var, e6 e6Var, boolean z10) {
        super(activity, 2131755353);
        int i7;
        this.F = lVar;
        Drawable mutate = getContext().getResources().getDrawable(2131232566).mutate();
        this.f61433c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f61434e = textView2;
        j jVar = new j(this, getContext());
        this.E = jVar;
        setCancelable(true);
        jVar.setVisibility(4);
        int i10 = j6.G8;
        e2 e2Var = lVar.f61447g;
        j6.w0(i10, e2Var.getResourceProvider());
        q6.x(jVar, mutate, i10, e2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(jVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f61431a = rect.top;
        this.f61432b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, e6Var);
        this.f61435f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        q6.h(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, e2Var.getResourceProvider());
        jVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f61436n = q4Var;
        vf0 vf0Var = new vf0(activity, e2Var.getActionBar(), uj0Var, q4Var);
        this.h = vf0Var;
        vf0Var.setCreateThumbFromParent(true);
        jVar.addView(vf0Var);
        q4Var.setProfileGalleryView(vf0Var);
        jVar.addView(q4Var);
        textView.setMaxLines(1);
        q6.U(textView, j6.G6, e2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        jVar.addView(textView);
        q6.U(textView2, j6.f29241y6, e2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        jVar.addView(textView2);
        z0 z0Var = new z0(0, activity, e6Var, true, false);
        int i11 = j6.E8;
        int i12 = j6.F8;
        z0Var.c(i11, i12);
        int i13 = j6.I5;
        z0Var.h(1.0f, i13);
        if (z10) {
            i7 = 2131754378;
        } else {
            i7 = 2131754373;
        }
        z0Var.j(hd.M0(i7, null), 2131232341, null);
        z0Var.setOnClickListener(new View.OnClickListener(this) {
            public final k f61426b;

            {
                this.f61426b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f61426b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f61437r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f61458s.e(false);
                        lVar2.f61457r = null;
                        return;
                    case 1:
                        k.a(this.f61426b);
                        return;
                    default:
                        k kVar2 = this.f61426b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f61437r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f61458s.e(false);
                        lVar3.f61457r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        z0 z0Var2 = new z0(0, activity, e6Var, false, false);
        z0Var2.c(i11, i12);
        z0Var2.h(1.0f, i13);
        z0Var2.j(hd.M0(2131745601, null), 2131232256, null);
        z0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k f61426b;

            {
                this.f61426b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f61426b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f61437r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f61458s.e(false);
                        lVar2.f61457r = null;
                        return;
                    case 1:
                        k.a(this.f61426b);
                        return;
                    default:
                        k kVar2 = this.f61426b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f61437r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f61458s.e(false);
                        lVar3.f61457r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        z0 z0Var3 = new z0(0, activity, e6Var, false, true);
        z0Var3.c(j6.f29090q7, j6.f29070p7);
        z0Var3.h(1.0f, i13);
        z0Var3.j(hd.M0(2131751368, null), 2131232329, null);
        z0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final k f61426b;

            {
                this.f61426b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f61426b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f61437r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f61458s.e(false);
                        lVar2.f61457r = null;
                        return;
                    case 1:
                        k.a(this.f61426b);
                        return;
                    default:
                        k kVar2 = this.f61426b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f61437r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f61458s.e(false);
                        lVar3.f61457r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
    }

    public static void a(k kVar) {
        l lVar = kVar.F;
        if (kVar.f61437r != null) {
            lVar.f61443b = true;
            e2 e2Var = lVar.f61447g;
            super.dismiss();
            e2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", kVar.f61437r.user_id);
            e2Var.presentFragment(new an(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + g0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f61434e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + g0.L(4.0f);
        }
        return this.f61435f.getMeasuredHeight() + g0.L(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f61438s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.f61439w.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        vf0 vf0Var = this.h;
        float width = (this.f61439w.getWidth() * 1.0f) / vf0Var.getMeasuredWidth();
        float width2 = (this.f61439w.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        float left = iArr[0] - (vf0Var.getLeft() + ((int) ((vf0Var.getMeasuredWidth() * f12) / 2.0f)));
        float top = iArr[1] - (vf0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        int i7 = (-this.f61435f.getTop()) / 2;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f61438s = ofFloat;
        ofFloat.addUpdateListener(new j9(this, width, left, top, width2, i7, 1));
        this.f61438s.addListener(new tk0(this, z10, width, 1));
        this.f61438s.setDuration(220L);
        this.f61438s.setInterpolator(er.f34420f);
        this.f61438s.start();
    }

    public final void f() {
        int i7;
        BitmapDrawable bitmapDrawable = this.f61440x;
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
        e2 e2Var = this.F.f61447g;
        ((LaunchActivity) e2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = e2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f61440x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i7);
        getWindow().setBackgroundDrawable(this.f61440x);
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
        g0.i3(new o(this, 13), 80L);
    }
}
