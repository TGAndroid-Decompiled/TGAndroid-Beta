package yf;

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
import g7.e6;
import ih.i3;
import ih.x7;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kh.a5;
import kh.b4;
import kh.n5;
import kh.o5;
import kh.p4;
import kh.v4;
import kh.y4;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.gq0;
import org.telegram.ui.xs0;
public abstract class l0 extends yu0 implements q1, h, m1, wu0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public boolean A1;
    public final xf.t1 B0;
    public o1.j B1;
    public final DispatchQueue C0;
    public final i0 C1;
    public final MediaController.CropState D0;
    public final Paint D1;
    public float E0;
    public final Paint E1;
    public float F0;
    public final Paint F1;
    public float G0;
    public final xf.q1 G1;
    public float H0;
    public boolean H1;
    public float I0;
    public o1.j I1;
    public float J0;
    public float J1;
    public float K0;
    public final Paint K1;
    public boolean L0;
    public final int L1;
    public float M0;
    public final mg.a M1;
    public qu0 N0;
    public org.telegram.ui.ActionBar.o1 N1;
    public j O0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O1;
    public boolean P0;
    public Rect P1;
    public int Q0;
    public Runnable Q1;
    public final boolean R0;
    public final xf.s0 R1;
    public final b0 S0;
    public boolean S1;
    public final d0 T0;
    public float T1;
    public final g0 U0;
    public boolean U1;
    public final f0 V0;
    public final y5 V1;
    public d01 W0;
    public final Paint W1;
    public final FrameLayout X0;
    public final Paint X1;
    public final j0 Y0;
    public kg.d Y1;
    public final h0 Z0;
    public final float[] Z1;
    public final FrameLayout f49927a1;
    public final int[] a2;
    public n5 f49928b1;
    public wy f49929b2;
    public int f49930c1;
    public boolean f49931c2;
    public int f49932d1;
    public boolean f49933d2;
    public float f49934e1;
    public boolean f49935e2;
    public ValueAnimator f49936f1;
    public int f49937f2;
    public boolean f49938g1;
    public int f49939g2;
    public final w1 f49940h1;
    public int f49941h2;
    public final n5.a0 f49942i1;
    public int f49943i2;
    public ArrayList f49944j1;
    public boolean f49945j2;
    public final int f49946k1;
    public BigInteger l1;
    public TextView f49947m1;
    public TextView f49948n1;
    public TextView f49949o1;
    public final r1 f49950p1;
    public final o1 f49951q1;
    public final t1 f49952r1;
    public final ImageView f49953s1;
    public final LinearLayout f49954t1;
    public final TextView f49955u1;
    public final TextView f49956v1;
    public final f1 f49957w0;
    public final TextView f49958w1;
    public final j1 f49959x0;
    public final Paint f49960x1;
    public float f49961y0;
    public final Paint f49962y1;
    public final Bitmap f49963z0;
    public float f49964z1;

    public l0(Context context, Activity activity, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, MediaController.CropState cropState, gq0 gq0Var, b6 b6Var) {
        super(context, activity);
        boolean z10;
        int i11;
        Emoji.EmojiSpan[] emojiSpanArr;
        x1 x1Var;
        boolean z11 = false;
        this.f49930c1 = 0;
        this.f49932d1 = -1;
        final xs0 xs0Var = (xs0) this;
        this.f49942i1 = new n5.a0(xs0Var, 21);
        byte b10 = 1;
        this.f49960x1 = new Paint(1);
        this.f49962y1 = new Paint(1);
        this.D1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        xf.q1 q1Var = new xf.q1(1.0f, 0.016773745f, -1);
        this.G1 = q1Var;
        this.K1 = new Paint(1);
        this.U1 = false;
        this.V1 = new y5((View) this, 350L, gr.h);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        this.X1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        byte b11 = 2;
        this.Z1 = new float[2];
        this.a2 = new int[2];
        new ju0(xs0Var, 10);
        setDelegate(this);
        this.L1 = i9;
        this.M1 = new mg.a(3, b6Var);
        this.D0 = cropState;
        this.R0 = context instanceof BubbleActivity;
        xf.s0 e10 = xf.s0.e(i9);
        this.R1 = e10;
        e10.i(0, true);
        q1Var.f49333a = e10.c();
        q1Var.f49335c = e10.f49364i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.C0 = dispatchQueue;
        this.f49963z0 = bitmap;
        this.A0 = bitmap2;
        this.f49946k1 = i10;
        xf.t1 t1Var = new xf.t1();
        this.B0 = t1Var;
        t1Var.f49381a = new t0.c(xs0Var, 8);
        b0 b0Var = new b0(xs0Var, context, new xf.q0(getPaintingSize(), bitmap2, i10, null), bitmap, bitmap2);
        this.S0 = b0Var;
        b0Var.setDelegate(new c0(xs0Var, gq0Var));
        b0Var.setUndoStore(t1Var);
        b0Var.setQueue(dispatchQueue);
        b0Var.setVisibility(4);
        addView(b0Var, e6.e(-1, -1, 51));
        d0 d0Var = new d0(xs0Var, context);
        this.T0 = d0Var;
        d0Var.setVisibility(4);
        addView(d0Var, e6.e(-1, -1, 51));
        f0 f0Var = new f0(xs0Var, context, new e0(xs0Var));
        this.V0 = f0Var;
        addView(f0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i12);
                byte b12 = mediaEntity.type;
                if (b12 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & b11) != 0) {
                        i02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i11 = size;
                    x1Var = i02;
                } else if (b12 == b10) {
                    ?? j02 = j0(z11);
                    j02.setType(mediaEntity.subType);
                    j02.setTypeface(mediaEntity.textTypeface);
                    j02.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i13);
                        int i14 = i13 + 1;
                        VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                        t5 t5Var = new t5(emojiEntity2.document_id, j02.getFontMetricsInt());
                        int i15 = emojiEntity2.offset;
                        spannableString.setSpan(t5Var, i15, emojiEntity2.length + i15, 33);
                        size = size;
                        size2 = size2;
                        i13 = i14;
                    }
                    i11 = size;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    j02.setText(replaceEmoji);
                    u0(j02, mediaEntity.textAlign);
                    xf.q1 swatch = j02.getSwatch();
                    swatch.f49333a = mediaEntity.color;
                    j02.setSwatch(swatch);
                    x1Var = j02;
                } else {
                    i11 = size;
                    if (b12 == 2) {
                        x1 h02 = h0(mediaEntity.text, false);
                        h02.f50178x0 = false;
                        if ((mediaEntity.subType & 2) != 0) {
                            h02.r(false);
                        }
                        if ((mediaEntity.subType & 16) != 0) {
                            h02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                        layoutParams2.width = mediaEntity.viewWidth;
                        layoutParams2.height = mediaEntity.viewHeight;
                        x1Var = h02;
                    } else {
                        i12++;
                        size = i11;
                        z11 = false;
                        b11 = 2;
                        b10 = 1;
                    }
                }
                x1Var.setX((mediaEntity.f19673x * this.N0.f32026a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                x1Var.setY((mediaEntity.f19674y * this.N0.f32027b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                x1Var.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + x1Var.getX(), (mediaEntity.viewHeight / 2.0f) + x1Var.getY()));
                x1Var.setScale(mediaEntity.scale);
                x1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i12++;
                size = i11;
                z11 = false;
                b11 = 2;
                b10 = 1;
            }
        }
        this.V0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.U0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.X0 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, e6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f49953s1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(f6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        xs0 xs0Var2 = xs0Var;
                        b0 b0Var2 = xs0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof xf.l)) {
                            b0Var2.b();
                            xs0Var2.f49950p1.setSelectedIndex(1);
                            xs0Var2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        xs0Var2.B0.c();
                        return;
                    case 1:
                        xs0 xs0Var3 = xs0Var;
                        b0 b0Var3 = xs0Var3.S0;
                        xf.t1 t1Var2 = xs0Var3.B0;
                        if (t1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof xf.l)) {
                                b0Var3.b();
                                xs0Var3.f49950p1.setSelectedIndex(1);
                                xs0Var3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            b0Var3.a();
                            t1Var2.f49383c.clear();
                            t1Var2.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            xs0Var3.V0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xs0 xs0Var4 = xs0Var;
                        j jVar = xs0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (xs0Var4.f49931c2) {
                            xs0Var4.l0(false);
                        }
                        xs0Var4.q0(xs0Var4.O0);
                        xs0Var4.r0(null, true);
                        return;
                    default:
                        xs0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, e6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f49954t1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(f6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ll.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, e6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, e6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new fh.n(27));
        frameLayout2.addView(linearLayout, e6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f49955u1 = textView2;
        textView2.setBackground(f6.f0(822083583, 7, -1));
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
                        xs0 xs0Var2 = xs0Var;
                        b0 b0Var2 = xs0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof xf.l)) {
                            b0Var2.b();
                            xs0Var2.f49950p1.setSelectedIndex(1);
                            xs0Var2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        xs0Var2.B0.c();
                        return;
                    case 1:
                        xs0 xs0Var3 = xs0Var;
                        b0 b0Var3 = xs0Var3.S0;
                        xf.t1 t1Var2 = xs0Var3.B0;
                        if (t1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof xf.l)) {
                                b0Var3.b();
                                xs0Var3.f49950p1.setSelectedIndex(1);
                                xs0Var3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            b0Var3.a();
                            t1Var2.f49383c.clear();
                            t1Var2.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            xs0Var3.V0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xs0 xs0Var4 = xs0Var;
                        j jVar = xs0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (xs0Var4.f49931c2) {
                            xs0Var4.l0(false);
                        }
                        xs0Var4.q0(xs0Var4.O0);
                        xs0Var4.r0(null, true);
                        return;
                    default:
                        xs0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout2, textView2, e6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f49956v1 = g10;
        g10.setBackground(f6.f0(822083583, 7, -1));
        g10.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.Clear, g10), 0, AndroidUtilities.dp(8.0f), 0);
        g10.setGravity(16);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextSize(1, 16.0f);
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        xs0 xs0Var2 = xs0Var;
                        b0 b0Var2 = xs0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof xf.l)) {
                            b0Var2.b();
                            xs0Var2.f49950p1.setSelectedIndex(1);
                            xs0Var2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        xs0Var2.B0.c();
                        return;
                    case 1:
                        xs0 xs0Var3 = xs0Var;
                        b0 b0Var3 = xs0Var3.S0;
                        xf.t1 t1Var2 = xs0Var3.B0;
                        if (t1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof xf.l)) {
                                b0Var3.b();
                                xs0Var3.f49950p1.setSelectedIndex(1);
                                xs0Var3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            b0Var3.a();
                            t1Var2.f49383c.clear();
                            t1Var2.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            xs0Var3.V0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xs0 xs0Var4 = xs0Var;
                        j jVar = xs0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (xs0Var4.f49931c2) {
                            xs0Var4.l0(false);
                        }
                        xs0Var4.q0(xs0Var4.O0);
                        xs0Var4.r0(null, true);
                        return;
                    default:
                        xs0Var.r0(null, true);
                        return;
                }
            }
        });
        g10.setAlpha(0.0f);
        g10.setVisibility(8);
        TextView g11 = org.telegram.ui.Cells.j2.g(frameLayout2, g10, e6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f49958w1 = g11;
        g11.setBackground(f6.f0(822083583, 7, -1));
        g11.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.Done, g11), 0, AndroidUtilities.dp(8.0f), 0);
        g11.setGravity(16);
        g11.setTextColor(-1);
        g11.setTypeface(AndroidUtilities.bold());
        g11.setTextSize(1, 16.0f);
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        xs0 xs0Var2 = xs0Var;
                        b0 b0Var2 = xs0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof xf.l)) {
                            b0Var2.b();
                            xs0Var2.f49950p1.setSelectedIndex(1);
                            xs0Var2.n((xf.m) xf.m.f49272a.get(0));
                            return;
                        }
                        xs0Var2.B0.c();
                        return;
                    case 1:
                        xs0 xs0Var3 = xs0Var;
                        b0 b0Var3 = xs0Var3.S0;
                        xf.t1 t1Var2 = xs0Var3.B0;
                        if (t1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof xf.l)) {
                                b0Var3.b();
                                xs0Var3.f49950p1.setSelectedIndex(1);
                                xs0Var3.n((xf.m) xf.m.f49272a.get(0));
                            }
                            b0Var3.a();
                            t1Var2.f49383c.clear();
                            t1Var2.f49382b.clear();
                            AndroidUtilities.runOnUIThread(new pf.o1(t1Var2, 14));
                            xs0Var3.V0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        xs0 xs0Var4 = xs0Var;
                        j jVar = xs0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (xs0Var4.f49931c2) {
                            xs0Var4.l0(false);
                        }
                        xs0Var4.q0(xs0Var4.O0);
                        xs0Var4.r0(null, true);
                        return;
                    default:
                        xs0Var.r0(null, true);
                        return;
                }
            }
        });
        g11.setAlpha(0.0f);
        g11.setVisibility(8);
        frameLayout2.addView(g11, e6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        j0 j0Var = new j0(xs0Var, context);
        this.Y0 = j0Var;
        j0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        j0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(j0Var, e6.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1 r1Var = new r1(context, z10);
        this.f49950p1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        j0Var.addView(r1Var, e6.c(48.0f, -1));
        o1 o1Var = new o1(context);
        this.f49951q1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        o1Var.setAlignment(xf.s0.e(i9).f49363g);
        j0Var.addView(o1Var, e6.c(48.0f, -1));
        h0 h0Var = new h0(xs0Var, context);
        this.Z0 = h0Var;
        addView(h0Var, e6.c(-1.0f, -1));
        t1 t1Var2 = new t1(context);
        this.f49952r1 = t1Var2;
        t1Var2.setVisibility(8);
        t1Var2.setOnItemClickListener(new eh.j(xs0Var, 21));
        o1Var.setTypefaceListView(t1Var2);
        h0Var.addView(t1Var2, e6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f49960x1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f49960x1.setColor(1728053247);
        this.f49960x1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.f49962y1.setColor(f6.v0(f6.G8, this.M1));
        i0 i0Var = new i0(xs0Var, context);
        this.C1 = i0Var;
        i0Var.setVisibility(8);
        i0Var.setColorPalette(xf.s0.e(i9));
        i0Var.setColorListener(new m(xs0Var, 0));
        j0Var.addView(i0Var, e6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        f1 f1Var = new f1(context);
        this.f49957w0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(f6.f0(1090519039, 1, -1));
        j0Var.addView(f1Var, e6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        j1 j1Var = new j1(context);
        this.f49959x0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(f6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new gd0(xs0Var, context, bitmap2, 8));
        j0Var.addView(j1Var, e6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        w1 w1Var = new w1(context);
        this.f49940h1 = w1Var;
        w1Var.setColorSwatch(this.G1);
        w1Var.setRenderView(this.S0);
        w1Var.setValueOverride(this.f49942i1);
        this.G1.f49335c = this.f49942i1.get();
        w1Var.setOnUpdate(new ve.a(xs0Var, i9, 3));
        addView(w1Var, e6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f49927a1 = frameLayout3;
        addView(frameLayout3, e6.c(-1.0f, -1));
        this.F1.setStyle(style);
        this.F1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.G1, null);
        n((xf.m) xf.m.f49272a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(xs0 xs0Var, Integer num) {
        xs0Var.setNewColor(num.intValue());
        xs0Var.w0(false);
    }

    public static void a0(yf.l0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: yf.l0.a0(yf.l0):void");
    }

    public static void b0(l0 l0Var) {
        n2 n2Var;
        f0 f0Var = l0Var.V0;
        j jVar = l0Var.O0;
        if (jVar != null) {
            PointF A0 = l0Var.A0(jVar);
            j jVar2 = l0Var.O0;
            if (jVar2 instanceof n2) {
                n2 n2Var2 = new n2(l0Var.getContext(), (n2) l0Var.O0, A0);
                n2Var2.setDelegate(l0Var);
                f0Var.addView(n2Var2);
                n2Var = n2Var2;
            } else if (jVar2 instanceof v2) {
                v2 v2Var = new v2(l0Var.getContext(), (v2) l0Var.O0, A0);
                v2Var.setDelegate(l0Var);
                v2Var.setMaxWidth((int) (l0Var.getPaintingSize().f32026a - 20.0f));
                f0Var.addView(v2Var, e6.c(-2.0f, -2));
                n2Var = v2Var;
            } else {
                n2Var = null;
            }
            l0Var.p0(n2Var);
            l0Var.r0(n2Var, true);
        }
        org.telegram.ui.ActionBar.o1 o1Var = l0Var.N1;
        if (o1Var != null && o1Var.isShowing()) {
            l0Var.N1.d(true);
        }
    }

    public static void c0(xs0 xs0Var, Integer num) {
        xf.s0 s0Var = xs0Var.R1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        xs0Var.setNewColor(num.intValue());
        i0 i0Var = xs0Var.C1;
        i0Var.setSelectedColorIndex(s0Var.d());
        i0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f49930c1 == 2) {
            return this.f49951q1;
        }
        return this.f49950p1;
    }

    private int getFrameRotation() {
        int i9 = this.f49946k1;
        if (i9 != 90) {
            if (i9 != 180) {
                if (i9 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private qu0 getPaintingSize() {
        int i9;
        qu0 qu0Var = this.N0;
        if (qu0Var != null) {
            return qu0Var;
        }
        Bitmap bitmap = this.f49963z0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            if (devicePerformanceClass != 2) {
                i9 = 2560;
            } else {
                i9 = 3840;
            }
        } else {
            i9 = 1280;
        }
        qu0 qu0Var2 = new qu0(width, height);
        float f10 = i9;
        qu0Var2.f32026a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        qu0Var2.f32027b = floor;
        if (floor > f10) {
            qu0Var2.f32027b = f10;
            qu0Var2.f32026a = (float) Math.floor((f10 * width) / height);
        }
        this.N0 = qu0Var2;
        return qu0Var2;
    }

    public void setNewColor(int i9) {
        xf.q1 q1Var = this.G1;
        int i10 = q1Var.f49333a;
        q1Var.f49333a = i9;
        s0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new v4(this, i10, i9, 5));
        duration.start();
    }

    private void setTextType(int i9) {
        this.Q0 = i9;
        j jVar = this.O0;
        if (jVar instanceof v2) {
            ((v2) jVar).setType(i9);
        }
        xf.s0 e10 = xf.s0.e(this.L1);
        e10.h = i9;
        e10.f49358a.edit().putInt("text_type", i9).apply();
        this.f49951q1.setOutlineType(i9);
    }

    private void setupTabsLayout(Context context) {
        n5 n5Var = new n5(this, context);
        this.f49928b1 = n5Var;
        n5Var.setClipToPadding(false);
        this.f49928b1.setOrientation(0);
        this.Y0.addView(this.f49928b1, e6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f49947m1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f49947m1;
        int i9 = f6.f23092i6;
        mg.a aVar = this.M1;
        textView2.setBackground(f6.f0(f6.v0(i9, aVar), 7, -1));
        this.f49947m1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f49947m1.setTextColor(-1);
        this.f49947m1.setTextSize(1, 14.0f);
        this.f49947m1.setGravity(1);
        this.f49947m1.setTypeface(AndroidUtilities.bold());
        this.f49947m1.setSingleLine();
        this.f49947m1.setOnClickListener(new k(this, 0));
        this.f49928b1.addView(this.f49947m1, e6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f49948n1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f49948n1.setBackground(f6.f0(f6.v0(i9, aVar), 7, -1));
        this.f49948n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f49948n1.setOnClickListener(new k(this, 1));
        this.f49948n1.setTextColor(-1);
        this.f49948n1.setTextSize(1, 14.0f);
        this.f49948n1.setGravity(1);
        this.f49948n1.setTypeface(AndroidUtilities.bold());
        this.f49948n1.setAlpha(0.6f);
        this.f49948n1.setSingleLine();
        this.f49928b1.addView(this.f49948n1, e6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f49949o1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f49949o1.setBackground(f6.f0(f6.v0(i9, aVar), 7, -1));
        this.f49949o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f49949o1.setTextColor(-1);
        this.f49949o1.setTextSize(1, 14.0f);
        this.f49949o1.setGravity(1);
        this.f49949o1.setTypeface(AndroidUtilities.bold());
        this.f49949o1.setAlpha(0.6f);
        this.f49949o1.setSingleLine();
        this.f49949o1.setOnClickListener(new k(this, 4));
        this.f49928b1.addView(this.f49949o1, e6.l(1.0f, 0, -2));
    }

    public static void u0(v2 v2Var, int i9) {
        int i10;
        v2Var.setAlign(i9);
        int i11 = 2;
        if (i9 != 1) {
            if (i9 != 2) {
                i10 = 19;
            } else {
                i10 = 21;
            }
        } else {
            i10 = 17;
        }
        v2Var.getEditText().setGravity(i10);
        if (i9 != 1) {
            if (i9 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        v2Var.getEditText().setTextAlignment(i11);
    }

    @Override
    public final void A() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        float f10 = 200.0f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f10 = 200.0f / cropState.cropScale;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = 100.0f;
        if (cropState != null) {
            f11 = 100.0f / cropState.cropScale;
        }
        PointF g02 = g0();
        while (true) {
            int i9 = 0;
            boolean z10 = false;
            while (true) {
                f0 f0Var = this.V0;
                if (i9 >= f0Var.getChildCount()) {
                    break;
                }
                View childAt = f0Var.getChildAt(i9);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i9++;
            }
            if (!z10) {
                return g02;
            }
            g02 = new PointF(g02.x + f10, g02.y + f10);
        }
    }

    public final void B0(int i9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.f49930c1 != i9 && this.f49932d1 != i9) {
            ValueAnimator valueAnimator = this.f49936f1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.f49930c1;
            ViewGroup viewGroup3 = this.f49951q1;
            ViewGroup viewGroup4 = this.f49950p1;
            if (i10 == 0) {
                viewGroup = viewGroup4;
            } else if (i10 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f49932d1 = i9;
            if (i9 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i9 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.L1;
            xf.s0 e10 = xf.s0.e(i11);
            if (i9 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f49367l != z10) {
                e10.f49367l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f49358a.getInt("brush", 0), false);
                }
            }
            int c10 = xf.s0.e(i11).c();
            xf.q1 q1Var = this.G1;
            q1Var.f49333a = c10;
            s0(q1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f49936f1 = duration;
            duration.setInterpolator(gr.f28844f);
            this.f49936f1.addUpdateListener(new i3(this, viewGroup, viewGroup2, 4));
            this.f49936f1.addListener(new o5(this, viewGroup, viewGroup2, i9, 2));
            this.f49936f1.start();
        }
    }

    public final void C0() {
        int i9 = 0;
        while (true) {
            f0 f0Var = this.V0;
            if (i9 < f0Var.getChildCount()) {
                View childAt = f0Var.getChildAt(i9);
                if (childAt != this.O0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f49862h0 && jVar.f49860f0 <= 0.0f) {
                        }
                    }
                    i9++;
                }
                ((j) childAt).m();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void D() {
        z0(true);
    }

    @Override
    public final void G(int i9, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i9 > AndroidUtilities.dp(50.0f) && this.f49933d2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f49941h2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f49941h2).commit();
            } else {
                this.f49939g2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f49939g2).commit();
            }
        }
        if (this.f49931c2) {
            if (z10) {
                i10 = this.f49941h2;
            } else {
                i10 = this.f49939g2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49929b2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = AndroidUtilities.displaySize.x;
            if (i11 != i12 || layoutParams.height != i10) {
                layoutParams.width = i12;
                layoutParams.height = i10;
                this.f49929b2.setLayoutParams(layoutParams);
                this.f49937f2 = layoutParams.height;
                requestLayout();
                b4 b4Var = ((xs0) this).f44585k2.G1;
                if (b4Var != null) {
                    b4Var.a();
                }
                getHeight();
            }
        }
        if (this.f49943i2 == i9 && this.f49945j2 == z10) {
            getHeight();
            return;
        }
        this.f49943i2 = i9;
        this.f49945j2 = z10;
        boolean z13 = this.f49933d2;
        j jVar = this.O0;
        if (jVar instanceof v2) {
            if (((v2) jVar).getEditText().isFocused() && i9 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f49933d2 = z12;
        } else {
            this.f49933d2 = false;
        }
        if (this.f49933d2 && this.f49931c2) {
            x0(0);
        }
        if (this.f49937f2 != 0 && !(z11 = this.f49933d2) && z11 != z13 && !this.f49931c2) {
            this.f49937f2 = 0;
            requestLayout();
            b4 b4Var2 = ((xs0) this).f44585k2.G1;
            if (b4Var2 != null) {
                b4Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        w0(true);
    }

    @Override
    public final int[] b(j jVar) {
        return k0(jVar);
    }

    @Override
    public final void d() {
        this.K1.setColor(-15132391);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        f0 f0Var;
        v2 v2Var;
        String str;
        if (i9 == NotificationCenter.customTypefacesLoaded && (f0Var = this.V0) != null) {
            for (int i11 = 0; i11 < f0Var.getChildCount(); i11++) {
                View childAt = f0Var.getChildAt(i11);
                if ((childAt instanceof v2) && (str = (v2Var = (v2) childAt).f50148w0) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: yf.l0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e() {
        setTextType((this.Q0 + 1) % 4);
    }

    @Override
    public final void f(int i9) {
        j jVar = this.O0;
        if (jVar instanceof v2) {
            u0((v2) jVar, i9);
            xf.s0 e10 = xf.s0.e(this.L1);
            e10.f49363g = i9;
            e10.f49358a.edit().putInt("text_alignment", i9).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new xf.o0(4, this, (x1) view)).start();
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        qu0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f32026a / 2.0f;
        float f11 = paintingSize.f32027b / 2.0f;
        if (this.D0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float b10 = (float) j3.r0.b(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f10 -= cos * paintingSize.f32026a;
            f11 -= b10 * paintingSize.f32027b;
        }
        return new PointF(f10, f11);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.f49957w0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f49959x0;
    }

    public long getLcm() {
        return this.l1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        t5[] t5VarArr;
        f0 f0Var = this.V0;
        int childCount = f0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = f0Var.getChildAt(i9);
            if (childAt instanceof n2) {
                TLRPC.Document sticker = ((n2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f22392id = sticker.f22386id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof v2) {
                CharSequence text = ((v2) childAt).getText();
                if ((text instanceof Spanned) && (t5VarArr = (t5[]) ((Spanned) text).getSpans(0, text.length(), t5.class)) != null) {
                    for (t5 t5Var : t5VarArr) {
                        if (t5Var != null) {
                            TLRPC.Document document = t5Var.document;
                            if (document == null) {
                                document = k5.f(this.L1, t5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22392id = document.f22386id;
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
        return this.f49961y0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public xf.c1 getRenderView() {
        return this.S0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.O0;
        f0 f0Var = this.V0;
        if (jVar == null) {
            return getY() + f0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (f0Var.getScaleY() * this.O0.getHeight()) + iArr[1];
    }

    public d01 getThanosEffect() {
        if (!d01.c()) {
            return null;
        }
        if (this.W0 == null) {
            d01 d01Var = new d01(getContext(), new n(this, 0));
            this.W0 = d01Var;
            addView(d01Var);
        }
        return this.W0;
    }

    public final x1 h0(String str, boolean z10) {
        float f10;
        qu0 qu0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            FileLog.e(e10);
            f10 = 1.0f;
        }
        f0 f0Var = this.V0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(f0Var.getMeasuredWidth() * 0.5d);
            qu0Var = new qu0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(f0Var.getMeasuredHeight() * 0.5d);
            qu0Var = new qu0(f10 * floor2, floor2);
        }
        qu0 qu0Var2 = qu0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = qu0Var2.f32026a;
            qu0Var2.f32026a = qu0Var2.f32027b;
            qu0Var2.f32027b = f11;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        x1 x1Var = new x1(context, g02, qu0Var2, str, intValue);
        x1Var.setDelegate(this);
        f0Var.addView(x1Var);
        if (z10) {
            p0(x1Var);
            r0(x1Var, true);
        }
        return x1Var;
    }

    public final yf.y i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: yf.l0.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):yf.y");
    }

    public final v2 j0(boolean z10) {
        ((xs0) this).f44585k2.f35598c0.isFocusable();
        qu0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        v2 v2Var = new v2(getContext(), A0, (int) (paintingSize.f32026a / 9.0f), "", this.G1, this.Q0);
        float f10 = paintingSize.f32026a / 9.0f;
        n nVar = new n(this, 2);
        v2Var.f50144s0 = (int) (0.5f * f10);
        v2Var.f50145t0 = (int) (f10 * 2.0f);
        v2Var.f50146u0 = nVar;
        float f11 = A0.x;
        f0 f0Var = this.V0;
        if (f11 == f0Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (A0.y == f0Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth((int) (paintingSize.f32026a - 20.0f));
        int i9 = this.L1;
        v2Var.setTypeface(xf.s0.e(i9).f49365j);
        v2Var.setType(xf.s0.e(i9).h);
        f0Var.addView(v2Var, e6.c(-2.0f, -2));
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            v2Var.j(1.0f / cropState.cropScale);
            v2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(v2Var);
            v2Var.q();
            r0(v2Var, false);
            v2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(v2Var.getFocusedView());
            this.P0 = true;
            int i10 = xf.s0.e(i9).f49363g;
            o1 o1Var = this.f49951q1;
            o1Var.d(i10, true);
            o1Var.setOutlineType(xf.s0.e(i9).h);
        }
        return v2Var;
    }

    @Override
    public final boolean k(j jVar) {
        return r0(jVar, true);
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.Z1;
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
        int[] iArr = this.a2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f10 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d9 = f10;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d9)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) j3.r0.b(radians, d9, Math.sin(radians) * d));
        return iArr;
    }

    public final void l0(boolean z10) {
        if (this.f49931c2) {
            x0(0);
        }
        if (z10) {
            wy wyVar = this.f49929b2;
            if (wyVar != null && wyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f49929b2.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.f49935e2 = true;
                ofFloat.addListener(new z(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                ofFloat.start();
                return;
            }
            m0();
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        if (this.O0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        b0 b0Var = this.S0;
        float translationX = ((x10 - b0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - b0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / b0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b0Var.getRotation());
        double d9 = y10;
        float measuredWidth = (b0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d9)));
        float measuredHeight = (b0Var.getMeasuredHeight() / 2.0f) + ((float) j3.r0.b(radians, d9, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        b0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void m0() {
        wy wyVar;
        b4 b4Var;
        if (this.f49937f2 > 0 && (b4Var = ((xs0) this).f44585k2.G1) != null) {
            b4Var.a();
        }
        if (!this.f49931c2 && (wyVar = this.f49929b2) != null && wyVar.getVisibility() != 8) {
            this.f49929b2.setVisibility(8);
        }
        this.f49937f2 = 0;
    }

    @Override
    public final void n(xf.m mVar) {
        boolean z10 = mVar instanceof xf.b;
        w1 w1Var = this.f49940h1;
        if (!z10 && !(mVar instanceof xf.d)) {
            w1Var.b(0.05f, 1.0f);
        } else {
            w1Var.b(0.4f, 1.75f);
        }
        w1Var.setDrawCenter(!(mVar instanceof xf.l));
        b0 b0Var = this.S0;
        if (b0Var.getCurrentBrush() instanceof xf.l) {
            this.f49938g1 = true;
        }
        b0Var.setBrush(mVar);
        xf.q1 q1Var = this.G1;
        int i9 = q1Var.f49333a;
        q1Var.f49333a = xf.s0.e(this.L1).c();
        q1Var.f49335c = this.f49942i1.get();
        s0(q1Var, Integer.valueOf(i9));
        this.T0.invalidate();
    }

    public final void n0(boolean z10) {
        int i9;
        int i10;
        if (this.f49930c1 == 0) {
            int i11 = 0;
            if (z10) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            this.f49940h1.setLayerType(i9, null);
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.Y0.setLayerType(i10, null);
            if (z10) {
                i11 = 2;
            }
            this.X0.setLayerType(i11, null);
        }
    }

    public final boolean o0() {
        if (this.H1) {
            w0(false);
            return true;
        } else if (this.f49931c2) {
            l0(true);
            return true;
        } else if (!this.P0) {
            return false;
        } else {
            r0(null, true);
            return true;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int R;
        super.onLayout(z10, i9, i10, i11, i12);
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        int i15 = 0;
        if (this.f49929b2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i14 - this.f49929b2.getMeasuredHeight();
            } else {
                R = (R() + i14) - this.f49929b2.getMeasuredHeight();
            }
            wy wyVar = this.f49929b2;
            wyVar.layout(0, R, wyVar.getMeasuredWidth(), this.f49929b2.getMeasuredHeight() + R);
        }
        if (!this.R0) {
            i15 = AndroidUtilities.statusBarHeight;
        }
        b0 b0Var = this.S0;
        int ceil = (int) Math.ceil((i13 - b0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.l0.C(8.0f, (((i14 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i15)) - AndroidUtilities.dp(48.0f)) - b0Var.getMeasuredHeight()) / 2, i15);
        b0Var.layout(ceil, additionalTop, b0Var.getMeasuredWidth() + ceil, b0Var.getMeasuredHeight() + additionalTop);
        d0 d0Var = this.T0;
        d0Var.layout(ceil, additionalTop, d0Var.getMeasuredWidth() + ceil, d0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = b0Var.getMeasuredWidth();
        f0 f0Var = this.V0;
        int measuredWidth2 = ((measuredWidth - f0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((b0Var.getMeasuredHeight() - f0Var.getMeasuredHeight()) / 2) + additionalTop;
        f0Var.layout(measuredWidth2, measuredHeight, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight);
        d01 d01Var = this.W0;
        if (d01Var != null) {
            d01Var.layout(measuredWidth2, measuredHeight, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight);
        }
        g0 g0Var = this.U0;
        g0Var.layout(ceil, additionalTop, g0Var.getMeasuredWidth() + ceil, g0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float currentActionBarHeight;
        float f10;
        this.L0 = true;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f49963z0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * currentActionBarHeight) / f10);
        float f12 = currentActionBarHeight2;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / currentActionBarHeight);
            floor = f12;
        }
        int i11 = (int) f11;
        int i12 = (int) floor;
        this.S0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        this.T0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        float f13 = f11 / this.N0.f32026a;
        this.M0 = f13;
        f0 f0Var = this.V0;
        f0Var.setScaleX(f13);
        f0Var.setScaleY(this.M0);
        f0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.f32026a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.N0.f32027b, 1073741824));
        d01 d01Var = this.W0;
        if (d01Var != null) {
            d01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.f32026a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.N0.f32027b, 1073741824));
            this.W0.setScaleX(this.M0);
            this.W0.setScaleY(this.M0);
        }
        C0();
        this.U0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        measureChild(this.Y0, i9, i10);
        measureChild(this.f49940h1, i9, i10);
        measureChild(this.f49927a1, i9, i10);
        measureChild(this.Z0, i9, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f49937f2), 1073741824));
        FrameLayout frameLayout = this.X0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i9, i10);
        this.L0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f49931c2 && !this.f49935e2) {
            this.L0 = true;
            m0();
            this.L0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        wy wyVar = this.f49929b2;
        if (wyVar != null) {
            measureChild(wyVar, i9, i10);
        }
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.B0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    public final void q0(j jVar) {
        j jVar2 = this.O0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f49863i0, false);
            this.O0 = null;
            if (jVar instanceof v2) {
                ValueAnimator valueAnimator = this.f49936f1;
                if (valueAnimator != null && this.f49932d1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.V0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            xf.t1 t1Var = this.B0;
            t1Var.f49382b.remove(uuid);
            t1Var.f49383c.remove(uuid);
            AndroidUtilities.runOnUIThread(new pf.o1(t1Var, 14));
        }
        w1 w1Var = this.f49940h1;
        n5.a0 a0Var = this.f49942i1;
        w1Var.setValueOverride(a0Var);
        w1Var.setShowPreview(true);
        float f10 = a0Var.get();
        xf.q1 q1Var = this.G1;
        q1Var.f49335c = f10;
        s0(q1Var, null);
    }

    @Override
    public final boolean r() {
        return true;
    }

    public final boolean r0(j jVar, boolean z10) {
        l0 l0Var;
        boolean z11;
        int i9;
        boolean z12 = jVar instanceof v2;
        int i10 = 2;
        if (z12 && (((i9 = this.f49932d1) == -1 && this.f49930c1 != 2) || (i9 != -1 && i9 != 2))) {
            ValueAnimator valueAnimator = this.f49936f1;
            if (valueAnimator != null && i9 != 2) {
                valueAnimator.cancel();
            }
            if (this.H1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            v2 v2Var = (v2) jVar;
            int gravity = v2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            o1 o1Var = this.f49951q1;
            o1Var.setAlignment(i10);
            o1Var.setTypeface(v2Var.getTypeface().f49240a);
            o1Var.e(v2Var.getType(), true);
            this.Z0.invalidate();
        }
        j jVar2 = this.O0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.P0) {
                    int[] k02 = k0(jVar2);
                    y0(new s(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof v2) {
                    AndroidUtilities.showKeyboard(((v2) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            l0Var = this;
            jVar2.l(jVar2.f49863i0, false);
            j jVar3 = l0Var.O0;
            if (jVar3 instanceof v2) {
                v2 v2Var2 = (v2) jVar3;
                u2 u2Var = v2Var2.m0;
                u2Var.clearFocus();
                u2Var.setEnabled(false);
                u2Var.setClickable(false);
                v2Var2.m();
                if (!z12) {
                    l0Var.P0 = false;
                    AndroidUtilities.hideKeyboard(((v2) l0Var.O0).getFocusedView());
                    l0(false);
                }
            }
            z11 = true;
        } else {
            l0Var = this;
            z11 = false;
        }
        j jVar4 = l0Var.O0;
        l0Var.O0 = jVar;
        if ((jVar4 instanceof v2) && TextUtils.isEmpty(((v2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = l0Var.O0;
        n5.a0 a0Var = l0Var.f49942i1;
        xf.q1 q1Var = l0Var.G1;
        w1 w1Var = l0Var.f49940h1;
        if (jVar5 != null) {
            g0 g0Var = l0Var.U0;
            jVar5.f49863i0 = g0Var;
            jVar5.l(g0Var, true);
            l0Var.V0.bringChildToFront(l0Var.O0);
            j jVar6 = l0Var.O0;
            if (jVar6 instanceof v2) {
                v2 v2Var3 = (v2) jVar6;
                v2Var3.f50147v0 = false;
                v2Var3.getSwatch().f49335c = q1Var.f49335c;
                s0(v2Var3.getSwatch(), null);
                w1Var.setValueOverride(new kh.k5(v2Var3, (int) (l0Var.N0.f32026a / 9.0f), 1));
                w1Var.setShowPreview(false);
                return true;
            }
            w1Var.setValueOverride(a0Var);
            w1Var.setShowPreview(true);
            q1Var.f49335c = a0Var.get();
            s0(q1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = l0Var.f49936f1;
        if (valueAnimator2 != null && l0Var.f49932d1 != 0) {
            valueAnimator2.cancel();
        }
        if (l0Var.H1) {
            w0(false);
        }
        B0(0);
        w1Var.setValueOverride(a0Var);
        w1Var.setShowPreview(true);
        q1Var.f49335c = a0Var.get();
        s0(q1Var, null);
        return z11;
    }

    @Override
    public final void requestLayout() {
        if (this.L0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        return !this.P0;
    }

    public final void s0(xf.q1 q1Var, Integer num) {
        xf.q1 q1Var2 = this.G1;
        if (q1Var2 != q1Var) {
            q1Var2.f49333a = q1Var.f49333a;
            q1Var2.f49334b = q1Var.f49334b;
            q1Var2.f49335c = q1Var.f49335c;
            int i9 = this.L1;
            xf.s0.e(i9).h(q1Var.f49333a, true);
            xf.s0.e(i9).j(q1Var.f49335c);
        }
        int i10 = q1Var.f49333a;
        b0 b0Var = this.S0;
        b0Var.setColor(i10);
        b0Var.setBrushSize(q1Var.f49335c);
        int i11 = q1Var2.f49333a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new p4(this, num, i11, 2));
            duration.start();
        } else {
            j0 j0Var = this.Y0;
            if (j0Var != null) {
                j0Var.invalidate();
            }
        }
        j jVar = this.O0;
        if (jVar instanceof v2) {
            ((v2) jVar).setSwatch(new xf.q1(q1Var.f49334b, q1Var.f49335c, q1Var.f49333a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(kg.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        this.Y1 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.S1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.f49930c1 == 0) {
            this.f49940h1.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.Q1 = runnable;
    }

    public final void t0(float f10) {
        this.f49961y0 = f10;
        this.X0.setTranslationY(-f10);
        this.Y0.setTranslationY(f10);
    }

    @Override
    public final void u() {
        b4 b4Var;
        if (!this.f49933d2 && !this.f49931c2) {
            j0(true);
            return;
        }
        boolean z10 = this.f49931c2;
        if (z10 && (b4Var = ((xs0) this).f44585k2.G1) != null) {
            b4Var.f14993e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.O0;
            if (jVar instanceof v2) {
                AndroidUtilities.showKeyboard(((v2) jVar).getEditText());
            }
        }
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d9 = f11 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d9)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) j3.r0.b(radians, d9, Math.sin(radians) * d));
    }

    public final void v0(float f10, float f11, float f12, float f13, float f14) {
        View view;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        this.E0 = f10;
        this.J0 = f13;
        this.K0 = f14;
        this.F0 = f11;
        this.G0 = f12;
        this.H0 = f11;
        float f21 = f12 + 0.0f;
        this.I0 = f21;
        for (int i9 = 0; i9 < 4; i9++) {
            if (i9 == 0) {
                view = this.V0;
            } else if (i9 == 1) {
                view = this.U0;
            } else if (i9 == 2) {
                view = this.S0;
            } else {
                view = this.T0;
            }
            MediaController.CropState cropState = this.D0;
            if (cropState != null) {
                float f22 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i10 = cropState.transformRotation;
                    if (i10 == 90 || i10 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f13 / ((int) (cropState.cropPw * f19)), f14 / ((int) (cropState.cropPh * f20)));
                    f15 = f22 * max;
                    float C = e2.c.C(cropState.cropPx, measuredWidth, f10, max);
                    float f23 = cropState.cropScale;
                    f16 = (C * f23) + f11;
                    f17 = (cropState.cropPy * measuredHeight * f10 * max * f23) + f21;
                    f18 = cropState.cropRotate + i10;
                } else {
                    return;
                }
            } else {
                if (i9 == 0) {
                    f15 = this.M0 * 1.0f;
                } else {
                    f15 = 1.0f;
                }
                f16 = f11;
                f17 = f21;
                f18 = 0.0f;
            }
            float f24 = ((-this.f49937f2) / 2.0f) + f17;
            float f25 = f10 * f15;
            if (Float.isNaN(f25)) {
                f25 = 1.0f;
            }
            view.setScaleX(f25);
            view.setScaleY(f25);
            view.setTranslationX(f16);
            view.setTranslationY(f24);
            view.setRotation(f18);
            view.invalidate();
        }
        C0();
        invalidate();
    }

    @Override
    public final void w(j jVar) {
        int[] k02 = k0(jVar);
        y0(new s(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    public final void w0(final boolean z10) {
        float f10;
        boolean z11;
        if (this.H1 != z10) {
            this.H1 = z10;
            o1.j jVar = this.I1;
            if (jVar != null) {
                jVar.c();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new gb.a(f10));
            this.I1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f11 = 0.0f;
            }
            kVar.f18807i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18800u = kVar;
            if (!this.f49933d2 && !this.f49931c2) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.Y0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.I1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    int i9;
                    l0 l0Var = l0.this;
                    j0 j0Var = l0Var.Y0;
                    float f14 = f12 / 1000.0f;
                    l0Var.J1 = f14;
                    float f15 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f15);
                    view.setScaleY(f15);
                    view.setTranslationY((Math.min(l0Var.J1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(l0Var.J1, 0.25f) / 0.25f));
                    i0 i0Var = l0Var.C1;
                    float f16 = l0Var.J1;
                    boolean z12 = z10;
                    i0Var.y1(f16, z12);
                    l0Var.f49959x0.setProgress(l0Var.J1);
                    l0Var.f49957w0.setProgress(l0Var.J1);
                    l0Var.f49928b1.setTranslationY(AndroidUtilities.dp(32.0f) * l0Var.J1);
                    if (zArr[0]) {
                        float f17 = l0Var.J1;
                        if (!z12) {
                            f17 = 1.0f - f17;
                        }
                        float dp = AndroidUtilities.dp(40.0f) * f17;
                        if (z12) {
                            i9 = 1;
                        } else {
                            i9 = -1;
                        }
                        j0Var.setTranslationY(translationY - (dp * i9));
                    }
                    j0Var.invalidate();
                    if (view == l0Var.f49951q1) {
                        l0Var.Z0.invalidate();
                    }
                }
            });
            this.I1.a(new r(this, z10, 1));
            this.I1.f();
            if (z10) {
                i0 i0Var = this.C1;
                i0Var.setVisibility(0);
                i0Var.setSelectedColorIndex(xf.s0.e(this.L1).d());
            }
        }
    }

    @Override
    public final xf.s0 x() {
        return xf.s0.e(this.L1);
    }

    public final void x0(int i9) {
        boolean z10;
        int i10;
        o1 o1Var = this.f49951q1;
        if (i9 == 1) {
            wy wyVar = this.f49929b2;
            if (wyVar != null && wyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wy wyVar2 = this.f49929b2;
            if (wyVar2 != null && wyVar2.Y0 != UserConfig.selectedAccount) {
                removeView(wyVar2);
                this.f49929b2 = null;
            }
            if (this.f49929b2 == null) {
                wy wyVar3 = new wy(null, true, false, false, getContext(), false, null, null, true, this.M1, false, false);
                this.f49929b2 = wyVar3;
                wyVar3.Q0 = true;
                wyVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f49929b2.setForseMultiwindowLayout(true);
                }
                this.f49929b2.setDelegate(new a0(this));
                addView(this.f49929b2);
            }
            this.f49929b2.setVisibility(0);
            this.f49931c2 = true;
            wy wyVar4 = this.f49929b2;
            if (this.f49939g2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f49939g2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f49939g2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f49941h2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f49941h2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f49941h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f49941h2;
            } else {
                i10 = this.f49939g2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wyVar4.getLayoutParams();
            layoutParams.height = i10;
            wyVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.O0;
                if (jVar instanceof v2) {
                    AndroidUtilities.hideKeyboard(((v2) jVar).getEditText());
                }
            }
            this.f49937f2 = i10;
            requestLayout();
            b4 b4Var = ((xs0) this).f44585k2.G1;
            if (b4Var != null) {
                b4Var.a();
            }
            qg emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            getHeight();
            if (!z10 && !this.f49933d2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49937f2, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new z(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        qg emojiButton2 = o1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(og.f31383e, true);
        }
        wy wyVar5 = this.f49929b2;
        if (wyVar5 != null) {
            this.f49931c2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                wyVar5.setVisibility(8);
            }
        }
        if (i9 == 0) {
            this.f49937f2 = 0;
        }
        b4 b4Var2 = ((xs0) this).f44585k2.G1;
        if (b4Var2 != null) {
            b4Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, l0 l0Var, int i9, int i10, int i11) {
        org.telegram.ui.ActionBar.o1 o1Var = this.N1;
        if (o1Var != null && o1Var.isShowing()) {
            this.N1.d(true);
            return;
        }
        if (this.O1 == null) {
            this.P1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.M1);
            this.O1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.O1.setBackgroundColor(-14145495);
            this.O1.setOnTouchListener(new y4(this, 1));
            this.O1.setDispatchKeyEventListener(new q(this));
            this.O1.setShownFromBottom(true);
        }
        this.O1.d();
        runnable.run();
        if (this.N1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.O1, -2, -2);
            this.N1 = o1Var2;
            o1Var2.f23688b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.N1.setOutsideTouchable(true);
            this.N1.setClippingEnabled(true);
            this.N1.setInputMethodMode(2);
            this.N1.setSoftInputMode(0);
            this.N1.getContentView().setFocusableInTouchMode(true);
            this.N1.setOnDismissListener(new a5(this, 1));
        }
        this.O1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.N1.setFocusable(true);
        this.N1.showAtLocation(l0Var, i9, i10 - (this.O1.getMeasuredWidth() / 2), i11 - this.O1.getMeasuredHeight());
        org.telegram.ui.ActionBar.o1.i(this.O1);
    }

    public final void z0(boolean z10) {
        float f10;
        if (this.A1 != z10) {
            this.A1 = z10;
            o1.j jVar = this.B1;
            if (jVar != null) {
                jVar.c();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new gb.a(f10));
            this.B1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f11 = 0.0f;
            }
            kVar.f18807i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18800u = kVar;
            if (z10) {
                t1 t1Var = this.f49952r1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.B1.b(new x7(3, this));
            this.B1.a(new r(this, z10, 0));
            this.B1.f();
        }
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void g(boolean z10) {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h(boolean z10) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void o(boolean z10) {
    }

    @Override
    public final void y() {
    }
}
