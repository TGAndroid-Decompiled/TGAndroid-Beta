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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.x9;
import org.telegram.ui.bn;
import org.telegram.ui.q4;
import v4.p;
public final class k extends Dialog {
    public final j E;
    public final l F;
    public final int f61997a;
    public final int f61998b;
    public final Drawable f61999c;
    public final TextView d;
    public final TextView f62000e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f62001f;
    public final fg0 h;
    public final i f62002n;
    public TLRPC.TL_chatInviteImporter f62003r;
    public ValueAnimator f62004s;
    public q9 f62005w;
    public BitmapDrawable f62006x;
    public float f62007y;

    public k(l lVar, Activity activity, ck0 ck0Var, i6 i6Var, boolean z10) {
        super(activity, 2131755353);
        int i7;
        this.F = lVar;
        Drawable mutate = getContext().getResources().getDrawable(2131232567).mutate();
        this.f61999c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f62000e = textView2;
        j jVar = new j(this, getContext());
        this.E = jVar;
        setCancelable(true);
        jVar.setVisibility(4);
        int i10 = n6.G8;
        h2 h2Var = lVar.f62013g;
        n6.w0(i10, h2Var.getResourceProvider());
        u6.x(jVar, mutate, i10, h2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(jVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f61997a = rect.top;
        this.f61998b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, i6Var);
        this.f62001f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        u6.h(i10, actionBarPopupWindow$ActionBarPopupWindowLayout, h2Var.getResourceProvider());
        jVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f62002n = q4Var;
        fg0 fg0Var = new fg0(activity, h2Var.getActionBar(), ck0Var, q4Var);
        this.h = fg0Var;
        fg0Var.setCreateThumbFromParent(true);
        jVar.addView(fg0Var);
        q4Var.setProfileGalleryView(fg0Var);
        jVar.addView(q4Var);
        textView.setMaxLines(1);
        u6.U(textView, n6.G6, h2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(g0.o());
        jVar.addView(textView);
        u6.U(textView2, n6.f29788y6, h2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        jVar.addView(textView2);
        z0 z0Var = new z0(0, activity, i6Var, true, false);
        int i11 = n6.E8;
        int i12 = n6.F8;
        z0Var.c(i11, i12);
        int i13 = n6.I5;
        z0Var.h(1.0f, i13);
        if (z10) {
            i7 = 2131754376;
        } else {
            i7 = 2131754371;
        }
        z0Var.j(gd.M0(i7, null), 2131232342, null);
        z0Var.setOnClickListener(new View.OnClickListener(this) {
            public final k f61992b;

            {
                this.f61992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f61992b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f62003r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f62024s.e(false);
                        lVar2.f62023r = null;
                        return;
                    case 1:
                        k.a(this.f61992b);
                        return;
                    default:
                        k kVar2 = this.f61992b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f62003r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f62024s.e(false);
                        lVar3.f62023r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
        z0 z0Var2 = new z0(0, activity, i6Var, false, false);
        z0Var2.c(i11, i12);
        z0Var2.h(1.0f, i13);
        z0Var2.j(gd.M0(2131745406, null), 2131232257, null);
        z0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k f61992b;

            {
                this.f61992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f61992b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f62003r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f62024s.e(false);
                        lVar2.f62023r = null;
                        return;
                    case 1:
                        k.a(this.f61992b);
                        return;
                    default:
                        k kVar2 = this.f61992b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f62003r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f62024s.e(false);
                        lVar3.f62023r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
        z0 z0Var3 = new z0(0, activity, i6Var, false, true);
        z0Var3.c(n6.f29637q7, n6.f29617p7);
        z0Var3.h(1.0f, i13);
        z0Var3.j(gd.M0(2131751357, null), 2131232330, null);
        z0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final k f61992b;

            {
                this.f61992b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f61992b;
                        l lVar2 = kVar.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f62003r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f62024s.e(false);
                        lVar2.f62023r = null;
                        return;
                    case 1:
                        k.a(this.f61992b);
                        return;
                    default:
                        k kVar2 = this.f61992b;
                        l lVar3 = kVar2.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f62003r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f62024s.e(false);
                        lVar3.f62023r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
    }

    public static void a(k kVar) {
        l lVar = kVar.F;
        if (kVar.f62003r != null) {
            lVar.f62009b = true;
            h2 h2Var = lVar.f62013g;
            super.dismiss();
            h2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", kVar.f62003r.user_id);
            h2Var.presentFragment(new bn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + g0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f62000e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + g0.L(4.0f);
        }
        return this.f62001f.getMeasuredHeight() + g0.L(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f62004s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.f62005w.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        fg0 fg0Var = this.h;
        float width = (this.f62005w.getWidth() * 1.0f) / fg0Var.getMeasuredWidth();
        float width2 = (this.f62005w.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        float left = iArr[0] - (fg0Var.getLeft() + ((int) ((fg0Var.getMeasuredWidth() * f12) / 2.0f)));
        float top = iArr[1] - (fg0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        int i7 = (-this.f62001f.getTop()) / 2;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f62004s = ofFloat;
        ofFloat.addUpdateListener(new x9(this, width, left, top, width2, i7, 1));
        this.f62004s.addListener(new bl0(this, z10, width, 1));
        this.f62004s.setDuration(220L);
        this.f62004s.setInterpolator(lr.f37208f);
        this.f62004s.start();
    }

    public final void f() {
        int i7;
        BitmapDrawable bitmapDrawable = this.f62006x;
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
        h2 h2Var = this.F.f62013g;
        ((LaunchActivity) h2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = h2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f62006x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i7);
        getWindow().setBackgroundDrawable(this.f62006x);
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
