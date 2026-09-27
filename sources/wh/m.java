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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s4;
import org.telegram.ui.xn;
import rg.q1;
import w7.q;
public final class m extends Dialog {
    public final n E;
    public final int f45425a;
    public final int f45426b;
    public final Drawable f45427c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f45428f;
    public final bi0 h;
    public final j f45429n;
    public TLRPC.TL_chatInviteImporter f45430r;
    public ValueAnimator f45431s;
    public w9 v;
    public BitmapDrawable f45432w;
    public float f45433x;
    public final l f45434y;

    public m(n nVar, Activity activity, yl0 yl0Var, e6 e6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = nVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f45427c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        l lVar = new l(this, getContext());
        this.f45434y = lVar;
        setCancelable(true);
        lVar.setVisibility(4);
        int i11 = i6.G8;
        o2 o2Var = nVar.f45439g;
        int v02 = i6.v0(i11, o2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(lVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f45425a = rect.top;
        this.f45426b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, e6Var);
        this.f45428f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        lVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? s4Var = new s4(getContext());
        this.f45429n = s4Var;
        bi0 bi0Var = new bi0(activity, o2Var.getActionBar(), yl0Var, s4Var);
        this.h = bi0Var;
        bi0Var.setCreateThumbFromParent(true);
        lVar.addView(bi0Var);
        s4Var.setProfileGalleryView(bi0Var);
        lVar.addView(s4Var);
        textView.setMaxLines(1);
        textView.setTextColor(i6.v0(i6.G6, o2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        lVar.addView(textView);
        textView2.setTextColor(i6.v0(i6.f19442y6, o2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        lVar.addView(textView2);
        g1 g1Var = new g1(activity, true, false);
        int i12 = i6.E8;
        int v03 = i6.v0(i12, e6Var);
        int i13 = i6.F8;
        g1Var.c(v03, i6.v0(i13, e6Var));
        int i14 = i6.I5;
        g1Var.setSelectorColor(i6.v0(i14, e6Var));
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        g1Var.g(LocaleController.getString(i10), R.drawable.msg_requests, null);
        g1Var.setOnClickListener(new View.OnClickListener(this) {
            public final m f45420b;

            {
                this.f45420b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45420b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45430r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45450s.e(false);
                        nVar2.f45449r = null;
                        return;
                    case 1:
                        m.a(this.f45420b);
                        return;
                    default:
                        m mVar2 = this.f45420b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45430r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45450s.e(false);
                        nVar3.f45449r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(activity, false, false);
        g1Var2.c(i6.v0(i12, e6Var), i6.v0(i13, e6Var));
        g1Var2.setSelectorColor(i6.v0(i14, e6Var));
        g1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        g1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final m f45420b;

            {
                this.f45420b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45420b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45430r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45450s.e(false);
                        nVar2.f45449r = null;
                        return;
                    case 1:
                        m.a(this.f45420b);
                        return;
                    default:
                        m mVar2 = this.f45420b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45430r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45450s.e(false);
                        nVar3.f45449r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(i6.v0(i6.f19297q7, e6Var), i6.v0(i6.f19278p7, e6Var));
        g1Var3.setSelectorColor(i6.v0(i14, e6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        g1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final m f45420b;

            {
                this.f45420b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m mVar = this.f45420b;
                        n nVar2 = mVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = mVar.f45430r;
                        if (tL_chatInviteImporter != null) {
                            nVar2.d(tL_chatInviteImporter, true);
                        }
                        nVar2.f45450s.e(false);
                        nVar2.f45449r = null;
                        return;
                    case 1:
                        m.a(this.f45420b);
                        return;
                    default:
                        m mVar2 = this.f45420b;
                        n nVar3 = mVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = mVar2.f45430r;
                        if (tL_chatInviteImporter2 != null) {
                            nVar3.d(tL_chatInviteImporter2, false);
                        }
                        nVar3.f45450s.e(false);
                        nVar3.f45449r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static void a(m mVar) {
        n nVar = mVar.E;
        if (mVar.f45430r != null) {
            nVar.f45436b = true;
            o2 o2Var = nVar.f45439g;
            super.dismiss();
            o2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", mVar.f45430r.user_id);
            o2Var.presentFragment(new xn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f45428f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f45431s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        bi0 bi0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / bi0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        final float left = iArr[0] - (bi0Var.getLeft() + ((int) ((bi0Var.getMeasuredWidth() * f11) / 2.0f)));
        final float top = iArr[1] - (bi0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        final int i10 = (-this.f45428f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f45431s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m mVar = m.this;
                mVar.f45433x = floatValue;
                float f12 = width;
                float z11 = e2.z(1.0f, f12, floatValue, f12);
                l lVar = mVar.f45434y;
                lVar.setScaleX(z11);
                lVar.setScaleY(z11);
                lVar.setTranslationX((1.0f - mVar.f45433x) * left);
                lVar.setTranslationY((1.0f - mVar.f45433x) * top);
                int i11 = (int) ((1.0f - mVar.f45433x) * width2);
                mVar.h.N(i11, i11);
                float a2 = q.a((mVar.f45433x * 2.0f) - 1.0f, 0.0f, 1.0f);
                mVar.f45427c.setAlpha((int) (a2 * 255.0f));
                mVar.d.setAlpha(a2);
                mVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = mVar.f45428f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - mVar.f45433x) * i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = mVar.f45432w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (mVar.f45433x * 255.0f));
                }
                mVar.f45429n.setAlpha(a2);
            }
        });
        this.f45431s.addListener(new tm0(this, z10, width, 1));
        this.f45431s.setDuration(220L);
        this.f45431s.setInterpolator(sr.f28359f);
        this.f45431s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f45432w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        l lVar = this.f45434y;
        int measuredWidth = (int) (lVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (lVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        o2 o2Var = this.E.f45439g;
        ((LaunchActivity) o2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = o2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f45432w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f45432w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f45434y, new ViewGroup.LayoutParams(-1, -1));
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
