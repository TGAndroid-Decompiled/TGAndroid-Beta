package wh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.d8;
import org.telegram.ui.q4;
import org.telegram.ui.zn;
import rg.x1;
public final class k extends Dialog {
    public final l E;
    public final int f50417a;
    public final int f50418b;
    public final Drawable f50419c;
    public final TextView d;
    public final TextView f50420e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50421f;
    public final ti0 h;
    public final i f50422n;
    public TLRPC.TL_chatInviteImporter f50423r;
    public ValueAnimator f50424s;
    public y9 v;
    public BitmapDrawable f50425w;
    public float f50426x;
    public final j f50427y;

    public k(l lVar, Activity activity, qm0 qm0Var, e6 e6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = lVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f50419c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f50420e = textView2;
        j jVar = new j(this, getContext());
        this.f50427y = jVar;
        setCancelable(true);
        jVar.setVisibility(4);
        int i11 = i6.G8;
        n2 n2Var = lVar.f50433g;
        int w02 = i6.w0(i11, n2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(jVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f50417a = rect.top;
        this.f50418b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, e6Var);
        this.f50421f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(w02);
        jVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f50422n = q4Var;
        ti0 ti0Var = new ti0(activity, n2Var.getActionBar(), qm0Var, q4Var);
        this.h = ti0Var;
        ti0Var.setCreateThumbFromParent(true);
        jVar.addView(ti0Var);
        q4Var.setProfileGalleryView(ti0Var);
        jVar.addView(q4Var);
        textView.setMaxLines(1);
        textView.setTextColor(i6.w0(i6.G6, n2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        jVar.addView(textView);
        textView2.setTextColor(i6.w0(i6.f21181y6, n2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        jVar.addView(textView2);
        f1 f1Var = new f1(activity, true, false);
        int i12 = i6.E8;
        int w03 = i6.w0(i12, e6Var);
        int i13 = i6.F8;
        f1Var.c(w03, i6.w0(i13, e6Var));
        int i14 = i6.I5;
        f1Var.setSelectorColor(i6.w0(i14, e6Var));
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        f1Var.g(LocaleController.getString(i10), R.drawable.msg_requests, null);
        f1Var.setOnClickListener(new View.OnClickListener(this) {
            public final k f50412b;

            {
                this.f50412b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f50412b;
                        l lVar2 = kVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f50423r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f50444s.e(false);
                        lVar2.f50443r = null;
                        return;
                    case 1:
                        k.a(this.f50412b);
                        return;
                    default:
                        k kVar2 = this.f50412b;
                        l lVar3 = kVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f50423r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f50444s.e(false);
                        lVar3.f50443r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        f1 f1Var2 = new f1(activity, false, false);
        f1Var2.c(i6.w0(i12, e6Var), i6.w0(i13, e6Var));
        f1Var2.setSelectorColor(i6.w0(i14, e6Var));
        f1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        f1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k f50412b;

            {
                this.f50412b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f50412b;
                        l lVar2 = kVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f50423r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f50444s.e(false);
                        lVar2.f50443r = null;
                        return;
                    case 1:
                        k.a(this.f50412b);
                        return;
                    default:
                        k kVar2 = this.f50412b;
                        l lVar3 = kVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f50423r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f50444s.e(false);
                        lVar3.f50443r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
        f1 f1Var3 = new f1(activity, false, true);
        f1Var3.c(i6.w0(i6.f21037q7, e6Var), i6.w0(i6.f21018p7, e6Var));
        f1Var3.setSelectorColor(i6.w0(i14, e6Var));
        f1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        f1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final k f50412b;

            {
                this.f50412b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f50412b;
                        l lVar2 = kVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f50423r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f50444s.e(false);
                        lVar2.f50443r = null;
                        return;
                    case 1:
                        k.a(this.f50412b);
                        return;
                    default:
                        k kVar2 = this.f50412b;
                        l lVar3 = kVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f50423r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f50444s.e(false);
                        lVar3.f50443r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
    }

    public static void a(k kVar) {
        l lVar = kVar.E;
        if (kVar.f50423r != null) {
            lVar.f50429b = true;
            n2 n2Var = lVar.f50433g;
            super.dismiss();
            n2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", kVar.f50423r.user_id);
            n2Var.presentFragment(new zn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f50420e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f50421f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f50424s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        ti0 ti0Var = this.h;
        float width = (this.v.getWidth() * 1.0f) / ti0Var.getMeasuredWidth();
        float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        float left = iArr[0] - (ti0Var.getLeft() + ((int) ((ti0Var.getMeasuredWidth() * f11) / 2.0f)));
        float top = iArr[1] - (ti0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        int i10 = (-this.f50421f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f50424s = ofFloat;
        ofFloat.addUpdateListener(new d8(this, width, left, top, width2, i10, 1));
        this.f50424s.addListener(new ln0(this, z10, width, 1));
        this.f50424s.setDuration(220L);
        this.f50424s.setInterpolator(hs.f27118f);
        this.f50424s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f50425w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        j jVar = this.f50427y;
        int measuredWidth = (int) (jVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (jVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        n2 n2Var = this.E.f50433g;
        ((LaunchActivity) n2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = n2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f50425w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f50425w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f50427y, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new x1(this, 14), 80L);
    }
}
