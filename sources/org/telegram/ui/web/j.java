package org.telegram.ui.web;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ii;
import org.telegram.ui.nc;
import w7.b6;
import w7.e6;
public final class j extends FrameLayout {
    public final h D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public org.telegram.ui.w L;
    public org.telegram.ui.p M;
    public org.telegram.ui.p N;
    public AsyncTask O;
    public final x4 f42866a;
    public boolean f42867b;
    public final org.telegram.ui.Cells.y f42868c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f42869f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView f42870n;
    public final TextView f42871r;
    public final TextView f42872s;
    public final bn f42873w;
    public final ii f42874x;
    public final ArrayList f42875y;

    public j(Activity activity) {
        super(activity);
        int i10 = e20.f15506s0;
        this.f42875y = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i11 = e20.f15506s0;
        ag.a aVar = new ag.a(this, 19);
        a aVar2 = new a(this);
        x4 x4Var = new x4(1, null);
        this.f42866a = x4Var;
        ii iiVar = new ii(this, activity, i11, aVar, aVar2, x4Var);
        this.f42874x = iiVar;
        iiVar.f31183f3.f29638r = false;
        iiVar.setOverScrollMode(2);
        iiVar.setPadding(0, 0, 0, 0);
        addView(iiVar, b6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.y b02 = t6.b0(this.G, this.I, 15, 15);
        this.f42868c = b02;
        frameLayout2.setBackground(b02);
        e6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, b6.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f42869f = imageView;
        frameLayout2.addView(imageView, b6.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.f42870n = imageView2;
        e6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232102);
        org.telegram.ui.Cells.y b03 = t6.b0(0, 0, 6, 6);
        this.h = b03;
        imageView2.setBackground(b03);
        frameLayout2.addView(imageView2, b6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, b6.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.f42871r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, b6.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.f42872s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, b6.t(-1, -2, 55, 0, 0, 0, 0));
        this.D = new h(null, i10, new w5(this, 12));
        this.f42873w = new bn(activity, 24);
        int i12 = t6.Dl;
        c(t6.x0(null, i12, false), org.telegram.messenger.i0.B(t6.x0(null, i12, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(kj kjVar) {
        TLRPC.Message message = kjVar.f16690k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = kjVar.v;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(kjVar.v);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                    return url;
                }
            }
            return null;
        }
        return null;
    }

    public static void b(android.content.Context r15, java.lang.String r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.j.b(android.content.Context, java.lang.String):void");
    }

    public final void c(int i10, int i11) {
        float f7;
        if (this.E != i10) {
            this.E = i10;
            invalidate();
        }
        this.H = i11;
        if (org.telegram.messenger.i0.B(i10) >= 0.721f) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.G = i0.b.f(org.telegram.messenger.i0.T1(0.05f, 0.12f, f7), i10, i11);
        this.F = i10;
        this.I = i0.b.f(org.telegram.messenger.i0.T1(0.12f, 0.22f, f7), i10, i11);
        int i12 = this.G;
        org.telegram.ui.Cells.y yVar = this.f42868c;
        t6.H1(yVar, i12, false);
        t6.H1(yVar, this.I, true);
        this.e.invalidate();
        this.f42871r.setTextColor(i11);
        this.f42872s.setTextColor(t6.r1(0.6f, i11));
        ImageView imageView = this.f42869f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.f42870n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        t6.H1(this.h, t6.r1(1.5f, this.I), true);
        int w9 = t6.w(i10, t6.r1(0.05f, i11));
        int w10 = t6.w(i10, t6.r1(0.55f, i11));
        x4 x4Var = this.f42866a;
        SparseIntArray sparseIntArray = (SparseIntArray) x4Var.f21529b;
        ((SparseIntArray) x4Var.f21529b).put(t6.f20930d6, this.F);
        sparseIntArray.put(t6.G6, i11);
        sparseIntArray.put(t6.e7, w9);
        sparseIntArray.put(t6.f7, w10);
        sparseIntArray.put(t6.G8, t6.r1(0.2f, i11));
        sparseIntArray.put(t6.f21021i6, t6.r1(org.telegram.messenger.i0.T1(0.05f, 0.12f, f7), i11));
        this.f42874x.g1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.J);
        canvas.drawColor(this.F);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.D;
        if (hVar != null && this.K) {
            hVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.D;
        if (hVar != null) {
            hVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.O;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        ArrayList arrayList = this.f42875y;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            ii iiVar = this.f42874x;
            iiVar.f31183f3.O(true);
            if (z10 != (!arrayList.isEmpty())) {
                iiVar.f31182e3.h1(0, 0);
                return;
            }
            return;
        }
        c1 c1Var = new c1(new nc(5, this, z10));
        String str3 = g1.a().f42849c;
        if (str3 != null) {
            StringBuilder t10 = a1.g.t(str3);
            t10.append(URLEncoder.encode(str));
            str2 = t10.toString();
        }
        this.O = c1Var.execute(str2);
    }

    public void setOpenProgress(float f7) {
        int i10;
        if (Math.abs(this.J - f7) > 1.0E-4f) {
            this.J = f7;
            if (f7 <= 1.0E-4f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (getImportantForAccessibility() != i10) {
                setImportantForAccessibility(i10);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        boolean z11;
        h hVar = this.D;
        if (z10 && hVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        if (z11) {
            hVar.a();
        }
    }
}
