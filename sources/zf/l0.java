package zf;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import jh.g3;
import jh.t7;
import lh.a4;
import lh.e6;
import lh.j5;
import lh.m5;
import lh.n4;
import lh.n5;
import lh.t4;
import lh.w4;
import lh.y4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.hq0;
import org.telegram.ui.ys0;

public abstract class l0 extends av0 implements q1, h, m1, yu0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public boolean A1;
    public final yf.s1 B0;
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
    public final yf.p1 G1;
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
    public final ng.b M1;
    public tu0 N0;
    public org.telegram.ui.ActionBar.n1 N1;
    public j O0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O1;
    public boolean P0;
    public Rect P1;
    public int Q0;
    public Runnable Q1;
    public final boolean R0;
    public final yf.r0 R1;
    public final b0 S0;
    public boolean S1;
    public final d0 T0;
    public float T1;
    public final g0 U0;
    public boolean U1;
    public final f0 V0;
    public final y5 V1;
    public f01 W0;
    public final Paint W1;
    public final FrameLayout X0;
    public final Paint X1;
    public final j0 Y0;
    public lg.d Y1;
    public final h0 Z0;
    public final float[] Z1;

    public final FrameLayout f50505a1;
    public final int[] a2;

    public m5 f50506b1;

    public yy f50507b2;

    public int f50508c1;

    public boolean f50509c2;

    public int f50510d1;

    public boolean f50511d2;

    public float f50512e1;

    public boolean f50513e2;

    public ValueAnimator f50514f1;

    public int f50515f2;

    public boolean f50516g1;

    public int f50517g2;

    public final w1 f50518h1;

    public int f50519h2;

    public final n2.b0 f50520i1;

    public int f50521i2;

    public ArrayList f50522j1;

    public boolean f50523j2;

    public final int f50524k1;
    public BigInteger l1;

    public TextView f50525m1;

    public TextView f50526n1;

    public TextView f50527o1;

    public final r1 f50528p1;

    public final o1 f50529q1;

    public final t1 f50530r1;

    public final ImageView f50531s1;

    public final LinearLayout f50532t1;

    public final TextView f50533u1;

    public final TextView f50534v1;

    public final f1 f50535w0;

    public final TextView f50536w1;

    public final j1 f50537x0;

    public final Paint f50538x1;

    public float f50539y0;

    public final Paint f50540y1;

    public final Bitmap f50541z0;

    public float f50542z1;

    public l0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, hq0 hq0Var, c6 c6Var) {
        Emoji.EmojiSpan[] emojiSpanArr;
        y yVar;
        super(context, activity);
        ArrayList arrayList2 = arrayList;
        boolean z10 = false;
        this.f50508c1 = 0;
        this.f50510d1 = -1;
        final ys0 ys0Var = (ys0) this;
        this.f50520i1 = new n2.b0(ys0Var, 26);
        byte b10 = 1;
        this.f50538x1 = new Paint(1);
        this.f50540y1 = new Paint(1);
        this.D1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        yf.p1 p1Var = new yf.p1(1.0f, 0.016773745f, -1);
        this.G1 = p1Var;
        this.K1 = new Paint(1);
        this.U1 = false;
        this.V1 = new y5(this, 350L, er.h);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        this.X1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.Z1 = new float[2];
        this.a2 = new int[2];
        new mu0(ys0Var, 10);
        setDelegate(this);
        this.L1 = i10;
        this.M1 = new ng.b(3, c6Var);
        this.D0 = cropState;
        this.R0 = context instanceof BubbleActivity;
        yf.r0 r0VarE = yf.r0.e(i10);
        this.R1 = r0VarE;
        r0VarE.i(0, true);
        p1Var.f50034a = r0VarE.c();
        p1Var.f50036c = r0VarE.f50060i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.C0 = dispatchQueue;
        this.f50541z0 = bitmap;
        this.A0 = bitmap2;
        this.f50524k1 = i11;
        yf.s1 s1Var = new yf.s1();
        this.B0 = s1Var;
        s1Var.f50076a = new t0.c(ys0Var, 8);
        b0 b0Var = new b0(ys0Var, context, new yf.p0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.S0 = b0Var;
        b0Var.setDelegate(new c0(ys0Var, hq0Var));
        b0Var.setUndoStore(s1Var);
        b0Var.setQueue(dispatchQueue);
        b0Var.setVisibility(4);
        addView(b0Var, z5.e(-1, -1, 51));
        d0 d0Var = new d0(ys0Var, context);
        this.T0 = d0Var;
        d0Var.setVisibility(4);
        addView(d0Var, z5.e(-1, -1, 51));
        f0 f0Var = new f0(ys0Var, context, new e0(ys0Var));
        this.V0 = f0Var;
        addView(f0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i12);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    y yVarI0 = i0(mediaEntity.parentObject, mediaEntity.document, z10);
                    if ((mediaEntity.subType & 2) != 0) {
                        yVarI0.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = yVarI0.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    yVar = yVarI0;
                } else if (b11 == b10) {
                    v2 v2VarJ0 = j0(z10);
                    v2VarJ0.setType(mediaEntity.subType);
                    v2VarJ0.setTypeface(mediaEntity.textTypeface);
                    v2VarJ0.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                    int size2 = arrayList3.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(i13);
                        t5 t5Var = new t5(emojiEntity.document_id, v2VarJ0.getFontMetricsInt());
                        int i14 = emojiEntity.offset;
                        spannableString.setSpan(t5Var, i14, emojiEntity.length + i14, 33);
                        size2 = size2;
                    }
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, v2VarJ0.getFontMetricsInt(), false);
                    if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    v2VarJ0.setText(charSequenceReplaceEmoji);
                    u0(v2VarJ0, mediaEntity.textAlign);
                    yf.p1 swatch = v2VarJ0.getSwatch();
                    swatch.f50034a = mediaEntity.color;
                    v2VarJ0.setSwatch(swatch);
                    yVar = v2VarJ0;
                } else {
                    if (b11 == 2) {
                        x1 x1VarH0 = h0(mediaEntity.text, false);
                        x1VarH0.f50773x0 = false;
                        if ((mediaEntity.subType & 2) != 0) {
                            x1VarH0.r(false);
                        }
                        if ((mediaEntity.subType & 16) != 0) {
                            x1VarH0.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = x1VarH0.getLayoutParams();
                        layoutParams2.width = mediaEntity.viewWidth;
                        layoutParams2.height = mediaEntity.viewHeight;
                        yVar = x1VarH0;
                    }
                    i12++;
                    arrayList2 = arrayList;
                    z10 = false;
                    b10 = 1;
                }
                yVar.setX((mediaEntity.f19646x * this.N0.f32893a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                yVar.setY((mediaEntity.f19647y * this.N0.f32894b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                yVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + yVar.getX(), (mediaEntity.viewHeight / 2.0f) + yVar.getY()));
                yVar.setScale(mediaEntity.scale);
                yVar.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
                i12++;
                arrayList2 = arrayList;
                z10 = false;
                b10 = 1;
            }
        }
        this.V0.setVisibility(4);
        g0 g0Var = new g0(context);
        this.U0 = g0Var;
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.X0 = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f50531s1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(g6.f0(1090519039, 1, -1));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        ys0 ys0Var2 = ys0Var;
                        b0 b0Var2 = ys0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof yf.l)) {
                            b0Var2.b();
                            ys0Var2.f50528p1.setSelectedIndex(1);
                            ys0Var2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            ys0Var2.B0.c();
                        }
                        break;
                    case 1:
                        ys0 ys0Var3 = ys0Var;
                        b0 b0Var3 = ys0Var3.S0;
                        yf.s1 s1Var2 = ys0Var3.B0;
                        if (s1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof yf.l)) {
                                b0Var3.b();
                                ys0Var3.f50528p1.setSelectedIndex(1);
                                ys0Var3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            b0Var3.a();
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            ys0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ys0 ys0Var4 = ys0Var;
                        j jVar = ys0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (ys0Var4.f50509c2) {
                            ys0Var4.l0(false);
                        }
                        ys0Var4.q0(ys0Var4.O0);
                        ys0Var4.r0(null, true);
                        break;
                    default:
                        ys0Var.r0(null, true);
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, z5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f50532t1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(g6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        rl.h(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ag.l2(28));
        frameLayout.addView(linearLayout, z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f50533u1 = textView2;
        textView2.setBackground(g6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i16 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        ys0 ys0Var2 = ys0Var;
                        b0 b0Var2 = ys0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof yf.l)) {
                            b0Var2.b();
                            ys0Var2.f50528p1.setSelectedIndex(1);
                            ys0Var2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            ys0Var2.B0.c();
                        }
                        break;
                    case 1:
                        ys0 ys0Var3 = ys0Var;
                        b0 b0Var3 = ys0Var3.S0;
                        yf.s1 s1Var2 = ys0Var3.B0;
                        if (s1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof yf.l)) {
                                b0Var3.b();
                                ys0Var3.f50528p1.setSelectedIndex(1);
                                ys0Var3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            b0Var3.a();
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            ys0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ys0 ys0Var4 = ys0Var;
                        j jVar = ys0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (ys0Var4.f50509c2) {
                            ys0Var4.l0(false);
                        }
                        ys0Var4.q0(ys0Var4.O0);
                        ys0Var4.r0(null, true);
                        break;
                    default:
                        ys0Var.r0(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView textViewH = pa.h(frameLayout, textView2, z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f50534v1 = textViewH;
        textViewH.setBackground(g6.f0(822083583, 7, -1));
        textViewH.setPadding(pa.c(8.0f, R.string.Clear, textViewH), 0, AndroidUtilities.dp(8.0f), 0);
        textViewH.setGravity(16);
        textViewH.setTextColor(-1);
        textViewH.setTypeface(AndroidUtilities.bold());
        textViewH.setTextSize(1, 16.0f);
        final int i17 = 2;
        textViewH.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        ys0 ys0Var2 = ys0Var;
                        b0 b0Var2 = ys0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof yf.l)) {
                            b0Var2.b();
                            ys0Var2.f50528p1.setSelectedIndex(1);
                            ys0Var2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            ys0Var2.B0.c();
                        }
                        break;
                    case 1:
                        ys0 ys0Var3 = ys0Var;
                        b0 b0Var3 = ys0Var3.S0;
                        yf.s1 s1Var2 = ys0Var3.B0;
                        if (s1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof yf.l)) {
                                b0Var3.b();
                                ys0Var3.f50528p1.setSelectedIndex(1);
                                ys0Var3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            b0Var3.a();
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            ys0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ys0 ys0Var4 = ys0Var;
                        j jVar = ys0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (ys0Var4.f50509c2) {
                            ys0Var4.l0(false);
                        }
                        ys0Var4.q0(ys0Var4.O0);
                        ys0Var4.r0(null, true);
                        break;
                    default:
                        ys0Var.r0(null, true);
                        break;
                }
            }
        });
        textViewH.setAlpha(0.0f);
        textViewH.setVisibility(8);
        TextView textViewH2 = pa.h(frameLayout, textViewH, z5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f50536w1 = textViewH2;
        textViewH2.setBackground(g6.f0(822083583, 7, -1));
        textViewH2.setPadding(pa.c(8.0f, R.string.Done, textViewH2), 0, AndroidUtilities.dp(8.0f), 0);
        textViewH2.setGravity(16);
        textViewH2.setTextColor(-1);
        textViewH2.setTypeface(AndroidUtilities.bold());
        textViewH2.setTextSize(1, 16.0f);
        final int i18 = 3;
        textViewH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        ys0 ys0Var2 = ys0Var;
                        b0 b0Var2 = ys0Var2.S0;
                        if (b0Var2 != null && (b0Var2.getCurrentBrush() instanceof yf.l)) {
                            b0Var2.b();
                            ys0Var2.f50528p1.setSelectedIndex(1);
                            ys0Var2.l((yf.m) yf.m.f49979a.get(0));
                        } else {
                            ys0Var2.B0.c();
                        }
                        break;
                    case 1:
                        ys0 ys0Var3 = ys0Var;
                        b0 b0Var3 = ys0Var3.S0;
                        yf.s1 s1Var2 = ys0Var3.B0;
                        if (s1Var2.a()) {
                            if (b0Var3 != null && (b0Var3.getCurrentBrush() instanceof yf.l)) {
                                b0Var3.b();
                                ys0Var3.f50528p1.setSelectedIndex(1);
                                ys0Var3.l((yf.m) yf.m.f49979a.get(0));
                            }
                            b0Var3.a();
                            s1Var2.f50078c.clear();
                            s1Var2.f50077b.clear();
                            AndroidUtilities.runOnUIThread(new qf.b(s1Var2, 22));
                            ys0Var3.V0.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        ys0 ys0Var4 = ys0Var;
                        j jVar = ys0Var4.O0;
                        if (jVar instanceof v2) {
                            AndroidUtilities.hideKeyboard(((v2) jVar).getFocusedView());
                        }
                        if (ys0Var4.f50509c2) {
                            ys0Var4.l0(false);
                        }
                        ys0Var4.q0(ys0Var4.O0);
                        ys0Var4.r0(null, true);
                        break;
                    default:
                        ys0Var.r0(null, true);
                        break;
                }
            }
        });
        textViewH2.setAlpha(0.0f);
        textViewH2.setVisibility(8);
        frameLayout.addView(textViewH2, z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        j0 j0Var = new j0(ys0Var, context);
        this.Y0 = j0Var;
        j0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        j0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(j0Var, z5.e(-1, 104, 80));
        r1 r1Var = new r1(context, bitmap2 != null);
        this.f50528p1 = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r1Var.setDelegate(this);
        r1Var.setSelectedIndex(1);
        j0Var.addView(r1Var, z5.c(48.0f, -1));
        o1 o1Var = new o1(context);
        this.f50529q1 = o1Var;
        o1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o1Var.setVisibility(8);
        o1Var.setDelegate(this);
        o1Var.setAlignment(yf.r0.e(i10).f50059g);
        j0Var.addView(o1Var, z5.c(48.0f, -1));
        h0 h0Var = new h0(ys0Var, context);
        this.Z0 = h0Var;
        addView(h0Var, z5.c(-1.0f, -1));
        t1 t1Var = new t1(context);
        this.f50530r1 = t1Var;
        t1Var.setVisibility(8);
        t1Var.setOnItemClickListener(new ag.p0(ys0Var, 23));
        o1Var.setTypefaceListView(t1Var);
        h0Var.addView(t1Var, z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f50538x1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f50538x1.setColor(1728053247);
        this.f50538x1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.f50540y1.setColor(g6.v0(g6.G8, this.M1));
        i0 i0Var = new i0(ys0Var, context);
        this.C1 = i0Var;
        i0Var.setVisibility(8);
        i0Var.setColorPalette(yf.r0.e(i10));
        i0Var.setColorListener(new m(ys0Var, 0));
        j0Var.addView(i0Var, z5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        f1 f1Var = new f1(context);
        this.f50535w0 = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f1Var.setBackground(g6.f0(1090519039, 1, -1));
        j0Var.addView(f1Var, z5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        j1 j1Var = new j1(context);
        this.f50537x0 = j1Var;
        j1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        j1Var.setBackground(g6.f0(1090519039, 1, -1));
        j1Var.setOnClickListener(new ld0(ys0Var, context, bitmap2, 8));
        j0Var.addView(j1Var, z5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        w1 w1Var = new w1(context);
        this.f50518h1 = w1Var;
        w1Var.setColorSwatch(this.G1);
        w1Var.setRenderView(this.S0);
        w1Var.setValueOverride(this.f50520i1);
        this.G1.f50036c = this.f50520i1.get();
        w1Var.setOnUpdate(new we.a(ys0Var, i10, 3));
        addView(w1Var, z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50505a1 = frameLayout2;
        addView(frameLayout2, z5.c(-1.0f, -1));
        this.F1.setStyle(style);
        this.F1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.G1, null);
        l((yf.m) yf.m.f49979a.get(0));
        d();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (((double) AndroidUtilities.displaySize.y) * 0.65d))));
        }
    }

    public static void Z(ys0 ys0Var, Integer num) {
        ys0Var.setNewColor(num.intValue());
        ys0Var.w0(false);
    }

    public static void a0(l0 l0Var) {
        Bitmap bitmap = l0Var.A0;
        e8.c cVarA = null;
        try {
            try {
                e8.b bVar = new e8.b(l0Var.getContext());
                bVar.c(1);
                bVar.b(1);
                bVar.f5353c = false;
                cVarA = bVar.a();
                if (!cVarA.f5355c.k()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    cVarA.N();
                    return;
                }
                a5.n nVar = new a5.n(5);
                b8.b bVar2 = (b8.b) nVar.f100b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                nVar.d = bitmap;
                bVar2.f2041a = width;
                bVar2.f2042b = height;
                bVar2.f2043c = l0Var.getFrameRotation();
                if (((ByteBuffer) nVar.f101c) == null && ((Bitmap) nVar.d) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray sparseArrayQ = cVarA.Q(nVar);
                    ArrayList arrayList = new ArrayList();
                    tu0 paintingSize = l0Var.getPaintingSize();
                    for (int i10 = 0; i10 < sparseArrayQ.size(); i10++) {
                        e8.a aVar = (e8.a) sparseArrayQ.get(sparseArrayQ.keyAt(i10));
                        int i11 = l0Var.f50524k1;
                        yf.s0 s0Var = new yf.s0(aVar, bitmap, paintingSize, i11 % 360 == 90 || i11 % 360 == 270);
                        if (s0Var.d != null) {
                            arrayList.add(s0Var);
                        }
                    }
                    l0Var.f50522j1 = arrayList;
                    cVarA.N();
                } catch (Throwable th) {
                    FileLog.e(th);
                    cVarA.N();
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                if (0 == 0) {
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cVarA.N();
            }
            throw th2;
        }
    }

    public static void b0(l0 l0Var) {
        j jVar;
        f0 f0Var = l0Var.V0;
        j jVar2 = l0Var.O0;
        if (jVar2 != null) {
            PointF pointFA0 = l0Var.A0(jVar2);
            j jVar3 = l0Var.O0;
            if (jVar3 instanceof o2) {
                j o2Var = new o2(l0Var.getContext(), (o2) l0Var.O0, pointFA0);
                o2Var.setDelegate(l0Var);
                f0Var.addView(o2Var);
                jVar = o2Var;
            } else if (jVar3 instanceof v2) {
                v2 v2Var = new v2(l0Var.getContext(), (v2) l0Var.O0, pointFA0);
                v2Var.setDelegate(l0Var);
                v2Var.setMaxWidth((int) (l0Var.getPaintingSize().f32893a - 20.0f));
                f0Var.addView(v2Var, z5.c(-2.0f, -2));
                jVar = v2Var;
            } else {
                jVar = null;
            }
            l0Var.p0(jVar);
            l0Var.r0(jVar, true);
        }
        org.telegram.ui.ActionBar.n1 n1Var = l0Var.N1;
        if (n1Var == null || !n1Var.isShowing()) {
            return;
        }
        l0Var.N1.d(true);
    }

    public static void c0(ys0 ys0Var, Integer num) {
        yf.r0 r0Var = ys0Var.R1;
        r0Var.h(num.intValue(), true);
        r0Var.g();
        ys0Var.setNewColor(num.intValue());
        i0 i0Var = ys0Var.C1;
        i0Var.setSelectedColorIndex(r0Var.d());
        i0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        return this.f50508c1 == 2 ? this.f50529q1 : this.f50528p1;
    }

    private int getFrameRotation() {
        int i10 = this.f50524k1;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private tu0 getPaintingSize() {
        int i10;
        tu0 tu0Var = this.N0;
        if (tu0Var != null) {
            return tu0Var;
        }
        Bitmap bitmap = this.f50541z0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            i10 = devicePerformanceClass != 2 ? 2560 : 3840;
        } else {
            i10 = 1280;
        }
        tu0 tu0Var2 = new tu0(width, height);
        float f10 = i10;
        tu0Var2.f32893a = f10;
        float fFloor = (float) Math.floor((f10 * height) / width);
        tu0Var2.f32894b = fFloor;
        if (fFloor > f10) {
            tu0Var2.f32894b = f10;
            tu0Var2.f32893a = (float) Math.floor((f10 * width) / height);
        }
        this.N0 = tu0Var2;
        return tu0Var2;
    }

    public void setNewColor(int i10) {
        yf.p1 p1Var = this.G1;
        int i11 = p1Var.f50034a;
        p1Var.f50034a = i10;
        s0(p1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new t4(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.Q0 = i10;
        j jVar = this.O0;
        if (jVar instanceof v2) {
            ((v2) jVar).setType(i10);
        }
        yf.r0 r0VarE = yf.r0.e(this.L1);
        r0VarE.h = i10;
        r0VarE.f50054a.edit().putInt("text_type", i10).apply();
        this.f50529q1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        m5 m5Var = new m5(this, context);
        this.f50506b1 = m5Var;
        m5Var.setClipToPadding(false);
        this.f50506b1.setOrientation(0);
        this.Y0.addView(this.f50506b1, z5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f50525m1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f50525m1;
        int i10 = g6.f23144i6;
        ng.b bVar = this.M1;
        textView2.setBackground(g6.f0(g6.v0(i10, bVar), 7, -1));
        this.f50525m1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f50525m1.setTextColor(-1);
        this.f50525m1.setTextSize(1, 14.0f);
        this.f50525m1.setGravity(1);
        this.f50525m1.setTypeface(AndroidUtilities.bold());
        this.f50525m1.setSingleLine();
        this.f50525m1.setOnClickListener(new k(this, 0));
        this.f50506b1.addView(this.f50525m1, z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f50526n1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f50526n1.setBackground(g6.f0(g6.v0(i10, bVar), 7, -1));
        this.f50526n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f50526n1.setOnClickListener(new k(this, 1));
        this.f50526n1.setTextColor(-1);
        this.f50526n1.setTextSize(1, 14.0f);
        this.f50526n1.setGravity(1);
        this.f50526n1.setTypeface(AndroidUtilities.bold());
        this.f50526n1.setAlpha(0.6f);
        this.f50526n1.setSingleLine();
        this.f50506b1.addView(this.f50526n1, z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f50527o1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f50527o1.setBackground(g6.f0(g6.v0(i10, bVar), 7, -1));
        this.f50527o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f50527o1.setTextColor(-1);
        this.f50527o1.setTextSize(1, 14.0f);
        this.f50527o1.setGravity(1);
        this.f50527o1.setTypeface(AndroidUtilities.bold());
        this.f50527o1.setAlpha(0.6f);
        this.f50527o1.setSingleLine();
        this.f50527o1.setOnClickListener(new k(this, 4));
        this.f50506b1.addView(this.f50527o1, z5.l(1.0f, 0, -2));
    }

    public static void u0(v2 v2Var, int i10) {
        int i11;
        v2Var.setAlign(i10);
        int i12 = 2;
        if (i10 != 1) {
            i11 = i10 != 2 ? 19 : 21;
        } else {
            i11 = 17;
        }
        v2Var.getEditText().setGravity(i11);
        if (i10 == 1) {
            i12 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i12 = 3;
        }
        v2Var.getEditText().setTextAlignment(i12);
    }

    @Override
    public final void A() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        MediaController.CropState cropState = this.D0;
        float f10 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF pointFG0 = g0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                f0 f0Var = this.V0;
                if (i10 >= f0Var.getChildCount()) {
                    break;
                }
                View childAt = f0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - pointFG0.y, 2.0d) + Math.pow(position2.x - pointFG0.x, 2.0d))) < f11) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return pointFG0;
            }
            pointFG0 = new PointF(pointFG0.x + f10, pointFG0.y + f10);
        }
    }

    public final void B0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.f50508c1 == i10 || this.f50510d1 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.f50514f1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.f50508c1;
        o1 o1Var = this.f50529q1;
        r1 r1Var = this.f50528p1;
        if (i11 == 0) {
            viewGroup = r1Var;
        } else {
            viewGroup = i11 == 2 ? o1Var : null;
        }
        this.f50510d1 = i10;
        if (i10 == 0) {
            viewGroup2 = r1Var;
        } else {
            viewGroup2 = i10 == 2 ? o1Var : null;
        }
        int i12 = this.L1;
        yf.r0 r0VarE = yf.r0.e(i12);
        boolean z10 = i10 == 2;
        if (r0VarE.f50063l != z10) {
            r0VarE.f50063l = z10;
            if (z10) {
                r0VarE.i(-1, false);
            } else {
                r0VarE.i(r0VarE.f50054a.getInt("brush", 0), false);
            }
        }
        int iC = yf.r0.e(i12).c();
        yf.p1 p1Var = this.G1;
        p1Var.f50034a = iC;
        s0(p1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.f50514f1 = duration;
        duration.setInterpolator(er.f28122f);
        this.f50514f1.addUpdateListener(new g3(this, viewGroup, viewGroup2, 4));
        this.f50514f1.addListener(new n5(this, viewGroup, viewGroup2, i10, 2));
        this.f50514f1.start();
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            f0 f0Var = this.V0;
            if (i10 >= f0Var.getChildCount()) {
                return;
            }
            View childAt = f0Var.getChildAt(i10);
            if (childAt == this.O0) {
                ((j) childAt).m();
            } else if (childAt instanceof j) {
                j jVar = (j) childAt;
                if (jVar.f50459h0 || jVar.f50457f0 > 0.0f) {
                    ((j) childAt).m();
                }
            }
            i10++;
        }
    }

    @Override
    public final void D() {
        z0(true);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f50511d2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f50519h2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f50519h2).commit();
            } else {
                this.f50517g2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f50517g2).commit();
            }
        }
        if (this.f50509c2) {
            int i11 = z10 ? this.f50519h2 : this.f50517g2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f50507b2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f50507b2.setLayoutParams(layoutParams);
                this.f50515f2 = layoutParams.height;
                requestLayout();
                a4 a4Var = ((ys0) this).f44893k2.G1;
                if (a4Var != null) {
                    a4Var.a();
                }
                getHeight();
            }
        }
        if (this.f50521i2 == i10 && this.f50523j2 == z10) {
            getHeight();
            return;
        }
        this.f50521i2 = i10;
        this.f50523j2 = z10;
        boolean z12 = this.f50511d2;
        j jVar = this.O0;
        if (jVar instanceof v2) {
            this.f50511d2 = ((v2) jVar).getEditText().isFocused() && i10 > 0;
        } else {
            this.f50511d2 = false;
        }
        if (this.f50511d2 && this.f50509c2) {
            x0(0);
        }
        if (this.f50515f2 != 0 && !(z11 = this.f50511d2) && z11 != z12 && !this.f50509c2) {
            this.f50515f2 = 0;
            requestLayout();
            a4 a4Var2 = ((ys0) this).f44893k2.G1;
            if (a4Var2 != null) {
                a4Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        w0(true);
    }

    @Override
    public final void c(j jVar) {
        int[] iArrK0 = k0(jVar);
        y0(new s(this, jVar, 1), this, 51, iArrK0[0], iArrK0[1] - AndroidUtilities.dp(32.0f));
    }

    @Override
    public final void d() {
        this.K1.setColor(-15132391);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f0 f0Var;
        v2 v2Var;
        String str;
        if (i10 != NotificationCenter.customTypefacesLoaded || (f0Var = this.V0) == null) {
            return;
        }
        for (int i12 = 0; i12 < f0Var.getChildCount(); i12++) {
            View childAt = f0Var.getChildAt(i12);
            if ((childAt instanceof v2) && (str = (v2Var = (v2) childAt).f50743w0) != null) {
                v2Var.setTypeface(str);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        g0 g0Var;
        int i10 = 0;
        f0 f0Var = this.V0;
        if (view == f0Var) {
            float fE = this.V1.e(this.S1);
            if (fE > 0.0f) {
                float fDp = AndroidUtilities.dp(24.0f * fE);
                int iL1 = g6.l1(fE, 1090519039);
                Paint paint = this.W1;
                paint.setShadowLayer(fDp, 0.0f, 0.0f, iL1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(f0Var.getX(), f0Var.getY());
                canvas.scale(f0Var.getScaleX(), f0Var.getScaleY(), f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, f0Var.getWidth(), f0Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, f0Var.getWidth(), f0Var.getHeight(), this.X1);
                canvas.restore();
            }
        }
        if ((view == this.S0 || view == this.T0 || ((view == f0Var && f0Var.getClipChildren()) || (view == (g0Var = this.U0) && g0Var.getClipChildren()))) && (cropState = this.D0) != null) {
            canvas.save();
            i10 = this.R0 ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = cropState.transformRotation;
            if (i11 == 90 || i11 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
            float fCeil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.H0;
            float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.f50515f2) - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i10 + this.I0;
            canvas.clipRect(Math.max(0.0f, fCeil), Math.max(0.0f, additionalBottom), Math.min(fCeil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i10 = 1;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override
    public final void e() {
        setTextType((this.Q0 + 1) % 4);
    }

    @Override
    public final void f(int i10) {
        j jVar = this.O0;
        if (jVar instanceof v2) {
            u0((v2) jVar, i10);
            yf.r0 r0VarE = yf.r0.e(this.L1);
            r0VarE.f50059g = i10;
            r0VarE.f50054a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new rh.o2(10, this, (x1) view)).start();
    }

    public final PointF g0() {
        tu0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f32893a / 2.0f;
        float f11 = paintingSize.f32894b / 2.0f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float fCos = (float) ((Math.cos(radians) * ((double) cropState.cropPx)) - (Math.sin(radians) * ((double) cropState.cropPy)));
            float fB = (float) i0.a.b(radians, cropState.cropPy, Math.sin(radians) * ((double) cropState.cropPx));
            f10 -= fCos * paintingSize.f32893a;
            f11 -= fB * paintingSize.f32894b;
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
        return this.f50535w0;
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
        return this.f50537x0;
    }

    public long getLcm() {
        return this.l1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        t5[] t5VarArr;
        f0 f0Var = this.V0;
        int childCount = f0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f0Var.getChildAt(i10);
            if (childAt instanceof o2) {
                TLRPC.Document sticker = ((o2) childAt).getSticker();
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
                            TLRPC.Document documentF = t5Var.document;
                            if (documentF == null) {
                                documentF = k5.f(this.L1, t5Var.getDocumentId());
                            }
                            if (documentF != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22392id = documentF.f22386id;
                                tL_inputDocument2.access_hash = documentF.access_hash;
                                byte[] bArr2 = documentF.file_reference;
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
        return this.f50539y0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public yf.b1 getRenderView() {
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

    public f01 getThanosEffect() {
        if (!f01.c()) {
            return null;
        }
        if (this.W0 == null) {
            f01 f01Var = new f01(getContext(), new n(this, 0));
            this.W0 = f01Var;
            addView(f01Var);
        }
        return this.W0;
    }

    public final x1 h0(String str, boolean z10) {
        float f10;
        tu0 tu0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e9) {
            FileLog.e(e9);
            f10 = 1.0f;
        }
        f0 f0Var = this.V0;
        if (f10 > 1.0f) {
            float fFloor = (float) Math.floor(((double) f0Var.getMeasuredWidth()) * 0.5d);
            tu0Var = new tu0(fFloor, fFloor / f10);
        } else {
            float fFloor2 = (float) Math.floor(((double) f0Var.getMeasuredHeight()) * 0.5d);
            tu0Var = new tu0(f10 * fFloor2, fFloor2);
        }
        tu0 tu0Var2 = tu0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = tu0Var2.f32893a;
            tu0Var2.f32893a = tu0Var2.f32894b;
            tu0Var2.f32894b = f11;
        }
        Context context = getContext();
        PointF pointFG0 = g0();
        int iIntValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        x1 x1Var = new x1(context, pointFG0, tu0Var2, str, iIntValue);
        x1Var.setDelegate(this);
        f0Var.addView(x1Var);
        if (z10) {
            p0(x1Var);
            r0(x1Var, true);
        }
        return x1Var;
    }

    public final y i0(Object obj, TLRPC.Document document, boolean z10) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f10;
        e6 e6Var;
        double d;
        e6 e6Var2;
        y yVar;
        PointF pointF;
        boolean zIsTextColorEmoji;
        ImageReceiver imageReceiver;
        ArrayList arrayList;
        yf.s0 s0Var;
        e6 e6Var3;
        int i10;
        float f11;
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
            i11++;
        }
        float f12 = 0.75f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f12 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        e6 e6Var4 = new e6(g0(), f12, f10);
        f0 f0Var = this.V0;
        if (tL_maskCoords != null && (arrayList = this.f50522j1) != null && arrayList.size() != 0) {
            int i12 = tL_maskCoords.f22455n;
            long j10 = document.f22386id;
            if (i12 < 0 || i12 > 3 || this.f50522j1.isEmpty()) {
                e6Var = e6Var4;
                d = 0.5d;
                s0Var = null;
                break;
            }
            int size = this.f50522j1.size();
            int iNextInt = Utilities.random.nextInt(size);
            int i13 = size;
            loop1: while (true) {
                if (i13 <= 0) {
                    e6Var = e6Var4;
                    d = 0.5d;
                    s0Var = null;
                    break;
                }
                yf.s0 s0Var2 = (yf.s0) this.f50522j1.get(iNextInt);
                PointF pointFA = s0Var2.a(i12);
                if (pointFA != null) {
                    d = 0.5d;
                    float f13 = s0Var2.f50070a * 1.1f;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= f0Var.getChildCount()) {
                            e6Var = e6Var4;
                            s0Var = s0Var2;
                            break loop1;
                        }
                        View childAt = f0Var.getChildAt(i14);
                        yf.s0 s0Var3 = s0Var2;
                        if (childAt instanceof o2) {
                            o2 o2Var = (o2) childAt;
                            if (o2Var.getAnchor() != i12) {
                                e6Var3 = e6Var4;
                                i10 = size;
                                f11 = f13;
                            } else {
                                PointF position = o2Var.getPosition();
                                e6Var3 = e6Var4;
                                i10 = size;
                                f11 = f13;
                                float fHypot = (float) Math.hypot(position.x - pointFA.x, position.y - pointFA.y);
                                if ((j10 == o2Var.getSticker().f22386id || this.f50522j1.size() > 1) && fHypot < f11) {
                                    break;
                                }
                            }
                        } else {
                            e6Var3 = e6Var4;
                            i10 = size;
                            f11 = f13;
                        }
                        i14++;
                        s0Var2 = s0Var3;
                        e6Var4 = e6Var3;
                        size = i10;
                        f13 = f11;
                    }
                } else {
                    e6Var3 = e6Var4;
                    i10 = size;
                }
                iNextInt = (iNextInt + 1) % i10;
                i13--;
                e6Var4 = e6Var3;
                size = i10;
            }
            if (s0Var != null) {
                PointF pointFA2 = s0Var.a(i12);
                float f14 = i12 == 1 ? s0Var.f50073e : s0Var.f50070a;
                float f15 = s0Var.f50071b;
                float fFloor = (float) (((double) (f14 / ((float) Math.floor(((double) getPaintingSize().f32893a) * d)))) * tL_maskCoords.zoom);
                double radians = (float) Math.toRadians(f15);
                double d10 = 1.5707963267948966d - radians;
                double d11 = f14;
                float fSin = (float) (Math.sin(d10) * d11 * tL_maskCoords.f22456x);
                float fCos = (float) (Math.cos(d10) * d11 * tL_maskCoords.f22456x);
                double d12 = radians + 1.5707963267948966d;
                e6Var2 = new e6(new PointF(pointFA2.x + fSin + ((float) (Math.cos(d12) * d11 * tL_maskCoords.f22457y)), pointFA2.y + fCos + ((float) (Math.sin(d12) * d11 * tL_maskCoords.f22457y))), fFloor, f15);
            }
            Context context = getContext();
            float fFloor2 = (float) Math.floor(((double) getPaintingSize().f32893a) * d);
            tu0 tu0Var = new tu0(fFloor2, fFloor2);
            pointF = e6Var2.f15933a;
            yVar = new y(this, context, pointF, e6Var2.f15935c, e6Var2.f15934b, tu0Var, document, obj);
            zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
            imageReceiver = yVar.f50651t0;
            if (zIsTextColorEmoji) {
                imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            imageReceiver.setLayerNum(12);
            if (pointF.x == f0Var.getMeasuredWidth() / 2.0f) {
                yVar.setStickyX(2);
            }
            if (pointF.y == f0Var.getMeasuredHeight() / 2.0f) {
                yVar.setStickyY(2);
            }
            yVar.setDelegate(this);
            f0Var.addView(yVar);
            if (z10) {
                p0(yVar);
                r0(yVar, true);
            }
            return yVar;
        }
        e6Var = e6Var4;
        d = 0.5d;
        e6Var2 = e6Var;
        Context context2 = getContext();
        float fFloor3 = (float) Math.floor(((double) getPaintingSize().f32893a) * d);
        tu0 tu0Var2 = new tu0(fFloor3, fFloor3);
        pointF = e6Var2.f15933a;
        yVar = new y(this, context2, pointF, e6Var2.f15935c, e6Var2.f15934b, tu0Var2, document, obj);
        zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
        imageReceiver = yVar.f50651t0;
        if (zIsTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        if (pointF.x == f0Var.getMeasuredWidth() / 2.0f) {
            yVar.setStickyX(2);
        }
        if (pointF.y == f0Var.getMeasuredHeight() / 2.0f) {
            yVar.setStickyY(2);
        }
        yVar.setDelegate(this);
        f0Var.addView(yVar);
        if (z10) {
            p0(yVar);
            r0(yVar, true);
        }
        return yVar;
    }

    @Override
    public final boolean j(j jVar) {
        return r0(jVar, true);
    }

    public final v2 j0(boolean z10) {
        ((ys0) this).f44893k2.f35601c0.isFocusable();
        tu0 paintingSize = getPaintingSize();
        PointF pointFA0 = A0(null);
        v2 v2Var = new v2(getContext(), pointFA0, (int) (paintingSize.f32893a / 9.0f), "", this.G1, this.Q0);
        float f10 = paintingSize.f32893a / 9.0f;
        n nVar = new n(this, 2);
        v2Var.f50739s0 = (int) (0.5f * f10);
        v2Var.f50740t0 = (int) (f10 * 2.0f);
        v2Var.f50741u0 = nVar;
        float f11 = pointFA0.x;
        f0 f0Var = this.V0;
        if (f11 == f0Var.getMeasuredWidth() / 2.0f) {
            v2Var.setStickyX(2);
        }
        if (pointFA0.y == f0Var.getMeasuredHeight() / 2.0f) {
            v2Var.setStickyY(2);
        }
        v2Var.setDelegate(this);
        v2Var.setMaxWidth((int) (paintingSize.f32893a - 20.0f));
        int i10 = this.L1;
        v2Var.setTypeface(yf.r0.e(i10).f50061j);
        v2Var.setType(yf.r0.e(i10).h);
        f0Var.addView(v2Var, z5.c(-2.0f, -2));
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
            int i11 = yf.r0.e(i10).f50059g;
            o1 o1Var = this.f50529q1;
            o1Var.d(i11, true);
            o1Var.setOutlineType(yf.r0.e(i10).h);
        }
        return v2Var;
    }

    public final int[] k0(j jVar) {
        float width = jVar.getWidth() / 2.0f;
        float[] fArr = this.Z1;
        fArr[0] = width;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        Object parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int iRound = Math.round(fArr[0]);
        int[] iArr = this.a2;
        iArr[0] = iRound;
        int iRound2 = Math.round(fArr[1]);
        iArr[1] = iRound2;
        float f10 = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f11 = f10 - (point.x / 2.0f);
        float f12 = iRound2 - (point.y / 2.0f);
        double d = f11;
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d10 = f12;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) i0.a.b(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    @Override
    public final void l(yf.m mVar) {
        boolean z10 = mVar instanceof yf.b;
        w1 w1Var = this.f50518h1;
        if (z10 || (mVar instanceof yf.d)) {
            w1Var.b(0.4f, 1.75f);
        } else {
            w1Var.b(0.05f, 1.0f);
        }
        w1Var.setDrawCenter(!(mVar instanceof yf.l));
        b0 b0Var = this.S0;
        if (b0Var.getCurrentBrush() instanceof yf.l) {
            this.f50516g1 = true;
        }
        b0Var.setBrush(mVar);
        yf.p1 p1Var = this.G1;
        int i10 = p1Var.f50034a;
        p1Var.f50034a = yf.r0.e(this.L1).c();
        p1Var.f50036c = this.f50520i1.get();
        s0(p1Var, Integer.valueOf(i10));
        this.T0.invalidate();
    }

    public final void l0(boolean z10) {
        int i10 = 0;
        if (this.f50509c2) {
            x0(0);
        }
        if (z10) {
            yy yyVar = this.f50507b2;
            if (yyVar == null || yyVar.getVisibility() != 0) {
                m0();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f50507b2.getMeasuredHeight());
            valueAnimatorOfFloat.addUpdateListener(new o(this, i10));
            this.f50513e2 = true;
            valueAnimatorOfFloat.addListener(new z(this, 1));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
            valueAnimatorOfFloat.start();
        }
    }

    public final void m0() {
        yy yyVar;
        a4 a4Var;
        if (this.f50515f2 > 0 && (a4Var = ((ys0) this).f44893k2.G1) != null) {
            a4Var.a();
        }
        if (!this.f50509c2 && (yyVar = this.f50507b2) != null && yyVar.getVisibility() != 8) {
            this.f50507b2.setVisibility(8);
        }
        this.f50515f2 = 0;
    }

    public final boolean n(MotionEvent motionEvent) {
        if (this.O0 != null) {
            r0(null, true);
        }
        float x8 = motionEvent.getX();
        b0 b0Var = this.S0;
        float translationX = ((x8 - b0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / b0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - b0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / b0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-b0Var.getRotation());
        double d10 = y10;
        float measuredWidth = (b0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (b0Var.getMeasuredHeight() / 2.0f) + ((float) i0.a.b(radians, d10, Math.sin(radians) * d));
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(measuredWidth, measuredHeight);
        b0Var.e(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public final void n0(boolean z10) {
        if (this.f50508c1 == 0) {
            this.f50518h1.setLayerType(z10 ? 2 : 0, null);
            this.Y0.setLayerType(z10 ? 2 : 0, null);
            this.X0.setLayerType(z10 ? 2 : 0, null);
        }
    }

    public final boolean o0() {
        if (this.H1) {
            w0(false);
            return true;
        }
        if (this.f50509c2) {
            l0(true);
            return true;
        }
        if (!this.P0) {
            return false;
        }
        r0(null, true);
        return true;
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
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (this.f50507b2 != null) {
            int measuredHeight = AndroidUtilities.isTablet() ? i15 - this.f50507b2.getMeasuredHeight() : (R() + i15) - this.f50507b2.getMeasuredHeight();
            yy yyVar = this.f50507b2;
            yyVar.layout(0, measuredHeight, yyVar.getMeasuredWidth(), this.f50507b2.getMeasuredHeight() + measuredHeight);
        }
        int i16 = this.R0 ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16;
        b0 b0Var = this.S0;
        int iCeil = (int) Math.ceil((i14 - b0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.y1.C(8.0f, (((i15 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - b0Var.getMeasuredHeight()) / 2, i16);
        b0Var.layout(iCeil, additionalTop, b0Var.getMeasuredWidth() + iCeil, b0Var.getMeasuredHeight() + additionalTop);
        d0 d0Var = this.T0;
        d0Var.layout(iCeil, additionalTop, d0Var.getMeasuredWidth() + iCeil, d0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = b0Var.getMeasuredWidth();
        f0 f0Var = this.V0;
        int measuredWidth2 = ((measuredWidth - f0Var.getMeasuredWidth()) / 2) + iCeil;
        int measuredHeight2 = ((b0Var.getMeasuredHeight() - f0Var.getMeasuredHeight()) / 2) + additionalTop;
        f0Var.layout(measuredWidth2, measuredHeight2, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight2);
        f01 f01Var = this.W0;
        if (f01Var != null) {
            f01Var.layout(measuredWidth2, measuredHeight2, f0Var.getMeasuredWidth() + measuredWidth2, f0Var.getMeasuredHeight() + measuredHeight2);
        }
        g0 g0Var = this.U0;
        g0Var.layout(iCeil, additionalTop, g0Var.getMeasuredWidth() + iCeil, g0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float width;
        this.L0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f50541z0;
        if (bitmap != null) {
            width = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            width = size;
        }
        float fFloor = size;
        float fFloor2 = (float) Math.floor((fFloor * currentActionBarHeight) / width);
        float f10 = currentActionBarHeight2;
        if (fFloor2 > f10) {
            fFloor = (float) Math.floor((width * f10) / currentActionBarHeight);
            fFloor2 = f10;
        }
        int i12 = (int) fFloor;
        int i13 = (int) fFloor2;
        this.S0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        this.T0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        float f11 = fFloor / this.N0.f32893a;
        this.M0 = f11;
        f0 f0Var = this.V0;
        f0Var.setScaleX(f11);
        f0Var.setScaleY(this.M0);
        f0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.f32893a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.N0.f32894b, 1073741824));
        f01 f01Var = this.W0;
        if (f01Var != null) {
            f01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.f32893a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.N0.f32894b, 1073741824));
            this.W0.setScaleX(this.M0);
            this.W0.setScaleY(this.M0);
        }
        C0();
        this.U0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.Y0, i10, i11);
        measureChild(this.f50518h1, i10, i11);
        measureChild(this.f50505a1, i10, i11);
        measureChild(this.Z0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f50515f2), 1073741824));
        FrameLayout frameLayout = this.X0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.L0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f50509c2 && !this.f50513e2) {
            this.L0 = true;
            m0();
            this.L0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        yy yyVar = this.f50507b2;
        if (yyVar != null) {
            measureChild(yyVar, i10, i11);
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
            jVar2.l(jVar2.f50460i0, false);
            this.O0 = null;
            if (jVar instanceof v2) {
                ValueAnimator valueAnimator = this.f50514f1;
                if (valueAnimator != null && this.f50510d1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.V0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            yf.s1 s1Var = this.B0;
            s1Var.f50077b.remove(uuid);
            s1Var.f50078c.remove(uuid);
            AndroidUtilities.runOnUIThread(new qf.b(s1Var, 22));
        }
        w1 w1Var = this.f50518h1;
        n2.b0 b0Var = this.f50520i1;
        w1Var.setValueOverride(b0Var);
        w1Var.setShowPreview(true);
        float f10 = b0Var.get();
        yf.p1 p1Var = this.G1;
        p1Var.f50036c = f10;
        s0(p1Var, null);
    }

    @Override
    public final boolean r() {
        return true;
    }

    public final boolean r0(j jVar, boolean z10) {
        l0 l0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof v2;
        int i11 = 2;
        if (z12 && (((i10 = this.f50510d1) == -1 && this.f50508c1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f50514f1;
            if (valueAnimator != null && i10 != 2) {
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
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            o1 o1Var = this.f50529q1;
            o1Var.setAlignment(i11);
            o1Var.setTypeface(v2Var.getTypeface().f49948a);
            o1Var.e(v2Var.getType(), true);
            this.Z0.invalidate();
        }
        j jVar2 = this.O0;
        if (jVar2 == null) {
            l0Var = this;
            z11 = false;
        } else {
            if (jVar2 == jVar) {
                if (!this.P0) {
                    int[] iArrK0 = k0(jVar2);
                    y0(new s(this, jVar2, 1), this, 51, iArrK0[0], iArrK0[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof v2) {
                    AndroidUtilities.showKeyboard(((v2) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            l0Var = this;
            jVar2.l(jVar2.f50460i0, false);
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
        }
        j jVar4 = l0Var.O0;
        l0Var.O0 = jVar;
        if ((jVar4 instanceof v2) && TextUtils.isEmpty(((v2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = l0Var.O0;
        n2.b0 b0Var = l0Var.f50520i1;
        yf.p1 p1Var = l0Var.G1;
        w1 w1Var = l0Var.f50518h1;
        if (jVar5 == null) {
            ValueAnimator valueAnimator2 = l0Var.f50514f1;
            if (valueAnimator2 != null && l0Var.f50510d1 != 0) {
                valueAnimator2.cancel();
            }
            if (l0Var.H1) {
                w0(false);
            }
            B0(0);
            w1Var.setValueOverride(b0Var);
            w1Var.setShowPreview(true);
            p1Var.f50036c = b0Var.get();
            s0(p1Var, null);
            return z11;
        }
        g0 g0Var = l0Var.U0;
        jVar5.f50460i0 = g0Var;
        jVar5.l(g0Var, true);
        l0Var.V0.bringChildToFront(l0Var.O0);
        j jVar6 = l0Var.O0;
        if (!(jVar6 instanceof v2)) {
            w1Var.setValueOverride(b0Var);
            w1Var.setShowPreview(true);
            p1Var.f50036c = b0Var.get();
            s0(p1Var, null);
            return true;
        }
        v2 v2Var3 = (v2) jVar6;
        v2Var3.f50742v0 = false;
        v2Var3.getSwatch().f50036c = p1Var.f50036c;
        s0(v2Var3.getSwatch(), null);
        w1Var.setValueOverride(new j5(v2Var3, (int) (l0Var.N0.f32893a / 9.0f), 1));
        w1Var.setShowPreview(false);
        return true;
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

    public final void s0(yf.p1 p1Var, Integer num) {
        yf.p1 p1Var2 = this.G1;
        if (p1Var2 != p1Var) {
            p1Var2.f50034a = p1Var.f50034a;
            p1Var2.f50035b = p1Var.f50035b;
            p1Var2.f50036c = p1Var.f50036c;
            int i10 = this.L1;
            yf.r0.e(i10).h(p1Var.f50034a, true);
            yf.r0.e(i10).j(p1Var.f50036c);
        }
        int i11 = p1Var.f50034a;
        b0 b0Var = this.S0;
        b0Var.setColor(i11);
        b0Var.setBrushSize(p1Var.f50036c);
        int i12 = p1Var2.f50034a;
        if (num == null || num.intValue() == i12) {
            j0 j0Var = this.Y0;
            if (j0Var != null) {
                j0Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new n4(this, num, i12, 2));
            duration.start();
        }
        j jVar = this.O0;
        if (jVar instanceof v2) {
            ((v2) jVar).setSwatch(new yf.p1(p1Var.f50035b, p1Var.f50036c, p1Var.f50034a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(lg.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        this.Y1 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.S1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.f50508c1 == 0) {
            this.f50518h1.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.Q1 = runnable;
    }

    public final void t0(float f10) {
        this.f50539y0 = f10;
        this.X0.setTranslationY(-f10);
        this.Y0.setTranslationY(f10);
    }

    @Override
    public final void u() {
        a4 a4Var;
        if (!this.f50511d2 && !this.f50509c2) {
            j0(true);
            return;
        }
        boolean z10 = this.f50509c2;
        if (z10 && (a4Var = ((ys0) this).f44893k2.G1) != null) {
            a4Var.f15636e = true;
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
        float f12 = f10 - (point.x / 2.0f);
        float f13 = f11 - (point.y / 2.0f);
        double d = f12;
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d10 = f13;
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) i0.a.b(radians, d10, Math.sin(radians) * d));
    }

    public final void v0(float f10, float f11, float f12, float f13, float f14) {
        View view;
        float f15;
        float f16;
        float f17;
        float f18;
        this.E0 = f10;
        this.J0 = f13;
        this.K0 = f14;
        this.F0 = f11;
        this.G0 = f12;
        this.H0 = f11;
        float f19 = f12 + 0.0f;
        this.I0 = f19;
        int i10 = 0;
        while (i10 < 4) {
            if (i10 == 0) {
                view = this.V0;
            } else if (i10 == 1) {
                view = this.U0;
            } else {
                view = i10 == 2 ? this.S0 : this.T0;
            }
            MediaController.CropState cropState = this.D0;
            if (cropState != null) {
                float f20 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0) {
                    return;
                }
                int i11 = cropState.transformRotation;
                if (i11 == 90 || i11 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float f21 = measuredWidth;
                float f22 = measuredHeight;
                float fMax = Math.max(f13 / ((int) (cropState.cropPw * f21)), f14 / ((int) (cropState.cropPh * f22)));
                f15 = f20 * fMax;
                float fC = com.google.android.recaptcha.internal.a.C(cropState.cropPx, f21, f10, fMax);
                float f23 = cropState.cropScale;
                f16 = (fC * f23) + f11;
                f17 = (cropState.cropPy * f22 * f10 * fMax * f23) + f19;
                f18 = cropState.cropRotate + i11;
            } else {
                f15 = i10 == 0 ? this.M0 * 1.0f : 1.0f;
                f16 = f11;
                f17 = f19;
                f18 = 0.0f;
            }
            float f24 = ((-this.f50515f2) / 2.0f) + f17;
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
            i10++;
        }
        C0();
        invalidate();
    }

    @Override
    public final int[] w(j jVar) {
        return k0(jVar);
    }

    public final void w0(final boolean z10) {
        if (this.H1 != z10) {
            this.H1 = z10;
            o1.j jVar = this.I1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new hb.a(z10 ? 0.0f : 1000.0f));
            this.I1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.f19154i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f19147u = kVar;
            int i10 = 1;
            final boolean[] zArr = {this.f50511d2 || this.f50509c2};
            final float translationY = this.Y0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.I1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f10, float f11) {
                    l0 l0Var = this.f50701a;
                    j0 j0Var = l0Var.Y0;
                    float f12 = f10 / 1000.0f;
                    l0Var.J1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(l0Var.J1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(l0Var.J1, 0.25f) / 0.25f));
                    i0 i0Var = l0Var.C1;
                    float f14 = l0Var.J1;
                    boolean z11 = z10;
                    i0Var.y1(f14, z11);
                    l0Var.f50537x0.setProgress(l0Var.J1);
                    l0Var.f50535w0.setProgress(l0Var.J1);
                    l0Var.f50506b1.setTranslationY(AndroidUtilities.dp(32.0f) * l0Var.J1);
                    if (zArr[0]) {
                        float f15 = l0Var.J1;
                        if (!z11) {
                            f15 = 1.0f - f15;
                        }
                        j0Var.setTranslationY(translationY - ((AndroidUtilities.dp(40.0f) * f15) * (z11 ? 1 : -1)));
                    }
                    j0Var.invalidate();
                    if (view == l0Var.f50529q1) {
                        l0Var.Z0.invalidate();
                    }
                }
            });
            this.I1.a(new r(this, z10, i10));
            this.I1.f();
            if (z10) {
                i0 i0Var = this.C1;
                i0Var.setVisibility(0);
                i0Var.setSelectedColorIndex(yf.r0.e(this.L1).d());
            }
        }
    }

    @Override
    public final yf.r0 x() {
        return yf.r0.e(this.L1);
    }

    public final void x0(int i10) {
        o1 o1Var = this.f50529q1;
        int i11 = 0;
        int i12 = 1;
        if (i10 != 1) {
            mg emojiButton = o1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(kg.f30100e, true);
            }
            yy yyVar = this.f50507b2;
            if (yyVar != null) {
                this.f50509c2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    yyVar.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.f50515f2 = 0;
            }
            a4 a4Var = ((ys0) this).f44893k2.G1;
            if (a4Var != null) {
                a4Var.a();
            }
            requestLayout();
            getHeight();
            return;
        }
        yy yyVar2 = this.f50507b2;
        boolean z10 = yyVar2 != null && yyVar2.getVisibility() == 0;
        yy yyVar3 = this.f50507b2;
        if (yyVar3 != null && yyVar3.Y0 != UserConfig.selectedAccount) {
            removeView(yyVar3);
            this.f50507b2 = null;
        }
        if (this.f50507b2 == null) {
            yy yyVar4 = new yy(null, true, false, false, getContext(), false, null, null, true, this.M1, false, false);
            this.f50507b2 = yyVar4;
            yyVar4.Q0 = true;
            yyVar4.setVisibility(8);
            if (AndroidUtilities.isTablet()) {
                this.f50507b2.setForseMultiwindowLayout(true);
            }
            this.f50507b2.setDelegate(new a0(this));
            addView(this.f50507b2);
        }
        this.f50507b2.setVisibility(0);
        this.f50509c2 = true;
        yy yyVar5 = this.f50507b2;
        if (this.f50517g2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.f50517g2 = AndroidUtilities.dp(150.0f);
            } else {
                this.f50517g2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.f50519h2 <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.f50519h2 = AndroidUtilities.dp(150.0f);
            } else {
                this.f50519h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x > point.y ? this.f50519h2 : this.f50517g2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yyVar5.getLayoutParams();
        layoutParams.height = i13;
        yyVar5.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            j jVar = this.O0;
            if (jVar instanceof v2) {
                AndroidUtilities.hideKeyboard(((v2) jVar).getEditText());
            }
        }
        this.f50515f2 = i13;
        requestLayout();
        a4 a4Var2 = ((ys0) this).f44893k2.G1;
        if (a4Var2 != null) {
            a4Var2.a();
        }
        mg emojiButton2 = o1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(kg.d, true);
        }
        getHeight();
        if (z10 || this.f50511d2) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f50515f2, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new o(this, i12));
        valueAnimatorOfFloat.addListener(new z(this, i11));
        valueAnimatorOfFloat.start();
    }

    public final void y0(Runnable runnable, l0 l0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.n1 n1Var = this.N1;
        if (n1Var != null && n1Var.isShowing()) {
            this.N1.d(true);
            return;
        }
        if (this.O1 == null) {
            this.P1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.M1);
            this.O1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.O1.setBackgroundColor(-14145495);
            this.O1.setOnTouchListener(new w4(this, 1));
            this.O1.setDispatchKeyEventListener(new q(this));
            this.O1.setShownFromBottom(true);
        }
        this.O1.d();
        runnable.run();
        if (this.N1 == null) {
            org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(this.O1, -2, -2);
            this.N1 = n1Var2;
            n1Var2.f23682b = true;
            n1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.N1.setOutsideTouchable(true);
            this.N1.setClippingEnabled(true);
            this.N1.setInputMethodMode(2);
            this.N1.setSoftInputMode(0);
            this.N1.getContentView().setFocusableInTouchMode(true);
            this.N1.setOnDismissListener(new y4(this, 1));
        }
        this.O1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.N1.setFocusable(true);
        this.N1.showAtLocation(l0Var, i10, i11 - (this.O1.getMeasuredWidth() / 2), i12 - this.O1.getMeasuredHeight());
        org.telegram.ui.ActionBar.n1.i(this.O1);
    }

    public final void z0(boolean z10) {
        if (this.A1 != z10) {
            this.A1 = z10;
            o1.j jVar = this.B1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new hb.a(z10 ? 0.0f : 1000.0f));
            this.B1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.f19154i = z10 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f19147u = kVar;
            if (z10) {
                t1 t1Var = this.f50530r1;
                t1Var.setAlpha(0.0f);
                t1Var.setVisibility(0);
            }
            this.B1.b(new t7(3, this));
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
    public final void k() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void o(boolean z10) {
    }

    @Override
    public final void y() {
    }
}
