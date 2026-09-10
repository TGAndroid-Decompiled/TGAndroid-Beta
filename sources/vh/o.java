package vh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.r4;
import qg.q0;
import w7.q;
public final class o extends Dialog {
    public final p E;
    public final int f43388a;
    public final int f43389b;
    public final Drawable f43390c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f43391f;
    public final yh0 h;
    public final l f43392n;
    public TLRPC.TL_chatInviteImporter f43393r;
    public ValueAnimator f43394s;
    public w9 v;
    public BitmapDrawable f43395w;
    public float f43396x;
    public final n f43397y;

    public o(p pVar, Activity activity, vl0 vl0Var, f6 f6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.E = pVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f43390c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        n nVar = new n(this, getContext());
        this.f43397y = nVar;
        setCancelable(true);
        nVar.setVisibility(4);
        int i11 = j6.G8;
        p2 p2Var = pVar.f43402g;
        int v02 = j6.v0(i11, p2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(nVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f43388a = rect.top;
        this.f43389b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, f6Var);
        this.f43391f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        nVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? r4Var = new r4(getContext());
        this.f43392n = r4Var;
        yh0 yh0Var = new yh0(activity, p2Var.getActionBar(), vl0Var, r4Var);
        this.h = yh0Var;
        yh0Var.setCreateThumbFromParent(true);
        nVar.addView(yh0Var);
        r4Var.setProfileGalleryView(yh0Var);
        nVar.addView(r4Var);
        textView.setMaxLines(1);
        textView.setTextColor(j6.v0(j6.G6, p2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        nVar.addView(textView);
        textView2.setTextColor(j6.v0(j6.f18306y6, p2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        nVar.addView(textView2);
        g1 g1Var = new g1(activity, true, false);
        int i12 = j6.E8;
        int v03 = j6.v0(i12, f6Var);
        int i13 = j6.F8;
        g1Var.c(v03, j6.v0(i13, f6Var));
        int i14 = j6.I5;
        g1Var.setSelectorColor(j6.v0(i14, f6Var));
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        g1Var.g(LocaleController.getString(i10), R.drawable.msg_requests, null);
        g1Var.setOnClickListener(new View.OnClickListener(this) {
            public final o f43383b;

            {
                this.f43383b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o oVar = this.f43383b;
                        p pVar2 = oVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = oVar.f43393r;
                        if (tL_chatInviteImporter != null) {
                            pVar2.d(tL_chatInviteImporter, true);
                        }
                        pVar2.f43413s.e(false);
                        pVar2.f43412r = null;
                        return;
                    case 1:
                        o.a(this.f43383b);
                        return;
                    default:
                        o oVar2 = this.f43383b;
                        p pVar3 = oVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = oVar2.f43393r;
                        if (tL_chatInviteImporter2 != null) {
                            pVar3.d(tL_chatInviteImporter2, false);
                        }
                        pVar3.f43413s.e(false);
                        pVar3.f43412r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(activity, false, false);
        g1Var2.c(j6.v0(i12, f6Var), j6.v0(i13, f6Var));
        g1Var2.setSelectorColor(j6.v0(i14, f6Var));
        g1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        g1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final o f43383b;

            {
                this.f43383b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o oVar = this.f43383b;
                        p pVar2 = oVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = oVar.f43393r;
                        if (tL_chatInviteImporter != null) {
                            pVar2.d(tL_chatInviteImporter, true);
                        }
                        pVar2.f43413s.e(false);
                        pVar2.f43412r = null;
                        return;
                    case 1:
                        o.a(this.f43383b);
                        return;
                    default:
                        o oVar2 = this.f43383b;
                        p pVar3 = oVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = oVar2.f43393r;
                        if (tL_chatInviteImporter2 != null) {
                            pVar3.d(tL_chatInviteImporter2, false);
                        }
                        pVar3.f43413s.e(false);
                        pVar3.f43412r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(j6.v0(j6.f18162q7, f6Var), j6.v0(j6.f18144p7, f6Var));
        g1Var3.setSelectorColor(j6.v0(i14, f6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        g1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final o f43383b;

            {
                this.f43383b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o oVar = this.f43383b;
                        p pVar2 = oVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = oVar.f43393r;
                        if (tL_chatInviteImporter != null) {
                            pVar2.d(tL_chatInviteImporter, true);
                        }
                        pVar2.f43413s.e(false);
                        pVar2.f43412r = null;
                        return;
                    case 1:
                        o.a(this.f43383b);
                        return;
                    default:
                        o oVar2 = this.f43383b;
                        p pVar3 = oVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = oVar2.f43393r;
                        if (tL_chatInviteImporter2 != null) {
                            pVar3.d(tL_chatInviteImporter2, false);
                        }
                        pVar3.f43413s.e(false);
                        pVar3.f43412r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static void a(o oVar) {
        p pVar = oVar.E;
        if (oVar.f43393r != null) {
            pVar.f43399b = true;
            p2 p2Var = pVar.f43402g;
            super.dismiss();
            p2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", oVar.f43393r.user_id);
            p2Var.presentFragment(new eo(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f43391f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f43394s;
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
        final int i10 = (-this.f43391f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f43394s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                o oVar = o.this;
                oVar.f43396x = floatValue;
                float f12 = width;
                float z11 = e2.z(1.0f, f12, floatValue, f12);
                n nVar = oVar.f43397y;
                nVar.setScaleX(z11);
                nVar.setScaleY(z11);
                nVar.setTranslationX((1.0f - oVar.f43396x) * left);
                nVar.setTranslationY((1.0f - oVar.f43396x) * top);
                int i11 = (int) ((1.0f - oVar.f43396x) * width2);
                oVar.h.N(i11, i11);
                float a2 = q.a((oVar.f43396x * 2.0f) - 1.0f, 0.0f, 1.0f);
                oVar.f43390c.setAlpha((int) (a2 * 255.0f));
                oVar.d.setAlpha(a2);
                oVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = oVar.f43391f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - oVar.f43396x) * i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = oVar.f43395w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (oVar.f43396x * 255.0f));
                }
                oVar.f43392n.setAlpha(a2);
            }
        });
        this.f43394s.addListener(new pm0(this, z10, width, 1));
        this.f43394s.setDuration(220L);
        this.f43394s.setInterpolator(wr.f28819f);
        this.f43394s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f43395w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        n nVar = this.f43397y;
        int measuredWidth = (int) (nVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (nVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        p2 p2Var = this.E.f43402g;
        ((LaunchActivity) p2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = p2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f43395w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f43395w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f43397y, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new q0(this, 17), 80L);
    }
}
