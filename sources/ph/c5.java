package ph;

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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c21;
import org.telegram.ui.kg1;
import org.telegram.ui.l61;
import org.telegram.ui.yh;
public abstract class c5 extends rv0 implements dg.n2, dg.h, dg.i2, pv0, z9 {
    public final cg.i2 A0;
    public float A1;
    public final DispatchQueue B0;
    public final Paint B1;
    public final MediaController.CropState C0;
    public final int C1;
    public boolean D0;
    public final q4 D1;
    public jv0 E0;
    public org.telegram.ui.ActionBar.p1 E1;
    public boolean F0;
    public b5 F1;
    public dg.j G0;
    public Rect G1;
    public boolean H0;
    public Runnable H1;
    public int I0;
    public Runnable I1;
    public boolean J0;
    public final ca J1;
    public final boolean K0;
    public AnimatorSet K1;
    public final s4 L0;
    public final j4 L1;
    public final u4 M0;
    public u6 M1;
    public final x4 N0;
    public ArrayList N1;
    public final w4 O0;
    public int O1;
    public final FrameLayout P0;
    public int P1;
    public final y4 Q0;
    public cg.e0 Q1;
    public final g4 R0;
    public final boolean R1;
    public final FrameLayout S0;
    public final File S1;
    public dg.k0 T0;
    public final boolean T1;
    public final View U0;
    public final boolean U1;
    public int V0;
    public boolean V1;
    public int W0;
    public pk0 W1;
    public float X0;
    public dg.a3 X1;
    public ValueAnimator Y0;
    public float Y1;
    public boolean Z0;
    public boolean Z1;
    public final dg.t2 f41326a1;
    public boolean a2;
    public final qk0 f41327b1;
    public org.telegram.ui.Components.ba f41328b2;
    public final int f41329c1;
    public final k5 f41330c2;
    public BigInteger f41331d1;
    public final l5 f41332d2;
    public TextView f41333e1;
    public boolean f41334e2;
    public TextView f41335f1;
    public ObjectAnimator f41336f2;
    public TextView f41337g1;
    public final float[] f41338g2;
    public final dg.o2 f41339h1;
    public l4 f41340h2;
    public final dg.k2 f41341i1;
    public boolean f41342i2;
    public final dg.q2 f41343j1;
    public boolean f41344j2;
    public final ImageView f41345k1;
    public boolean f41346k2;
    public final TextView l1;
    public final int[] f41347l2;
    public final TextView f41348m1;
    public kz f41349m2;
    public final TextView f41350n1;
    public boolean f41351n2;
    public final Paint f41352o1;
    public boolean f41353o2;
    public final Paint f41354p1;
    public boolean f41355p2;
    public float f41356q1;
    public int f41357q2;
    public boolean f41358r1;
    public boolean f41359r2;
    public o1.j f41360s1;
    public int f41361s2;
    public final h4 f41362t1;
    public int f41363t2;
    public final Paint f41364u1;
    public int f41365u2;
    public final Paint f41366v1;
    public boolean f41367v2;
    public final Paint f41368w1;
    public final dg.b2 f41369x0;
    public final cg.f2 f41370x1;
    public final dg.f2 f41371y0;
    public boolean f41372y1;
    public final Bitmap f41373z0;
    public o1.j f41374z1;

