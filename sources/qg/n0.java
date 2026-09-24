package qg;

import ai.qa;
import ai.x4;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.c5;
import ci.g5;
import ci.i4;
import ci.i5;
import ci.t5;
import ci.w4;
import ci.w5;
import ci.x5;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zg;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.ar0;
import org.telegram.ui.st0;
import w7.y5;
public abstract class n0 extends bw0 implements r1, h, n1, zv0, NotificationCenter.NotificationCenterDelegate {
    public final g1 A0;
    public final TextView A1;
    public final k1 B0;
    public final Paint B1;
    public float C0;
    public final Paint C1;
    public final Bitmap D0;
    public float D1;
    public final Bitmap E0;
    public boolean E1;
    public final pg.w1 F0;
    public o1.k F1;
    public final DispatchQueue G0;
    public final k0 G1;
    public final MediaController.CropState H0;
    public final Paint H1;
    public float I0;
    public final Paint I1;
    public float J0;
    public final Paint J1;
    public float K0;
    public final pg.t1 K1;
    public float L0;
    public boolean L1;
    public float M0;
    public o1.k M1;
    public float N0;
    public float N1;
    public float O0;
    public final Paint O1;
    public boolean P0;
    public final int P1;
    public float Q0;
    public final eh.a Q1;
    public uv0 R0;
    public org.telegram.ui.ActionBar.m1 R1;
    public j S0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout S1;
    public boolean T0;
    public Rect T1;
    public int U0;
    public Runnable U1;
    public final boolean V0;
    public final pg.u0 V1;
    public final d0 W0;
    public boolean W1;
    public final f0 X0;
    public float X1;
    public final i0 Y0;
    public boolean Y1;
    public final h0 Z0;
    public final e6 Z1;
    public k11 f41756a1;
    public final Paint a2;
    public final FrameLayout f41757b1;
    public final Paint f41758b2;
    public final l0 f41759c1;
    public ch.d f41760c2;
    public final j0 f41761d1;
    public final float[] f41762d2;
    public final FrameLayout f41763e1;
    public final int[] f41764e2;
    public w5 f41765f1;
    public lz f41766f2;
    public int f41767g1;
    public boolean f41768g2;
    public int f41769h1;
    public boolean f41770h2;
    public float f41771i1;
    public boolean f41772i2;
    public ValueAnimator f41773j1;
    public int f41774j2;
    public boolean f41775k1;
    public int f41776k2;
    public final x1 l1;
    public int f41777l2;
    public final ka.c f41778m1;
    public int f41779m2;
    public ArrayList f41780n1;
    public boolean f41781n2;
    public final int f41782o1;
    public BigInteger f41783p1;
    public TextView f41784q1;
    public TextView f41785r1;
    public TextView f41786s1;
    public final s1 f41787t1;
    public final p1 f41788u1;
    public final u1 f41789v1;
    public final ImageView f41790w1;
    public final LinearLayout f41791x1;
    public final TextView f41792y1;
    public final TextView f41793z1;

