package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class z51 extends Dialog {
    public final int A;
    public final int B;
    public final int[] C;
    public boolean D;
    public float E;
    public boolean F;
    public ValueAnimator G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public boolean K;
    public final d61 L;
    public final m51 f45074a;
    public final ImageReceiver f45075b;
    public final Rect f45076c;
    public final Rect d;
    public final Rect f45077e;
    public final Runnable f45078f;
    public final View h;
    public Bitmap f45079n;
    public Paint f45080r;
    public final n0 f45081s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout v;
    public org.telegram.ui.ActionBar.f3 f45082w;
    public boolean f45083x;
    public final int f45084y;

    public z51(d61 d61Var, Context context, Runnable runnable, View view, m51 m51Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        boolean z10;
        ImageLocation forDocument;
        String str;
        ColorFilter colorFilter;
        this.L = d61Var;
        Rect rect = new Rect();
        this.f45076c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.f45077e = rect3;
        int[] iArr = new int[2];
        this.C = iArr;
        this.D = false;
        this.K = false;
        this.f45074a = m51Var;
        this.f45078f = runnable;
        this.h = view;
        final s41 s41Var = (s41) this;
        n0 n0Var = new n0(s41Var, context, 23);
        this.f45081s = n0Var;
        setContentView(n0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new op0(s41Var, context, 6), i7.f6.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, c6Var);
        this.v = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, i7.f6.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.w0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil1Hour), false, c6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Hours), false, c6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil8Hours), false, c6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Days), false, c6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        s41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntilOther), false, c6Var).setOnClickListener(new t70(20, s41Var, context));
        n0Var.addView(linearLayout, i7.f6.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            z10 = true;
            n0Var.setOnApplyWindowInsetsListener(new r31(s41Var, 1));
            attributes.flags |= 1024;
            n0Var.setFitsSystemWindows(true);
            n0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z10 = true;
        }
        if (m51Var != null) {
            m51Var.f40427b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f45075b = imageReceiver;
        imageReceiver.setParentView(n0Var);
        imageReceiver.setLayerNum(7);
        TLRPC.Document document = m51Var.d;
        if (document == null) {
            Drawable drawable = m51Var.A;
            if (drawable instanceof org.telegram.ui.Components.p5) {
                document = ((org.telegram.ui.Components.p5) drawable).f31588e;
            }
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if ("video/webm".equals(document.mime_type)) {
                forDocument = ImageLocation.getForDocument(document);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                str = "160_160_g";
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.setImage(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", null, null, svgThumb, document.size, null, document2, 1);
            if ((m51Var.A instanceof org.telegram.ui.Components.p5) && (MessageObject.isTextColorEmoji(document2) || ((org.telegram.ui.Components.p5) m51Var.A).c())) {
                if (!MessageObject.isTextColorEmoji(document2)) {
                    org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) m51Var.A;
                    SparseArray sparseArray = org.telegram.ui.Components.p5.f31579q;
                    if (p5Var == null || !p5Var.l()) {
                        colorFilter = org.telegram.ui.ActionBar.g6.n0(c6Var);
                        imageReceiver.setColorFilter(colorFilter);
                    }
                }
                colorFilter = d61Var.f37335g1;
                imageReceiver.setColorFilter(colorFilter);
            }
        }
        m51Var.getLocationOnScreen(iArr);
        rect.left = m51Var.getPaddingLeft() + iArr[0];
        rect.top = m51Var.getPaddingTop() + iArr[1];
        rect.right = (m51Var.getWidth() + iArr[0]) - m51Var.getPaddingRight();
        rect.bottom = (m51Var.getHeight() + iArr[1]) - m51Var.getPaddingBottom();
        AndroidUtilities.lerp(rect, rect2, this.E, rect3);
        view.getLocationOnScreen(iArr);
        this.f45084y = iArr[0];
        int i10 = iArr[1];
        this.A = i10;
        this.B = view.getHeight() + i10;
    }

    public static void a(z51 z51Var, Integer num) {
        Runnable runnable;
        s41 s41Var = (s41) z51Var;
        if (num != null && (runnable = s41Var.O.f42550e.P1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(s41 s41Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            if (this.I == z10) {
                return;
            }
            valueAnimator.cancel();
        }
        this.I = z10;
        float f10 = this.H;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new w01(this, 10));
        this.J.addListener(new p60(8, this, z10));
        if (z10) {
            this.J.setDuration(360L);
            this.J.setInterpolator(org.telegram.ui.Components.jr.h);
        } else {
            this.J.setDuration(240L);
            this.J.setInterpolator(org.telegram.ui.Components.jr.f29801g);
        }
        this.J.start();
    }

    public final void d(final boolean z10, v51 v51Var, final v51 v51Var2, final boolean z11) {
        float f9;
        m51 m51Var = this.f45074a;
        if (m51Var == null) {
            if (v51Var != null) {
                v51Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            if (this.F == z10) {
                return;
            }
            valueAnimator.cancel();
        }
        this.F = z10;
        if (z10) {
            m51Var.f40427b = true;
        }
        final boolean[] zArr = new boolean[1];
        float f10 = this.E;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                z51 z51Var = z51.this;
                z51Var.E = floatValue;
                AndroidUtilities.lerp(z51Var.f45076c, z51Var.d, floatValue, z51Var.f45077e);
                z51Var.f45081s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    z51Var.v.setAlpha(z51Var.E);
                }
                if (z51Var.E < 0.025f && !z12) {
                    if (z11) {
                        z51Var.f45074a.f40427b = false;
                        z51Var.L.f37326d0.invalidate();
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                }
                if (z51Var.E < 0.5f && !z12 && (runnable = v51Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.G.addListener(new y51(this, z10, v51Var2, zArr, z11, v51Var));
        this.G.setDuration(420L);
        this.G.setInterpolator(org.telegram.ui.Components.jr.h);
        this.G.start();
    }

    @Override
    public void dismiss() {
        if (this.K) {
            return;
        }
        e(null);
        this.K = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!dispatchTouchEvent && motionEvent.getAction() == 0) {
            dismiss();
            return false;
        }
        return dispatchTouchEvent;
    }

    public final void e(java.lang.Integer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z51.e(java.lang.Integer):void");
    }

    public final void f() {
        Activity activity;
        int[] iArr;
        Context context = getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
        int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.083333336f, 0.083333336f);
        canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.O().getLastFragment().getVisibleDialog() != null) {
                launchActivity.O().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.C);
            canvas.save();
            canvas.translate(iArr[0], iArr[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
        this.f45080r = new Paint(1);
        this.f45079n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        d(true, null, null, true);
        c(true);
    }
}
