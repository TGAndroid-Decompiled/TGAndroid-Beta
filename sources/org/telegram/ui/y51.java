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
public abstract class y51 extends Dialog {
    public final int E;
    public final int F;
    public final int[] G;
    public boolean H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public float L;
    public boolean M;
    public ValueAnimator N;
    public boolean O;
    public final c61 P;
    public final l51 f45956a;
    public final ImageReceiver f45957b;
    public final Rect f45958c;
    public final Rect d;
    public final Rect e;
    public final Runnable f45959f;
    public final View h;
    public Bitmap f45960n;
    public Paint f45961r;
    public final k0 f45962s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout v;
    public org.telegram.ui.ActionBar.k3 f45963w;
    public boolean f45964x;
    public final int f45965y;

    public y51(c61 c61Var, Context context, Runnable runnable, View view, l51 l51Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        boolean z10;
        ImageLocation forDocument;
        String str;
        ColorFilter colorFilter;
        this.P = c61Var;
        Rect rect = new Rect();
        this.f45958c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.G = iArr;
        this.H = false;
        this.O = false;
        this.f45956a = l51Var;
        this.f45959f = runnable;
        this.h = view;
        final r41 r41Var = (r41) this;
        k0 k0Var = new k0(r41Var, context, 24);
        this.f45962s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new z10(r41Var, context, 9), org.telegram.ui.Components.gb1.x(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, u6Var);
        this.v = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.Components.gb1.x(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.w0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil1Hour), false, u6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Hours), false, u6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil8Hours), false, u6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Days), false, u6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        r41Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntilOther), false, u6Var).setOnClickListener(new xd0(13, r41Var, context));
        k0Var.addView(linearLayout, org.telegram.ui.Components.gb1.i(-2, -2, 17));
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
            k0Var.setOnApplyWindowInsetsListener(new p31(r41Var, 1));
            attributes.flags |= 1024;
            k0Var.setFitsSystemWindows(true);
            k0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z10 = true;
        }
        if (l51Var != null) {
            l51Var.f41139b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f45957b = imageReceiver;
        imageReceiver.setParentView(k0Var);
        imageReceiver.setLayerNum(7);
        TLRPC.Document document = l51Var.d;
        if (document == null) {
            Drawable drawable = l51Var.E;
            if (drawable instanceof org.telegram.ui.Components.t5) {
                document = ((org.telegram.ui.Components.t5) drawable).e;
            }
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23518m6, 0.2f);
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
            if ((l51Var.E instanceof org.telegram.ui.Components.t5) && (MessageObject.isTextColorEmoji(document2) || ((org.telegram.ui.Components.t5) l51Var.E).c())) {
                if (!MessageObject.isTextColorEmoji(document2)) {
                    org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) l51Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.t5.f32836r;
                    if (t5Var == null || !t5Var.l()) {
                        colorFilter = org.telegram.ui.ActionBar.y6.o0(u6Var);
                        imageReceiver.setColorFilter(colorFilter);
                    }
                }
                colorFilter = c61Var.f38303k1;
                imageReceiver.setColorFilter(colorFilter);
            }
        }
        l51Var.getLocationOnScreen(iArr);
        rect.left = l51Var.getPaddingLeft() + iArr[0];
        rect.top = l51Var.getPaddingTop() + iArr[1];
        rect.right = (l51Var.getWidth() + iArr[0]) - l51Var.getPaddingRight();
        rect.bottom = (l51Var.getHeight() + iArr[1]) - l51Var.getPaddingBottom();
        AndroidUtilities.lerp(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.f45965y = iArr[0];
        int i10 = iArr[1];
        this.E = i10;
        this.F = view.getHeight() + i10;
    }

    public static void a(y51 y51Var, Integer num) {
        Runnable runnable;
        r41 r41Var = (r41) y51Var;
        if (num != null && (runnable = r41Var.S.e.U1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(r41 r41Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            if (this.M == z10) {
                return;
            }
            valueAnimator.cancel();
        }
        this.M = z10;
        float f10 = this.L;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new v11(this, 7));
        this.N.addListener(new q40(9, this, z10));
        if (z10) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.ds.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.ds.f27585g);
        }
        this.N.start();
    }

    public final void d(final boolean z10, u51 u51Var, final u51 u51Var2, final boolean z11) {
        float f7;
        l51 l51Var = this.f45956a;
        if (l51Var == null) {
            if (u51Var != null) {
                u51Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            if (this.J == z10) {
                return;
            }
            valueAnimator.cancel();
        }
        this.J = z10;
        if (z10) {
            l51Var.f41139b = true;
        }
        final boolean[] zArr = new boolean[1];
        float f10 = this.I;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                y51 y51Var = y51.this;
                y51Var.I = floatValue;
                AndroidUtilities.lerp(y51Var.f45958c, y51Var.d, floatValue, y51Var.e);
                y51Var.f45962s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    y51Var.v.setAlpha(y51Var.I);
                }
                if (y51Var.I < 0.025f && !z12) {
                    if (z11) {
                        y51Var.f45956a.f41139b = false;
                        y51Var.P.f38296h0.invalidate();
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                }
                if (y51Var.I < 0.5f && !z12 && (runnable = u51Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.K.addListener(new x51(this, z10, u51Var2, zArr, z11, u51Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.ds.h);
        this.K.start();
    }

    @Override
    public void dismiss() {
        if (this.O) {
            return;
        }
        e(null);
        this.O = true;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y51.e(java.lang.Integer):void");
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
        canvas.drawColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.O().getLastFragment().getVisibleDialog() != null) {
                launchActivity.O().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.G);
            canvas.save();
            canvas.translate(iArr[0], iArr[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
        this.f45961r = new Paint(1);
        this.f45960n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        d(true, null, null, true);
        c(true);
    }
}