    public c5(Context context, boolean z4, File file, boolean z10, boolean z11, ca caVar, Activity activity, final int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, u6 u6Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar, org.telegram.ui.ActionBar.f6 f6Var, k5 k5Var, l5 l5Var) {
        super(context, activity);
        s4 s4Var;
        cg.f2 f2Var;
        org.telegram.ui.Components.ba baVar2;
        q4 q4Var;
        DispatchQueue dispatchQueue;
        Bitmap bitmap3;
        Paint paint;
        Paint paint2;
        s4 s4Var2;
        int i14;
        this.V0 = 0;
        this.W0 = -1;
        final h9 h9Var = (h9) this;
        qk0 qk0Var = new qk0(h9Var, 6);
        this.f41327b1 = qk0Var;
        Paint paint3 = new Paint(1);
        this.f41352o1 = paint3;
        Paint paint4 = new Paint(1);
        this.f41354p1 = paint4;
        this.f41364u1 = new Paint(1);
        this.f41366v1 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f41368w1 = paint5;
        cg.f2 f2Var2 = new cg.f2(1.0f, 0.016773745f, -1);
        this.f41370x1 = f2Var2;
        this.B1 = new Paint(1);
        this.f41338g2 = new float[2];
        this.f41344j2 = false;
        this.f41347l2 = new int[2];
        new tl0(h9Var, 7);
        setDelegate(this);
        this.f41328b2 = baVar;
        this.f41330c2 = k5Var;
        this.R1 = z4;
        this.S1 = file;
        this.T1 = z10;
        this.U1 = z11;
        this.J1 = caVar;
        this.O1 = i12;
        this.P1 = i13;
        this.f41332d2 = l5Var;
        this.C1 = i10;
        q4 q4Var2 = new q4(f6Var);
        this.D1 = q4Var2;
        this.C0 = cropState;
        this.K0 = context instanceof BubbleActivity;
        cg.f1 e = cg.f1.e(i10);
        e.i(0, true);
        f2Var2.f2401a = e.c();
        f2Var2.f2403c = e.f2397i;
        DispatchQueue dispatchQueue2 = new DispatchQueue("Paint");
        this.B0 = dispatchQueue2;
        this.f41373z0 = bitmap;
        this.f41329c1 = i11;
        cg.i2 i2Var = new cg.i2();
        this.A0 = i2Var;
        i2Var.f2428a = new lh.m5(h9Var, 26);
        View view = new View(context);
        this.U0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        cg.d1 d1Var = new cg.d1(getPaintingSize(), null, i11, baVar);
        if (u6Var == null || !u6Var.f42439u) {
            f2Var = f2Var2;
            baVar2 = baVar;
            q4Var = q4Var2;
            dispatchQueue = dispatchQueue2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            s4Var2 = s4Var;
        } else {
            f2Var = f2Var2;
            baVar2 = null;
            q4Var = q4Var2;
            bitmap3 = bitmap;
            paint = paint5;
            paint2 = paint4;
            s4Var2 = s4Var;
            dispatchQueue = dispatchQueue2;
        }
        s4Var2 = new s4(h9Var, context, d1Var, bitmap3, bitmap2, baVar2);
        this.L0 = s4Var2;
        s4Var2.setDelegate(new t4(h9Var));
        s4Var2.setUndoStore(i2Var);
        s4Var2.setQueue(dispatchQueue);
        s4Var2.setVisibility(4);
        u4 u4Var = new u4(h9Var, context);
        this.M0 = u4Var;
        u4Var.setVisibility(4);
        w4 w4Var = new w4(h9Var, context, new v4(h9Var));
        this.O0 = w4Var;
        this.M1 = u6Var;
        this.N1 = arrayList;
        if (this.O1 > 0 && this.P1 > 0) {
            H0();
        }
        w4Var.setVisibility(4);
        this.N0 = new x4(h9Var, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, k7.b6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f41345k1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h9 h9Var2 = h9Var;
                        s4 s4Var3 = h9Var2.L0;
                        if (s4Var3 != null && (s4Var3.getCurrentBrush() instanceof cg.l)) {
                            s4Var3.b();
                            h9Var2.f41339h1.setSelectedIndex(1);
                            h9Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        h9Var2.A0.c();
                        return;
                    case 1:
                        h9 h9Var3 = h9Var;
                        s4 s4Var4 = h9Var3.L0;
                        cg.i2 i2Var2 = h9Var3.A0;
                        if (i2Var2.a()) {
                            if (s4Var4 != null && (s4Var4.getCurrentBrush() instanceof cg.l)) {
                                s4Var4.b();
                                h9Var3.f41339h1.setSelectedIndex(1);
                                h9Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            if (s4Var4 != null) {
                                s4Var4.a();
                            }
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            h9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h9 h9Var4 = h9Var;
                        dg.j jVar = h9Var4.G0;
                        if (jVar instanceof dg.b4) {
                            AndroidUtilities.hideKeyboard(((dg.b4) jVar).getFocusedView());
                        }
                        if (h9Var4.f41351n2) {
                            h9Var4.v0(false);
                        }
                        h9Var4.C0(h9Var4.G0);
                        h9Var4.D0(null, true);
                        return;
                    case 3:
                        h9Var.D0(null, true);
                        return;
                    default:
                        h9 h9Var5 = h9Var;
                        if (h9Var5.f41372y1) {
                            h9Var5.I0(false);
                            return;
                        } else if (h9Var5.f41351n2) {
                            h9Var5.v0(true);
                            return;
                        } else if (h9Var5.H0) {
                            h9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = h9Var5.I1;
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
        frameLayout.addView(imageView, k7.b6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, k7.b6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, k7.b6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new dg.m(25));
        frameLayout.addView(linearLayout, k7.b6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.l1 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
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
                        h9 h9Var2 = h9Var;
                        s4 s4Var3 = h9Var2.L0;
                        if (s4Var3 != null && (s4Var3.getCurrentBrush() instanceof cg.l)) {
                            s4Var3.b();
                            h9Var2.f41339h1.setSelectedIndex(1);
                            h9Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        h9Var2.A0.c();
                        return;
                    case 1:
                        h9 h9Var3 = h9Var;
                        s4 s4Var4 = h9Var3.L0;
                        cg.i2 i2Var2 = h9Var3.A0;
                        if (i2Var2.a()) {
                            if (s4Var4 != null && (s4Var4.getCurrentBrush() instanceof cg.l)) {
                                s4Var4.b();
                                h9Var3.f41339h1.setSelectedIndex(1);
                                h9Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            if (s4Var4 != null) {
                                s4Var4.a();
                            }
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            h9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h9 h9Var4 = h9Var;
                        dg.j jVar = h9Var4.G0;
                        if (jVar instanceof dg.b4) {
                            AndroidUtilities.hideKeyboard(((dg.b4) jVar).getFocusedView());
                        }
                        if (h9Var4.f41351n2) {
                            h9Var4.v0(false);
                        }
                        h9Var4.C0(h9Var4.G0);
                        h9Var4.D0(null, true);
                        return;
                    case 3:
                        h9Var.D0(null, true);
                        return;
                    default:
                        h9 h9Var5 = h9Var;
                        if (h9Var5.f41372y1) {
                            h9Var5.I0(false);
                            return;
                        } else if (h9Var5.f41351n2) {
                            h9Var5.v0(true);
                            return;
                        } else if (h9Var5.H0) {
                            h9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = h9Var5.I1;
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
        TextView i15 = yh.i(frameLayout, textView2, k7.b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f41348m1 = i15;
        i15.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        i15.setPadding(org.telegram.ui.b.e(8.0f, R.string.Clear, i15), 0, AndroidUtilities.dp(8.0f), 0);
        i15.setGravity(16);
        i15.setTextColor(-1);
        i15.setTypeface(AndroidUtilities.bold());
        i15.setTextSize(1, 16.0f);
        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h9 h9Var2 = h9Var;
                        s4 s4Var3 = h9Var2.L0;
                        if (s4Var3 != null && (s4Var3.getCurrentBrush() instanceof cg.l)) {
                            s4Var3.b();
                            h9Var2.f41339h1.setSelectedIndex(1);
                            h9Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        h9Var2.A0.c();
                        return;
                    case 1:
                        h9 h9Var3 = h9Var;
                        s4 s4Var4 = h9Var3.L0;
                        cg.i2 i2Var2 = h9Var3.A0;
                        if (i2Var2.a()) {
                            if (s4Var4 != null && (s4Var4.getCurrentBrush() instanceof cg.l)) {
                                s4Var4.b();
                                h9Var3.f41339h1.setSelectedIndex(1);
                                h9Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            if (s4Var4 != null) {
                                s4Var4.a();
                            }
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            h9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h9 h9Var4 = h9Var;
                        dg.j jVar = h9Var4.G0;
                        if (jVar instanceof dg.b4) {
                            AndroidUtilities.hideKeyboard(((dg.b4) jVar).getFocusedView());
                        }
                        if (h9Var4.f41351n2) {
                            h9Var4.v0(false);
                        }
                        h9Var4.C0(h9Var4.G0);
                        h9Var4.D0(null, true);
                        return;
                    case 3:
                        h9Var.D0(null, true);
                        return;
                    default:
                        h9 h9Var5 = h9Var;
                        if (h9Var5.f41372y1) {
                            h9Var5.I0(false);
                            return;
                        } else if (h9Var5.f41351n2) {
                            h9Var5.v0(true);
                            return;
                        } else if (h9Var5.H0) {
                            h9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = h9Var5.I1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        i15.setAlpha(0.0f);
        i15.setVisibility(8);
        TextView i16 = yh.i(frameLayout, i15, k7.b6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f41350n1 = i16;
        i16.setBackground(org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
        i16.setPadding(org.telegram.ui.b.e(8.0f, R.string.Done, i16), 0, AndroidUtilities.dp(8.0f), 0);
        i16.setGravity(16);
        i16.setTextColor(-1);
        i16.setTypeface(AndroidUtilities.bold());
        i16.setTextSize(1, 16.0f);
        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h9 h9Var2 = h9Var;
                        s4 s4Var3 = h9Var2.L0;
                        if (s4Var3 != null && (s4Var3.getCurrentBrush() instanceof cg.l)) {
                            s4Var3.b();
                            h9Var2.f41339h1.setSelectedIndex(1);
                            h9Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        h9Var2.A0.c();
                        return;
                    case 1:
                        h9 h9Var3 = h9Var;
                        s4 s4Var4 = h9Var3.L0;
                        cg.i2 i2Var2 = h9Var3.A0;
                        if (i2Var2.a()) {
                            if (s4Var4 != null && (s4Var4.getCurrentBrush() instanceof cg.l)) {
                                s4Var4.b();
                                h9Var3.f41339h1.setSelectedIndex(1);
                                h9Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            if (s4Var4 != null) {
                                s4Var4.a();
                            }
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            h9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h9 h9Var4 = h9Var;
                        dg.j jVar = h9Var4.G0;
                        if (jVar instanceof dg.b4) {
                            AndroidUtilities.hideKeyboard(((dg.b4) jVar).getFocusedView());
                        }
                        if (h9Var4.f41351n2) {
                            h9Var4.v0(false);
                        }
                        h9Var4.C0(h9Var4.G0);
                        h9Var4.D0(null, true);
                        return;
                    case 3:
                        h9Var.D0(null, true);
                        return;
                    default:
                        h9 h9Var5 = h9Var;
                        if (h9Var5.f41372y1) {
                            h9Var5.I0(false);
                            return;
                        } else if (h9Var5.f41351n2) {
                            h9Var5.v0(true);
                            return;
                        } else if (h9Var5.H0) {
                            h9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = h9Var5.I1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        i16.setAlpha(0.0f);
        i16.setVisibility(8);
        frameLayout.addView(i16, k7.b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        y4 y4Var = new y4(h9Var, context, e);
        this.Q0 = y4Var;
        y4Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        y4Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(y4Var, k7.b6.e(-1, 104, 80));
        dg.o2 o2Var = new dg.o2(context, (u6Var == null || u6Var.v() || u6Var.f42439u || baVar == null) ? false : true);
        this.f41339h1 = o2Var;
        o2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o2Var.setDelegate(this);
        o2Var.setSelectedIndex(1);
        y4Var.addView(o2Var, k7.b6.c(48.0f, -1));
        dg.k2 k2Var = new dg.k2(context);
        this.f41341i1 = k2Var;
        k2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        k2Var.setVisibility(8);
        k2Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        h9 h9Var2 = h9Var;
                        cg.f2 f2Var3 = h9Var2.f41370x1;
                        h9Var2.F0(f2Var3);
                        cg.f1.e(i10).j(f2Var3.f2403c);
                        return;
                    default:
                        h9Var.f41341i1.setTypeface(cg.f1.e(i10).f2398j);
                        return;
                }
            }
        });
        k2Var.setAlignment(cg.f1.e(i10).f2396g);
        y4Var.addView(k2Var, k7.b6.c(48.0f, -1));
        g4 g4Var = new g4(h9Var, context);
        this.R0 = g4Var;
        addView(g4Var, k7.b6.c(-1.0f, -1));
        dg.q2 q2Var = new dg.q2(context);
        this.f41343j1 = q2Var;
        q2Var.setVisibility(8);
        q2Var.setOnItemClickListener(new dg.n(h9Var, 16));
        k2Var.setTypefaceListView(q2Var);
        g4Var.addView(q2Var, k7.b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(352321535);
        paint2.setColor(q4Var.x0(org.telegram.ui.ActionBar.j6.G8));
        h4 h4Var = new h4(h9Var, context);
        this.f41362t1 = h4Var;
        h4Var.setVisibility(8);
        h4Var.setColorPalette(cg.f1.e(i10));
        h4Var.setColorListener(new cg.o(h9Var, 3));
        y4Var.addView(h4Var, k7.b6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        dg.b2 b2Var = new dg.b2(context);
        this.f41369x0 = b2Var;
        b2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        b2Var.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        y4Var.addView(b2Var, k7.b6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        b2Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h9 h9Var2 = h9Var;
                        s4 s4Var3 = h9Var2.L0;
                        if (s4Var3 != null && (s4Var3.getCurrentBrush() instanceof cg.l)) {
                            s4Var3.b();
                            h9Var2.f41339h1.setSelectedIndex(1);
                            h9Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        h9Var2.A0.c();
                        return;
                    case 1:
                        h9 h9Var3 = h9Var;
                        s4 s4Var4 = h9Var3.L0;
                        cg.i2 i2Var2 = h9Var3.A0;
                        if (i2Var2.a()) {
                            if (s4Var4 != null && (s4Var4.getCurrentBrush() instanceof cg.l)) {
                                s4Var4.b();
                                h9Var3.f41339h1.setSelectedIndex(1);
                                h9Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            if (s4Var4 != null) {
                                s4Var4.a();
                            }
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            h9Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h9 h9Var4 = h9Var;
                        dg.j jVar = h9Var4.G0;
                        if (jVar instanceof dg.b4) {
                            AndroidUtilities.hideKeyboard(((dg.b4) jVar).getFocusedView());
                        }
                        if (h9Var4.f41351n2) {
                            h9Var4.v0(false);
                        }
                        h9Var4.C0(h9Var4.G0);
                        h9Var4.D0(null, true);
                        return;
                    case 3:
                        h9Var.D0(null, true);
                        return;
                    default:
                        h9 h9Var5 = h9Var;
                        if (h9Var5.f41372y1) {
                            h9Var5.I0(false);
                            return;
                        } else if (h9Var5.f41351n2) {
                            h9Var5.v0(true);
                            return;
                        } else if (h9Var5.H0) {
                            h9Var5.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = h9Var5.I1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        dg.f2 f2Var3 = new dg.f2(context);
        this.f41371y0 = f2Var3;
        f2Var3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f2Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        f2Var3.setOnClickListener(new q31(h9Var, context, e, 4));
        y4Var.addView(f2Var3, k7.b6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        dg.t2 t2Var = new dg.t2(context);
        this.f41326a1 = t2Var;
        cg.f2 f2Var4 = f2Var;
        t2Var.setColorSwatch(f2Var4);
        t2Var.setRenderView(s4Var2);
        t2Var.setValueOverride(qk0Var);
        f2Var4.f2403c = qk0Var.get();
        t2Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        h9 h9Var2 = h9Var;
                        cg.f2 f2Var32 = h9Var2.f41370x1;
                        h9Var2.F0(f2Var32);
                        cg.f1.e(i10).j(f2Var32.f2403c);
                        return;
                    default:
                        h9Var.f41341i1.setTypeface(cg.f1.e(i10).f2398j);
                        return;
                }
            }
        });
        addView(t2Var, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S0 = frameLayout2;
        addView(frameLayout2, k7.b6.c(-1.0f, -1));
        Paint paint6 = paint;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(AndroidUtilities.dp(2.0f));
        E0(f2Var4, null, false);
        x((cg.m) cg.m.f2447a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            i14 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i14 = 1;
        }
        this.L1 = new j4(h9Var, caVar, new org.telegram.ui.web.u1(3, h9Var, caVar));
        y1.D = i14;
    }

    public static void G0(dg.b4 b4Var, int i10) {
        int i11;
        b4Var.setAlign(i10);
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
        b4Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        b4Var.getEditText().setTextAlignment(i12);
    }

    public static void Z(h9 h9Var, cg.f1 f1Var, Integer num) {
        f1Var.h(num.intValue(), true);
        f1Var.g();
        h9Var.setNewColor(num.intValue());
        h9Var.f41362t1.setSelectedColorIndex(f1Var.d());
        h9Var.Q1 = null;
    }

    public static void a0(h9 h9Var, Integer num) {
        h9Var.setNewColor(num.intValue());
        h9Var.I0(false);
    }

    public ViewGroup getBarView() {
        if (this.V0 == 2) {
            return this.f41341i1;
        }
        return this.f41339h1;
    }

    private int getFrameRotation() {
        int i10 = this.f41329c1;
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
            w4 w4Var = this.O0;
            if (i10 < w4Var.getChildCount()) {
                View childAt = w4Var.getChildAt(i10);
                if (childAt instanceof dg.r3) {
                    ImageReceiver imageReceiver = ((dg.r3) childAt).f4777u0;
                    gj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
                        animation.f30881y = z4;
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
        cg.f2 f2Var = this.f41370x1;
        int i11 = f2Var.f2401a;
        f2Var.f2401a = i10;
        E0(f2Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new dg.g0(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.I0 = i10;
        dg.j jVar = this.G0;
        if (jVar instanceof dg.b4) {
            ((dg.b4) jVar).setType(i10);
        }
        cg.f1 e = cg.f1.e(this.C1);
        e.h = i10;
        e.f2392a.edit().putInt("text_type", i10).apply();
        this.f41341i1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        dg.k0 k0Var = new dg.k0(this, context);
        this.T0 = k0Var;
        k0Var.setClipToPadding(false);
        this.T0.setOrientation(0);
        this.Q0.addView(this.T0, k7.b6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f41333e1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f41333e1;
        int i10 = org.telegram.ui.ActionBar.j6.f19996i6;
        q4 q4Var = this.D1;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, q4Var), 7, -1));
        this.f41333e1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41333e1.setTextColor(-1);
        this.f41333e1.setTextSize(1, 14.0f);
        this.f41333e1.setGravity(1);
        this.f41333e1.setTypeface(AndroidUtilities.bold());
        this.f41333e1.setSingleLine();
        this.f41333e1.setOnClickListener(new View.OnClickListener(this) {
            public final c5 f42330b;

            {
                this.f42330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var = this.f42330b;
                        if (c5Var.H0) {
                            c5Var.D0(null, true);
                            return;
                        } else {
                            c5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f42330b.A0();
                        return;
                    default:
                        c5 c5Var2 = this.f42330b;
                        c5Var2.R0(2);
                        if (!(c5Var2.G0 instanceof dg.b4)) {
                            c5Var2.f41342i2 = true;
                            c5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.T0.addView(this.f41333e1, k7.b6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f41335f1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f41335f1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, q4Var), 7, -1));
        this.f41335f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41335f1.setOnClickListener(new View.OnClickListener(this) {
            public final c5 f42330b;

            {
                this.f42330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var = this.f42330b;
                        if (c5Var.H0) {
                            c5Var.D0(null, true);
                            return;
                        } else {
                            c5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f42330b.A0();
                        return;
                    default:
                        c5 c5Var2 = this.f42330b;
                        c5Var2.R0(2);
                        if (!(c5Var2.G0 instanceof dg.b4)) {
                            c5Var2.f41342i2 = true;
                            c5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f41335f1.setTextColor(-1);
        this.f41335f1.setTextSize(1, 14.0f);
        this.f41335f1.setGravity(1);
        this.f41335f1.setTypeface(AndroidUtilities.bold());
        this.f41335f1.setAlpha(0.6f);
        this.f41335f1.setSingleLine();
        this.T0.addView(this.f41335f1, k7.b6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f41337g1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f41337g1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, q4Var), 7, -1));
        this.f41337g1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41337g1.setTextColor(-1);
        this.f41337g1.setTextSize(1, 14.0f);
        this.f41337g1.setGravity(1);
        this.f41337g1.setTypeface(AndroidUtilities.bold());
        this.f41337g1.setAlpha(0.6f);
        this.f41337g1.setSingleLine();
        this.f41337g1.setOnClickListener(new View.OnClickListener(this) {
            public final c5 f42330b;

            {
                this.f42330b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var = this.f42330b;
                        if (c5Var.H0) {
                            c5Var.D0(null, true);
                            return;
                        } else {
                            c5Var.R0(0);
                            return;
                        }
                    case 1:
                        this.f42330b.A0();
                        return;
                    default:
                        c5 c5Var2 = this.f42330b;
                        c5Var2.R0(2);
                        if (!(c5Var2.G0 instanceof dg.b4)) {
                            c5Var2.f41342i2 = true;
                            c5Var2.o0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.T0.addView(this.f41337g1, k7.b6.l(1.0f, 0, -2));
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
        N0(new a4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i10 = this.V0;
        R0(1);
        postDelayed(new c21(this, 13), 350L);
        l4 l4Var = new l4(this, getContext(), this.D1, i10);
        this.f41340h2 = l4Var;
        ca caVar = this.J1;
        Objects.requireNonNull(caVar);
        l4Var.f42609w = new d4(caVar, 1);
        final boolean[] zArr = {true};
        l4Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                c5 c5Var = c5.this;
                c5Var.f41340h2 = null;
                if (zArr[0]) {
                    c5Var.z0(false);
                }
                c5Var.R0(i10);
            }
        });
        l4Var.f42611y = new b4(this);
        l4Var.q0(new org.telegram.ui.Components.i(this, zArr, l4Var, 3));
        l4Var.show();
        z0(true);
    }

    public final void B0(dg.j jVar) {
        this.A0.b(jVar.getUUID(), new z3(this, jVar, 0));
    }

    public final void C0(dg.j jVar) {
        dg.j jVar2 = this.G0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f4591j0, false);
            D0(null, true);
            if (jVar instanceof dg.b4) {
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
            cg.i2 i2Var = this.A0;
            i2Var.f2429b.remove(uuid);
            i2Var.f2430c.remove(uuid);
            AndroidUtilities.runOnUIThread(new ag.d(i2Var, 15));
        }
        dg.t2 t2Var = this.f41326a1;
        qk0 qk0Var = this.f41327b1;
        t2Var.setValueOverride(qk0Var);
        t2Var.setShowPreview(true);
        float f10 = qk0Var.get();
        cg.f2 f2Var = this.f41370x1;
        f2Var.f2403c = f10;
        E0(f2Var, null, false);
        if (!this.f41346k2 && (jVar instanceof dg.b3)) {
            da daVar = ((h9) this).f41720x2;
            s9 s9Var = daVar.U0;
            if (s9Var != null) {
                s9Var.s(null, null, true);
            }
            h9 h9Var = daVar.f41531s1;
            if (h9Var != null) {
                h9Var.q0();
            }
            t9 t9Var = daVar.Z0;
            if (t9Var != null) {
                t9Var.setHasRoundVideo(false);
            }
            u6 u6Var = daVar.H1;
            if (u6Var != null) {
                File file = u6Var.f42428o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    daVar.H1.f42428o0 = null;
                }
                if (daVar.H1.f42430p0 != null) {
                    try {
                        new File(daVar.H1.f42430p0).delete();
                    } catch (Exception unused2) {
                    }
                    daVar.H1.f42430p0 = null;
                }
            }
        }
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(dg.j jVar, boolean z4) {
        boolean z10;
        oa oaVar;
        oa oaVar2;
        pk0 pk0Var;
        int i10;
        boolean z11 = jVar instanceof dg.b4;
        int i11 = 2;
        int i12 = 0;
        if (z11 && (((i10 = this.W0) == -1 && this.V0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.f41372y1) {
                I0(false);
            }
            R0(2);
        }
        boolean z12 = true;
        if (z11 && z4) {
            dg.b4 b4Var = (dg.b4) jVar;
            int gravity = b4Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            dg.k2 k2Var = this.f41341i1;
            k2Var.setAlignment(i11);
            cg.t0 typeface = b4Var.getTypeface();
            if (typeface != null) {
                k2Var.setTypeface(typeface.f2529a);
            }
            k2Var.e(b4Var.getType(), true);
            this.R0.invalidate();
        }
        dg.j jVar2 = this.G0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f4579a0) {
                    if (jVar instanceof dg.m1) {
                        dg.m1 m1Var = (dg.m1) jVar;
                        m1Var.setType((m1Var.getType() + 1) % m1Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof dg.c4) {
                        dg.c4 c4Var = (dg.c4) jVar;
                        c4Var.setType((c4Var.getType() + 1) % c4Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof dg.i1) {
                        dg.i1 i1Var = (dg.i1) jVar;
                        dg.g1 g1Var = i1Var.f4570n0;
                        if (g1Var.e()) {
                            if (g1Var.getPreviewType() == 0) {
                                i12 = 1;
                            }
                            g1Var.setPreviewType(i12);
                            return true;
                        }
                        i1Var.setType(i1Var.getNextType());
                        return true;
                    } else if (!this.H0) {
                        if (jVar instanceof dg.b4) {
                            this.J0 = true;
                            r0();
                            return true;
                        } else if (jVar instanceof dg.a3) {
                            dg.a3 a3Var = (dg.a3) jVar;
                            if (this.Z1 && this.X1 == jVar) {
                                a3Var.q(true);
                                return true;
                            }
                            dg.a3 a3Var2 = this.X1;
                            if (a3Var2 != null && a3Var2 != a3Var && (pk0Var = this.W1) != null) {
                                pk0Var.animate().alpha(0.0f).setListener(new ck0(pk0Var, 2));
                                this.W1 = null;
                                this.Z1 = false;
                                this.Y1 = 0.0f;
                            }
                            if (this.W1 == null) {
                                pk0 pk0Var2 = new pk0(2, this.C1, getContext(), LaunchActivity.R(), new nh.m2(7, new nh.b()));
                                this.W1 = pk0Var2;
                                org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(this.f41328b2, pk0Var2, 0, false);
                                this.W1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                                this.J1.addView(this.W1, k7.b6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.k(-16777216, 120));
                                pk0 pk0Var3 = this.W1;
                                ?? obj = new Object();
                                obj.e = this;
                                obj.f2131c = faVar;
                                obj.d = paint;
                                obj.f2130b = new Path();
                                pk0Var3.setDelegate(obj);
                                this.W1.p(null, null, true);
                            }
                            this.W1.setFragment(LaunchActivity.R());
                            this.X1 = a3Var;
                            O0(true);
                            return true;
                        } else {
                            M0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof dg.b4) {
                        AndroidUtilities.showKeyboard(((dg.b4) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.f4591j0, false);
            dg.j jVar3 = this.G0;
            if (jVar3 instanceof dg.b4) {
                dg.b4 b4Var2 = (dg.b4) jVar3;
                dg.z3 z3Var = b4Var2.f4406n0;
                z3Var.clearFocus();
                z3Var.setEnabled(false);
                z3Var.setClickable(false);
                b4Var2.m();
                if (!z11) {
                    this.H0 = false;
                    AndroidUtilities.hideKeyboard(((dg.b4) this.G0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar3 instanceof dg.b3) && (oaVar2 = ((h9) this).f41720x2.W0) != null) {
                oaVar2.l(false);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        dg.j jVar4 = this.G0;
        this.G0 = jVar;
        if ((jVar4 instanceof dg.b4) && TextUtils.isEmpty(((dg.b4) jVar4).getText())) {
            C0(jVar4);
        }
        dg.j jVar5 = this.G0;
        if (jVar4 != jVar5 && (jVar5 instanceof dg.b3) && (oaVar = ((h9) this).f41720x2.W0) != null) {
            oaVar.l(true);
        }
        dg.j jVar6 = this.G0;
        qk0 qk0Var = this.f41327b1;
        cg.f2 f2Var = this.f41370x1;
        dg.t2 t2Var = this.f41326a1;
        if (jVar6 != null) {
            x4 x4Var = this.N0;
            jVar6.f4591j0 = x4Var;
            jVar6.l(x4Var, true);
            dg.j jVar7 = this.G0;
            if (jVar7 instanceof dg.b4) {
                dg.b4 b4Var3 = (dg.b4) jVar7;
                b4Var3.getSwatch().f2403c = f2Var.f2403c;
                b4Var3.f4415w0 = false;
                F0(b4Var3.getSwatch());
                t2Var.setValueOverride(new dg.j0(b4Var3, (int) (this.E0.f26052a / 9.0f), 1));
                t2Var.setShowPreview(false);
            } else {
                t2Var.setValueOverride(qk0Var);
                t2Var.setShowPreview(true);
                f2Var.f2403c = qk0Var.get();
                E0(f2Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.Y0;
            if (valueAnimator2 != null && this.W0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f41372y1) {
                I0(false);
            }
            R0(0);
            t2Var.setValueOverride(qk0Var);
            t2Var.setShowPreview(true);
            f2Var.f2403c = qk0Var.get();
            E0(f2Var, null, false);
            z12 = z10;
        }
        U0();
        return z12;
    }

    public final void E0(cg.f2 f2Var, Integer num, boolean z4) {
        cg.f2 f2Var2 = this.f41370x1;
        if (f2Var2 != f2Var) {
            f2Var2.f2401a = f2Var.f2401a;
            f2Var2.f2402b = f2Var.f2402b;
            f2Var2.f2403c = f2Var.f2403c;
            int i10 = this.C1;
            cg.f1.e(i10).h(f2Var.f2401a, true);
            cg.f1.e(i10).j(f2Var.f2403c);
        }
        int i11 = f2Var.f2401a;
        s4 s4Var = this.L0;
        s4Var.setColor(i11);
        s4Var.setBrushSize(f2Var.f2403c);
        int i12 = f2Var2.f2401a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new dg.t(this, num, i12, 2));
            duration.start();
        } else {
            y4 y4Var = this.Q0;
            if (y4Var != null) {
                y4Var.invalidate();
            }
        }
        dg.j jVar = this.G0;
        if (jVar instanceof dg.b4) {
            ((dg.b4) jVar).setSwatch(new cg.f2(f2Var.f2402b, f2Var.f2403c, f2Var.f2401a));
        } else if (z4 && (jVar instanceof dg.m1)) {
            ((dg.m1) jVar).setColor(f2Var.f2401a);
            ((dg.m1) this.G0).setType(3);
        } else if (z4 && (jVar instanceof dg.c4)) {
            ((dg.c4) jVar).setColor(f2Var.f2401a);
            ((dg.c4) this.G0).setType(3);
        } else if (z4 && (jVar instanceof dg.i1)) {
            ((dg.i1) jVar).setColor(f2Var.f2401a);
            ((dg.i1) this.G0).setType(0);
        }
    }

    public final void F0(cg.f2 f2Var) {
        E0(f2Var, null, false);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f41353o2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z4) {
                this.f41363t2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f41363t2).commit();
            } else {
                this.f41361s2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f41361s2).commit();
            }
        }
        boolean z12 = this.f41351n2;
        j4 j4Var = this.L1;
        if (z12) {
            if (z4) {
                i11 = this.f41363t2;
            } else {
                i11 = this.f41361s2;
            }
            int paddingUnderContainer = this.J1.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41349m2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i13;
                layoutParams.height = paddingUnderContainer;
                this.f41349m2.setLayoutParams(layoutParams);
                this.f41357q2 = layoutParams.height;
                j4Var.a();
                requestLayout();
            }
        }
        if (this.f41365u2 == i10 && this.f41367v2 == z4) {
            return;
        }
        this.f41365u2 = i10;
        this.f41367v2 = z4;
        boolean z13 = this.f41353o2;
        dg.j jVar = this.G0;
        if (jVar instanceof dg.b4) {
            if (((dg.b4) jVar).getEditText().isFocused() && j4Var.c()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f41353o2 = z11;
        } else {
            this.f41353o2 = false;
        }
        if (this.f41353o2 && this.f41351n2) {
            J0(0);
        }
        if (this.f41357q2 != 0 && !(z10 = this.f41353o2) && z10 != z13 && !this.f41351n2) {
            this.f41357q2 = 0;
            j4Var.a();
            requestLayout();
        }
        U0();
        if (z13 && !this.f41353o2 && this.f41357q2 > 0 && this.f41359r2) {
            this.f41359r2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        dg.j jVar;
        ArrayList arrayList = this.N1;
        if (arrayList != null) {
            u6 u6Var = this.M1;
            this.M1 = null;
            this.N1 = null;
            int size = arrayList.size();
            boolean z4 = false;
            int i11 = 0;
            while (true) {
                w4 w4Var = this.O0;
                if (i11 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
                    byte b10 = mediaEntity.type;
                    if (b10 == 0) {
                        p4 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                        if ((2 & mediaEntity.subType) != 0) {
                            n02.r(z4);
                        }
                        ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                        layoutParams.width = mediaEntity.viewWidth;
                        layoutParams.height = mediaEntity.viewHeight;
                        i10 = i11;
                        jVar = n02;
                    } else if (b10 == 1) {
                        dg.b4 o02 = o0(z4);
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
                        cg.f2 swatch = o02.getSwatch();
                        swatch.f2401a = mediaEntity.color;
                        o02.setSwatch(swatch);
                        jVar = o02;
                    } else {
                        i10 = i11;
                        if (b10 == 2) {
                            dg.v2 k02 = k0(mediaEntity.text, false);
                            k02.D0 = mediaEntity.crop;
                            k02.f4828y0 = false;
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
                            ArrayList arrayList3 = u6Var.v;
                            boolean z10 = u6Var.K;
                            this.f41342i2 = true;
                            dg.j o4Var = new o4(this, getContext(), e0(), arrayList3, this.f41328b2, z10, this.f41330c2);
                            o4Var.setDelegate(this);
                            w4Var.addView(o4Var);
                            g0();
                            jVar = o4Var;
                            if (mediaEntity.viewWidth > 0) {
                                jVar = o4Var;
                                if (mediaEntity.viewHeight > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = o4Var.getLayoutParams();
                                    layoutParams3.width = mediaEntity.viewWidth;
                                    layoutParams3.height = mediaEntity.viewHeight;
                                    jVar = o4Var;
                                }
                            }
                        } else if (b10 == 3) {
                            dg.m1 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                            int i14 = mediaEntity.color;
                            if (i14 != 0) {
                                j02.setColor(i14);
                            }
                            j02.setType(mediaEntity.subType);
                            jVar = j02;
                        } else if (b10 == 8) {
                            za zaVar = mediaEntity.weather;
                            if (zaVar != null) {
                                dg.c4 p02 = p0(zaVar);
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
                            dg.i1 i02 = i0(mediaEntity.linkSettings);
                            dg.g1 g1Var = i02.f4570n0;
                            int i16 = mediaEntity.color;
                            if (i16 != 0) {
                                i02.setColor(i16);
                            }
                            boolean e = g1Var.e();
                            int i17 = g1Var.h;
                            int i18 = g1Var.f4529f;
                            if (e) {
                                g1Var.setPreviewType(mediaEntity.subType);
                            }
                            byte b11 = mediaEntity.subType;
                            if (b11 == -1) {
                                i02.setType(3);
                                g1Var.d();
                                mediaEntity.viewWidth = ((int) Math.ceil(g1Var.U)) + i18 + i18;
                                mediaEntity.viewHeight = ((int) Math.ceil(g1Var.V)) + i17 + i17;
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
                            dg.a3 l02 = l0(false);
                            l02.s(mg.q0.d(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                l02.r(false);
                            }
                            jVar = l02;
                            if (mediaEntity.mediaArea.dark) {
                                l02.q(false);
                                jVar = l02;
                            }
                        } else {
                            if (b10 == 5 && u6Var.f42428o0 != null) {
                                dg.b3 m0 = m0(u6Var.f42430p0, false);
                                da daVar = ((h9) this).f41720x2;
                                s9 s9Var = daVar.U0;
                                if (s9Var != null) {
                                    s9Var.f41906w = m0;
                                    i71 i71Var = s9Var.f41908x;
                                    if (i71Var != null) {
                                        i71Var.V(m0.f4397r0);
                                    }
                                }
                                t9 t9Var = daVar.Z0;
                                if (t9Var != null) {
                                    t9Var.setHasRoundVideo(true);
                                }
                                jVar = m0;
                                if ((2 & mediaEntity.subType) != 0) {
                                    boolean z11 = !m0.f4394o0;
                                    m0.f4394o0 = z11;
                                    m0.f4395p0.f(z11, true);
                                    m0.invalidate();
                                    jVar = m0;
                                }
                            }
                            i11 = i10 + 1;
                            z4 = false;
                        }
                    }
                    jVar.setX((mediaEntity.f16693x * this.O1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                    jVar.setY((mediaEntity.f16694y * this.P1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                    jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
                    jVar.setScale(mediaEntity.scale);
                    jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    i11 = i10 + 1;
                    z4 = false;
                } else {
                    w4Var.setVisibility(0);
                    return;
                }
            }
        }
    }

    public final void I0(final boolean z4) {
        float f10;
        boolean z10;
        if (this.f41372y1 != z4) {
            this.f41372y1 = z4;
            o1.j jVar = this.f41374z1;
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
            this.f41374z1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z4) {
                f11 = 0.0f;
            }
            kVar.f16204i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f16198u = kVar;
            if (!this.L1.c() && this.f41357q2 <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            final boolean[] zArr = {z10};
            final float translationY = this.Q0.getTranslationY();
            final float alpha = this.f41371y0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f41374z1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14;
                    int i10;
                    c5 c5Var = c5.this;
                    y4 y4Var = c5Var.Q0;
                    float f15 = f12 / 1000.0f;
                    c5Var.A1 = f15;
                    float f16 = 1.0f;
                    float f17 = ((1.0f - f15) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY((Math.min(c5Var.A1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(c5Var.A1, 0.25f) / 0.25f));
                    h4 h4Var = c5Var.f41362t1;
                    float f18 = c5Var.A1;
                    boolean z11 = z4;
                    h4Var.y1(f18, z11);
                    dg.f2 f2Var = c5Var.f41371y0;
                    f2Var.setProgress(c5Var.A1);
                    dg.b2 b2Var = c5Var.f41369x0;
                    b2Var.setProgress(c5Var.A1);
                    c5Var.T0.setTranslationY(AndroidUtilities.dp(32.0f) * c5Var.A1);
                    AnimatorSet animatorSet = c5Var.K1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f19 = c5Var.A1;
                        if (!z11) {
                            f19 = 1.0f - f19;
                        }
                        if (z11) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        float f20 = alpha;
                        f2Var.setAlpha(AndroidUtilities.lerp(f20, f14, f19));
                        if (!z11) {
                            f16 = 0.0f;
                        }
                        b2Var.setAlpha(AndroidUtilities.lerp(f20, f16, f19));
                        float dp = AndroidUtilities.dp(39.0f) * f19;
                        if (z11) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        y4Var.setTranslationY(translationY - (dp * i10));
                    }
                    y4Var.invalidate();
                    if (view == c5Var.f41341i1) {
                        c5Var.R0.invalidate();
                    }
                }
            });
            this.f41374z1.a(new v3(this, z4, 0));
            this.f41374z1.f();
            if (z4) {
                h4 h4Var = this.f41362t1;
                h4Var.setVisibility(0);
                h4Var.setSelectedColorIndex(cg.f1.e(this.C1).d());
            }
        }
    }

    public final void J0(int i10) {
        boolean z4;
        int i11;
        dg.k2 k2Var = this.f41341i1;
        j4 j4Var = this.L1;
        if (i10 == 1) {
            kz kzVar = this.f41349m2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            kz kzVar2 = this.f41349m2;
            ca caVar = this.J1;
            if (kzVar2 != null && kzVar2.Z0 != UserConfig.selectedAccount) {
                caVar.removeView(kzVar2);
                this.f41349m2 = null;
            }
            if (this.f41349m2 == null) {
                kz kzVar3 = new kz(null, true, false, false, getContext(), false, null, null, true, this.D1, false, false);
                this.f41349m2 = kzVar3;
                kzVar3.f26475u2 = false;
                kzVar3.R0 = true;
                kzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f41349m2.setForseMultiwindowLayout(true);
                }
                this.f41349m2.setDelegate(new r4(this));
                caVar.addView(this.f41349m2);
            }
            this.f41349m2.setVisibility(0);
            this.f41351n2 = true;
            kz kzVar4 = this.f41349m2;
            if (this.f41361s2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f41361s2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f41361s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f41363t2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f41363t2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f41363t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f41363t2;
            } else {
                i11 = this.f41361s2;
            }
            int paddingUnderContainer = caVar.getPaddingUnderContainer() + i11;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            kzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                dg.j jVar = this.G0;
                if (jVar instanceof dg.b4) {
                    AndroidUtilities.hideKeyboard(((dg.b4) jVar).getEditText());
                }
            }
            this.f41357q2 = paddingUnderContainer;
            j4Var.a();
            requestLayout();
            qg emojiButton = k2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            if (!z4) {
                if (this.f41353o2) {
                    this.f41359r2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41357q2, 0.0f);
                    ofFloat.addUpdateListener(new w3(this, 1));
                    ofFloat.addListener(new k4(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                    ofFloat.start();
                }
            }
        } else {
            qg emojiButton2 = k2Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(og.e, true);
            }
            kz kzVar5 = this.f41349m2;
            if (kzVar5 != null) {
                this.f41351n2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f41357q2 = 0;
                j4Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(dg.i1 i1Var) {
        d7 d7Var = new d7(getContext(), this.D1, this.f41332d2, new org.telegram.ui.web.u1(5, this, i1Var));
        if (i1Var != null) {
            dg.f1 f1Var = i1Var.f4574r0;
            d7Var.Z = true;
            org.telegram.ui.Cells.i3 i3Var = d7Var.W;
            org.telegram.ui.Cells.i3 i3Var2 = d7Var.V;
            if (f1Var != null) {
                d7Var.f41457d0 = f1Var.d;
                d7Var.f41458e0 = false;
                i3Var2.setText(f1Var.f4507c);
                i3Var.setText(f1Var.f4506b);
                d7Var.f41463j0 = !TextUtils.isEmpty(f1Var.f4506b);
                d7Var.f41464k0 = f1Var.f4508f;
                d7Var.f41465l0 = f1Var.e;
            } else {
                i3Var2.setText("");
                i3Var.setText("");
                d7Var.f41464k0 = true;
                d7Var.f41465l0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = d7Var.Y;
            dVar.g(string, false, true);
            z6 z6Var = d7Var.U;
            if (z6Var != null) {
                z6Var.N(false);
            }
            dVar.setEnabled(d7Var.V(i3Var2.getText().toString()));
            d7Var.Z = false;
        }
        d7Var.setOnDismissListener(new e4(this, 1));
        d7Var.show();
        z0(true);
    }

    public final void L0(dg.m1 m1Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        li liVar = new li(getContext(), new m4(this, callback2), false, true, false, this.D1);
        liVar.W1 = new Object();
        mh mhVar = liVar.f26746u1;
        if (m1Var != null && (messageMedia = m1Var.f4661r0) != null && (geoPoint = messageMedia.geo) != null) {
            liVar.f26747u2 = new double[]{geoPoint.lat, geoPoint._long};
            liVar.L = true;
            mhVar.setVisibility(8);
        } else if (this.R1) {
            liVar.f26741s2 = this.T1;
            liVar.f26744t2 = this.S1;
            liVar.L = true;
            mhVar.setVisibility(8);
        } else {
            liVar.L = true;
            mhVar.setVisibility(8);
        }
        liVar.setOnDismissListener(new e4(this, 0));
        liVar.r1();
        liVar.show();
    }

    public final void M0(dg.j jVar) {
        if (jVar instanceof dg.a2) {
            org.telegram.ui.ActionBar.p1 p1Var = this.E1;
            if (p1Var != null && p1Var.isShowing()) {
                this.E1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.f41347l2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        w4 w4Var = this.O0;
        float scaleX2 = w4Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = w4Var.getScaleY() * scaleY * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new z3(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, c5 c5Var, int i10, int i11, int i12, boolean z4) {
        org.telegram.ui.ActionBar.p1 p1Var = this.E1;
        if (p1Var != null && p1Var.isShowing()) {
            this.E1.d(true);
            return;
        }
        if (this.F1 == null) {
            this.G1 = new Rect();
            b5 b5Var = new b5(this, getContext());
            this.F1 = b5Var;
            b5Var.setAnimationEnabled(true);
            this.F1.setOnTouchListener(new dg.v(this, 1));
            this.F1.setDispatchKeyEventListener(new b4(this));
            this.F1.setShownFromBottom(true);
        }
        b5 b5Var2 = this.F1;
        b5Var2.T = z4;
        b5Var2.d();
        runnable.run();
        if (this.E1 == null) {
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(this.F1, -2, -2);
            this.E1 = p1Var2;
            p1Var2.f20516b = true;
            p1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.E1.setOutsideTouchable(true);
            this.E1.setClippingEnabled(true);
            this.E1.setInputMethodMode(2);
            this.E1.setSoftInputMode(0);
            this.E1.getContentView().setFocusableInTouchMode(true);
            this.E1.setOnDismissListener(new dg.x(this, 1));
        }
        this.F1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.E1.setFocusable(true);
        int measuredWidth = i11 - (this.F1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.F1.getMeasuredHeight();
        this.E1.showAtLocation(c5Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.p1.i(this.F1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z4) {
            b5 b5Var3 = this.F1;
            b5Var3.setBackgroundDrawable(new org.telegram.ui.Components.ea(new org.telegram.ui.Components.fa(this.f41328b2, b5Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
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
                    ofFloat.addUpdateListener(new w3(this, 2));
                    ofFloat.addListener(new l61(11, this, z4));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(nr.f27347g);
                    ofFloat.start();
                    return;
                }
                if (this.W1.getReactionsWindow() != null) {
                    this.W1.getReactionsWindow().e();
                }
                this.W1.animate().alpha(0.0f).setDuration(150L).setListener(new k4(this, 0)).start();
            }
        }
    }

    public final void P0(boolean z4) {
        float f10;
        if (this.f41358r1 != z4) {
            this.f41358r1 = z4;
            o1.j jVar = this.f41360s1;
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
            this.f41360s1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z4) {
                f11 = 0.0f;
            }
            kVar.f16204i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f16198u = kVar;
            if (z4) {
                dg.q2 q2Var = this.f41343j1;
                q2Var.setAlpha(0.0f);
                q2Var.setVisibility(0);
            }
            this.f41360s1.b(new dg.y(2, this));
            this.f41360s1.a(new v3(this, z4, 1));
            this.f41360s1.f();
        }
    }

    public final PointF Q0(dg.j jVar) {
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
                w4 w4Var = this.O0;
                if (i11 >= w4Var.getChildCount()) {
                    break;
                }
                View childAt = w4Var.getChildAt(i11);
                if (!(childAt instanceof dg.j) || (childAt instanceof dg.a2)) {
                    f10 = f12;
                } else {
                    PointF position2 = ((dg.j) childAt).getPosition();
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
        return this.L1.f41748l - this.J1.getBottomPadding2();
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
            ViewGroup viewGroup3 = this.f41341i1;
            ViewGroup viewGroup4 = this.f41339h1;
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
            cg.f1 e = cg.f1.e(i12);
            if (i10 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (e.f2400l != z4) {
                e.f2400l = z4;
                if (z4) {
                    e.i(-1, false);
                } else {
                    e.i(e.f2392a.getInt("brush", 0), false);
                }
            }
            int c3 = cg.f1.e(i12).c();
            cg.f2 f2Var = this.f41370x1;
            f2Var.f2401a = c3;
            E0(f2Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.Y0 = duration;
            duration.setInterpolator(nr.f27346f);
            this.Y0.addUpdateListener(new dg.r(this, viewGroup, viewGroup2, 2));
            this.Y0.addListener(new dg.l0(this, viewGroup, viewGroup2, i10, 2));
            this.Y0.start();
        }
    }

    public final void S0() {
        boolean z4;
        j4 j4Var = this.L1;
        dg.k2 k2Var = this.f41341i1;
        if (k2Var != null) {
            if (j4Var.c()) {
                k2Var.a(R.drawable.input_smile);
            } else if (this.f41351n2) {
                k2Var.a(R.drawable.input_keyboard);
            } else {
                k2Var.a(R.drawable.msg_add);
            }
        }
        if (!j4Var.c() && !this.f41351n2) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z10 = !z4;
        AndroidUtilities.updateViewShow(this.l1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f41345k1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f41350n1, z4, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.f41348m1, z4, false, 1.0f, true, null);
    }

    public final void T0() {
        float f10;
        dg.j jVar;
        ObjectAnimator objectAnimator = this.f41336f2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.L0.getParent();
        if (view == null) {
            return;
        }
        j4 j4Var = this.L1;
        if (((j4Var.c() && !j4Var.d) || this.f41357q2 > 0) && (jVar = this.G0) != null) {
            f10 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f10);
        this.f41336f2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f41336f2.setInterpolator(nr.h);
        this.f41336f2.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: ph.c5.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    @Override
    public final void b(dg.j jVar) {
        O0(false);
        M0(jVar);
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
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new kg1(21, this, view)).start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f41344j2) {
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
        w4 w4Var = this.O0;
        int measuredWidth = w4Var.getMeasuredWidth();
        int measuredHeight = w4Var.getMeasuredHeight();
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
        dg.j jVar = this.G0;
        if (jVar instanceof dg.b4) {
            G0((dg.b4) jVar, i10);
            cg.f1 e = cg.f1.e(this.C1);
            e.f2396g = i10;
            e.f2392a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public abstract boolean f0(hm hmVar);

    public final void g0() {
        org.telegram.ui.Components.u5[] u5VarArr;
        boolean z4 = this.T1;
        w4 w4Var = this.O0;
        boolean z10 = true;
        if (!z4 && !this.V1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 < w4Var.getChildCount()) {
                    View childAt = w4Var.getChildAt(i10);
                    boolean z11 = childAt instanceof dg.b4;
                    int i11 = this.C1;
                    if (z11) {
                        CharSequence text = ((dg.b4) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.u5 u5Var : (org.telegram.ui.Components.u5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.u5.class)) {
                                TLRPC.Document document = u5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.l5.f(i11, u5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.l5.h(i11).e(document);
                                }
                                if (u6.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i10++;
                    } else if (childAt instanceof dg.r3) {
                        TLRPC.Document sticker = ((dg.r3) childAt).getSticker();
                        if (u6.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                            break;
                        }
                        i10++;
                    } else if (childAt instanceof dg.b3) {
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
        for (int i12 = 0; i12 < w4Var.getChildCount(); i12++) {
            View childAt2 = w4Var.getChildAt(i12);
            if (childAt2 instanceof dg.j) {
                ((dg.j) childAt2).setIsVideo(z10);
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
        return this.f41369x0;
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
        return this.f41371y0;
    }

    public View getEntitiesView() {
        return this.O0;
    }

    public long getLcm() {
        return this.f41331d1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.u5[] u5VarArr;
        w4 w4Var = this.O0;
        int childCount = w4Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = w4Var.getChildAt(i10);
            if (childAt instanceof dg.r3) {
                TLRPC.Document sticker = ((dg.r3) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f19196id = sticker.f19190id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof dg.b4) {
                CharSequence text = ((dg.b4) childAt).getText();
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
                                tL_inputDocument2.f19196id = document.f19190id;
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

    public cg.p1 getRenderView() {
        return this.L0;
    }

    public dg.j getSelectedEntity() {
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
        return this.f41326a1;
    }

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.D1));
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

    public final dg.i1 i0(dg.f1 f1Var) {
        int measuredWidth;
        int i10;
        this.f41342i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        w4 w4Var = this.O0;
        if (w4Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.O1;
        } else {
            measuredWidth = w4Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        dg.i1 i1Var = new dg.i1(getContext(), Q0, this.C1, f1Var, f10 / 360.0f, dp);
        if (Q0.x == w4Var.getMeasuredWidth() / 2.0f) {
            i1Var.setStickyX(2);
        }
        if (Q0.y == w4Var.getMeasuredHeight() / 2.0f) {
            i1Var.setStickyY(2);
        }
        cg.f2 f2Var = this.f41370x1;
        if (f2Var != null && (i10 = f2Var.f2401a) != -47814) {
            i1Var.setColor(i10);
        }
        i1Var.setDelegate(this);
        i1Var.setMaxWidth(dp);
        w4Var.addView(i1Var, k7.b6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            i1Var.j(1.0f / cropState.cropScale);
            i1Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return i1Var;
    }

    public final dg.m1 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i10;
        this.f41342i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        w4 w4Var = this.O0;
        if (w4Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.O1;
        } else {
            measuredWidth = w4Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        dg.m1 m1Var = new dg.m1(getContext(), Q0, this.C1, messageMedia, mediaArea, f10 / 240.0f, dp);
        if (Q0.x == w4Var.getMeasuredWidth() / 2.0f) {
            m1Var.setStickyX(2);
        }
        if (Q0.y == w4Var.getMeasuredHeight() / 2.0f) {
            m1Var.setStickyY(2);
        }
        cg.f2 f2Var = this.f41370x1;
        if (f2Var != null && (i10 = f2Var.f2401a) != -47814) {
            m1Var.setColor(i10);
        }
        m1Var.setDelegate(this);
        m1Var.setMaxWidth(dp);
        w4Var.addView(m1Var, k7.b6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            m1Var.j(1.0f / cropState.cropScale);
            m1Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return m1Var;
    }

    public final dg.v2 k0(String str, boolean z4) {
        float f10;
        jv0 jv0Var;
        this.f41342i2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f10 = 1.0f;
        }
        w4 w4Var = this.O0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.O1, w4Var.getMeasuredWidth()) * 0.5d);
            jv0Var = new jv0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.P1, w4Var.getMeasuredHeight()) * 0.5d);
            jv0Var = new jv0(f10 * floor2, floor2);
        }
        jv0 jv0Var2 = jv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = jv0Var2.f26052a;
            jv0Var2.f26052a = jv0Var2.f26053b;
            jv0Var2.f26053b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        dg.v2 v2Var = new dg.v2(context, e02, jv0Var2, str, intValue);
        v2Var.setDelegate(this);
        w4Var.addView(v2Var);
        g0();
        return v2Var;
    }

    @Override
    public final boolean l(MotionEvent motionEvent) {
        if (this.f41344j2) {
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

    public final dg.a3 l0(boolean z4) {
        String str;
        jv0 jv0Var = new jv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        w4 w4Var = this.O0;
        if (w4Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < w4Var.getChildCount(); i10++) {
                    View childAt = w4Var.getChildAt(i10);
                    if (k7.n6.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (w4Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (w4Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, w4Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, w4Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new dg.j(getContext(), e02);
        jVar.f4364o0 = new nh.o8(jVar);
        jVar.f4365p0 = new nh.o8(jVar);
        jVar.f4366q0 = new mg.h0(jVar);
        jVar.f4367r0 = new mg.h0(jVar);
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5((View) jVar);
        jVar.f4369t0 = z5Var;
        org.telegram.ui.Components.z5 z5Var2 = new org.telegram.ui.Components.z5((View) jVar);
        jVar.f4370u0 = z5Var2;
        jVar.f4372w0 = 1.0f;
        jVar.f4363n0 = jv0Var;
        z5Var2.d(1.0f, true);
        z5Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        mg.h0 h0Var = jVar.f4366q0;
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
        mg.q0 b10 = mg.q0.b(str);
        jVar.f4368s0 = b10;
        h0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        w4Var.addView(jVar);
        g0();
        if (z4) {
            B0(jVar);
            D0(jVar, true);
        }
        return jVar;
    }

    public final dg.b3 m0(String str, boolean z4) {
        float f10;
        this.f41342i2 = true;
        this.f41346k2 = true;
        q0();
        w4 w4Var = this.O0;
        int measuredWidth = w4Var.getMeasuredWidth();
        w4Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.O1;
        }
        float floor = (float) Math.floor(0.43f * f10);
        jv0 jv0Var = new jv0(floor, floor);
        dg.b3 b3Var = new dg.b3(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (jv0Var.f26053b / 2.0f) + AndroidUtilities.dp(72.0f)), jv0Var, str);
        b3Var.setDelegate(this);
        w4Var.addView(b3Var);
        g0();
        if (z4) {
            B0(b3Var);
            post(new s3(this, b3Var, 0));
        }
        this.f41346k2 = false;
        return b3Var;
    }

    public final p4 n0(Object obj, TLRPC.Document document) {
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
        dg.d1 d1Var = new dg.d1(e0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f26052a * 0.5d);
        p4 p4Var = new p4(this, context, d1Var.f4446a, d1Var.f4448c, d1Var.f4447b, new jv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = p4Var.f4777u0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        p4Var.setDelegate(this);
        this.O0.addView(p4Var);
        g0();
        return p4Var;
    }

    public final dg.b4 o0(boolean z4) {
        jv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        dg.b4 b4Var = new dg.b4(getContext(), Q0, (int) (paintingSize.f26052a / 9.0f), "", this.f41370x1, this.I0);
        float f10 = paintingSize.f26052a / 9.0f;
        a4 a4Var = new a4(this, 0);
        b4Var.f4412t0 = (int) (0.5f * f10);
        b4Var.f4413u0 = (int) (f10 * 2.0f);
        b4Var.f4414v0 = a4Var;
        float f11 = Q0.x;
        w4 w4Var = this.O0;
        if (f11 == w4Var.getMeasuredWidth() / 2.0f) {
            b4Var.setStickyX(2);
        }
        if (Q0.y == w4Var.getMeasuredHeight() / 2.0f) {
            b4Var.setStickyY(2);
        }
        b4Var.setDelegate(this);
        b4Var.setMaxWidth(this.O1 - AndroidUtilities.dp(32.0f));
        int i10 = this.C1;
        b4Var.setTypeface(cg.f1.e(i10).f2398j);
        b4Var.setType(cg.f1.e(i10).h);
        w4Var.addView(b4Var, k7.b6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            b4Var.j(1.0f / cropState.cropScale);
            b4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z4) {
            B0(b4Var);
            b4Var.q();
            D0(b4Var, false);
            b4Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(b4Var.getFocusedView());
            this.H0 = true;
            int i11 = cg.f1.e(i10).f2396g;
            dg.k2 k2Var = this.f41341i1;
            k2Var.d(i11, true);
            k2Var.setOutlineType(cg.f1.e(i10).h);
        }
        return b4Var;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        pk0 pk0Var = this.W1;
        if (pk0Var != null) {
            AndroidUtilities.removeFromParent(pk0Var);
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
        Bitmap bitmap = this.f41373z0;
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
        float f12 = this.E0.f26052a;
        dg.j jVar = this.G0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.Q0, i10, i11);
        measureChild(this.f41326a1, i10, i11);
        measureChild(this.S0, i10, i11);
        measureChild(this.R0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f41357q2 - this.J1.getPaddingUnderContainer(), R()), 1073741824));
        FrameLayout frameLayout = this.P0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.D0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f41351n2 && !this.f41355p2) {
            this.D0 = true;
            w0();
            this.D0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    @Override
    public final boolean p() {
        return !(this.G0 instanceof dg.a2);
    }

    public final dg.c4 p0(za zaVar) {
        int measuredWidth;
        int i10;
        this.f41342i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        w4 w4Var = this.O0;
        if (w4Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.O1;
        } else {
            measuredWidth = w4Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int dp = ((int) f10) - AndroidUtilities.dp(58.0f);
        dg.c4 c4Var = new dg.c4(getContext(), Q0, this.C1, zaVar, f10 / 240.0f, dp);
        if (Q0.x == w4Var.getMeasuredWidth() / 2.0f) {
            c4Var.setStickyX(2);
        }
        if (Q0.y == w4Var.getMeasuredHeight() / 2.0f) {
            c4Var.setStickyY(2);
        }
        cg.f2 f2Var = this.f41370x1;
        if (f2Var != null && (i10 = f2Var.f2401a) != -47814) {
            c4Var.setColor(i10);
        }
        c4Var.setDelegate(this);
        c4Var.setMaxWidth(dp);
        w4Var.addView(c4Var, k7.b6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            c4Var.j(1.0f / cropState.cropScale);
            c4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return c4Var;
    }

    @Override
    public final boolean q() {
        return !this.H0;
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            w4 w4Var = this.O0;
            if (i10 < w4Var.getChildCount()) {
                View childAt = w4Var.getChildAt(i10);
                if (childAt instanceof dg.b3) {
                    if (this.G0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(nr.h).withEndAction(new s3(this, (dg.b3) childAt, 1)).start();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final int[] r(dg.j jVar) {
        int[] iArr = this.f41347l2;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public abstract void r0();

    @Override
    public final void requestLayout() {
        if (this.D0) {
            return;
        }
        super.requestLayout();
    }

    public final dg.a2 s0() {
        int i10 = 0;
        while (true) {
            w4 w4Var = this.O0;
            if (i10 < w4Var.getChildCount()) {
                View childAt = w4Var.getChildAt(i10);
                if (childAt instanceof dg.a2) {
                    return (dg.a2) childAt;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ba baVar) {
        this.f41328b2 = baVar;
    }

    public void setCoverPreview(boolean z4) {
        if (this.f41344j2 != z4) {
            this.f41344j2 = z4;
            if (z4) {
                D0(null, true);
            }
            setCoverPause(z4);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            w4 w4Var = this.O0;
            if (i10 < w4Var.getChildCount()) {
                View childAt = w4Var.getChildAt(i10);
                if (childAt instanceof dg.r3) {
                    ImageReceiver imageReceiver = ((dg.r3) childAt).f4777u0;
                    gj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    imageReceiver.getAnimation();
                    if (lottieAnimation != null) {
                        lottieAnimation.L(Math.round(((((float) j10) % ((float) lottieAnimation.p())) / ((float) lottieAnimation.p())) * lottieAnimation.e[0]), true, false);
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
    public final void t() {
        if (!this.f41353o2 && !this.f41351n2) {
            this.f41342i2 = true;
            o0(true);
            return;
        }
        if (this.f41351n2) {
            dg.j jVar = this.G0;
            if (jVar instanceof dg.b4) {
                this.L1.e = true;
                AndroidUtilities.showKeyboard(((dg.b4) jVar).getEditText());
            }
        }
        J0(!this.f41351n2 ? 1 : 0);
    }

    public final android.graphics.Bitmap t0(java.util.ArrayList r41, boolean r42, boolean r43, boolean r44, boolean r45, ph.u6 r46) {
        throw new UnsupportedOperationException("Method not decompiled: ph.c5.t0(java.util.ArrayList, boolean, boolean, boolean, boolean, ph.u6):android.graphics.Bitmap");
    }

    @Override
    public final void u(float f10, float f11, float[] fArr) {
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

    public final boolean u0() {
        if (!this.A0.a() && !this.f41342i2) {
            return false;
        }
        return true;
    }

    @Override
    public final cg.f1 v() {
        return cg.f1.e(this.C1);
    }

    public final void v0(boolean z4) {
        if (this.f41351n2) {
            J0(0);
        }
        if (z4) {
            kz kzVar = this.f41349m2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f41349m2.getMeasuredHeight());
                ofFloat.addUpdateListener(new w3(this, 0));
                this.f41355p2 = true;
                ofFloat.addListener(new k4(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                ofFloat.start();
                return;
            }
            w0();
        }
    }

    @Override
    public final boolean w(dg.j jVar) {
        return D0(jVar, true);
    }

    public final void w0() {
        kz kzVar;
        if (!this.f41351n2 && (kzVar = this.f41349m2) != null && kzVar.getVisibility() != 8) {
            this.f41349m2.setVisibility(8);
        }
        int i10 = this.f41357q2;
        this.f41357q2 = 0;
        if (i10 != 0) {
            this.L1.a();
        }
    }

    @Override
    public final void x(cg.m mVar) {
        boolean z4 = mVar instanceof cg.b;
        dg.t2 t2Var = this.f41326a1;
        if (!z4 && !(mVar instanceof cg.d)) {
            t2Var.b(0.05f, 1.0f);
        } else {
            t2Var.b(0.4f, 1.75f);
        }
        t2Var.setDrawCenter(!(mVar instanceof cg.l));
        s4 s4Var = this.L0;
        if (s4Var.getCurrentBrush() instanceof cg.l) {
            this.Z0 = true;
        }
        s4Var.setBrush(mVar);
        cg.f2 f2Var = this.f41370x1;
        int i10 = f2Var.f2401a;
        f2Var.f2401a = cg.f1.e(this.C1).c();
        f2Var.f2403c = this.f41327b1.get();
        E0(f2Var, Integer.valueOf(i10), false);
        this.M0.invalidate();
    }

    public final boolean y0() {
        if (this.Z1) {
            if (this.W1.getReactionsWindow() != null && !this.W1.getReactionsWindow().f13985q) {
                this.W1.e();
                return true;
            }
            O0(false);
            return true;
        } else if (this.f41372y1) {
            I0(false);
            return true;
        } else if (this.f41351n2) {
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
