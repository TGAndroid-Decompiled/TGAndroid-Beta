package xh;

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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c9;
import org.telegram.ui.qn;
import org.telegram.ui.w4;
import tg.p;
public final class j extends Dialog {
    public final k E;
    public final int f49856a;
    public final int f49857b;
    public final Drawable f49858c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49859f;
    public final li0 h;
    public final h f49860n;
    public TLRPC.TL_chatInviteImporter f49861r;
    public ValueAnimator f49862s;
    public w9 v;
    public BitmapDrawable f49863w;
    public float f49864x;
    public final i f49865y;

    public j(k kVar, Activity activity, jm0 jm0Var, d6 d6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = kVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f49858c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        i iVar = new i(this, getContext());
        this.f49865y = iVar;
        setCancelable(true);
        iVar.setVisibility(4);
        int i11 = h6.G8;
        n2 n2Var = kVar.f49870g;
        int w02 = h6.w0(i11, n2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(iVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f49856a = rect.top;
        this.f49857b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, d6Var);
        this.f49859f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(w02);
        iVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? w4Var = new w4(getContext());
        this.f49860n = w4Var;
        li0 li0Var = new li0(activity, n2Var.getActionBar(), jm0Var, w4Var);
        this.h = li0Var;
        li0Var.setCreateThumbFromParent(true);
        iVar.addView(li0Var);
        w4Var.setProfileGalleryView(li0Var);
        iVar.addView(w4Var);
        textView.setMaxLines(1);
        textView.setTextColor(h6.w0(h6.G6, n2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        iVar.addView(textView);
        textView2.setTextColor(h6.w0(h6.f21381y6, n2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        iVar.addView(textView2);
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
            public final j f49852b;

            {
                this.f49852b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f49852b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f49861r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f49881s.e(false);
                        kVar2.f49880r = null;
                        return;
                    case 1:
                        j.a(this.f49852b);
                        return;
                    default:
                        j jVar2 = this.f49852b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f49861r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f49881s.e(false);
                        kVar3.f49880r = null;
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
            public final j f49852b;

            {
                this.f49852b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f49852b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f49861r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f49881s.e(false);
                        kVar2.f49880r = null;
                        return;
                    case 1:
                        j.a(this.f49852b);
                        return;
                    default:
                        j jVar2 = this.f49852b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f49861r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f49881s.e(false);
                        kVar3.f49880r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        e1 e1Var3 = new e1(activity, false, true);
        e1Var3.c(h6.w0(h6.f21231q7, d6Var), h6.w0(h6.f21214p7, d6Var));
        e1Var3.setSelectorColor(h6.w0(i14, d6Var));
        e1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        e1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final j f49852b;

            {
                this.f49852b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j jVar = this.f49852b;
                        k kVar2 = jVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = jVar.f49861r;
                        if (tL_chatInviteImporter != null) {
                            kVar2.d(tL_chatInviteImporter, true);
                        }
                        kVar2.f49881s.e(false);
                        kVar2.f49880r = null;
                        return;
                    case 1:
                        j.a(this.f49852b);
                        return;
                    default:
                        j jVar2 = this.f49852b;
                        k kVar3 = jVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = jVar2.f49861r;
                        if (tL_chatInviteImporter2 != null) {
                            kVar3.d(tL_chatInviteImporter2, false);
                        }
                        kVar3.f49881s.e(false);
                        kVar3.f49880r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
    }

    public static void a(j jVar) {
        k kVar = jVar.E;
        if (jVar.f49861r != null) {
            kVar.f49867b = true;
            n2 n2Var = kVar.f49870g;
            super.dismiss();
            n2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", jVar.f49861r.user_id);
            n2Var.presentFragment(new qn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f49859f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f49862s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        li0 li0Var = this.h;
        float width = (this.v.getWidth() * 1.0f) / li0Var.getMeasuredWidth();
        float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        float left = iArr[0] - (li0Var.getLeft() + ((int) ((li0Var.getMeasuredWidth() * f11) / 2.0f)));
        float top = iArr[1] - (li0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        int i10 = (-this.f49859f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f49862s = ofFloat;
        ofFloat.addUpdateListener(new c9(this, width, left, top, width2, i10, 1));
        this.f49862s.addListener(new en0(this, z10, width, 1));
        this.f49862s.setDuration(220L);
        this.f49862s.setInterpolator(bs.f25024f);
        this.f49862s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f49863w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        i iVar = this.f49865y;
        int measuredWidth = (int) (iVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (iVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        n2 n2Var = this.E.f49870g;
        ((LaunchActivity) n2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.o(-16777216, 76));
        Dialog visibleDialog = n2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f49863w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f49863w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f49865y, new ViewGroup.LayoutParams(-1, -1));
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
