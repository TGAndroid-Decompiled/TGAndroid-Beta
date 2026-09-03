package qh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.sj0;
import org.telegram.ui.vd1;
import org.telegram.ui.yh;
public abstract class a5 extends rv0 implements eg.l2, eg.h, eg.g2, ov0, x9 {
    public final dg.h2 A0;
    public float A1;
    public final DispatchQueue B0;
    public final Paint B1;
    public final MediaController.CropState C0;
    public final int C1;
    public boolean D0;
    public final p4 D1;
    public jv0 E0;
    public org.telegram.ui.ActionBar.p1 E1;
    public boolean F0;
    public z4 F1;
    public eg.j G0;
    public Rect G1;
    public boolean H0;
    public Runnable H1;
    public int I0;
    public Runnable I1;
    public boolean J0;
    public final aa J1;
    public final boolean K0;
    public AnimatorSet K1;
    public final r4 L0;
    public final i4 L1;
    public final t4 M0;
    public r6 M1;
    public final w4 N0;
    public ArrayList N1;
    public final v4 O0;
    public int O1;
    public final FrameLayout P0;
    public int P1;
    public final x4 Q0;
    public dg.e0 Q1;
    public final f4 R0;
    public final boolean R1;
    public final FrameLayout S0;
    public final File S1;
    public eg.i0 T0;
    public final boolean T1;
    public final View U0;
    public final boolean U1;
    public int V0;
    public boolean V1;
    public int W0;
    public qk0 W1;
    public float X0;
    public eg.y2 X1;
    public ValueAnimator Y0;
    public float Y1;
    public boolean Z0;
    public boolean Z1;
    public final eg.r2 f44922a1;
    public boolean a2;
    public final org.telegram.ui.Cells.f1 f44923b1;
    public org.telegram.ui.Components.ba f44924b2;
    public final int f44925c1;
    public final h5 f44926c2;
    public BigInteger f44927d1;
    public final i5 f44928d2;
    public TextView f44929e1;
    public boolean f44930e2;
    public TextView f44931f1;
    public ObjectAnimator f44932f2;
    public TextView f44933g1;
    public final float[] f44934g2;
    public final eg.m2 f44935h1;
    public k4 f44936h2;
    public final eg.i2 f44937i1;
    public boolean f44938i2;
    public final eg.o2 f44939j1;
    public boolean f44940j2;
    public final ImageView f44941k1;
    public boolean f44942k2;
    public final TextView l1;
    public final int[] f44943l2;
    public final TextView f44944m1;
    public mz f44945m2;
    public final TextView f44946n1;
    public boolean f44947n2;
    public final Paint f44948o1;
    public boolean f44949o2;
    public final Paint f44950p1;
    public boolean f44951p2;
    public float f44952q1;
    public int f44953q2;
    public boolean f44954r1;
    public boolean f44955r2;
    public o1.j f44956s1;
    public int f44957s2;
    public final g4 f44958t1;
    public int f44959t2;
    public final Paint f44960u1;
    public int f44961u2;
    public final Paint f44962v1;
    public boolean f44963v2;
    public final Paint f44964w1;
    public final eg.z1 f44965x0;
    public final dg.e2 f44966x1;
    public final eg.d2 f44967y0;
    public boolean f44968y1;
    public final Bitmap f44969z0;
    public o1.j f44970z1;

