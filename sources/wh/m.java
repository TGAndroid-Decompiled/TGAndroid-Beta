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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q4;
import org.telegram.ui.wn;
import rg.q1;
import w7.q;
public final class m extends Dialog {
    public final n E;
    public final int f45380a;
    public final int f45381b;
    public final Drawable f45382c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f45383f;
    public final zh0 h;
    public final j f45384n;
    public TLRPC.TL_chatInviteImporter f45385r;
    public ValueAnimator f45386s;
    public w9 v;
    public BitmapDrawable f45387w;
    public float f45388x;
    public final l f45389y;

    public m(n nVar, Activity activity, wl0 wl0Var, d6 d6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = nVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f45382c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        l lVar = new l(this, getContext());
        this.f45389y = lVar;
        setCancelable(true);
        lVar.setVisibility(4);
        int i11 = h6.G8;
        m2 m2Var = nVar.f45394g;
        int v02 = h6.v0(i11, m2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(lVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f45380a = rect.top;
        this.f45381b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, d6Var);
        this.f45383f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        lVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f45384n = q4Var;
        zh0 zh0Var = new zh0(activity, m2Var.getActionBar(), wl0Var, q4Var);
        this.h = zh0Var;
        zh0Var.setCreateThumbFromParent(true);
        lVar.addView(zh0Var);
        q4Var.setProfileGalleryView(zh0Var);
        lVar.addView(q4Var);
        textView.setMaxLines(1);
        textView.setTextColor(h6.v0(h6.G6, m2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        lVar.addView(textView);
        textView2.setTextColor(h6.v0(h6.f19443y6, m2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        lVar.addView(textView2);
        e1 e1Var = new e1(activity, true, false);
        int i12 = h6.E8;
        int v03 = h6.v0(i12, d6Var);
        int i13 = h6.F8;
        e1Var.c(v03, h6.v0(i13, d6Var));
        int i14 = h6.I5;
        e1Var.setSelectorColor(h6.v0(i14, d6Var));
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        e1Var.g(LocaleController.getString(i10), R.drawable.msg_requests, null);
        e1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m f45375b;

            {
                this.f45375b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45375b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45385r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45405s.e(false);
                        nVar2.f45404r = null;
                        return;
                    case 1:
                        m.a(this.f45375b);
                        return;
                    default:
                        m mVar2 = this.f45375b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45385r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45405s.e(false);
                        nVar3.f45404r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
        e1 e1Var2 = new e1(activity, false, false);
        e1Var2.c(h6.v0(i12, d6Var), h6.v0(i13, d6Var));
        e1Var2.setSelectorColor(h6.v0(i14, d6Var));
        e1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        e1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final m f45375b;

            {
                this.f45375b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45375b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45385r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45405s.e(false);
                        nVar2.f45404r = null;
                        return;
                    case 1:
                        m.a(this.f45375b);
                        return;
                    default:
                        m mVar2 = this.f45375b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45385r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45405s.e(false);
                        nVar3.f45404r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
        e1 e1Var3 = new e1(activity, false, true);
        e1Var3.c(h6.v0(h6.f19299q7, d6Var), h6.v0(h6.f19280p7, d6Var));
        e1Var3.setSelectorColor(h6.v0(i14, d6Var));
        e1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        e1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final m f45375b;

            {
                this.f45375b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45375b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45385r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45405s.e(false);
                        nVar2.f45404r = null;
                        return;
                    case 1:
                        m.a(this.f45375b);
                        return;
                    default:
                        m mVar2 = this.f45375b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45385r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45405s.e(false);
                        nVar3.f45404r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
    }

    public static void a(m mVar) {
        n nVar = mVar.E;
        if (mVar.f45385r != null) {
            nVar.f45391b = true;
            m2 m2Var = nVar.f45394g;
            super.dismiss();
            m2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", mVar.f45385r.user_id);
            m2Var.presentFragment(new wn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f45383f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f45386s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        zh0 zh0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / zh0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        final float left = iArr[0] - (zh0Var.getLeft() + ((int) ((zh0Var.getMeasuredWidth() * f11) / 2.0f)));
        final float top = iArr[1] - (zh0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        final int i10 = (-this.f45383f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f45386s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m mVar = m.this;
                mVar.f45388x = floatValue;
                float f12 = width;
                float z11 = e2.z(1.0f, f12, floatValue, f12);
                l lVar = mVar.f45389y;
                lVar.setScaleX(z11);
                lVar.setScaleY(z11);
                lVar.setTranslationX((1.0f - mVar.f45388x) * left);
                lVar.setTranslationY((1.0f - mVar.f45388x) * top);
                int i11 = (int) ((1.0f - mVar.f45388x) * width2);
                mVar.h.N(i11, i11);
                float a2 = q.a((mVar.f45388x * 2.0f) - 1.0f, 0.0f, 1.0f);
                mVar.f45382c.setAlpha((int) (a2 * 255.0f));
                mVar.d.setAlpha(a2);
                mVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = mVar.f45383f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - mVar.f45388x) * i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = mVar.f45387w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (mVar.f45388x * 255.0f));
                }
                mVar.f45384n.setAlpha(a2);
            }
        });
        this.f45386s.addListener(new rm0(this, z10, width, 1));
        this.f45386s.setDuration(220L);
        this.f45386s.setInterpolator(rr.f28031f);
        this.f45386s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f45387w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        l lVar = this.f45389y;
        int measuredWidth = (int) (lVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (lVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        m2 m2Var = this.E.f45394g;
        ((LaunchActivity) m2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = m2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f45387w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f45387w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f45389y, new ViewGroup.LayoutParams(-1, -1));
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
