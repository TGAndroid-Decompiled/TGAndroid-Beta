package xh;

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
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.d9;
import org.telegram.ui.sn;
import org.telegram.ui.v4;
import tg.p;
public final class j extends Dialog {
    public final k E;
    public final int f50297a;
    public final int f50298b;
    public final Drawable f50299c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50300f;
    public final oi0 h;
    public final h f50301n;
    public TLRPC.TL_chatInviteImporter f50302r;
    public ValueAnimator f50303s;
    public w9 v;
    public BitmapDrawable f50304w;
    public float f50305x;
    public final i f50306y;

    public j(k kVar, Activity activity, mm0 mm0Var, g6 g6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = kVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f50299c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        i iVar = new i(this, getContext());
        this.f50306y = iVar;
        setCancelable(true);
        iVar.setVisibility(4);
        int i11 = k6.G8;
        o2 o2Var = kVar.f50311g;
        k6.w0(i11, o2Var.getResourceProvider());
        r6.z(iVar, mutate, i11, o2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(iVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f50297a = rect.top;
        this.f50298b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, g6Var);
        this.f50300f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        r6.i(i11, actionBarPopupWindow$ActionBarPopupWindowLayout, o2Var.getResourceProvider());
        iVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? v4Var = new v4(getContext());
        this.f50301n = v4Var;
        oi0 oi0Var = new oi0(activity, o2Var.getActionBar(), mm0Var, v4Var);
        this.h = oi0Var;
        oi0Var.setCreateThumbFromParent(true);
        iVar.addView(oi0Var);
        v4Var.setProfileGalleryView(oi0Var);
        iVar.addView(v4Var);
        textView.setMaxLines(1);
        r6.W(textView, k6.G6, o2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        iVar.addView(textView);
        r6.W(textView2, k6.f21571y6, o2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        iVar.addView(textView2);
        e1 e1Var = new e1(0, activity, g6Var, true, false);
        int i12 = k6.E8;
        int i13 = k6.F8;
        e1Var.c(i12, i13);
        int i14 = k6.I5;
        e1Var.h(1.0f, i14);
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        e1Var.j(LocaleController.getString(i10), R.drawable.msg_requests, null);
        e1Var.setOnClickListener(new View.OnClickListener(this) {
            public final j f50293b;

            {
                this.f50293b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f50293b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f50302r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f50322s.e(false);
                        kVar2.f50321r = null;
                        return;
                    case 1:
                        j.a(this.f50293b);
                        return;
                    default:
                        j jVar2 = this.f50293b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f50302r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f50322s.e(false);
                        kVar3.f50321r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
        e1 e1Var2 = new e1(0, activity, g6Var, false, false);
        e1Var2.c(i12, i13);
        e1Var2.h(1.0f, i14);
        e1Var2.j(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        e1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j f50293b;

            {
                this.f50293b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f50293b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f50302r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f50322s.e(false);
                        kVar2.f50321r = null;
                        return;
                    case 1:
                        j.a(this.f50293b);
                        return;
                    default:
                        j jVar2 = this.f50293b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f50302r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f50322s.e(false);
                        kVar3.f50321r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        e1 e1Var3 = new e1(0, activity, g6Var, false, true);
        e1Var3.c(k6.f21421q7, k6.f21404p7);
        e1Var3.h(1.0f, i14);
        e1Var3.j(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        e1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final j f50293b;

            {
                this.f50293b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f50293b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f50302r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f50322s.e(false);
                        kVar2.f50321r = null;
                        return;
                    case 1:
                        j.a(this.f50293b);
                        return;
                    default:
                        j jVar2 = this.f50293b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f50302r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f50322s.e(false);
                        kVar3.f50321r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
    }

    public static void a(j jVar) {
        k kVar = jVar.E;
        if (jVar.f50302r != null) {
            kVar.f50308b = true;
            o2 o2Var = kVar.f50311g;
            super.dismiss();
            o2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", jVar.f50302r.user_id);
            o2Var.presentFragment(new sn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f50300f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f50303s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        oi0 oi0Var = this.h;
        float width = (this.v.getWidth() * 1.0f) / oi0Var.getMeasuredWidth();
        float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        float left = iArr[0] - (oi0Var.getLeft() + ((int) ((oi0Var.getMeasuredWidth() * f11) / 2.0f)));
        float top = iArr[1] - (oi0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        int i10 = (-this.f50300f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f50303s = ofFloat;
        ofFloat.addUpdateListener(new d9(this, width, left, top, width2, i10, 1));
        this.f50303s.addListener(new hn0(this, z10, width, 1));
        this.f50303s.setDuration(220L);
        this.f50303s.setInterpolator(bs.f25133f);
        this.f50303s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f50304w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        i iVar = this.f50306y;
        int measuredWidth = (int) (iVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (iVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        o2 o2Var = this.E.f50311g;
        ((LaunchActivity) o2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = o2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f50304w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f50304w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f50306y, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new p(this, 11), 80L);
    }
}
