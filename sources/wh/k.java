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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.f8;
import org.telegram.ui.p4;
import org.telegram.ui.zn;
import rg.x1;
public final class k extends Dialog {
    public final l E;
    public final int f50505a;
    public final int f50506b;
    public final Drawable f50507c;
    public final TextView d;
    public final TextView f50508e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50509f;
    public final vi0 h;
    public final i f50510n;
    public TLRPC.TL_chatInviteImporter f50511r;
    public ValueAnimator f50512s;
    public y9 v;
    public BitmapDrawable f50513w;
    public float f50514x;
    public final j f50515y;

    public k(l lVar, Activity activity, sm0 sm0Var, d6 d6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = lVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f50507c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f50508e = textView2;
        j jVar = new j(this, getContext());
        this.f50515y = jVar;
        setCancelable(true);
        jVar.setVisibility(4);
        int i11 = h6.G8;
        m2 m2Var = lVar.f50521g;
        int w02 = h6.w0(i11, m2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(jVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f50505a = rect.top;
        this.f50506b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, d6Var);
        this.f50509f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(w02);
        jVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? p4Var = new p4(getContext());
        this.f50510n = p4Var;
        vi0 vi0Var = new vi0(activity, m2Var.getActionBar(), sm0Var, p4Var);
        this.h = vi0Var;
        vi0Var.setCreateThumbFromParent(true);
        jVar.addView(vi0Var);
        p4Var.setProfileGalleryView(vi0Var);
        jVar.addView(p4Var);
        textView.setMaxLines(1);
        textView.setTextColor(h6.w0(h6.G6, m2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        jVar.addView(textView);
        textView2.setTextColor(h6.w0(h6.f21171y6, m2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        jVar.addView(textView2);
        e1 e1Var = new e1(activity, true, false);
        int i12 = h6.E8;
        int w03 = h6.w0(i12, d6Var);
        int i13 = h6.F8;
        e1Var.c(w03, h6.w0(i13, d6Var));
        int i14 = h6.I5;
        e1Var.setSelectorColor(h6.w0(i14, d6Var));
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        e1Var.g(LocaleController.getString(i10), R.drawable.msg_requests, null);
        e1Var.setOnClickListener(new View.OnClickListener(this) {
            public final k f50500b;

            {
                this.f50500b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f50500b;
                        l lVar2 = kVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f50511r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f50532s.e(false);
                        lVar2.f50531r = null;
                        return;
                    case 1:
                        k.a(this.f50500b);
                        return;
                    default:
                        k kVar2 = this.f50500b;
                        l lVar3 = kVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f50511r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f50532s.e(false);
                        lVar3.f50531r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
        e1 e1Var2 = new e1(activity, false, false);
        e1Var2.c(h6.w0(i12, d6Var), h6.w0(i13, d6Var));
        e1Var2.setSelectorColor(h6.w0(i14, d6Var));
        e1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        e1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final k f50500b;

            {
                this.f50500b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f50500b;
                        l lVar2 = kVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f50511r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f50532s.e(false);
                        lVar2.f50531r = null;
                        return;
                    case 1:
                        k.a(this.f50500b);
                        return;
                    default:
                        k kVar2 = this.f50500b;
                        l lVar3 = kVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f50511r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f50532s.e(false);
                        lVar3.f50531r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        e1 e1Var3 = new e1(activity, false, true);
        e1Var3.c(h6.w0(h6.f21026q7, d6Var), h6.w0(h6.f21007p7, d6Var));
        e1Var3.setSelectorColor(h6.w0(i14, d6Var));
        e1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        e1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final k f50500b;

            {
                this.f50500b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k kVar = this.f50500b;
                        l lVar2 = kVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f50511r;
                        if (tL_chatInviteImporter != null) {
                            lVar2.d(tL_chatInviteImporter, true);
                        }
                        lVar2.f50532s.e(false);
                        lVar2.f50531r = null;
                        return;
                    case 1:
                        k.a(this.f50500b);
                        return;
                    default:
                        k kVar2 = this.f50500b;
                        l lVar3 = kVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = kVar2.f50511r;
                        if (tL_chatInviteImporter2 != null) {
                            lVar3.d(tL_chatInviteImporter2, false);
                        }
                        lVar3.f50532s.e(false);
                        lVar3.f50531r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
    }

    public static void a(k kVar) {
        l lVar = kVar.E;
        if (kVar.f50511r != null) {
            lVar.f50517b = true;
            m2 m2Var = lVar.f50521g;
            super.dismiss();
            m2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", kVar.f50511r.user_id);
            m2Var.presentFragment(new zn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f50508e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f50509f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f50512s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        vi0 vi0Var = this.h;
        float width = (this.v.getWidth() * 1.0f) / vi0Var.getMeasuredWidth();
        float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        float left = iArr[0] - (vi0Var.getLeft() + ((int) ((vi0Var.getMeasuredWidth() * f11) / 2.0f)));
        float top = iArr[1] - (vi0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        int i10 = (-this.f50509f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f50512s = ofFloat;
        ofFloat.addUpdateListener(new f8(this, width, left, top, width2, i10, 1));
        this.f50512s.addListener(new nn0(this, z10, width, 1));
        this.f50512s.setDuration(220L);
        this.f50512s.setInterpolator(is.f27451f);
        this.f50512s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f50513w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        j jVar = this.f50515y;
        int measuredWidth = (int) (jVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (jVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        m2 m2Var = this.E.f50521g;
        ((LaunchActivity) m2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = m2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f50513w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f50513w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f50515y, new ViewGroup.LayoutParams(-1, -1));
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