    public a5(Context context, boolean z4, File file, boolean z10, boolean z11, aa aaVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, r6 r6Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar, org.telegram.ui.ActionBar.g6 g6Var, h5 h5Var, i5 i5Var) {
        super(context, activity);
        r4 r4Var;
        dg.e2 e2Var;
        org.telegram.ui.Components.ba baVar2;
        p4 p4Var;
        DispatchQueue dispatchQueue;
        Bitmap bitmap3;
        Paint paint;
        Paint paint2;
        r4 r4Var2;
        int i14;
        this.V0 = 0;
        this.W0 = -1;
        final e9 e9Var = (e9) this;
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(e9Var, 11);
        this.f44923b1 = f1Var;
        Paint paint3 = new Paint(1);
        this.f44948o1 = paint3;
        Paint paint4 = new Paint(1);
        this.f44950p1 = paint4;
        this.f44960u1 = new Paint(1);
        this.f44962v1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f44964w1 = paint5;
        dg.e2 e2Var2 = new dg.e2(1.0f, 0.016773745f, -1);
        this.f44966x1 = e2Var2;
        this.B1 = new Paint(1);
        this.f44934g2 = new float[2];
        this.f44940j2 = false;
        this.f44943l2 = new int[2];
        new tl0(e9Var, 7);
        setDelegate(this);
        this.f44924b2 = baVar;
        this.f44926c2 = h5Var;
        this.R1 = z4;
        this.S1 = file;
        this.T1 = z10;
        this.U1 = z11;
        this.J1 = aaVar;
        this.O1 = i12;
        this.P1 = i13;
        this.f44928d2 = i5Var;
        this.C1 = i10;
        p4 p4Var2 = new p4(g6Var);
        this.D1 = p4Var2;
        this.C0 = cropState;
        this.K0 = context instanceof BubbleActivity;
        dg.e1 e6 = dg.e1.e(i10);
        e6.i(0, true);
        e2Var2.f4524a = e6.c();
        e2Var2.f4526c = e6.f4520i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.B0 = dispatchQueue2;
        this.f44969z0 = bitmap;
        this.f44925c1 = i11;
        dg.h2 h2Var = new dg.h2();
        this.A0 = h2Var;
        h2Var.f4556a = new mh.m5(e9Var, 27);
        View view = new View(context);
        this.U0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        dg.c1 c1Var = new dg.c1(getPaintingSize(), null, i11, baVar);
        if (r6Var == null || !r6Var.f46034u) {
            e2Var = e2Var2;
            baVar2 = baVar;
            p4Var = p4Var2;
            dispatchQueue = dispatchQueue2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            r4Var2 = r4Var;
        } else {
            e2Var = e2Var2;
            baVar2 = null;
            p4Var = p4Var2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            r4Var2 = r4Var;
            dispatchQueue = dispatchQueue2;
        }
        r4Var2 = new r4(e9Var, context, c1Var, bitmap3, bitmap2, baVar2);
        this.L0 = r4Var2;
        r4Var2.setDelegate(new s4(e9Var));
        r4Var2.setUndoStore(h2Var);
        r4Var2.setQueue(dispatchQueue);
        r4Var2.setVisibility(4);
        t4 t4Var = new t4(e9Var, context);
        this.M0 = t4Var;
        t4Var.setVisibility(4);
        v4 v4Var = new v4(e9Var, context, new u4(e9Var));
        this.O0 = v4Var;
        this.M1 = r6Var;
        this.N1 = arrayList;
        if (this.O1 > 0 && this.P1 > 0) {
            H0();
        }
        v4Var.setVisibility(4);
        this.N0 = new w4(e9Var, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, k7.c6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f44941k1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e9 e9Var2 = e9Var;
                        r4 r4Var3 = e9Var2.L0;
                        if (r4Var3 != null && (r4Var3.getCurrentBrush() instanceof dg.l)) {
                            r4Var3.b();
                            e9Var2.f44935h1.setSelectedIndex(1);
                            e9Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        e9Var2.A0.c();
                        return;
                    case 1:
                        e9 e9Var3 = e9Var;
                        r4 r4Var4 = e9Var3.L0;
                        dg.h2 h2Var2 = e9Var3.A0;
                        if (h2Var2.a()) {
                            if (r4Var4 != null && (r4Var4.getCurrentBrush() instanceof dg.l)) {
                                r4Var4.b();
                                e9Var3.f44935h1.setSelectedIndex(1);
                                e9Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            if (r4Var4 != null) {
                                r4Var4.a();
                            }
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            e9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        e9 e9Var4 = e9Var;
                        eg.j jVar = e9Var4.G0;
                        if (jVar instanceof eg.z3) {
                            AndroidUtilities.hideKeyboard(((eg.z3) jVar).getFocusedView());
                        }
                        if (e9Var4.f44947n2) {
                            e9Var4.v0(false);
                        }
                        e9Var4.C0(e9Var4.G0);
                        e9Var4.D0(null, true);
                        return;
                    case 3:
                        e9Var.D0(null, true);
                        return;
                    default:
                        e9 e9Var5 = e9Var;
                        if (e9Var5.f44968y1) {
                            e9Var5.I0(false);
                            return;
                        } else if (e9Var5.f44947n2) {
                            e9Var5.v0(true);
                            return;
                        } else if (e9Var5.H0) {
                            e9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = e9Var5.I1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, k7.c6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, k7.c6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, k7.c6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new eg.m(25));
        frameLayout.addView(linearLayout, k7.c6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.l1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e9 e9Var2 = e9Var;
                        r4 r4Var3 = e9Var2.L0;
                        if (r4Var3 != null && (r4Var3.getCurrentBrush() instanceof dg.l)) {
                            r4Var3.b();
                            e9Var2.f44935h1.setSelectedIndex(1);
                            e9Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        e9Var2.A0.c();
                        return;
                    case 1:
                        e9 e9Var3 = e9Var;
                        r4 r4Var4 = e9Var3.L0;
                        dg.h2 h2Var2 = e9Var3.A0;
                        if (h2Var2.a()) {
                            if (r4Var4 != null && (r4Var4.getCurrentBrush() instanceof dg.l)) {
                                r4Var4.b();
                                e9Var3.f44935h1.setSelectedIndex(1);
                                e9Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            if (r4Var4 != null) {
                                r4Var4.a();
                            }
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            e9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        e9 e9Var4 = e9Var;
                        eg.j jVar = e9Var4.G0;
                        if (jVar instanceof eg.z3) {
                            AndroidUtilities.hideKeyboard(((eg.z3) jVar).getFocusedView());
                        }
                        if (e9Var4.f44947n2) {
                            e9Var4.v0(false);
                        }
                        e9Var4.C0(e9Var4.G0);
                        e9Var4.D0(null, true);
                        return;
                    case 3:
                        e9Var.D0(null, true);
                        return;
                    default:
                        e9 e9Var5 = e9Var;
                        if (e9Var5.f44968y1) {
                            e9Var5.I0(false);
                            return;
                        } else if (e9Var5.f44947n2) {
                            e9Var5.v0(true);
                            return;
                        } else if (e9Var5.H0) {
                            e9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = e9Var5.I1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView h = yh.h(frameLayout, textView2, k7.c6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f44944m1 = h;
        h.setBackground(org.telegram.ui.ActionBar.k6.f0(822083583, 7, -1));
        h.setPadding(org.telegram.ui.b.e(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e9 e9Var2 = e9Var;
                        r4 r4Var3 = e9Var2.L0;
                        if (r4Var3 != null && (r4Var3.getCurrentBrush() instanceof dg.l)) {
                            r4Var3.b();
                            e9Var2.f44935h1.setSelectedIndex(1);
                            e9Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        e9Var2.A0.c();
                        return;
                    case 1:
                        e9 e9Var3 = e9Var;
                        r4 r4Var4 = e9Var3.L0;
                        dg.h2 h2Var2 = e9Var3.A0;
                        if (h2Var2.a()) {
                            if (r4Var4 != null && (r4Var4.getCurrentBrush() instanceof dg.l)) {
                                r4Var4.b();
                                e9Var3.f44935h1.setSelectedIndex(1);
                                e9Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            if (r4Var4 != null) {
                                r4Var4.a();
                            }
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            e9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        e9 e9Var4 = e9Var;
                        eg.j jVar = e9Var4.G0;
                        if (jVar instanceof eg.z3) {
                            AndroidUtilities.hideKeyboard(((eg.z3) jVar).getFocusedView());
                        }
                        if (e9Var4.f44947n2) {
                            e9Var4.v0(false);
                        }
                        e9Var4.C0(e9Var4.G0);
                        e9Var4.D0(null, true);
                        return;
                    case 3:
                        e9Var.D0(null, true);
                        return;
                    default:
                        e9 e9Var5 = e9Var;
                        if (e9Var5.f44968y1) {
                            e9Var5.I0(false);
                            return;
                        } else if (e9Var5.f44947n2) {
                            e9Var5.v0(true);
                            return;
                        } else if (e9Var5.H0) {
                            e9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = e9Var5.I1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h9 = yh.h(frameLayout, h, k7.c6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f44946n1 = h9;
        h9.setBackground(org.telegram.ui.ActionBar.k6.f0(822083583, 7, -1));
        h9.setPadding(org.telegram.ui.b.e(8.0f, R.string.Done, h9), 0, AndroidUtilities.dp(8.0f), 0);
        h9.setGravity(16);
        h9.setTextColor(-1);
        h9.setTypeface(AndroidUtilities.bold());
        h9.setTextSize(1, 16.0f);
        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e9 e9Var2 = e9Var;
                        r4 r4Var3 = e9Var2.L0;
                        if (r4Var3 != null && (r4Var3.getCurrentBrush() instanceof dg.l)) {
                            r4Var3.b();
                            e9Var2.f44935h1.setSelectedIndex(1);
                            e9Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        e9Var2.A0.c();
                        return;
                    case 1:
                        e9 e9Var3 = e9Var;
                        r4 r4Var4 = e9Var3.L0;
                        dg.h2 h2Var2 = e9Var3.A0;
                        if (h2Var2.a()) {
                            if (r4Var4 != null && (r4Var4.getCurrentBrush() instanceof dg.l)) {
                                r4Var4.b();
                                e9Var3.f44935h1.setSelectedIndex(1);
                                e9Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            if (r4Var4 != null) {
                                r4Var4.a();
                            }
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            e9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        e9 e9Var4 = e9Var;
                        eg.j jVar = e9Var4.G0;
                        if (jVar instanceof eg.z3) {
                            AndroidUtilities.hideKeyboard(((eg.z3) jVar).getFocusedView());
                        }
                        if (e9Var4.f44947n2) {
                            e9Var4.v0(false);
                        }
                        e9Var4.C0(e9Var4.G0);
                        e9Var4.D0(null, true);
                        return;
                    case 3:
                        e9Var.D0(null, true);
                        return;
                    default:
                        e9 e9Var5 = e9Var;
                        if (e9Var5.f44968y1) {
                            e9Var5.I0(false);
                            return;
                        } else if (e9Var5.f44947n2) {
                            e9Var5.v0(true);
                            return;
                        } else if (e9Var5.H0) {
                            e9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = e9Var5.I1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        h9.setAlpha(0.0f);
        h9.setVisibility(8);
        frameLayout.addView(h9, k7.c6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        x4 x4Var = new x4(e9Var, context, e6);
        this.Q0 = x4Var;
        x4Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        x4Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(x4Var, k7.c6.e(-1, 104, 80));
        eg.m2 m2Var = new eg.m2(context, (r6Var == null || r6Var.v() || r6Var.f46034u || baVar == null) ? false : true);
        this.f44935h1 = m2Var;
        m2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        m2Var.setDelegate(this);
        m2Var.setSelectedIndex(1);
        x4Var.addView(m2Var, k7.c6.c(48.0f, -1));
        eg.i2 i2Var = new eg.i2(context);
        this.f44937i1 = i2Var;
        i2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        i2Var.setVisibility(8);
        i2Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        e9 e9Var2 = e9Var;
                        dg.e2 e2Var3 = e9Var2.f44966x1;
                        e9Var2.F0(e2Var3);
                        dg.e1.e(i10).j(e2Var3.f4526c);
                        return;
                    default:
                        e9Var.f44937i1.setTypeface(dg.e1.e(i10).f4521j);
                        return;
                }
            }
        });
        i2Var.setAlignment(dg.e1.e(i10).f4519g);
        x4Var.addView(i2Var, k7.c6.c(48.0f, -1));
        f4 f4Var = new f4(e9Var, context);
        this.R0 = f4Var;
        addView(f4Var, k7.c6.c(-1.0f, -1));
        eg.o2 o2Var = new eg.o2(context);
        this.f44939j1 = o2Var;
        o2Var.setVisibility(8);
        o2Var.setOnItemClickListener(new ag.h(e9Var, 17));
        i2Var.setTypefaceListView(o2Var);
        f4Var.addView(o2Var, k7.c6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(p4Var.B0(org.telegram.ui.ActionBar.k6.G8));
        g4 g4Var = new g4(e9Var, context);
        this.f44958t1 = g4Var;
        g4Var.setVisibility(8);
        g4Var.setColorPalette(dg.e1.e(i10));
        g4Var.setColorListener(new dg.o(e9Var, 3));
        x4Var.addView(g4Var, k7.c6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        eg.z1 z1Var = new eg.z1(context);
        this.f44965x0 = z1Var;
        z1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        z1Var.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, -1));
        x4Var.addView(z1Var, k7.c6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        z1Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e9 e9Var2 = e9Var;
                        r4 r4Var3 = e9Var2.L0;
                        if (r4Var3 != null && (r4Var3.getCurrentBrush() instanceof dg.l)) {
                            r4Var3.b();
                            e9Var2.f44935h1.setSelectedIndex(1);
                            e9Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        e9Var2.A0.c();
                        return;
                    case 1:
                        e9 e9Var3 = e9Var;
                        r4 r4Var4 = e9Var3.L0;
                        dg.h2 h2Var2 = e9Var3.A0;
                        if (h2Var2.a()) {
                            if (r4Var4 != null && (r4Var4.getCurrentBrush() instanceof dg.l)) {
                                r4Var4.b();
                                e9Var3.f44935h1.setSelectedIndex(1);
                                e9Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            if (r4Var4 != null) {
                                r4Var4.a();
                            }
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            e9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        e9 e9Var4 = e9Var;
                        eg.j jVar = e9Var4.G0;
                        if (jVar instanceof eg.z3) {
                            AndroidUtilities.hideKeyboard(((eg.z3) jVar).getFocusedView());
                        }
                        if (e9Var4.f44947n2) {
                            e9Var4.v0(false);
                        }
                        e9Var4.C0(e9Var4.G0);
                        e9Var4.D0(null, true);
                        return;
                    case 3:
                        e9Var.D0(null, true);
                        return;
                    default:
                        e9 e9Var5 = e9Var;
                        if (e9Var5.f44968y1) {
                            e9Var5.I0(false);
                            return;
                        } else if (e9Var5.f44947n2) {
                            e9Var5.v0(true);
                            return;
                        } else if (e9Var5.H0) {
                            e9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = e9Var5.I1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        eg.d2 d2Var = new eg.d2(context);
        this.f44967y0 = d2Var;
        d2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        d2Var.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, -1));
        d2Var.setOnClickListener(new q31(e9Var, context, e6, 4));
        x4Var.addView(d2Var, k7.c6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        eg.r2 r2Var = new eg.r2(context);
        this.f44922a1 = r2Var;
        dg.e2 e2Var3 = e2Var;
        r2Var.setColorSwatch(e2Var3);
        r2Var.setRenderView(r4Var2);
        r2Var.setValueOverride(f1Var);
        e2Var3.f4526c = f1Var.get();
        r2Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        e9 e9Var2 = e9Var;
                        dg.e2 e2Var32 = e9Var2.f44966x1;
                        e9Var2.F0(e2Var32);
                        dg.e1.e(i10).j(e2Var32.f4526c);
                        return;
                    default:
                        e9Var.f44937i1.setTypeface(dg.e1.e(i10).f4521j);
                        return;
                }
            }
        });
        addView(r2Var, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S0 = frameLayout2;
        addView(frameLayout2, k7.c6.c(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(e2Var3, null, false);
        g((dg.m) dg.m.f4581a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.L1 = new i4(e9Var, aaVar, new org.telegram.ui.web.a2(2, e9Var, aaVar));
        x1.D = i14;
    }

    public static void G0(eg.z3 z3Var, int i10) {
        int i11;
        z3Var.setAlign(i10);
        int i12 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 19;
            } else {
                i11 = 21;
            }
        } else {
            i11 = 17;
        }
        z3Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        z3Var.getEditText().setTextAlignment(i12);
    }

    public static void Z(e9 e9Var, dg.e1 e1Var, Integer num) {
        e1Var.h(num.intValue(), true);
        e1Var.g();
        e9Var.setNewColor(num.intValue());
        e9Var.f44958t1.setSelectedColorIndex(e1Var.d());
        e9Var.Q1 = null;
    }

    public static void a0(e9 e9Var, Integer num) {
        e9Var.setNewColor(num.intValue());
        e9Var.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.V0 == 2) {
            return this.f44937i1;
        }
        return this.f44935h1;
    }

    private int getFrameRotation() {
        int i10 = this.f44925c1;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private jv0 getPaintingSize() {
        jv0 jv0Var = this.E0;
        if (jv0Var != null) {
            return jv0Var;
        }
        jv0 jv0Var2 = new jv0(1080.0f, 1920.0f);
        this.E0 = jv0Var2;
        return jv0Var2;
    }

    private void setCoverPause(boolean z4) {
        int i10 = 0;
        while (true) {
            v4 v4Var = this.O0;
            if (i10 < v4Var.getChildCount()) {
                View childAt = v4Var.getChildAt(i10);
                if (childAt instanceof eg.p3) {
                    ImageReceiver imageReceiver = ((eg.p3) childAt).f5439u0;
                    hj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    org.telegram.ui.Components.y5 animation = imageReceiver.getAnimation();
                    boolean z10 = !z4;
                    imageReceiver.setAllowStartLottieAnimation(z10);
                    imageReceiver.setAllowStartAnimation(z10);
                    if (lottieAnimation != null) {
                        if (z4) {
                            lottieAnimation.stop();
                        } else {
                            lottieAnimation.start();
                        }
                    } else if (animation != null) {
                        animation.f33355y = z4;
                        if (z4) {
                            animation.x(false);
                        }
                        if (z4) {
                            animation.stop();
                        } else {
                            animation.start();
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i10) {
        dg.e2 e2Var = this.f44966x1;
        int i11 = e2Var.f4524a;
        e2Var.f4524a = i10;
        E0(e2Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new eg.e0(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.I0 = i10;
        eg.j jVar = this.G0;
        if (jVar instanceof eg.z3) {
            ((eg.z3) jVar).setType(i10);
        }
        dg.e1 e6 = dg.e1.e(this.C1);
        e6.h = i10;
        e6.f4514a.edit().putInt("text_type", i10).apply();
        this.f44937i1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        eg.i0 i0Var = new eg.i0(this, context);
        this.T0 = i0Var;
        i0Var.setClipToPadding(false);
        this.T0.setOrientation(0);
        this.Q0.addView(this.T0, k7.c6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44929e1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f44929e1;
        int i10 = org.telegram.ui.ActionBar.k6.f21752i6;
        p4 p4Var = this.D1;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i10, p4Var), 7, -1));
        this.f44929e1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44929e1.setTextColor(-1);
        this.f44929e1.setTextSize(1, 14.0f);
        this.f44929e1.setGravity(1);
        this.f44929e1.setTypeface(AndroidUtilities.bold());
        this.f44929e1.setSingleLine();
        this.f44929e1.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f46096b;

            {
                this.f46096b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f46096b;
                        if (a5Var.H0) {
                            a5Var.D0(null, true);
                            return;
                        } else {
                            a5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f46096b.A0();
                        return;
                    default:
                        a5 a5Var2 = this.f46096b;
                        a5Var2.R0(2);
                        if (!(a5Var2.G0 instanceof eg.z3)) {
                            a5Var2.f44938i2 = true;
                            a5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.T0.addView(this.f44929e1, k7.c6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f44931f1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f44931f1.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i10, p4Var), 7, -1));
        this.f44931f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44931f1.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f46096b;

            {
                this.f46096b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f46096b;
                        if (a5Var.H0) {
                            a5Var.D0(null, true);
                            return;
                        } else {
                            a5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f46096b.A0();
                        return;
                    default:
                        a5 a5Var2 = this.f46096b;
                        a5Var2.R0(2);
                        if (!(a5Var2.G0 instanceof eg.z3)) {
                            a5Var2.f44938i2 = true;
                            a5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f44931f1.setTextColor(-1);
        this.f44931f1.setTextSize(1, 14.0f);
        this.f44931f1.setGravity(1);
        this.f44931f1.setTypeface(AndroidUtilities.bold());
        this.f44931f1.setAlpha(0.6f);
        this.f44931f1.setSingleLine();
        this.T0.addView(this.f44931f1, k7.c6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f44933g1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f44933g1.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i10, p4Var), 7, -1));
        this.f44933g1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f44933g1.setTextColor(-1);
        this.f44933g1.setTextSize(1, 14.0f);
        this.f44933g1.setGravity(1);
        this.f44933g1.setTypeface(AndroidUtilities.bold());
        this.f44933g1.setAlpha(0.6f);
        this.f44933g1.setSingleLine();
        this.f44933g1.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f46096b;

            {
                this.f46096b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f46096b;
                        if (a5Var.H0) {
                            a5Var.D0(null, true);
                            return;
                        } else {
                            a5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f46096b.A0();
                        return;
                    default:
                        a5 a5Var2 = this.f46096b;
                        a5Var2.R0(2);
                        if (!(a5Var2.G0 instanceof eg.z3)) {
                            a5Var2.f44938i2 = true;
                            a5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.T0.addView(this.f44933g1, k7.c6.l(1.0f, 0, -2));
    }

    public static boolean x0(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void A() {
        N0(new z3(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i10 = this.V0;
        R0(1);
        postDelayed(new sj0(this, 15), 350L);
        k4 k4Var = new k4(this, getContext(), this.D1, i10);
        this.f44936h2 = k4Var;
        aa aaVar = this.J1;
        Objects.requireNonNull(aaVar);
        k4Var.f46305w = new c4(aaVar, 1);
        final boolean[] zArr = {true};
        k4Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                a5 a5Var = a5.this;
                a5Var.f44936h2 = null;
                if (zArr[0]) {
                    a5Var.z0(false);
                }
                a5Var.R0(i10);
            }
        });
        k4Var.f46307y = new a4(this);
        k4Var.q0(new org.telegram.ui.Components.i(this, zArr, k4Var, 3));
        k4Var.show();
        z0(true);
    }

    public final void B0(eg.j jVar) {
        this.A0.b(jVar.getUUID(), new y3(this, jVar, 0));
    }

    public final void C0(eg.j jVar) {
        eg.j jVar2 = this.G0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f5282j0, false);
            D0(null, true);
            if (jVar instanceof eg.z3) {
                ValueAnimator valueAnimator = this.Y0;
                if (valueAnimator != null && this.W0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.O0.removeView(jVar);
        g0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            dg.h2 h2Var = this.A0;
            h2Var.f4557b.remove(uuid);
            h2Var.f4558c.remove(uuid);
            AndroidUtilities.runOnUIThread(new ag.e(h2Var, 20));
        }
        eg.r2 r2Var = this.f44922a1;
        org.telegram.ui.Cells.f1 f1Var = this.f44923b1;
        r2Var.setValueOverride(f1Var);
        r2Var.setShowPreview(true);
        float f10 = f1Var.get();
        dg.e2 e2Var = this.f44966x1;
        e2Var.f4526c = f10;
        E0(e2Var, null, false);
        if (!this.f44942k2 && (jVar instanceof eg.z2)) {
            ba baVar = ((e9) this).f45309x2;
            p9 p9Var = baVar.U0;
            if (p9Var != null) {
                p9Var.s(null, null, true);
            }
            e9 e9Var = baVar.f45100s1;
            if (e9Var != null) {
                e9Var.q0();
            }
            q9 q9Var = baVar.Z0;
            if (q9Var != null) {
                q9Var.setHasRoundVideo(false);
            }
            r6 r6Var = baVar.H1;
            if (r6Var != null) {
                File file = r6Var.f46023o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    baVar.H1.f46023o0 = null;
                }
                if (baVar.H1.f46025p0 != null) {
                    try {
                        new File(baVar.H1.f46025p0).delete();
                    } catch (Exception unused2) {
                    }
                    baVar.H1.f46025p0 = null;
                }
            }
        }
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(eg.j jVar, boolean z4) {
        boolean z10;
        la laVar;
        la laVar2;
        qk0 qk0Var;
        int i10;
        boolean z11 = jVar instanceof eg.z3;
        int i11 = 2;
        int i12 = 0;
        if (z11 && (((i10 = this.W0) == -1 && this.V0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.f44968y1) {
                I0(false);
            }
            R0(2);
        }
        boolean z12 = true;
        if (z11 && z4) {
            eg.z3 z3Var = (eg.z3) jVar;
            int gravity = z3Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            eg.i2 i2Var = this.f44937i1;
            i2Var.setAlignment(i11);
            dg.s0 typeface = z3Var.getTypeface();
            if (typeface != null) {
                i2Var.setTypeface(typeface.f4665a);
            }
            i2Var.e(z3Var.getType(), true);
            this.R0.invalidate();
        }
        eg.j jVar2 = this.G0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f5269a0) {
                    if (jVar instanceof eg.k1) {
                        eg.k1 k1Var = (eg.k1) jVar;
                        k1Var.setType((k1Var.getType() + 1) % k1Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof eg.a4) {
                        eg.a4 a4Var = (eg.a4) jVar;
                        a4Var.setType((a4Var.getType() + 1) % a4Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof eg.g1) {
                        eg.g1 g1Var = (eg.g1) jVar;
                        eg.e1 e1Var = g1Var.f5220n0;
                        if (e1Var.e()) {
                            if (e1Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            e1Var.setPreviewType(i12);
                            return true;
                        }
                        g1Var.setType(g1Var.getNextType());
                        return true;
                    } else if (!this.H0) {
                        if (jVar instanceof eg.z3) {
                            this.J0 = true;
                            r0();
                            return true;
                        } else if (jVar instanceof eg.y2) {
                            eg.y2 y2Var = (eg.y2) jVar;
                            if (this.Z1 && this.X1 == jVar) {
                                y2Var.q(true);
                                return true;
                            }
                            eg.y2 y2Var2 = this.X1;
                            if (y2Var2 != null && y2Var2 != y2Var && (qk0Var = this.W1) != null) {
                                qk0Var.animate().alpha(0.0f).setListener(new dk0(qk0Var, 2));
                                this.W1 = null;
                                this.Z1 = false;
                                this.Y1 = 0.0f;
                            }
                            if (this.W1 == null) {
                                qk0 qk0Var2 = new qk0(2, this.C1, getContext(), LaunchActivity.R(), new oh.n2(7, new oh.b()));
                                this.W1 = qk0Var2;
                                org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(this.f44924b2, qk0Var2, 0, false);
                                this.W1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.J1.addView(this.W1, k7.c6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                qk0 qk0Var3 = this.W1;
                                ?? obj = new Object();
                                obj.f2318e = this;
                                obj.f2317c = faVar;
                                obj.d = paint;
                                obj.f2316b = new Path();
                                qk0Var3.setDelegate(obj);
                                this.W1.p(null, null, true);
                            }
                            this.W1.setFragment(LaunchActivity.R());
                            this.X1 = y2Var;
                            O0(true);
                            return true;
                        } else {
                            M0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof eg.z3) {
                        AndroidUtilities.showKeyboard(((eg.z3) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.f5282j0, false);
            eg.j jVar3 = this.G0;
            if (jVar3 instanceof eg.z3) {
                eg.z3 z3Var2 = (eg.z3) jVar3;
                eg.x3 x3Var = z3Var2.f5599n0;
                x3Var.clearFocus();
                x3Var.setEnabled(false);
                x3Var.setClickable(false);
                z3Var2.m();
                if (!z11) {
                    this.H0 = false;
                    AndroidUtilities.hideKeyboard(((eg.z3) this.G0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof eg.z2) && (laVar2 = ((e9) this).f45309x2.W0) != null) {
                laVar2.l(false);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        eg.j jVar4 = this.G0;
        this.G0 = jVar;
        if ((jVar4 instanceof eg.z3) && TextUtils.isEmpty(((eg.z3) jVar4).getText())) {
            C0(jVar4);
        }
        eg.j jVar5 = this.G0;
        if (jVar4 != jVar5 && (jVar5 instanceof eg.z2) && (laVar = ((e9) this).f45309x2.W0) != null) {
            laVar.l(true);
        }
        eg.j jVar6 = this.G0;
        org.telegram.ui.Cells.f1 f1Var = this.f44923b1;
        dg.e2 e2Var = this.f44966x1;
        eg.r2 r2Var = this.f44922a1;
        if (jVar6 != null) {
            w4 w4Var = this.N0;
            jVar6.f5282j0 = w4Var;
            jVar6.l(w4Var, true);
            eg.j jVar7 = this.G0;
            if (jVar7 instanceof eg.z3) {
                eg.z3 z3Var3 = (eg.z3) jVar7;
                z3Var3.getSwatch().f4526c = e2Var.f4526c;
                z3Var3.f5608w0 = false;
                F0(z3Var3.getSwatch());
                r2Var.setValueOverride(new eg.h0(z3Var3, (int) (this.E0.f28201a / 9.0f), 1));
                r2Var.setShowPreview(false);
            } else {
                r2Var.setValueOverride(f1Var);
                r2Var.setShowPreview(true);
                e2Var.f4526c = f1Var.get();
                E0(e2Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.Y0;
            if (valueAnimator2 != null && this.W0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f44968y1) {
                I0(false);
            }
            R0(0);
            r2Var.setValueOverride(f1Var);
            r2Var.setShowPreview(true);
            e2Var.f4526c = f1Var.get();
            E0(e2Var, null, false);
            z12 = z10;
        }
        U0();
        return z12;
    }

    public final void E0(dg.e2 e2Var, Integer num, boolean z4) {
        dg.e2 e2Var2 = this.f44966x1;
        if (e2Var2 != e2Var) {
            e2Var2.f4524a = e2Var.f4524a;
            e2Var2.f4525b = e2Var.f4525b;
            e2Var2.f4526c = e2Var.f4526c;
            int i10 = this.C1;
            dg.e1.e(i10).h(e2Var.f4524a, true);
            dg.e1.e(i10).j(e2Var.f4526c);
        }
        int i11 = e2Var.f4524a;
        r4 r4Var = this.L0;
        r4Var.setColor(i11);
        r4Var.setBrushSize(e2Var.f4526c);
        int i12 = e2Var2.f4524a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new eg.s(this, num, i12, 2));
            duration.start();
        } else {
            x4 x4Var = this.Q0;
            if (x4Var != null) {
                x4Var.invalidate();
            }
        }
        eg.j jVar = this.G0;
        if (jVar instanceof eg.z3) {
            ((eg.z3) jVar).setSwatch(new dg.e2(e2Var.f4525b, e2Var.f4526c, e2Var.f4524a));
        } else if (z4 && (jVar instanceof eg.k1)) {
            ((eg.k1) jVar).setColor(e2Var.f4524a);
            ((eg.k1) this.G0).setType(3);
        } else if (z4 && (jVar instanceof eg.a4)) {
            ((eg.a4) jVar).setColor(e2Var.f4524a);
            ((eg.a4) this.G0).setType(3);
        } else if (z4 && (jVar instanceof eg.g1)) {
            ((eg.g1) jVar).setColor(e2Var.f4524a);
            ((eg.g1) this.G0).setType(0);
        }
    }

    public final void F0(dg.e2 e2Var) {
        E0(e2Var, null, false);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f44949o2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z4) {
                this.f44959t2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f44959t2).commit();
            } else {
                this.f44957s2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f44957s2).commit();
            }
        }
        boolean z12 = this.f44947n2;
        i4 i4Var = this.L1;
        if (z12) {
            if (z4) {
                i11 = this.f44959t2;
            } else {
                i11 = this.f44957s2;
            }
            int paddingUnderContainer = this.J1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f44945m2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f44945m2.setLayoutParams(layoutParams);
                this.f44953q2 = layoutParams.height;
                i4Var.a();
                requestLayout();
            }
        }
        if (this.f44961u2 == i10 && this.f44963v2 == z4) {
            return;
        }
        this.f44961u2 = i10;
        this.f44963v2 = z4;
        boolean z13 = this.f44949o2;
        eg.j jVar = this.G0;
        if (jVar instanceof eg.z3) {
            if (((eg.z3) jVar).getEditText().isFocused() && i4Var.c()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f44949o2 = z11;
        } else {
            this.f44949o2 = false;
        }
        if (this.f44949o2 && this.f44947n2) {
            J0(0);
        }
        if (this.f44953q2 != 0 && !(z10 = this.f44949o2) && z10 != z13 && !this.f44947n2) {
            this.f44953q2 = 0;
            i4Var.a();
            requestLayout();
        }
        U0();
        if (z13 && !this.f44949o2 && this.f44953q2 > 0 && this.f44955r2) {
            this.f44955r2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        eg.j jVar;
        ArrayList arrayList = this.N1;
        if (arrayList != null) {
            r6 r6Var = this.M1;
            this.M1 = null;
            this.N1 = null;
            int size = arrayList.size();
            boolean z4 = false;
            int i11 = 0;
            while (true) {
                v4 v4Var = this.O0;
                if (i11 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        o4 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            n02.r(z4);
                        }
                        ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        jVar = n02;
                    } else if (b10 == 1) {
                        eg.z3 o02 = o0(z4);
                        o02.setType(mediaEntity.subType);
                        o02.setTypeface(mediaEntity.textTypeface);
                        o02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                            i12++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(emojiEntity2.document_id, 1.0f, o02.getFontMetricsInt());
                            int i13 = emojiEntity2.offset;
                            spannableString.setSpan(u5Var, i13, emojiEntity2.length + i13, 33);
                            i11 = i11;
                        }
                        i10 = i11;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, o02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        o02.setText(replaceEmoji);
                        G0(o02, mediaEntity.textAlign);
                        dg.e2 swatch = o02.getSwatch();
                        swatch.f4524a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        jVar = o02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            eg.t2 k02 = k0(mediaEntity.text, false);
                            k02.D0 = mediaEntity.crop;
                            k02.f5493y0 = false;
                            if ((2 & mediaEntity.subType) != 0) {
                                k02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                k02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = k02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            jVar = k02;
                        } else if (b10 == 6) {
                            ArrayList arrayList3 = r6Var.v;
                            boolean z10 = r6Var.K;
                            this.f44938i2 = true;
                            eg.j n4Var = new n4(this, getContext(), e0(), arrayList3, this.f44924b2, z10, this.f44926c2);
                            n4Var.setDelegate(this);
                            v4Var.addView(n4Var);
                            g0();
                            jVar = n4Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = n4Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = n4Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = n4Var;
                                }
                            }
                        } else if (b10 == 3) {
                            eg.k1 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                j02.setColor(i14);
                            }
                            j02.setType(mediaEntity.subType);
                            jVar = j02;
                        } else if (b10 == 8) {
                            wa waVar = mediaEntity.weather;
                            if (waVar != null) {
                                eg.a4 p02 = p0(waVar);
                                int i15 = mediaEntity.color;
                                if (i15 != 0) {
                                    p02.setColor(i15);
                                }
                                p02.setType(mediaEntity.subType);
                                jVar = p02;
                            } else {
                                i11 = i10 + 1;
                                z4 = false;
                            }
                        } else if (b10 == 7) {
                            eg.g1 i02 = i0(mediaEntity.linkSettings);
                            eg.e1 e1Var = i02.f5220n0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                i02.setColor(i16);
                            }
                            boolean e6 = e1Var.e();
                            int i17 = e1Var.h;
                            int i18 = e1Var.f5178f;
                            if (e6) {
                                e1Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                e1Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(e1Var.U)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(e1Var.V)) + i17 + i17;
                                PointF position = i02.getPosition();
                                position.y = (this.P1 * 0.3f) + position.y;
                                i02.setPosition(position);
                                i11 = i10 + 1;
                                z4 = false;
                            } else {
                                i02.setType(b11);
                                jVar = i02;
                            }
                        } else if (b10 == 4) {
                            eg.y2 l02 = l0(false);
                            l02.s(ng.q0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                l02.r(false);
                            }
                            jVar = l02;
                            if (mediaEntity.mediaArea.dark) {
                                l02.q(false);
                                jVar = l02;
                            }
                        } else {
                            if (b10 == 5 && r6Var.f46023o0 != null) {
                                eg.z2 m0 = m0(r6Var.f46025p0, false);
                                ba baVar = ((e9) this).f45309x2;
                                p9 p9Var = baVar.U0;
                                if (p9Var != null) {
                                    p9Var.f45461w = m0;
                                    j71 j71Var = p9Var.f45463x;
                                    if (j71Var != null) {
                                        j71Var.V(m0.f5590r0);
                                    }
                                }
                                q9 q9Var = baVar.Z0;
                                if (q9Var != null) {
                                    q9Var.setHasRoundVideo(true);
                                }
                                jVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z11 = !m0.f5587o0;
                                    m0.f5587o0 = z11;
                                    m0.f5588p0.f(z11, true);
                                    m0.invalidate();
                                    jVar = m0;
                                }
                            }
                            i11 = i10 + 1;
                            z4 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f18081x * this.O1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f18082y * this.P1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
                    jVar.setScale(mediaEntity.scale);
                    jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    i11 = i10 + 1;
                    z4 = false;
                } else {
                    v4Var.setVisibility(0);
                    return;
                }
            }
        }
    }

    public final void I0(final boolean z4) {
        float f10;
        boolean z10;
        if (this.f44968y1 != z4) {
            this.f44968y1 = z4;
            o1.j jVar = this.f44970z1;
            if (jVar != null) {
                jVar.c();
            }
            float f11 = 1000.0f;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new kb.a(f10));
            this.f44970z1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z4) {
                f11 = 0.0f;
            }
            kVar.f16345i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f16338u = kVar;
            if (!this.L1.c() && this.f44953q2 <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            final boolean[] zArr = {z10};
            final float translationY = this.Q0.getTranslationY();
            final float alpha = this.f44967y0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f44970z1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14;
                    int i10;
                    a5 a5Var = a5.this;
                    x4 x4Var = a5Var.Q0;
                    float f15 = f12 / 1000.0f;
                    a5Var.A1 = f15;
                    float f16 = 1.0f;
                    float f17 = ((1.0f - f15) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY((Math.min(a5Var.A1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(a5Var.A1, 0.25f) / 0.25f));
                    g4 g4Var = a5Var.f44958t1;
                    float f18 = a5Var.A1;
                    boolean z11 = z4;
                    g4Var.x1(f18, z11);
                    eg.d2 d2Var = a5Var.f44967y0;
                    d2Var.setProgress(a5Var.A1);
                    eg.z1 z1Var = a5Var.f44965x0;
                    z1Var.setProgress(a5Var.A1);
                    a5Var.T0.setTranslationY(AndroidUtilities.dp(32.0f) * a5Var.A1);
                    AnimatorSet animatorSet = a5Var.K1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f19 = a5Var.A1;
                        if (!z11) {
                            f19 = 1.0f - f19;
                        }
                        if (z11) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        float f20 = alpha;
                        d2Var.setAlpha(AndroidUtilities.lerp(f20, f14, f19));
                        if (!z11) {
                            f16 = 0.0f;
                        }
                        z1Var.setAlpha(AndroidUtilities.lerp(f20, f16, f19));
                        float dp = AndroidUtilities.dp(39.0f) * f19;
                        if (z11) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        x4Var.setTranslationY(translationY - (dp * i10));
                    }
                    x4Var.invalidate();
                    if (view == a5Var.f44937i1) {
                        a5Var.R0.invalidate();
                    }
                }
            });
            this.f44970z1.a(new u3(this, z4, 0));
            this.f44970z1.f();
            if (z4) {
                g4 g4Var = this.f44958t1;
                g4Var.setVisibility(0);
                g4Var.setSelectedColorIndex(dg.e1.e(this.C1).d());
            }
        }
    }

    public final void J0(int i10) {
        boolean z4;
        int i11;
        eg.i2 i2Var = this.f44937i1;
        i4 i4Var = this.L1;
        if (i10 == 1) {
            mz mzVar = this.f44945m2;
            if (mzVar != null && mzVar.getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            mz mzVar2 = this.f44945m2;
            aa aaVar = this.J1;
            if (mzVar2 != null && mzVar2.Z0 != UserConfig.selectedAccount) {
                aaVar.removeView(mzVar2);
                this.f44945m2 = null;
            }
            if (this.f44945m2 == null) {
                mz mzVar3 = new mz(null, true, false, false, getContext(), false, null, null, true, this.D1, false, false);
                this.f44945m2 = mzVar3;
                mzVar3.f29332u2 = false;
                mzVar3.R0 = true;
                mzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f44945m2.setForseMultiwindowLayout(true);
                }
                this.f44945m2.setDelegate(new q4(this));
                aaVar.addView(this.f44945m2);
            }
            this.f44945m2.setVisibility(0);
            this.f44947n2 = true;
            mz mzVar4 = this.f44945m2;
            if (this.f44957s2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f44957s2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f44957s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f44959t2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f44959t2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f44959t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f44959t2;
            } else {
                i11 = this.f44957s2;
            }
            int paddingUnderContainer = aaVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            mzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                eg.j jVar = this.G0;
                if (jVar instanceof eg.z3) {
                    AndroidUtilities.hideKeyboard(((eg.z3) jVar).getEditText());
                }
            }
            this.f44953q2 = paddingUnderContainer;
            i4Var.a();
            requestLayout();
            qg emojiButton = i2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            if (!z4) {
                if (this.f44949o2) {
                    this.f44955r2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44953q2, 0.0f);
                    ofFloat.addUpdateListener(new v3(this, 1));
                    ofFloat.addListener(new j4(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
                    ofFloat.start();
                }
            }
        } else {
            qg emojiButton2 = i2Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(og.f29751e, true);
            }
            mz mzVar5 = this.f44945m2;
            if (mzVar5 != null) {
                this.f44947n2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    mzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f44953q2 = 0;
                i4Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(eg.g1 g1Var) {
        a7 a7Var = new a7(getContext(), this.D1, this.f44928d2, new org.telegram.ui.web.a2(4, this, g1Var));
        if (g1Var != null) {
            eg.d1 d1Var = g1Var.f5224r0;
            a7Var.Z = true;
            org.telegram.ui.Cells.i3 i3Var = a7Var.W;
            org.telegram.ui.Cells.i3 i3Var2 = a7Var.V;
            if (d1Var != null) {
                a7Var.f44985d0 = d1Var.d;
                a7Var.f44986e0 = false;
                i3Var2.setText(d1Var.f5153c);
                i3Var.setText(d1Var.f5152b);
                a7Var.f44991j0 = !TextUtils.isEmpty(d1Var.f5152b);
                a7Var.f44992k0 = d1Var.f5155f;
                a7Var.f44993l0 = d1Var.f5154e;
            } else {
                i3Var2.setText("");
                i3Var.setText("");
                a7Var.f44992k0 = true;
                a7Var.f44993l0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = a7Var.Y;
            dVar.g(string, false, true);
            w6 w6Var = a7Var.U;
            if (w6Var != null) {
                w6Var.N(false);
            }
            dVar.setEnabled(a7Var.V(i3Var2.getText().toString()));
            a7Var.Z = false;
        }
        a7Var.setOnDismissListener(new d4(this, 1));
        a7Var.show();
        z0(true);
    }

    public final void L0(eg.k1 k1Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        mi miVar = new mi(getContext(), new l4(this, callback2), false, true, false, this.D1);
        miVar.W1 = new Object();
        mh mhVar = miVar.f29116u1;
        if (k1Var != null && (messageMedia = k1Var.f5319r0) != null && (geoPoint = messageMedia.geo) != null) {
            miVar.f29117u2 = new double[]{geoPoint.lat, geoPoint._long};
            miVar.L = true;
            mhVar.setVisibility(8);
        } else if (this.R1) {
            miVar.f29111s2 = this.T1;
            miVar.f29114t2 = this.S1;
            miVar.L = true;
            mhVar.setVisibility(8);
        } else {
            miVar.L = true;
            mhVar.setVisibility(8);
        }
        miVar.setOnDismissListener(new d4(this, 0));
        miVar.r1();
        miVar.show();
    }

    public final void M0(eg.j jVar) {
        if (jVar instanceof eg.y1) {
            org.telegram.ui.ActionBar.p1 p1Var = this.E1;
            if (p1Var != null && p1Var.isShowing()) {
                this.E1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f44943l2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        v4 v4Var = this.O0;
        float scaleX2 = v4Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = v4Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new y3(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, a5 a5Var, int i10, int i11, int i12, boolean z4) {
        org.telegram.ui.ActionBar.p1 p1Var = this.E1;
        if (p1Var != null && p1Var.isShowing()) {
            this.E1.d(true);
            return;
        }
        if (this.F1 == null) {
            this.G1 = new Rect();
            z4 z4Var = new z4(this, getContext());
            this.F1 = z4Var;
            z4Var.setAnimationEnabled(true);
            this.F1.setOnTouchListener(new eg.u(this, 1));
            this.F1.setDispatchKeyEventListener(new a4(this));
            this.F1.setShownFromBottom(true);
        }
        z4 z4Var2 = this.F1;
        z4Var2.T = z4;
        z4Var2.d();
        runnable.run();
        if (this.E1 == null) {
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(this.F1, -2, -2);
            this.E1 = p1Var2;
            p1Var2.f22218b = true;
            p1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.E1.setOutsideTouchable(true);
            this.E1.setClippingEnabled(true);
            this.E1.setInputMethodMode(2);
            this.E1.setSoftInputMode(0);
            this.E1.getContentView().setFocusableInTouchMode(true);
            this.E1.setOnDismissListener(new eg.w(this, 1));
        }
        this.F1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.E1.setFocusable(true);
        int measuredWidth = i11 - (this.F1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.F1.getMeasuredHeight();
        this.E1.showAtLocation(a5Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.p1.i(this.F1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z4) {
            z4 z4Var3 = this.F1;
            z4Var3.setBackgroundDrawable(new org.telegram.ui.Components.ea(new org.telegram.ui.Components.fa(this.f44924b2, z4Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.F1.setBackgroundDrawable(mutate);
        this.F1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z4) {
        if (this.Z1 != z4) {
            if (z4 || this.W1 != null) {
                this.Z1 = z4;
                if (z4) {
                    this.W1.n();
                    this.W1.setVisibility(0);
                    this.W1.setSelectedReaction(this.X1.getCurrentReaction());
                    this.W1.getParent().bringChildToFront(this.W1);
                } else {
                    this.X1 = null;
                }
                float f10 = 0.0f;
                if (z4) {
                    this.a2 = true;
                    this.J1.invalidate();
                    float f11 = this.Y1;
                    if (z4) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.W1.setTransitionProgress(this.Y1);
                    ofFloat.addUpdateListener(new v3(this, 2));
                    ofFloat.addListener(new vd1(11, this, z4));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(pr.f30169g);
                    ofFloat.start();
                    return;
                }
                if (this.W1.getReactionsWindow() != null) {
                    this.W1.getReactionsWindow().e();
                }
                this.W1.animate().alpha(0.0f).setDuration(150L).setListener(new j4(this, 0)).start();
            }
        }
    }

    public final void P0(boolean z4) {
        float f10;
        if (this.f44954r1 != z4) {
            this.f44954r1 = z4;
            o1.j jVar = this.f44956s1;
            if (jVar != null) {
                jVar.c();
            }
            float f11 = 1000.0f;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new kb.a(f10));
            this.f44956s1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z4) {
                f11 = 0.0f;
            }
            kVar.f16345i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f16338u = kVar;
            if (z4) {
                eg.o2 o2Var = this.f44939j1;
                o2Var.setAlpha(0.0f);
                o2Var.setVisibility(0);
            }
            this.f44956s1.b(new ag.c(3, this));
            this.f44956s1.a(new u3(this, z4, 1));
            this.f44956s1.f();
        }
    }

    public final PointF Q0(eg.j jVar) {
        float f10;
        float f11 = 200.0f;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f11 = 200.0f / cropState.cropScale;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f12 = 100.0f;
        if (cropState != null) {
            f12 = 100.0f / cropState.cropScale;
        }
        PointF e02 = e0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z4 = false;
            while (true) {
                v4 v4Var = this.O0;
                if (i11 >= v4Var.getChildCount()) {
                    break;
                }
                View childAt = v4Var.getChildAt(i11);
                if (!(childAt instanceof eg.j) || (childAt instanceof eg.y1)) {
                    f10 = f12;
                } else {
                    PointF position2 = ((eg.j) childAt).getPosition();
                    f10 = f12;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z4 = true;
                    }
                }
                i11++;
                f12 = f10;
            }
            float f13 = f12;
            if (!z4) {
                break;
            }
            i10++;
            e02 = new PointF(e02.x + f11, e02.y + f11);
            f12 = f13;
        }
        return e02;
    }

    @Override
    public final int R() {
        return this.L1.f45400l - this.J1.getBottomPadding2();
    }

    public final void R0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z4;
        if (this.V0 != i10 && this.W0 != i10) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.V0;
            ViewGroup viewGroup3 = this.f44937i1;
            ViewGroup viewGroup4 = this.f44935h1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.W0 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.C1;
            dg.e1 e6 = dg.e1.e(i12);
            if (i10 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (e6.f4523l != z4) {
                e6.f4523l = z4;
                if (z4) {
                    e6.i(-1, false);
                } else {
                    e6.i(e6.f4514a.getInt("brush", 0), false);
                }
            }
            int c3 = dg.e1.e(i12).c();
            dg.e2 e2Var = this.f44966x1;
            e2Var.f4524a = c3;
            E0(e2Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.Y0 = duration;
            duration.setInterpolator(pr.f30168f);
            this.Y0.addUpdateListener(new eg.q(this, viewGroup, viewGroup2, 2));
            this.Y0.addListener(new eg.j0(this, viewGroup, viewGroup2, i10, 2));
            this.Y0.start();
        }
    }

    public final void S0() {
        boolean z4;
        i4 i4Var = this.L1;
        eg.i2 i2Var = this.f44937i1;
        if (i2Var != null) {
            if (i4Var.c()) {
                i2Var.a(R.drawable.input_smile);
            } else if (this.f44947n2) {
                i2Var.a(R.drawable.input_keyboard);
            } else {
                i2Var.a(R.drawable.msg_add);
            }
        }
        if (!i4Var.c() && !this.f44947n2) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z10 = !z4;
        AndroidUtilities.updateViewShow(this.l1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f44941k1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f44946n1, z4, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f44944m1, z4, false, 1.0f, true, null);
    }

    public final void T0() {
        float f10;
        eg.j jVar;
        ObjectAnimator objectAnimator = this.f44932f2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.L0.getParent();
        if (view == null) {
            return;
        }
        i4 i4Var = this.L1;
        if (((i4Var.c() && !i4Var.d) || this.f44953q2 > 0) && (jVar = this.G0) != null) {
            f10 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f10);
        this.f44932f2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f44932f2.setInterpolator(pr.h);
        this.f44932f2.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: qh.a5.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final int[] b(eg.j jVar) {
        int[] iArr = this.f44943l2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    @Override
    public final void d() {
        setTextType((this.I0 + 1) % 4);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new bh1(20, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f44940j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10 = 0;
        if ((view == this.L0 || view == this.M0 || view == this.O0 || view == this.N0) && (cropState = this.C0) != null) {
            canvas.save();
            if (!this.K0) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = cropState.transformRotation;
            if (i11 != 90 && i11 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i10 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i10 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final void e() {
        this.B1.setColor(-15132391);
    }

    public final PointF e0() {
        v4 v4Var = this.O0;
        int measuredWidth = v4Var.getMeasuredWidth();
        int measuredHeight = v4Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.O1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.P1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override
    public final void f(int i10) {
        eg.j jVar = this.G0;
        if (jVar instanceof eg.z3) {
            G0((eg.z3) jVar, i10);
            dg.e1 e6 = dg.e1.e(this.C1);
            e6.f4519g = i10;
            e6.f4514a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public abstract boolean f0(im imVar);

    @Override
    public final void g(dg.m mVar) {
        boolean z4 = mVar instanceof dg.b;
        eg.r2 r2Var = this.f44922a1;
        if (!z4 && !(mVar instanceof dg.d)) {
            r2Var.b(0.05f, 1.0f);
        } else {
            r2Var.b(0.4f, 1.75f);
        }
        r2Var.setDrawCenter(!(mVar instanceof dg.l));
        r4 r4Var = this.L0;
        if (r4Var.getCurrentBrush() instanceof dg.l) {
            this.Z0 = true;
        }
        r4Var.setBrush(mVar);
        dg.e2 e2Var = this.f44966x1;
        int i10 = e2Var.f4524a;
        e2Var.f4524a = dg.e1.e(this.C1).c();
        e2Var.f4526c = this.f44923b1.get();
        E0(e2Var, Integer.valueOf(i10), false);
        this.M0.invalidate();
    }

    public final void g0() {
        org.telegram.ui.Components.u5[] u5VarArr;
        boolean z4 = this.T1;
        v4 v4Var = this.O0;
        boolean z10 = true;
        if (!z4 && !this.V1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < v4Var.getChildCount()) {
                    View childAt = v4Var.getChildAt(i10);
                    boolean z11 = childAt instanceof eg.z3;
                    int i11 = this.C1;
                    if (z11) {
                        CharSequence text = ((eg.z3) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.u5 u5Var : (org.telegram.ui.Components.u5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.u5.class)) {
                                TLRPC.Document document = u5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.l5.f(i11, u5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.l5.h(i11).e(document);
                                }
                                if (r6.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (childAt instanceof eg.p3) {
                        TLRPC.Document sticker = ((eg.p3) childAt).getSticker();
                        if (r6.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof eg.z2) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
        }
        for (int i12 = 0; i12 < v4Var.getChildCount(); i12++) {
            View childAt2 = v4Var.getChildAt(i12);
            if (childAt2 instanceof eg.j) {
                ((eg.j) childAt2).setIsVideo(z10);
            }
        }
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.L0.c(true, false);
    }

    public View getBottomLayout() {
        return this.Q0;
    }

    public View getCancelView() {
        return this.f44965x0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f44967y0;
    }

    public View getEntitiesView() {
        return this.O0;
    }

    public long getLcm() {
        return this.f44927d1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.u5[] u5VarArr;
        v4 v4Var = this.O0;
        int childCount = v4Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = v4Var.getChildAt(i10);
            if (childAt instanceof eg.p3) {
                TLRPC.Document sticker = ((eg.p3) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f20857id = sticker.f20851id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof eg.z3) {
                CharSequence text = ((eg.z3) childAt).getText();
                if ((text instanceof Spanned) && (u5VarArr = (org.telegram.ui.Components.u5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.u5.class)) != null) {
                    for (org.telegram.ui.Components.u5 u5Var : u5VarArr) {
                        if (u5Var != null) {
                            TLRPC.Document document = u5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.l5.f(this.C1, u5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f20857id = document.f20851id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.L0, this.M0, this.O0, this.N0);
    }

    public View getRenderInputView() {
        return this.M0;
    }

    public dg.o1 getRenderView() {
        return this.L0;
    }

    public eg.j getSelectedEntity() {
        return this.G0;
    }

    public View getSelectionEntitiesView() {
        return this.N0;
    }

    public View getTextDimView() {
        return this.U0;
    }

    public View getTopLayout() {
        return this.P0;
    }

    public View getWeightChooserView() {
        return this.f44922a1;
    }

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, this.D1));
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(str);
        return textView;
    }

    public final eg.g1 i0(eg.d1 d1Var) {
        int measuredWidth;
        int i10;
        this.f44938i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        v4 v4Var = this.O0;
        if (v4Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.O1;
        } else {
            measuredWidth = v4Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        eg.g1 g1Var = new eg.g1(getContext(), Q0, this.C1, d1Var, f10 / 360.0f, dp);
        if (Q0.x == v4Var.getMeasuredWidth() / 2.0f) {
            g1Var.setStickyX(2);
        }
        if (Q0.y == v4Var.getMeasuredHeight() / 2.0f) {
            g1Var.setStickyY(2);
        }
        dg.e2 e2Var = this.f44966x1;
        if (e2Var != null && (i10 = e2Var.f4524a) != -47814) {
            g1Var.setColor(i10);
        }
        g1Var.setDelegate(this);
        g1Var.setMaxWidth(dp);
        v4Var.addView(g1Var, k7.c6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            g1Var.j(1.0f / cropState.cropScale);
            g1Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return g1Var;
    }

    public final eg.k1 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f44938i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        v4 v4Var = this.O0;
        if (v4Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.O1;
        } else {
            measuredWidth = v4Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        eg.k1 k1Var = new eg.k1(getContext(), Q0, this.C1, messageMedia, mediaArea, f10 / 240.0f, dp);
        if (Q0.x == v4Var.getMeasuredWidth() / 2.0f) {
            k1Var.setStickyX(2);
        }
        if (Q0.y == v4Var.getMeasuredHeight() / 2.0f) {
            k1Var.setStickyY(2);
        }
        dg.e2 e2Var = this.f44966x1;
        if (e2Var != null && (i10 = e2Var.f4524a) != -47814) {
            k1Var.setColor(i10);
        }
        k1Var.setDelegate(this);
        k1Var.setMaxWidth(dp);
        v4Var.addView(k1Var, k7.c6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            k1Var.j(1.0f / cropState.cropScale);
            k1Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return k1Var;
    }

    public final eg.t2 k0(String str, boolean z4) {
        float f10;
        jv0 jv0Var;
        this.f44938i2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e6) {
            FileLog.e(e6);
            f10 = 1.0f;
        }
        v4 v4Var = this.O0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.O1, v4Var.getMeasuredWidth()) * 0.5d);
            jv0Var = new jv0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.P1, v4Var.getMeasuredHeight()) * 0.5d);
            jv0Var = new jv0(f10 * floor2, floor2);
        }
        jv0 jv0Var2 = jv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = jv0Var2.f28201a;
            jv0Var2.f28201a = jv0Var2.f28202b;
            jv0Var2.f28202b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        eg.t2 t2Var = new eg.t2(context, e02, jv0Var2, str, intValue);
        t2Var.setDelegate(this);
        v4Var.addView(t2Var);
        g0();
        return t2Var;
    }

    public final eg.y2 l0(boolean z4) {
        String str;
        jv0 jv0Var = new jv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        v4 v4Var = this.O0;
        if (v4Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < v4Var.getChildCount(); i10++) {
                    View childAt = v4Var.getChildAt(i10);
                    if (k7.o6.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (v4Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (v4Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, v4Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, v4Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new eg.j(getContext(), e02);
        jVar.f5566o0 = new oh.o8(jVar);
        jVar.f5567p0 = new oh.o8(jVar);
        jVar.f5568q0 = new ng.h0(jVar);
        jVar.f5569r0 = new ng.h0(jVar);
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5((View) jVar);
        jVar.f5571t0 = z5Var;
        org.telegram.ui.Components.z5 z5Var2 = new org.telegram.ui.Components.z5((View) jVar);
        jVar.f5572u0 = z5Var2;
        jVar.f5574w0 = 1.0f;
        jVar.f5565n0 = jv0Var;
        z5Var2.d(1.0f, true);
        z5Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        ng.h0 h0Var = jVar.f5568q0;
        int i11 = 0;
        while (true) {
            if (i11 < reactionsList.size()) {
                if (reactionsList.get(i11).title.equals("Red Heart")) {
                    str = reactionsList.get(i11).reaction;
                    break;
                }
                i11++;
            } else {
                str = reactionsList.get(0).reaction;
                break;
            }
        }
        ng.q0 b10 = ng.q0.b(str);
        jVar.f5570s0 = b10;
        h0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        v4Var.addView(jVar);
        g0();
        if (z4) {
            B0(jVar);
            D0(jVar, true);
        }
        return jVar;
    }

    @Override
    public final boolean m(MotionEvent motionEvent) {
        if (this.f44940j2) {
            return false;
        }
        if (this.G0 != null) {
            D0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.L0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final eg.z2 m0(String str, boolean z4) {
        float f10;
        this.f44938i2 = true;
        this.f44942k2 = true;
        q0();
        v4 v4Var = this.O0;
        int measuredWidth = v4Var.getMeasuredWidth();
        v4Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.O1;
        }
        float floor = (float) Math.floor(0.43f * f10);
        jv0 jv0Var = new jv0(floor, floor);
        eg.z2 z2Var = new eg.z2(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (jv0Var.f28202b / 2.0f) + AndroidUtilities.dp(72.0f)), jv0Var, str);
        z2Var.setDelegate(this);
        v4Var.addView(z2Var);
        g0();
        if (z4) {
            B0(z2Var);
            post(new r3(this, z2Var, 0));
        }
        this.f44942k2 = false;
        return z2Var;
    }

    public final o4 n0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f11 = 0.75f;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f11 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        eg.b1 b1Var = new eg.b1(e0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f28201a * 0.5d);
        o4 o4Var = new o4(this, context, b1Var.f5091a, b1Var.f5093c, b1Var.f5092b, new jv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = o4Var.f5439u0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        o4Var.setDelegate(this);
        this.O0.addView(o4Var);
        g0();
        return o4Var;
    }

    public final eg.z3 o0(boolean z4) {
        jv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        eg.z3 z3Var = new eg.z3(getContext(), Q0, (int) (paintingSize.f28201a / 9.0f), "", this.f44966x1, this.I0);
        float f10 = paintingSize.f28201a / 9.0f;
        z3 z3Var2 = new z3(this, 0);
        z3Var.f5605t0 = (int) (0.5f * f10);
        z3Var.f5606u0 = (int) (f10 * 2.0f);
        z3Var.f5607v0 = z3Var2;
        float f11 = Q0.x;
        v4 v4Var = this.O0;
        if (f11 == v4Var.getMeasuredWidth() / 2.0f) {
            z3Var.setStickyX(2);
        }
        if (Q0.y == v4Var.getMeasuredHeight() / 2.0f) {
            z3Var.setStickyY(2);
        }
        z3Var.setDelegate(this);
        z3Var.setMaxWidth(this.O1 - AndroidUtilities.dp(32.0f));
        int i10 = this.C1;
        z3Var.setTypeface(dg.e1.e(i10).f4521j);
        z3Var.setType(dg.e1.e(i10).h);
        v4Var.addView(z3Var, k7.c6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            z3Var.j(1.0f / cropState.cropScale);
            z3Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z4) {
            B0(z3Var);
            z3Var.q();
            D0(z3Var, false);
            z3Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(z3Var.getFocusedView());
            this.H0 = true;
            int i11 = dg.e1.e(i10).f4519g;
            eg.i2 i2Var = this.f44937i1;
            i2Var.d(i11, true);
            i2Var.setOutlineType(dg.e1.e(i10).h);
        }
        return z3Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        qk0 qk0Var = this.W1;
        if (qk0Var != null) {
            AndroidUtilities.removeFromParent(qk0Var);
            this.W1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f10;
        float f11;
        this.D0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f44969z0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f10)) > currentActionBarHeight2) {
            Math.floor((f11 * f10) / currentActionBarHeight);
        }
        float f12 = this.E0.f28201a;
        eg.j jVar = this.G0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.Q0, i10, i11);
        measureChild(this.f44922a1, i10, i11);
        measureChild(this.S0, i10, i11);
        measureChild(this.R0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f44953q2 - this.J1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.P0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.D0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f44947n2 && !this.f44951p2) {
            this.D0 = true;
            w0();
            this.D0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    public final eg.a4 p0(wa waVar) {
        int measuredWidth;
        int i10;
        this.f44938i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        v4 v4Var = this.O0;
        if (v4Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.O1;
        } else {
            measuredWidth = v4Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        eg.a4 a4Var = new eg.a4(getContext(), Q0, this.C1, waVar, f10 / 240.0f, dp);
        if (Q0.x == v4Var.getMeasuredWidth() / 2.0f) {
            a4Var.setStickyX(2);
        }
        if (Q0.y == v4Var.getMeasuredHeight() / 2.0f) {
            a4Var.setStickyY(2);
        }
        dg.e2 e2Var = this.f44966x1;
        if (e2Var != null && (i10 = e2Var.f4524a) != -47814) {
            a4Var.setColor(i10);
        }
        a4Var.setDelegate(this);
        a4Var.setMaxWidth(dp);
        v4Var.addView(a4Var, k7.c6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            a4Var.j(1.0f / cropState.cropScale);
            a4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return a4Var;
    }

    @Override
    public final boolean q() {
        return !(this.G0 instanceof eg.y1);
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            v4 v4Var = this.O0;
            if (i10 < v4Var.getChildCount()) {
                View childAt = v4Var.getChildAt(i10);
                if (childAt instanceof eg.z2) {
                    if (this.G0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(pr.h).withEndAction(new r3(this, (eg.z2) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean r() {
        return !this.H0;
    }

    public abstract void r0();

    @Override
    public final void requestLayout() {
        if (this.D0) {
            return;
        }
        super.requestLayout();
    }

    public final eg.y1 s0() {
        int i10 = 0;
        while (true) {
            v4 v4Var = this.O0;
            if (i10 < v4Var.getChildCount()) {
                View childAt = v4Var.getChildAt(i10);
                if (childAt instanceof eg.y1) {
                    return (eg.y1) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ba baVar) {
        this.f44924b2 = baVar;
    }

    public void setCoverPreview(boolean z4) {
        if (this.f44940j2 != z4) {
            this.f44940j2 = z4;
            if (z4) {
                D0(null, true);
            }
            setCoverPause(z4);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            v4 v4Var = this.O0;
            if (i10 < v4Var.getChildCount()) {
                View childAt = v4Var.getChildAt(i10);
                if (childAt instanceof eg.p3) {
                    ImageReceiver imageReceiver = ((eg.p3) childAt).f5439u0;
                    hj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.L(Math.round(((((float) j10) % ((float) lottieAnimation.p())) / ((float) lottieAnimation.p())) * lottieAnimation.f27524e[0]), true, false);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z4) {
        if (z4 != this.V1) {
            this.V1 = z4;
            g0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.I1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.H1 = runnable;
    }

    @Override
    public final void t(eg.j jVar) {
        O0(false);
        M0(jVar);
    }

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, qh.r6 r46) {
        throw new UnsupportedOperationException("Method not decompiled: qh.a5.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, qh.r6):android.graphics.Bitmap");
    }

    @Override
    public final void u() {
        if (!this.f44949o2 && !this.f44947n2) {
            this.f44938i2 = true;
            o0(true);
            return;
        }
        if (this.f44947n2) {
            eg.j jVar = this.G0;
            if (jVar instanceof eg.z3) {
                this.L1.f45394e = true;
                AndroidUtilities.showKeyboard(((eg.z3) jVar).getEditText());
            }
        }
        J0(!this.f44947n2 ? 1 : 0);
    }

    public final boolean u0() {
        if (!this.A0.a() && !this.f44938i2) {
            return false;
        }
        return true;
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.L0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f10 - view2.getX()) - view.getLeft();
        float y10 = (f11 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y10 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    public final void v0(boolean z4) {
        if (this.f44947n2) {
            J0(0);
        }
        if (z4) {
            mz mzVar = this.f44945m2;
            if (mzVar != null && mzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f44945m2.getMeasuredHeight());
                ofFloat.addUpdateListener(new v3(this, 0));
                this.f44951p2 = true;
                ofFloat.addListener(new j4(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22251w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    @Override
    public final dg.e1 w() {
        return dg.e1.e(this.C1);
    }

    public final void w0() {
        mz mzVar;
        if (!this.f44947n2 && (mzVar = this.f44945m2) != null && mzVar.getVisibility() != 8) {
            this.f44945m2.setVisibility(8);
        }
        int i10 = this.f44953q2;
        this.f44953q2 = 0;
        if (i10 != 0) {
            this.L1.a();
        }
    }

    @Override
    public final boolean x(eg.j jVar) {
        return D0(jVar, true);
    }

    public final boolean y0() {
        if (this.Z1) {
            if (this.W1.getReactionsWindow() != null && !this.W1.getReactionsWindow().f16049q) {
                this.W1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.f44968y1) {
            I0(false);
            return true;
        } else if (this.f44947n2) {
            v0(true);
            return true;
        } else if (!this.H0) {
            return false;
        } else {
            if (this.J0) {
                this.J0 = false;
                this.L1.b(true);
                return false;
            }
            D0(null, true);
            return true;
        }
    }

    public abstract void z0(boolean z4);

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f10) {
    }
}