    public n0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, ar0 ar0Var, d6 d6Var) {
        super(context, activity);
        boolean z10;
        float f7;
        int i12;
        int i13;
        Emoji.EmojiSpan[] emojiSpanArr;
        y1 y1Var;
        boolean z11 = false;
        this.f41767g1 = 0;
        this.f41769h1 = -1;
        final st0 st0Var = (st0) this;
        this.f41778m1 = new ka.c(st0Var, 16);
        byte b10 = 1;
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.H1 = new Paint(1);
        this.I1 = new Paint(1);
        this.J1 = new Paint(1);
        pg.t1 t1Var = new pg.t1(1.0f, 0.016773745f, -1);
        this.K1 = t1Var;
        this.O1 = new Paint(1);
        this.Y1 = false;
        this.Z1 = new e6((View) this, 350L, rr.h);
        this.a2 = new Paint(1);
        Paint paint = new Paint(1);
        this.f41758b2 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.f41762d2 = new float[2];
        this.f41764e2 = new int[2];
        new pg.c1(st0Var, 1);
        setDelegate(this);
        this.P1 = i10;
        this.Q1 = new eh.a(3, d6Var);
        this.H0 = cropState;
        this.V0 = context instanceof BubbleActivity;
        pg.u0 e = pg.u0.e(i10);
        this.V1 = e;
        e.i(0, true);
        t1Var.f41251a = e.c();
        t1Var.f41253c = e.f41265i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.G0 = dispatchQueue;
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.f41782o1 = i11;
        pg.w1 w1Var = new pg.w1();
        this.F0 = w1Var;
        w1Var.f41287a = new le.b(st0Var, 19);
        d0 d0Var = new d0(st0Var, context, new pg.s0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.W0 = d0Var;
        d0Var.setDelegate(new e0(st0Var, ar0Var));
        d0Var.setUndoStore(w1Var);
        d0Var.setQueue(dispatchQueue);
        d0Var.setVisibility(4);
        addView(d0Var, y5.e(-1, -1, 51));
        f0 f0Var = new f0(st0Var, context);
        this.X0 = f0Var;
        f0Var.setVisibility(4);
        addView(f0Var, y5.e(-1, -1, 51));
        h0 h0Var = new h0(st0Var, context, new g0(st0Var));
        this.Z0 = h0Var;
        addView(h0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i14);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    f7 = 2.0f;
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    i13 = i14;
                    y1Var = i02;
                } else {
                    f7 = 2.0f;
                    if (b11 == b10) {
                        ?? j02 = j0(z11);
                        j02.setType(mediaEntity.subType);
                        j02.setTypeface(mediaEntity.textTypeface);
                        j02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i15);
                            i15++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            int i16 = size;
                            z5 z5Var = new z5(emojiEntity2.document_id, j02.getFontMetricsInt());
                            int i17 = emojiEntity2.offset;
                            spannableString.setSpan(z5Var, i17, emojiEntity2.length + i17, 33);
                            i14 = i14;
                            size2 = size2;
                            size = i16;
                        }
                        i12 = size;
                        i13 = i14;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        j02.setText(replaceEmoji);
                        v0(j02, mediaEntity.textAlign);
                        pg.t1 swatch = j02.getSwatch();
                        swatch.f41251a = mediaEntity.color;
                        j02.setSwatch(swatch);
                        y1Var = j02;
                    } else {
                        i12 = size;
                        i13 = i14;
                        if (b11 == 2) {
                            y1 h02 = h0(mediaEntity.text, false);
                            h02.B0 = false;
                            if ((mediaEntity.subType & 2) != 0) {
                                h02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            y1Var = h02;
                        } else {
                            i14 = i13 + 1;
                            size = i12;
                            z11 = false;
                            b10 = 1;
                        }
                    }
                }
                y1Var.setX((mediaEntity.f15840x * this.R0.f28926a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f7));
                y1Var.setY((mediaEntity.f15841y * this.R0.f28927b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f7));
                y1Var.setPosition(new PointF((mediaEntity.viewWidth / f7) + y1Var.getX(), (mediaEntity.viewHeight / f7) + y1Var.getY()));
                y1Var.setScale(mediaEntity.scale);
                y1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i14 = i13 + 1;
                size = i12;
                z11 = false;
                b10 = 1;
            }
        }
        this.Z0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.Y0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.f41757b1 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, y5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f41790w1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(h6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        st0 st0Var2 = st0Var;
                        d0 d0Var2 = st0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof pg.l)) {
                            d0Var2.b();
                            st0Var2.f41787t1.setSelectedIndex(1);
                            st0Var2.b((pg.m) pg.m.f41155a.get(0));
                            return;
                        }
                        st0Var2.F0.c();
                        return;
                    case 1:
                        st0 st0Var3 = st0Var;
                        d0 d0Var3 = st0Var3.W0;
                        pg.w1 w1Var2 = st0Var3.F0;
                        if (w1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof pg.l)) {
                                d0Var3.b();
                                st0Var3.f41787t1.setSelectedIndex(1);
                                st0Var3.b((pg.m) pg.m.f41155a.get(0));
                            }
                            d0Var3.a();
                            w1Var2.f41289c.clear();
                            w1Var2.f41288b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(w1Var2, 13));
                            st0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        st0 st0Var4 = st0Var;
                        j jVar = st0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (st0Var4.f41768g2) {
                            st0Var4.m0(false);
                        }
                        st0Var4.r0(st0Var4.S0);
                        st0Var4.s0(null, true);
                        return;
                    default:
                        st0Var.s0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, y5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41791x1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(h6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ok.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, y5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, y5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.e2(22));
        frameLayout2.addView(linearLayout, y5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f41792y1 = textView2;
        textView2.setBackground(h6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        st0 st0Var2 = st0Var;
                        d0 d0Var2 = st0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof pg.l)) {
                            d0Var2.b();
                            st0Var2.f41787t1.setSelectedIndex(1);
                            st0Var2.b((pg.m) pg.m.f41155a.get(0));
                            return;
                        }
                        st0Var2.F0.c();
                        return;
                    case 1:
                        st0 st0Var3 = st0Var;
                        d0 d0Var3 = st0Var3.W0;
                        pg.w1 w1Var2 = st0Var3.F0;
                        if (w1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof pg.l)) {
                                d0Var3.b();
                                st0Var3.f41787t1.setSelectedIndex(1);
                                st0Var3.b((pg.m) pg.m.f41155a.get(0));
                            }
                            d0Var3.a();
                            w1Var2.f41289c.clear();
                            w1Var2.f41288b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(w1Var2, 13));
                            st0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        st0 st0Var4 = st0Var;
                        j jVar = st0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (st0Var4.f41768g2) {
                            st0Var4.m0(false);
                        }
                        st0Var4.r0(st0Var4.S0);
                        st0Var4.s0(null, true);
                        return;
                    default:
                        st0Var.s0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout2, textView2, y5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f41793z1 = h;
        h.setBackground(h6.f0(822083583, 7, -1));
        h.setPadding(org.telegram.ui.Cells.c1.c(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        st0 st0Var2 = st0Var;
                        d0 d0Var2 = st0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof pg.l)) {
                            d0Var2.b();
                            st0Var2.f41787t1.setSelectedIndex(1);
                            st0Var2.b((pg.m) pg.m.f41155a.get(0));
                            return;
                        }
                        st0Var2.F0.c();
                        return;
                    case 1:
                        st0 st0Var3 = st0Var;
                        d0 d0Var3 = st0Var3.W0;
                        pg.w1 w1Var2 = st0Var3.F0;
                        if (w1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof pg.l)) {
                                d0Var3.b();
                                st0Var3.f41787t1.setSelectedIndex(1);
                                st0Var3.b((pg.m) pg.m.f41155a.get(0));
                            }
                            d0Var3.a();
                            w1Var2.f41289c.clear();
                            w1Var2.f41288b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(w1Var2, 13));
                            st0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        st0 st0Var4 = st0Var;
                        j jVar = st0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (st0Var4.f41768g2) {
                            st0Var4.m0(false);
                        }
                        st0Var4.r0(st0Var4.S0);
                        st0Var4.s0(null, true);
                        return;
                    default:
                        st0Var.s0(null, true);
                        return;
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h10 = org.telegram.ui.Cells.c1.h(frameLayout2, h, y5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.A1 = h10;
        h10.setBackground(h6.f0(822083583, 7, -1));
        h10.setPadding(org.telegram.ui.Cells.c1.c(8.0f, R.string.Done, h10), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setGravity(16);
        h10.setTextColor(-1);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setTextSize(1, 16.0f);
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        st0 st0Var2 = st0Var;
                        d0 d0Var2 = st0Var2.W0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof pg.l)) {
                            d0Var2.b();
                            st0Var2.f41787t1.setSelectedIndex(1);
                            st0Var2.b((pg.m) pg.m.f41155a.get(0));
                            return;
                        }
                        st0Var2.F0.c();
                        return;
                    case 1:
                        st0 st0Var3 = st0Var;
                        d0 d0Var3 = st0Var3.W0;
                        pg.w1 w1Var2 = st0Var3.F0;
                        if (w1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof pg.l)) {
                                d0Var3.b();
                                st0Var3.f41787t1.setSelectedIndex(1);
                                st0Var3.b((pg.m) pg.m.f41155a.get(0));
                            }
                            d0Var3.a();
                            w1Var2.f41289c.clear();
                            w1Var2.f41288b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(w1Var2, 13));
                            st0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        st0 st0Var4 = st0Var;
                        j jVar = st0Var4.S0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (st0Var4.f41768g2) {
                            st0Var4.m0(false);
                        }
                        st0Var4.r0(st0Var4.S0);
                        st0Var4.s0(null, true);
                        return;
                    default:
                        st0Var.s0(null, true);
                        return;
                }
            }
        });
        h10.setAlpha(0.0f);
        h10.setVisibility(8);
        frameLayout2.addView(h10, y5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        l0 l0Var = new l0(st0Var, context);
        this.f41759c1 = l0Var;
        l0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        l0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(l0Var, y5.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        s1 s1Var = new s1(context, z10);
        this.f41787t1 = s1Var;
        s1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s1Var.setDelegate(this);
        s1Var.setSelectedIndex(1);
        l0Var.addView(s1Var, y5.c(48.0f, -1));
        p1 p1Var = new p1(context);
        this.f41788u1 = p1Var;
        p1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        p1Var.setVisibility(8);
        p1Var.setDelegate(this);
        p1Var.setAlignment(pg.u0.e(i10).f41264g);
        l0Var.addView(p1Var, y5.c(48.0f, -1));
        j0 j0Var = new j0(st0Var, context);
        this.f41761d1 = j0Var;
        addView(j0Var, y5.c(-1.0f, -1));
        u1 u1Var = new u1(context);
        this.f41789v1 = u1Var;
        u1Var.setVisibility(8);
        u1Var.setOnItemClickListener(new ai.g(st0Var, 14));
        p1Var.setTypefaceListView(u1Var);
        j0Var.addView(u1Var, y5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.B1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.B1.setColor(1728053247);
        this.B1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.C1.setColor(h6.v0(h6.G8, this.Q1));
        k0 k0Var = new k0(st0Var, context);
        this.G1 = k0Var;
        k0Var.setVisibility(8);
        k0Var.setColorPalette(pg.u0.e(i10));
        k0Var.setColorListener(new m(st0Var, 0));
        l0Var.addView(k0Var, y5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        g1 g1Var = new g1(context);
        this.A0 = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        g1Var.setBackground(h6.f0(1090519039, 1, -1));
        l0Var.addView(g1Var, y5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        k1 k1Var = new k1(context);
        this.B0 = k1Var;
        k1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        k1Var.setBackground(h6.f0(1090519039, 1, -1));
        k1Var.setOnClickListener(new ai.d0(st0Var, context, bitmap2, 29));
        l0Var.addView(k1Var, y5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        x1 x1Var = new x1(context);
        this.l1 = x1Var;
        x1Var.setColorSwatch(this.K1);
        x1Var.setRenderView(this.W0);
        x1Var.setValueOverride(this.f41778m1);
        this.K1.f41253c = this.f41778m1.get();
        x1Var.setOnUpdate(new v(st0Var, i10, 0));
        addView(x1Var, y5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f41763e1 = frameLayout3;
        addView(frameLayout3, y5.c(-1.0f, -1));
        this.J1.setStyle(style);
        this.J1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        t0(this.K1, null);
        b((pg.m) pg.m.f41155a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(st0 st0Var, Integer num) {
        st0Var.setNewColor(num.intValue());
        st0Var.x0(false);
    }

    public static void a0(qg.n0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: qg.n0.a0(qg.n0):void");
    }

    public static void b0(n0 n0Var) {
        o2 o2Var;
        h0 h0Var = n0Var.Z0;
        j jVar = n0Var.S0;
        if (jVar != null) {
            PointF B0 = n0Var.B0(jVar);
            j jVar2 = n0Var.S0;
            if (jVar2 instanceof o2) {
                o2 o2Var2 = new o2(n0Var.getContext(), (o2) n0Var.S0, B0);
                o2Var2.setDelegate(n0Var);
                h0Var.addView(o2Var2);
                o2Var = o2Var2;
            } else if (jVar2 instanceof v2) {
                v2 v2Var = new v2(n0Var.getContext(), (v2) n0Var.S0, B0);
                v2Var.setDelegate(n0Var);
                v2Var.setMaxWidth((int) (n0Var.getPaintingSize().f28926a - 20.0f));
                h0Var.addView(v2Var, y5.c(-2.0f, -2));
                o2Var = v2Var;
            } else {
                o2Var = null;
            }
            n0Var.q0(o2Var);
            n0Var.s0(o2Var, true);
        }
        org.telegram.ui.ActionBar.m1 m1Var = n0Var.R1;
        if (m1Var != null && m1Var.isShowing()) {
            n0Var.R1.d(true);
        }
    }

    public static void c0(st0 st0Var, Integer num) {
        pg.u0 u0Var = st0Var.V1;
        u0Var.h(num.intValue(), true);
        u0Var.g();
        st0Var.setNewColor(num.intValue());
        k0 k0Var = st0Var.G1;
        k0Var.setSelectedColorIndex(u0Var.d());
        k0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f41767g1 == 2) {
            return this.f41788u1;
        }
        return this.f41787t1;
    }

    private int getFrameRotation() {
        int i10 = this.f41782o1;
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

    private uv0 getPaintingSize() {
        int i10;
        uv0 uv0Var = this.R0;
        if (uv0Var != null) {
            return uv0Var;
        }
        Bitmap bitmap = this.D0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            if (devicePerformanceClass != 2) {
                i10 = 2560;
            } else {
                i10 = 3840;
            }
        } else {
            i10 = 1280;
        }
        uv0 uv0Var2 = new uv0(width, height);
        float f7 = i10;
        uv0Var2.f28926a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        uv0Var2.f28927b = floor;
        if (floor > f7) {
            uv0Var2.f28927b = f7;
            uv0Var2.f28926a = (float) Math.floor((f7 * width) / height);
        }
        this.R0 = uv0Var2;
        return uv0Var2;
    }

    public void setNewColor(int i10) {
        pg.t1 t1Var = this.K1;
        int i11 = t1Var.f41251a;
        t1Var.f41251a = i10;
        t0(t1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new c5(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.U0 = i10;
        j jVar = this.S0;
        if (jVar instanceof v2) {
            ((v2) jVar).setType(i10);
        }
        pg.u0 e = pg.u0.e(this.P1);
        e.h = i10;
        e.f41260a.edit().putInt("text_type", i10).apply();
        this.f41788u1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        w5 w5Var = new w5(this, context);
        this.f41765f1 = w5Var;
        w5Var.setClipToPadding(false);
        this.f41765f1.setOrientation(0);
        this.f41759c1.addView(this.f41765f1, y5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f41784q1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f41784q1;
        int i10 = h6.f19134i6;
        eh.a aVar = this.Q1;
        textView2.setBackground(h6.f0(h6.v0(i10, aVar), 7, -1));
        this.f41784q1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41784q1.setTextColor(-1);
        this.f41784q1.setTextSize(1, 14.0f);
        this.f41784q1.setGravity(1);
        this.f41784q1.setTypeface(AndroidUtilities.bold());
        this.f41784q1.setSingleLine();
        this.f41784q1.setOnClickListener(new k(this, 0));
        this.f41765f1.addView(this.f41784q1, y5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f41785r1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f41785r1.setBackground(h6.f0(h6.v0(i10, aVar), 7, -1));
        this.f41785r1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41785r1.setOnClickListener(new k(this, 1));
        this.f41785r1.setTextColor(-1);
        this.f41785r1.setTextSize(1, 14.0f);
        this.f41785r1.setGravity(1);
        this.f41785r1.setTypeface(AndroidUtilities.bold());
        this.f41785r1.setAlpha(0.6f);
        this.f41785r1.setSingleLine();
        this.f41765f1.addView(this.f41785r1, y5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f41786s1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f41786s1.setBackground(h6.f0(h6.v0(i10, aVar), 7, -1));
        this.f41786s1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f41786s1.setTextColor(-1);
        this.f41786s1.setTextSize(1, 14.0f);
        this.f41786s1.setGravity(1);
        this.f41786s1.setTypeface(AndroidUtilities.bold());
        this.f41786s1.setAlpha(0.6f);
        this.f41786s1.setSingleLine();
        this.f41786s1.setOnClickListener(new k(this, 4));
        this.f41765f1.addView(this.f41786s1, y5.l(1.0f, 0, -2));
    }

    public static void v0(v2 v2Var, int i10) {
        int i11;
        v2Var.setAlign(i10);
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
        v2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        v2Var.getEditText().setTextAlignment(i12);
    }

    public final void A0(boolean z10) {
        float f7;
        if (this.E1 != z10) {
            this.E1 = z10;
            o1.k kVar = this.F1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new o1.j(f7));
            this.F1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f15524i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f15518u = lVar;
            if (z10) {
                u1 u1Var = this.f41789v1;
                u1Var.setAlpha(0.0f);
                u1Var.setVisibility(0);
            }
            this.F1.b(new qa(3, this));
            this.F1.a(new r(this, z10, 0));
            this.F1.f();
        }
    }

    public final PointF B0(j jVar) {
        float f7 = 200.0f;
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            f7 = 200.0f / cropState.cropScale;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f7, position.y + f7);
        }
        float f10 = 100.0f;
        if (cropState != null) {
            f10 = 100.0f / cropState.cropScale;
        }
        PointF g02 = g0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                h0 h0Var = this.Z0;
                if (i10 >= h0Var.getChildCount()) {
                    break;
                }
                View childAt = h0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return g02;
            }
            g02 = new PointF(g02.x + f7, g02.y + f7);
        }
    }

    @Override
    public final int[] C(j jVar) {
        return k0(jVar);
    }

    public final void C0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.f41767g1 != i10 && this.f41769h1 != i10) {
            ValueAnimator valueAnimator = this.f41773j1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f41767g1;
            ViewGroup viewGroup3 = this.f41788u1;
            ViewGroup viewGroup4 = this.f41787t1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f41769h1 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.P1;
            pg.u0 e = pg.u0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f41268l != z10) {
                e.f41268l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f41260a.getInt("brush", 0), false);
                }
            }
            int c10 = pg.u0.e(i12).c();
            pg.t1 t1Var = this.K1;
            t1Var.f41251a = c10;
            t0(t1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f41773j1 = duration;
            duration.setInterpolator(rr.f28022f);
            this.f41773j1.addUpdateListener(new x4(this, viewGroup, viewGroup2, 4));
            this.f41773j1.addListener(new x5(this, viewGroup, viewGroup2, i10, 2));
            this.f41773j1.start();
        }
    }

    @Override
    public final void D() {
        A0(true);
    }

    public final void D0() {
        int i10 = 0;
        while (true) {
            h0 h0Var = this.Z0;
            if (i10 < h0Var.getChildCount()) {
                View childAt = h0Var.getChildAt(i10);
                if (childAt != this.S0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f41676l0 && jVar.f41674j0 <= 0.0f) {
                        }
                    }
                    i10++;
                }
                ((j) childAt).m();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f41770h2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f41777l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f41777l2).commit();
            } else {
                this.f41776k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f41776k2).commit();
            }
        }
        if (this.f41768g2) {
            if (z10) {
                i11 = this.f41777l2;
            } else {
                i11 = this.f41776k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41766f2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f41766f2.setLayoutParams(layoutParams);
                this.f41774j2 = layoutParams.height;
                requestLayout();
                i4 i4Var = ((st0) this).f37846o2.K1;
                if (i4Var != null) {
                    i4Var.a();
                }
                getHeight();
            }
        }
        if (this.f41779m2 == i10 && this.f41781n2 == z10) {
            getHeight();
            return;
        }
        this.f41779m2 = i10;
        this.f41781n2 = z10;
        boolean z13 = this.f41770h2;
        j jVar = this.S0;
        if (jVar instanceof v2) {
            if (((v2) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f41770h2 = z12;
        } else {
            this.f41770h2 = false;
        }
        if (this.f41770h2 && this.f41768g2) {
            y0(0);
        }
        if (this.f41774j2 != 0 && !(z11 = this.f41770h2) && z11 != z13 && !this.f41768g2) {
            this.f41774j2 = 0;
            requestLayout();
            i4 i4Var2 = ((st0) this).f37846o2.K1;
            if (i4Var2 != null) {
                i4Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        x0(true);
    }

    @Override
    public final void b(pg.m mVar) {
        boolean z10 = mVar instanceof pg.b;
        x1 x1Var = this.l1;
        if (!z10 && !(mVar instanceof pg.d)) {
            x1Var.b(0.05f, 1.0f);
        } else {
            x1Var.b(0.4f, 1.75f);
        }
        x1Var.setDrawCenter(!(mVar instanceof pg.l));
        d0 d0Var = this.W0;
        if (d0Var.getCurrentBrush() instanceof pg.l) {
            this.f41775k1 = true;
        }
        d0Var.setBrush(mVar);
        pg.t1 t1Var = this.K1;
        int i10 = t1Var.f41251a;
        t1Var.f41251a = pg.u0.e(this.P1).c();
        t1Var.f41253c = this.f41778m1.get();
        t0(t1Var, Integer.valueOf(i10));
        this.X0.invalidate();
    }

    @Override
    public final boolean d(j jVar) {
        return s0(jVar, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h0 h0Var;
        v2 v2Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (h0Var = this.Z0) != null) {
            for (int i12 = 0; i12 < h0Var.getChildCount(); i12++) {
                View childAt = h0Var.getChildAt(i12);
                if ((childAt instanceof v2) && (str = (v2Var = (v2) childAt).A0) != null) {
                    v2Var.setTypeface(str);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r15, android.view.View r16, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: qg.n0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e() {
        this.O1.setColor(-15132391);
    }

    @Override
    public final void f() {
        setTextType((this.U0 + 1) % 4);
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new org.telegram.ui.web.f1(11, this, (y1) view)).start();
    }

    @Override
    public final void g(int i10) {
        j jVar = this.S0;
        if (jVar instanceof v2) {
            v0((v2) jVar, i10);
            pg.u0 e = pg.u0.e(this.P1);
            e.f41264g = i10;
            e.f41260a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        uv0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f28926a / 2.0f;
        float f10 = paintingSize.f28927b / 2.0f;
        if (this.H0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float e = (float) hg.c.e(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f7 -= cos * paintingSize.f28926a;
            f10 -= e * paintingSize.f28927b;
        }
        return new PointF(f7, f10);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.A0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.B0;
    }

    public long getLcm() {
        return this.f41783p1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        z5[] z5VarArr;
        h0 h0Var = this.Z0;
        int childCount = h0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = h0Var.getChildAt(i10);
            if (childAt instanceof o2) {
                TLRPC.Document sticker = ((o2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f18333id = sticker.f18327id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof v2) {
                CharSequence text = ((v2) childAt).getText();
                if ((text instanceof Spanned) && (z5VarArr = (z5[]) ((Spanned) text).getSpans(0, text.length(), z5.class)) != null) {
                    for (z5 z5Var : z5VarArr) {
                        if (z5Var != null) {
                            TLRPC.Document document = z5Var.document;
                            if (document == null) {
                                document = q5.f(this.P1, z5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f18333id = document.f18327id;
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
        return this.C0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public pg.f1 getRenderView() {
        return this.W0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.S0;
        h0 h0Var = this.Z0;
        if (jVar == null) {
            return getY() + h0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (h0Var.getScaleY() * this.S0.getHeight()) + iArr[1];
    }

    public k11 getThanosEffect() {
        if (!k11.c()) {
            return null;
        }
        if (this.f41756a1 == null) {
            k11 k11Var = new k11(getContext(), new n(this, 0));
            this.f41756a1 = k11Var;
            addView(k11Var);
        }
        return this.f41756a1;
    }

    public final y1 h0(String str, boolean z10) {
        float f7;
        uv0 uv0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        h0 h0Var = this.Z0;
        if (f7 > 1.0f) {
            float floor = (float) Math.floor(h0Var.getMeasuredWidth() * 0.5d);
            uv0Var = new uv0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(h0Var.getMeasuredHeight() * 0.5d);
            uv0Var = new uv0(f7 * floor2, floor2);
        }
        uv0 uv0Var2 = uv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = uv0Var2.f28926a;
            uv0Var2.f28926a = uv0Var2.f28927b;
            uv0Var2.f28927b = f10;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        y1 y1Var = new y1(context, g02, uv0Var2, str, intValue);
        y1Var.setDelegate(this);
        h0Var.addView(y1Var);
        if (z10) {
            q0(y1Var);
            s0(y1Var, true);
        }
        return y1Var;
    }

    public final qg.a0 i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: qg.n0.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):qg.a0");
    }

    public final v2 j0(boolean z10) {
        ((st0) this).f37846o2.f31226g0.isFocusable();
        uv0 paintingSize = getPaintingSize();
        PointF B0 = B0(null);
        v2 v2Var = new v2(getContext(), B0, (int) (paintingSize.f28926a / 9.0f), "", this.K1, this.U0);
        float f7 = paintingSize.f28926a / 9.0f;
        n nVar = new n(this, 2);
        v2Var.f41955w0 = (int) (0.5f * f7);
        v2Var.f41956x0 = (int) (f7 * 2.0f);
        v2Var.f41957y0 = nVar;
        float f10 = B0.x;
        h0 h0Var = this.Z0;
        if (f10 == h0Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (B0.y == h0Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth((int) (paintingSize.f28926a - 20.0f));
        int i10 = this.P1;
        v2Var.setTypeface(pg.u0.e(i10).f41266j);
        v2Var.setType(pg.u0.e(i10).h);
        h0Var.addView(v2Var, y5.c(-2.0f, -2));
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            q0(v2Var);
            v2Var.q();
            s0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.T0 = true;
            int i11 = pg.u0.e(i10).f41264g;
            p1 p1Var = this.f41788u1;
            p1Var.d(i11, true);
            p1Var.setOutlineType(pg.u0.e(i10).h);
        }
        return v2Var;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.f41762d2;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        ViewParent parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.f41764e2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f7 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f7;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) hg.c.e(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final int l0(boolean z10) {
        return this.f41774j2;
    }

    public final boolean m(MotionEvent motionEvent) {
        if (this.S0 != null) {
            s0(null, true);
        }
        float x10 = motionEvent.getX();
        d0 d0Var = this.W0;
        float translationX = ((x10 - d0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / d0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - d0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / d0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-d0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (d0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (d0Var.getMeasuredHeight() / 2.0f) + ((float) hg.c.e(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        d0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void m0(boolean z10) {
        if (this.f41768g2) {
            y0(0);
        }
        if (z10) {
            lz lzVar = this.f41766f2;
            if (lzVar != null && lzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f41766f2.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.f41772i2 = true;
                ofFloat.addListener(new b0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f19654w);
                ofFloat.start();
                return;
            }
            n0();
        }
    }

    public final void n0() {
        lz lzVar;
        i4 i4Var;
        if (this.f41774j2 > 0 && (i4Var = ((st0) this).f37846o2.K1) != null) {
            i4Var.a();
        }
        if (!this.f41768g2 && (lzVar = this.f41766f2) != null && lzVar.getVisibility() != 8) {
            this.f41766f2.setVisibility(8);
        }
        this.f41774j2 = 0;
    }

    public final void o0(boolean z10) {
        int i10;
        int i11;
        if (this.f41767g1 == 0) {
            int i12 = 0;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.l1.setLayerType(i10, null);
            if (z10) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f41759c1.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.f41757b1.setLayerType(i12, null);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int R;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        if (this.f41766f2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i15 - this.f41766f2.getMeasuredHeight();
            } else {
                R = (R() + i15) - this.f41766f2.getMeasuredHeight();
            }
            lz lzVar = this.f41766f2;
            lzVar.layout(0, R, lzVar.getMeasuredWidth(), this.f41766f2.getMeasuredHeight() + R);
        }
        if (!this.V0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        d0 d0Var = this.W0;
        int ceil = (int) Math.ceil((i14 - d0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.f0.C(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - d0Var.getMeasuredHeight()) / 2, i16);
        d0Var.layout(ceil, additionalTop, d0Var.getMeasuredWidth() + ceil, d0Var.getMeasuredHeight() + additionalTop);
        f0 f0Var = this.X0;
        f0Var.layout(ceil, additionalTop, f0Var.getMeasuredWidth() + ceil, f0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = d0Var.getMeasuredWidth();
        h0 h0Var = this.Z0;
        int measuredWidth2 = ((measuredWidth - h0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((d0Var.getMeasuredHeight() - h0Var.getMeasuredHeight()) / 2) + additionalTop;
        h0Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        k11 k11Var = this.f41756a1;
        if (k11Var != null) {
            k11Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        }
        i0 i0Var = this.Y0;
        i0Var.layout(ceil, additionalTop, i0Var.getMeasuredWidth() + ceil, i0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.P0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.D0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f7 = size;
        }
        float f10 = size;
        float floor = (float) Math.floor((f10 * currentActionBarHeight) / f7);
        float f11 = currentActionBarHeight2;
        if (floor > f11) {
            f10 = (float) Math.floor((f7 * f11) / currentActionBarHeight);
            floor = f11;
        }
        int i12 = (int) f10;
        int i13 = (int) floor;
        this.W0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        this.X0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        float f12 = f10 / this.R0.f28926a;
        this.Q0 = f12;
        h0 h0Var = this.Z0;
        h0Var.setScaleX(f12);
        h0Var.setScaleY(this.Q0);
        h0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f28926a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f28927b, 1073741824));
        k11 k11Var = this.f41756a1;
        if (k11Var != null) {
            k11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f28926a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f28927b, 1073741824));
            this.f41756a1.setScaleX(this.Q0);
            this.f41756a1.setScaleY(this.Q0);
        }
        D0();
        this.Y0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.f41759c1, i10, i11);
        measureChild(this.l1, i10, i11);
        measureChild(this.f41763e1, i10, i11);
        measureChild(this.f41761d1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f41774j2), 1073741824));
        FrameLayout frameLayout = this.f41757b1;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.P0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f41768g2 && !this.f41772i2) {
            this.P0 = true;
            n0();
            this.P0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            n0();
        }
        lz lzVar = this.f41766f2;
        if (lzVar != null) {
            measureChild(lzVar, i10, i11);
        }
    }

    public final boolean p0() {
        if (this.L1) {
            x0(false);
            return true;
        } else if (this.f41768g2) {
            m0(true);
            return true;
        } else if (!this.T0) {
            return false;
        } else {
            s0(null, true);
            return true;
        }
    }

    @Override
    public final boolean q() {
        return true;
    }

    public final void q0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.F0.b(jVar.getUUID(), new t(this, jVar, 0));
    }

    @Override
    public final boolean r() {
        return !this.T0;
    }

    public final void r0(j jVar) {
        j jVar2 = this.S0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.S0 = null;
            if (jVar instanceof v2) {
                ValueAnimator valueAnimator = this.f41773j1;
                if (valueAnimator != null && this.f41769h1 != 0) {
                    valueAnimator.cancel();
                }
                C0(0);
            }
        }
        this.Z0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            pg.w1 w1Var = this.F0;
            w1Var.f41288b.remove(uuid);
            w1Var.f41289c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(w1Var, 13));
        }
        x1 x1Var = this.l1;
        ka.c cVar = this.f41778m1;
        x1Var.setValueOverride(cVar);
        x1Var.setShowPreview(true);
        float f7 = cVar.get();
        pg.t1 t1Var = this.K1;
        t1Var.f41253c = f7;
        t0(t1Var, null);
    }

    @Override
    public final void requestLayout() {
        if (this.P0) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s0(j jVar, boolean z10) {
        n0 n0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof v2;
        int i11 = 2;
        if (z12 && (((i10 = this.f41769h1) == -1 && this.f41767g1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f41773j1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.L1) {
                x0(false);
            }
            C0(2);
        }
        if (z12 && z10) {
            v2 v2Var = (v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            p1 p1Var = this.f41788u1;
            p1Var.setAlignment(i11);
            p1Var.setTypeface(v2Var.getTypeface().f41143a);
            p1Var.e(v2Var.getType(), true);
            this.f41761d1.invalidate();
        }
        j jVar2 = this.S0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.T0) {
                    int[] k02 = k0(jVar2);
                    z0(new t(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof v2) {
                    AndroidUtilities.showKeyboard(((v2) jVar2).getFocusedView());
                    m0(false);
                }
                return true;
            }
            n0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = n0Var.S0;
            if (jVar3 instanceof v2) {
                v2 v2Var2 = (v2) jVar3;
                u2 u2Var = v2Var2.f41949q0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    n0Var.T0 = false;
                    AndroidUtilities.hideKeyboard(((v2) n0Var.S0).getFocusedView());
                    m0(false);
                }
            }
            z11 = true;
        } else {
            n0Var = this;
            z11 = false;
        }
        j jVar4 = n0Var.S0;
        n0Var.S0 = jVar;
        if ((jVar4 instanceof v2) && TextUtils.isEmpty(((v2) jVar4).getText())) {
            r0(jVar4);
        }
        j jVar5 = n0Var.S0;
        ka.c cVar = n0Var.f41778m1;
        pg.t1 t1Var = n0Var.K1;
        x1 x1Var = n0Var.l1;
        if (jVar5 != null) {
            i0 i0Var = n0Var.Y0;
            jVar5.m0 = i0Var;
            jVar5.l(i0Var, true);
            n0Var.Z0.bringChildToFront(n0Var.S0);
            j jVar6 = n0Var.S0;
            if (jVar6 instanceof v2) {
                v2 v2Var3 = (v2) jVar6;
                v2Var3.f41958z0 = false;
                v2Var3.getSwatch().f41253c = t1Var.f41253c;
                t0(v2Var3.getSwatch(), null);
                x1Var.setValueOverride(new t5(v2Var3, (int) (n0Var.R0.f28926a / 9.0f), 1));
                x1Var.setShowPreview(false);
                return true;
            }
            x1Var.setValueOverride(cVar);
            x1Var.setShowPreview(true);
            t1Var.f41253c = cVar.get();
            t0(t1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = n0Var.f41773j1;
        if (valueAnimator2 != null && n0Var.f41769h1 != 0) {
            valueAnimator2.cancel();
        }
        if (n0Var.L1) {
            x0(false);
        }
        C0(0);
        x1Var.setValueOverride(cVar);
        x1Var.setShowPreview(true);
        t1Var.f41253c = cVar.get();
        t0(t1Var, null);
        return z11;
    }

    public void setBlurredBackgroundDrawableForTools(ch.d dVar) {
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f41760c2 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.W1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.f41767g1 == 0) {
            this.l1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.U1 = runnable;
    }

    @Override
    public final void t() {
        i4 i4Var;
        if (!this.f41770h2 && !this.f41768g2) {
            j0(true);
            return;
        }
        boolean z10 = this.f41768g2;
        if (z10 && (i4Var = ((st0) this).f37846o2.K1) != null) {
            i4Var.e = true;
        }
        y0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.S0;
            if (jVar instanceof v2) {
                AndroidUtilities.showKeyboard(((v2) jVar).getEditText());
            }
        }
    }

    public final void t0(pg.t1 t1Var, Integer num) {
        pg.t1 t1Var2 = this.K1;
        if (t1Var2 != t1Var) {
            t1Var2.f41251a = t1Var.f41251a;
            t1Var2.f41252b = t1Var.f41252b;
            t1Var2.f41253c = t1Var.f41253c;
            int i10 = this.P1;
            pg.u0.e(i10).h(t1Var.f41251a, true);
            pg.u0.e(i10).j(t1Var.f41253c);
        }
        int i11 = t1Var.f41251a;
        d0 d0Var = this.W0;
        d0Var.setColor(i11);
        d0Var.setBrushSize(t1Var.f41253c);
        int i12 = t1Var2.f41251a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new w4(this, num, i12, 2));
            duration.start();
        } else {
            l0 l0Var = this.f41759c1;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        }
        j jVar = this.S0;
        if (jVar instanceof v2) {
            ((v2) jVar).setSwatch(new pg.t1(t1Var.f41252b, t1Var.f41253c, t1Var.f41251a));
        }
    }

    @Override
    public final void u(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) hg.c.e(radians, d10, Math.sin(radians) * d));
    }

    public final void u0(float f7) {
        this.C0 = f7;
        this.f41757b1.setTranslationY(-f7);
        this.f41759c1.setTranslationY(f7);
    }

    @Override
    public final pg.u0 v() {
        return pg.u0.e(this.P1);
    }

    public final void w0(float f7, float f10, float f11, float f12, float f13) {
        View view;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        this.I0 = f7;
        this.N0 = f12;
        this.O0 = f13;
        this.J0 = f10;
        this.K0 = f11;
        this.L0 = f10;
        float f20 = f11 + 0.0f;
        this.M0 = f20;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                view = this.Z0;
            } else if (i10 == 1) {
                view = this.Y0;
            } else if (i10 == 2) {
                view = this.W0;
            } else {
                view = this.X0;
            }
            MediaController.CropState cropState = this.H0;
            if (cropState != null) {
                float f21 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i11 = cropState.transformRotation;
                    if (i11 == 90 || i11 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f12 / ((int) (cropState.cropPw * f18)), f13 / ((int) (cropState.cropPh * f19)));
                    f14 = f21 * max;
                    float C = com.google.android.gms.internal.vision.e2.C(cropState.cropPx, measuredWidth, f7, max);
                    float f22 = cropState.cropScale;
                    f15 = (C * f22) + f10;
                    f16 = (cropState.cropPy * measuredHeight * f7 * max * f22) + f20;
                    f17 = cropState.cropRotate + i11;
                } else {
                    return;
                }
            } else {
                if (i10 == 0) {
                    f14 = this.Q0 * 1.0f;
                } else {
                    f14 = 1.0f;
                }
                f15 = f10;
                f16 = f20;
                f17 = 0.0f;
            }
            float f23 = ((-this.f41774j2) / 2.0f) + f16;
            float f24 = f7 * f14;
            if (Float.isNaN(f24)) {
                f24 = 1.0f;
            }
            view.setScaleX(f24);
            view.setScaleY(f24);
            view.setTranslationX(f15);
            view.setTranslationY(f23);
            view.setRotation(f17);
            view.invalidate();
        }
        D0();
        invalidate();
    }

    public final void x0(final boolean z10) {
        float f7;
        boolean z11;
        if (this.L1 != z10) {
            this.L1 = z10;
            o1.k kVar = this.M1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new o1.j(f7));
            this.M1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f15524i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f15518u = lVar;
            if (!this.f41770h2 && !this.f41768g2) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.f41759c1.getTranslationY();
            final ViewGroup barView = getBarView();
            this.M1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    int i10;
                    n0 n0Var = n0.this;
                    l0 l0Var = n0Var.f41759c1;
                    float f13 = f11 / 1000.0f;
                    n0Var.N1 = f13;
                    float f14 = ((1.0f - f13) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f14);
                    view.setScaleY(f14);
                    view.setTranslationY((Math.min(n0Var.N1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(n0Var.N1, 0.25f) / 0.25f));
                    k0 k0Var = n0Var.G1;
                    float f15 = n0Var.N1;
                    boolean z12 = z10;
                    k0Var.y1(f15, z12);
                    n0Var.B0.setProgress(n0Var.N1);
                    n0Var.A0.setProgress(n0Var.N1);
                    n0Var.f41765f1.setTranslationY(AndroidUtilities.dp(32.0f) * n0Var.N1);
                    if (zArr[0]) {
                        float f16 = n0Var.N1;
                        if (!z12) {
                            f16 = 1.0f - f16;
                        }
                        float dp = AndroidUtilities.dp(40.0f) * f16;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        l0Var.setTranslationY(translationY - (dp * i10));
                    }
                    l0Var.invalidate();
                    if (view == n0Var.f41788u1) {
                        n0Var.f41761d1.invalidate();
                    }
                }
            });
            this.M1.a(new r(this, z10, 1));
            this.M1.f();
            if (z10) {
                k0 k0Var = this.G1;
                k0Var.setVisibility(0);
                k0Var.setSelectedColorIndex(pg.u0.e(this.P1).d());
            }
        }
    }

    @Override
    public final void y() {
        z0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void y0(int i10) {
        boolean z10;
        int i11;
        p1 p1Var = this.f41788u1;
        if (i10 == 1) {
            lz lzVar = this.f41766f2;
            if (lzVar != null && lzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lz lzVar2 = this.f41766f2;
            if (lzVar2 != null && lzVar2.f26229c1 != UserConfig.selectedAccount) {
                removeView(lzVar2);
                this.f41766f2 = null;
            }
            if (this.f41766f2 == null) {
                lz lzVar3 = new lz(null, true, false, false, getContext(), false, null, null, true, this.Q1, false, false);
                this.f41766f2 = lzVar3;
                lzVar3.U0 = true;
                lzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f41766f2.setForseMultiwindowLayout(true);
                }
                this.f41766f2.setDelegate(new c0(this));
                addView(this.f41766f2);
            }
            this.f41766f2.setVisibility(0);
            this.f41768g2 = true;
            lz lzVar4 = this.f41766f2;
            if (this.f41776k2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f41776k2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f41776k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f41777l2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f41777l2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f41777l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f41777l2;
            } else {
                i11 = this.f41776k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lzVar4.getLayoutParams();
            layoutParams.height = i11;
            lzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.S0;
                if (jVar instanceof v2) {
                    AndroidUtilities.hideKeyboard(((v2) jVar).getEditText());
                }
            }
            this.f41774j2 = i11;
            requestLayout();
            i4 i4Var = ((st0) this).f37846o2.K1;
            if (i4Var != null) {
                i4Var.a();
            }
            bh emojiButton = p1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(zg.d, true);
            }
            getHeight();
            if (!z10 && !this.f41770h2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41774j2, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new b0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        bh emojiButton2 = p1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(zg.e, true);
        }
        lz lzVar5 = this.f41766f2;
        if (lzVar5 != null) {
            this.f41768g2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                lzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f41774j2 = 0;
        }
        i4 i4Var2 = ((st0) this).f37846o2.K1;
        if (i4Var2 != null) {
            i4Var2.a();
        }
        requestLayout();
        getHeight();
    }

    @Override
    public final void z(j jVar) {
        int[] k02 = k0(jVar);
        z0(new t(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    public final void z0(Runnable runnable, n0 n0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.m1 m1Var = this.R1;
        if (m1Var != null && m1Var.isShowing()) {
            this.R1.d(true);
            return;
        }
        if (this.S1 == null) {
            this.T1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.Q1);
            this.S1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.S1.setBackgroundColor(-14145495);
            this.S1.setOnTouchListener(new g5(this, 1));
            this.S1.setDispatchKeyEventListener(new q(this));
            this.S1.setShownFromBottom(true);
        }
        this.S1.d();
        runnable.run();
        if (this.R1 == null) {
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(this.S1, -2, -2);
            this.R1 = m1Var2;
            m1Var2.f19620b = true;
            m1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.R1.setOutsideTouchable(true);
            this.R1.setClippingEnabled(true);
            this.R1.setInputMethodMode(2);
            this.R1.setSoftInputMode(0);
            this.R1.getContentView().setFocusableInTouchMode(true);
            this.R1.setOnDismissListener(new i5(this, 1));
        }
        this.S1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.R1.setFocusable(true);
        this.R1.showAtLocation(n0Var, i10, i11 - (this.S1.getMeasuredWidth() / 2), i12 - this.S1.getMeasuredHeight());
        org.telegram.ui.ActionBar.m1.i(this.S1);
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void B() {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h(boolean z10) {
    }

    @Override
    public final void i(boolean z10) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void n(boolean z10) {
    }

    @Override
    public final void w() {
    }
}
