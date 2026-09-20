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
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q4;
import org.telegram.ui.zn;
import rg.q1;
import w7.q;
public final class m extends Dialog {
    public final n E;
    public final int f45396a;
    public final int f45397b;
    public final Drawable f45398c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f45399f;
    public final yh0 h;
    public final j f45400n;
    public TLRPC.TL_chatInviteImporter f45401r;
    public ValueAnimator f45402s;
    public v9 v;
    public BitmapDrawable f45403w;
    public float f45404x;
    public final l f45405y;

    public m(n nVar, Activity activity, vl0 vl0Var, f6 f6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = nVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f45398c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        l lVar = new l(this, getContext());
        this.f45405y = lVar;
        setCancelable(true);
        lVar.setVisibility(4);
        int i11 = j6.G8;
        n2 n2Var = nVar.f45410g;
        int v02 = j6.v0(i11, n2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(lVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f45396a = rect.top;
        this.f45397b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, f6Var);
        this.f45399f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        lVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f45400n = q4Var;
        yh0 yh0Var = new yh0(activity, n2Var.getActionBar(), vl0Var, q4Var);
        this.h = yh0Var;
        yh0Var.setCreateThumbFromParent(true);
        lVar.addView(yh0Var);
        q4Var.setProfileGalleryView(yh0Var);
        lVar.addView(q4Var);
        textView.setMaxLines(1);
        textView.setTextColor(j6.v0(j6.G6, n2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        lVar.addView(textView);
        textView2.setTextColor(j6.v0(j6.f19477y6, n2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        lVar.addView(textView2);
        f1 f1Var = new f1(activity, true, false);
        int i12 = j6.E8;
        int v03 = j6.v0(i12, f6Var);
        int i13 = j6.F8;
        f1Var.c(v03, j6.v0(i13, f6Var));
        int i14 = j6.I5;
        f1Var.setSelectorColor(j6.v0(i14, f6Var));
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        f1Var.g(LocaleController.getString(i10), R.drawable.msg_requests, null);
        f1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m f45391b;

            {
                this.f45391b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45391b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45401r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45421s.e(false);
                        nVar2.f45420r = null;
                        return;
                    case 1:
                        m.a(this.f45391b);
                        return;
                    default:
                        m mVar2 = this.f45391b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45401r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45421s.e(false);
                        nVar3.f45420r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        f1 f1Var2 = new f1(activity, false, false);
        f1Var2.c(j6.v0(i12, f6Var), j6.v0(i13, f6Var));
        f1Var2.setSelectorColor(j6.v0(i14, f6Var));
        f1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        f1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final m f45391b;

            {
                this.f45391b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45391b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45401r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45421s.e(false);
                        nVar2.f45420r = null;
                        return;
                    case 1:
                        m.a(this.f45391b);
                        return;
                    default:
                        m mVar2 = this.f45391b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45401r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45421s.e(false);
                        nVar3.f45420r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
        f1 f1Var3 = new f1(activity, false, true);
        f1Var3.c(j6.v0(j6.f19333q7, f6Var), j6.v0(j6.f19315p7, f6Var));
        f1Var3.setSelectorColor(j6.v0(i14, f6Var));
        f1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        f1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final m f45391b;

            {
                this.f45391b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45391b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45401r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45421s.e(false);
                        nVar2.f45420r = null;
                        return;
                    case 1:
                        m.a(this.f45391b);
                        return;
                    default:
                        m mVar2 = this.f45391b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45401r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45421s.e(false);
                        nVar3.f45420r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
    }

    public static void a(m mVar) {
        n nVar = mVar.E;
        if (mVar.f45401r != null) {
            nVar.f45407b = true;
            n2 n2Var = nVar.f45410g;
            super.dismiss();
            n2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", mVar.f45401r.user_id);
            n2Var.presentFragment(new zn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f45399f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f45402s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        yh0 yh0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / yh0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        final float left = iArr[0] - (yh0Var.getLeft() + ((int) ((yh0Var.getMeasuredWidth() * f11) / 2.0f)));
        final float top = iArr[1] - (yh0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        final int i10 = (-this.f45399f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f45402s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m mVar = m.this;
                mVar.f45404x = floatValue;
                float f12 = width;
                float z11 = e2.z(1.0f, f12, floatValue, f12);
                l lVar = mVar.f45405y;
                lVar.setScaleX(z11);
                lVar.setScaleY(z11);
                lVar.setTranslationX((1.0f - mVar.f45404x) * left);
                lVar.setTranslationY((1.0f - mVar.f45404x) * top);
                int i11 = (int) ((1.0f - mVar.f45404x) * width2);
                mVar.h.N(i11, i11);
                float a2 = q.a((mVar.f45404x * 2.0f) - 1.0f, 0.0f, 1.0f);
                mVar.f45398c.setAlpha((int) (a2 * 255.0f));
                mVar.d.setAlpha(a2);
                mVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = mVar.f45399f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - mVar.f45404x) * i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = mVar.f45403w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (mVar.f45404x * 255.0f));
                }
                mVar.f45400n.setAlpha(a2);
            }
        });
        this.f45402s.addListener(new rm0(this, z10, width, 1));
        this.f45402s.setDuration(220L);
        this.f45402s.setInterpolator(qr.f27642f);
        this.f45402s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f45403w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        l lVar = this.f45405y;
        int measuredWidth = (int) (lVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (lVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        n2 n2Var = this.E.f45410g;
        ((LaunchActivity) n2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = n2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f45403w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f45403w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f45405y, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new q1(this, 11), 80L);
    }
}
