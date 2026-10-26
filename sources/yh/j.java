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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c9;
import org.telegram.ui.u4;
import org.telegram.ui.un;
public final class j extends Dialog {
    public final k E;
    public final int f52600a;
    public final int f52601b;
    public final Drawable f52602c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f52603f;
    public final ni0 h;
    public final h f52604n;
    public TLRPC.TL_chatInviteImporter f52605r;
    public ValueAnimator f52606s;
    public y9 v;
    public BitmapDrawable f52607w;
    public float f52608x;
    public final i f52609y;

    public j(k kVar, Activity activity, mm0 mm0Var, u6 u6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = kVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f52602c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        i iVar = new i(this, getContext());
        this.f52609y = iVar;
        setCancelable(true);
        iVar.setVisibility(4);
        int i11 = y6.G8;
        r2 r2Var = kVar.f52614g;
        y6.w0(i11, r2Var.getResourceProvider());
        f7.y(iVar, mutate, i11, r2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(iVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f52600a = rect.top;
        this.f52601b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, u6Var);
        this.f52603f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        f7.i(i11, actionBarPopupWindow$ActionBarPopupWindowLayout, r2Var.getResourceProvider());
        iVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? u4Var = new u4(getContext());
        this.f52604n = u4Var;
        ni0 ni0Var = new ni0(activity, r2Var.getActionBar(), mm0Var, u4Var);
        this.h = ni0Var;
        ni0Var.setCreateThumbFromParent(true);
        iVar.addView(ni0Var);
        u4Var.setProfileGalleryView(ni0Var);
        iVar.addView(u4Var);
        textView.setMaxLines(1);
        f7.V(textView, y6.G6, r2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        iVar.addView(textView);
        f7.V(textView2, y6.f23748y6, r2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        iVar.addView(textView2);
        g1 g1Var = new g1(0, activity, u6Var, true, false);
        int i12 = y6.E8;
        int i13 = y6.F8;
        g1Var.c(i12, i13);
        int i14 = y6.I5;
        g1Var.h(1.0f, i14);
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        g1Var.j(LocaleController.getString(i10), R.drawable.msg_requests, null);
        g1Var.setOnClickListener(new View.OnClickListener(this) {
            public final j f52596b;

            {
                this.f52596b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f52596b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f52605r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f52625s.e(false);
                        kVar2.f52624r = null;
                        return;
                    case 1:
                        j.a(this.f52596b);
                        return;
                    default:
                        j jVar2 = this.f52596b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f52605r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f52625s.e(false);
                        kVar3.f52624r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(0, activity, u6Var, false, false);
        g1Var2.c(i12, i13);
        g1Var2.h(1.0f, i14);
        g1Var2.j(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        g1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j f52596b;

            {
                this.f52596b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f52596b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f52605r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f52625s.e(false);
                        kVar2.f52624r = null;
                        return;
                    case 1:
                        j.a(this.f52596b);
                        return;
                    default:
                        j jVar2 = this.f52596b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f52605r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f52625s.e(false);
                        kVar3.f52624r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(0, activity, u6Var, false, true);
        g1Var3.c(y6.f23598q7, y6.f23581p7);
        g1Var3.h(1.0f, i14);
        g1Var3.j(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        g1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final j f52596b;

            {
                this.f52596b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f52596b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f52605r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f52625s.e(false);
                        kVar2.f52624r = null;
                        return;
                    case 1:
                        j.a(this.f52596b);
                        return;
                    default:
                        j jVar2 = this.f52596b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f52605r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f52625s.e(false);
                        kVar3.f52624r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static void a(j jVar) {
        k kVar = jVar.E;
        if (jVar.f52605r != null) {
            kVar.f52611b = true;
            r2 r2Var = kVar.f52614g;
            super.dismiss();
            r2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", jVar.f52605r.user_id);
            r2Var.presentFragment(new un(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f52603f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f52606s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        ni0 ni0Var = this.h;
        float width = (this.v.getWidth() * 1.0f) / ni0Var.getMeasuredWidth();
        float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        float left = iArr[0] - (ni0Var.getLeft() + ((int) ((ni0Var.getMeasuredWidth() * f11) / 2.0f)));
        float top = iArr[1] - (ni0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        int i10 = (-this.f52603f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f52606s = ofFloat;
        ofFloat.addUpdateListener(new c9(this, width, left, top, width2, i10, 1));
        this.f52606s.addListener(new mn0(this, z10, width, 1));
        this.f52606s.setDuration(220L);
        this.f52606s.setInterpolator(ds.f27586f);
        this.f52606s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f52607w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        i iVar = this.f52609y;
        int measuredWidth = (int) (iVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (iVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        r2 r2Var = this.E.f52614g;
        ((LaunchActivity) r2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = r2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f52607w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f52607w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f52609y, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.flags = i10;
        attributes.gravity = 51;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-2147417856);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new ti.g(this, 15), 80L);
    }
}
