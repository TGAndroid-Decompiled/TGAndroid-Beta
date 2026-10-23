package rg;

import ai.xa;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
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
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.k8;
import ci.n3;
import com.google.android.gms.internal.play_billing.k3;
import ei.b4;
import ei.j5;
import ei.m5;
import ei.n5;
import ei.o4;
import ei.u4;
import ei.x4;
import ei.z4;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.jt0;
import org.telegram.ui.tq0;
import org.telegram.ui.wg1;
import w7.z5;
public abstract class m0 extends pw0 implements r1, h, n1, nw0, NotificationCenter.NotificationCenterDelegate {
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
    public final qg.v1 F0;
    public o1.k F1;
    public final DispatchQueue G0;
    public final j0 G1;
    public final MediaController.CropState H0;
    public final Paint H1;
    public float I0;
    public final Paint I1;
    public float J0;
    public final Paint J1;
    public float K0;
    public final qg.s1 K1;
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
    public final u Q1;
    public iw0 R0;
    public org.telegram.ui.ActionBar.m1 R1;
    public j S0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout S1;
    public boolean T0;
    public Rect T1;
    public int U0;
    public Runnable U1;
    public final boolean V0;
    public final qg.u0 V1;
    public final c0 W0;
    public boolean W1;
    public final e0 X0;
    public float X1;
    public final h0 Y0;
    public boolean Y1;
    public final g0 Z0;
    public final f6 Z1;
    public y11 f45883a1;
    public final Paint a2;
    public final FrameLayout f45884b1;
    public final Paint f45885b2;
    public final k0 f45886c1;
    public dh.d f45887c2;
    public final i0 f45888d1;
    public final float[] f45889d2;
    public final FrameLayout f45890e1;
    public final int[] f45891e2;
    public m5 f45892f1;
    public tz f45893f2;
    public int f45894g1;
    public boolean f45895g2;
    public int f45896h1;
    public boolean f45897h2;
    public float f45898i1;
    public boolean f45899i2;
    public ValueAnimator f45900j1;
    public int f45901j2;
    public boolean f45902k1;
    public int f45903k2;
    public final x1 l1;
    public int f45904l2;
    public final l2.f f45905m1;
    public int f45906m2;
    public ArrayList f45907n1;
    public boolean f45908n2;
    public final int f45909o1;
    public BigInteger f45910p1;
    public TextView f45911q1;
    public TextView f45912r1;
    public TextView f45913s1;
    public final s1 f45914t1;
    public final p1 f45915u1;
    public final u1 f45916v1;
    public final ImageView f45917w1;
    public final LinearLayout f45918x1;
    public final TextView f45919y1;
    public final TextView f45920z1;

    public m0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, tq0 tq0Var, final g6 g6Var) {
        super(context, activity);
        boolean z10;
        int i12;
        Emoji.EmojiSpan[] emojiSpanArr;
        z1 z1Var;
        boolean z11 = false;
        this.f45894g1 = 0;
        this.f45896h1 = -1;
        final jt0 jt0Var = (jt0) this;
        this.f45905m1 = new l2.f(jt0Var, 18);
        byte b10 = 1;
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.H1 = new Paint(1);
        this.I1 = new Paint(1);
        this.J1 = new Paint(1);
        qg.s1 s1Var = new qg.s1(1.0f, 0.016773745f, -1);
        this.K1 = s1Var;
        this.O1 = new Paint(1);
        this.Y1 = false;
        this.Z1 = new f6((View) this, 350L, bs.h);
        this.a2 = new Paint(1);
        Paint paint = new Paint(1);
        this.f45885b2 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        byte b11 = 2;
        this.f45889d2 = new float[2];
        this.f45891e2 = new int[2];
        new m4(jt0Var, 5);
        setDelegate(this);
        this.P1 = i10;
        this.Q1 = new g6() {
            @Override
            public final boolean a() {
                return k6.I.q();
            }

            @Override
            public final void b(float f7, float f10, int i13, int i14) {
                k6.q(f7, f10, i13, i14);
            }

            @Override
            public final ColorFilter c() {
                return k6.f21513v3;
            }

            @Override
            public final Paint d(String str) {
                return k6.U0(str);
            }

            @Override
            public final int e(int i13) {
                return g(i13);
            }

            @Override
            public final boolean f() {
                return false;
            }

            @Override
            public final int g(int i13) {
                if (i13 == k6.G8) {
                    return -14145495;
                }
                if (i13 != k6.E8) {
                    if (i13 == k6.f21254h5) {
                        return -14737633;
                    }
                    if (i13 == k6.f21289j5) {
                        return -592138;
                    }
                    if (i13 == k6.f21439r5) {
                        return -8553091;
                    }
                    if (i13 != k6.He) {
                        if (i13 == k6.Ke) {
                            return -1610612736;
                        }
                        if (i13 == k6.Ne || i13 == k6.Re || i13 == k6.Me) {
                            return -9539985;
                        }
                        if (i13 != k6.G6) {
                            int i14 = k6.Mh;
                            if (i13 == i14) {
                                return -11754001;
                            }
                            if (i13 == k6.f21272i6) {
                                return 536870911;
                            }
                            if (i13 != k6.Fh && i13 != k6.Eh && i13 != k6.Gh) {
                                if (i13 == k6.Hh) {
                                    return 352321535;
                                }
                                if (i13 != k6.Je && i13 != i14) {
                                    if (i13 == k6.Ie) {
                                        return 780633991;
                                    }
                                    if (i13 == k6.f21125a7) {
                                        return -15921907;
                                    }
                                    if (i13 == k6.f21347m7) {
                                        return -12500671;
                                    }
                                    if (i13 == k6.f21328l7) {
                                        return -13133079;
                                    }
                                    if (i13 == k6.f21367n7) {
                                        return -1;
                                    }
                                    if (i13 == k6.f21183d6) {
                                        return -15198183;
                                    }
                                    if (i13 == k6.f21184d7) {
                                        return -16777216;
                                    }
                                    g6 g6Var2 = g6.this;
                                    if (g6Var2 != null) {
                                        return g6Var2.g(i13);
                                    }
                                    return k6.x0(null, i13, false);
                                }
                                return -7895161;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    return -16777216;
                }
                return -1;
            }

            @Override
            public final Drawable getDrawable(String str) {
                return null;
            }

            @Override
            public final int i(int i13) {
                return g(i13);
            }

            @Override
            public final void h(int i13, int i14) {
            }
        };
        this.H0 = cropState;
        this.V0 = context instanceof BubbleActivity;
        qg.u0 e = qg.u0.e(i10);
        this.V1 = e;
        e.i(0, true);
        s1Var.f45066a = e.c();
        s1Var.f45068c = e.f45096i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.G0 = dispatchQueue;
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.f45909o1 = i11;
        qg.v1 v1Var = new qg.v1();
        this.F0 = v1Var;
        v1Var.f45105a = new qg.g0(jt0Var, 7);
        c0 c0Var = new c0(jt0Var, context, new qg.s0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.W0 = c0Var;
        c0Var.setDelegate(new d0(jt0Var, tq0Var));
        c0Var.setUndoStore(v1Var);
        c0Var.setQueue(dispatchQueue);
        c0Var.setVisibility(4);
        addView(c0Var, z5.e(-1, -1, 51));
        e0 e0Var = new e0(jt0Var, context);
        this.X0 = e0Var;
        e0Var.setVisibility(4);
        addView(e0Var, z5.e(-1, -1, 51));
        g0 g0Var = new g0(jt0Var, context, new f0(jt0Var));
        this.Z0 = g0Var;
        addView(g0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i13);
                byte b12 = mediaEntity.type;
                if (b12 == 0) {
                    ?? h02 = h0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & b11) != 0) {
                        h02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = h02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    z1Var = h02;
                } else if (b12 == b10) {
                    ?? i02 = i0(z11);
                    i02.setType(mediaEntity.subType);
                    i02.setTypeface(mediaEntity.textTypeface);
                    i02.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                    int size2 = arrayList2.size();
                    int i14 = z11;
                    while (i14 < size2) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i14);
                        int i15 = i14 + 1;
                        VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                        a6 a6Var = new a6(emojiEntity2.document_id, i02.getFontMetricsInt());
                        int i16 = emojiEntity2.offset;
                        spannableString.setSpan(a6Var, i16, emojiEntity2.length + i16, 33);
                        size = size;
                        size2 = size2;
                        i14 = i15;
                    }
                    i12 = size;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, i02.getFontMetricsInt(), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    i02.setText(replaceEmoji);
                    u0(i02, mediaEntity.textAlign);
                    qg.s1 swatch = i02.getSwatch();
                    swatch.f45066a = mediaEntity.color;
                    i02.setSwatch(swatch);
                    z1Var = i02;
                } else {
                    byte b13 = b11;
                    i12 = size;
                    if (b12 == b13) {
                        z1 g02 = g0(mediaEntity.text, false);
                        g02.B0 = false;
                        if ((mediaEntity.subType & b13) != 0) {
                            g02.r(false);
                        }
                        if ((mediaEntity.subType & 16) != 0) {
                            g02.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = g02.getLayoutParams();
                        layoutParams2.width = mediaEntity.viewWidth;
                        layoutParams2.height = mediaEntity.viewHeight;
                        z1Var = g02;
                    } else {
                        i13++;
                        size = i12;
                        z11 = false;
                        b11 = 2;
                        b10 = 1;
                    }
                }
                z1Var.setX((mediaEntity.f17885x * this.R0.f27465a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                z1Var.setY((mediaEntity.f17886y * this.R0.f27466b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                z1Var.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + z1Var.getX(), (mediaEntity.viewHeight / 2.0f) + z1Var.getY()));
                z1Var.setScale(mediaEntity.scale);
                z1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i13++;
                size = i12;
                z11 = false;
                b11 = 2;
                b10 = 1;
            }
        }
        this.Z0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.Y0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.f45884b1 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, z5.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f45917w1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(k6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        jt0 jt0Var2 = jt0Var;
                        c0 c0Var2 = jt0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof qg.l)) {
                            c0Var2.b();
                            jt0Var2.f45914t1.setSelectedIndex(1);
                            jt0Var2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        jt0Var2.F0.c();
                        return;
                    case 1:
                        jt0 jt0Var3 = jt0Var;
                        c0 c0Var3 = jt0Var3.W0;
                        qg.v1 v1Var2 = jt0Var3.F0;
                        if (v1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof qg.l)) {
                                c0Var3.b();
                                jt0Var3.f45914t1.setSelectedIndex(1);
                                jt0Var3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            c0Var3.a();
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            jt0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        jt0 jt0Var4 = jt0Var;
                        j jVar = jt0Var4.S0;
                        if (jVar instanceof w2) {
                            AndroidUtilities.hideKeyboard(((w2) jVar).getFocusedView());
                        }
                        if (jt0Var4.f45895g2) {
                            jt0Var4.l0(false);
                        }
                        jt0Var4.q0(jt0Var4.S0);
                        jt0Var4.r0(null, true);
                        return;
                    default:
                        jt0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, z5.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f45918x1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(k6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        sl.k(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, z5.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, z5.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ah.f(25));
        frameLayout2.addView(linearLayout, z5.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f45919y1 = textView2;
        textView2.setBackground(k6.g0(822083583, 7, -1));
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
                        jt0 jt0Var2 = jt0Var;
                        c0 c0Var2 = jt0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof qg.l)) {
                            c0Var2.b();
                            jt0Var2.f45914t1.setSelectedIndex(1);
                            jt0Var2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        jt0Var2.F0.c();
                        return;
                    case 1:
                        jt0 jt0Var3 = jt0Var;
                        c0 c0Var3 = jt0Var3.W0;
                        qg.v1 v1Var2 = jt0Var3.F0;
                        if (v1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof qg.l)) {
                                c0Var3.b();
                                jt0Var3.f45914t1.setSelectedIndex(1);
                                jt0Var3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            c0Var3.a();
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            jt0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        jt0 jt0Var4 = jt0Var;
                        j jVar = jt0Var4.S0;
                        if (jVar instanceof w2) {
                            AndroidUtilities.hideKeyboard(((w2) jVar).getFocusedView());
                        }
                        if (jt0Var4.f45895g2) {
                            jt0Var4.l0(false);
                        }
                        jt0Var4.q0(jt0Var4.S0);
                        jt0Var4.r0(null, true);
                        return;
                    default:
                        jt0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout2, textView2, z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f45920z1 = j10;
        j10.setBackground(k6.g0(822083583, 7, -1));
        j10.setPadding(org.telegram.ui.Cells.b1.e(8.0f, R.string.Clear, j10), 0, AndroidUtilities.dp(8.0f), 0);
        j10.setGravity(16);
        j10.setTextColor(-1);
        j10.setTypeface(AndroidUtilities.bold());
        j10.setTextSize(1, 16.0f);
        j10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        jt0 jt0Var2 = jt0Var;
                        c0 c0Var2 = jt0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof qg.l)) {
                            c0Var2.b();
                            jt0Var2.f45914t1.setSelectedIndex(1);
                            jt0Var2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        jt0Var2.F0.c();
                        return;
                    case 1:
                        jt0 jt0Var3 = jt0Var;
                        c0 c0Var3 = jt0Var3.W0;
                        qg.v1 v1Var2 = jt0Var3.F0;
                        if (v1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof qg.l)) {
                                c0Var3.b();
                                jt0Var3.f45914t1.setSelectedIndex(1);
                                jt0Var3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            c0Var3.a();
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            jt0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        jt0 jt0Var4 = jt0Var;
                        j jVar = jt0Var4.S0;
                        if (jVar instanceof w2) {
                            AndroidUtilities.hideKeyboard(((w2) jVar).getFocusedView());
                        }
                        if (jt0Var4.f45895g2) {
                            jt0Var4.l0(false);
                        }
                        jt0Var4.q0(jt0Var4.S0);
                        jt0Var4.r0(null, true);
                        return;
                    default:
                        jt0Var.r0(null, true);
                        return;
                }
            }
        });
        j10.setAlpha(0.0f);
        j10.setVisibility(8);
        TextView j11 = org.telegram.ui.Cells.b1.j(frameLayout2, j10, z5.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.A1 = j11;
        j11.setBackground(k6.g0(822083583, 7, -1));
        j11.setPadding(org.telegram.ui.Cells.b1.e(8.0f, R.string.Done, j11), 0, AndroidUtilities.dp(8.0f), 0);
        j11.setGravity(16);
        j11.setTextColor(-1);
        j11.setTypeface(AndroidUtilities.bold());
        j11.setTextSize(1, 16.0f);
        j11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        jt0 jt0Var2 = jt0Var;
                        c0 c0Var2 = jt0Var2.W0;
                        if (c0Var2 != null && (c0Var2.getCurrentBrush() instanceof qg.l)) {
                            c0Var2.b();
                            jt0Var2.f45914t1.setSelectedIndex(1);
                            jt0Var2.n((qg.m) qg.m.f44984a.get(0));
                            return;
                        }
                        jt0Var2.F0.c();
                        return;
                    case 1:
                        jt0 jt0Var3 = jt0Var;
                        c0 c0Var3 = jt0Var3.W0;
                        qg.v1 v1Var2 = jt0Var3.F0;
                        if (v1Var2.a()) {
                            if (c0Var3 != null && (c0Var3.getCurrentBrush() instanceof qg.l)) {
                                c0Var3.b();
                                jt0Var3.f45914t1.setSelectedIndex(1);
                                jt0Var3.n((qg.m) qg.m.f44984a.get(0));
                            }
                            c0Var3.a();
                            v1Var2.f45107c.clear();
                            v1Var2.f45106b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var2, 7));
                            jt0Var3.Z0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        jt0 jt0Var4 = jt0Var;
                        j jVar = jt0Var4.S0;
                        if (jVar instanceof w2) {
                            AndroidUtilities.hideKeyboard(((w2) jVar).getFocusedView());
                        }
                        if (jt0Var4.f45895g2) {
                            jt0Var4.l0(false);
                        }
                        jt0Var4.q0(jt0Var4.S0);
                        jt0Var4.r0(null, true);
                        return;
                    default:
                        jt0Var.r0(null, true);
                        return;
                }
            }
        });
        j11.setAlpha(0.0f);
        j11.setVisibility(8);
        frameLayout2.addView(j11, z5.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        k0 k0Var = new k0(jt0Var, context);
        this.f45886c1 = k0Var;
        k0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        k0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(k0Var, z5.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        s1 s1Var2 = new s1(context, z10);
        this.f45914t1 = s1Var2;
        s1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s1Var2.setDelegate(this);
        s1Var2.setSelectedIndex(1);
        k0Var.addView(s1Var2, z5.c(48.0f, -1));
        p1 p1Var = new p1(context);
        this.f45915u1 = p1Var;
        p1Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        p1Var.setVisibility(8);
        p1Var.setDelegate(this);
        p1Var.setAlignment(qg.u0.e(i10).f45095g);
        k0Var.addView(p1Var, z5.c(48.0f, -1));
        i0 i0Var = new i0(jt0Var, context);
        this.f45888d1 = i0Var;
        addView(i0Var, z5.c(-1.0f, -1));
        u1 u1Var = new u1(context);
        this.f45916v1 = u1Var;
        u1Var.setVisibility(8);
        u1Var.setOnItemClickListener(new xa(jt0Var, 18));
        p1Var.setTypefaceListView(u1Var);
        i0Var.addView(u1Var, z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.B1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.B1.setColor(1728053247);
        this.B1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.C1.setColor(k6.w0(k6.G8, this.Q1));
        j0 j0Var = new j0(jt0Var, context);
        this.G1 = j0Var;
        j0Var.setVisibility(8);
        j0Var.setColorPalette(qg.u0.e(i10));
        j0Var.setColorListener(new m(jt0Var, 0));
        k0Var.addView(j0Var, z5.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        g1 g1Var = new g1(context);
        this.A0 = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        g1Var.setBackground(k6.g0(1090519039, 1, -1));
        k0Var.addView(g1Var, z5.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        k1 k1Var = new k1(context);
        this.B0 = k1Var;
        k1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        k1Var.setBackground(k6.g0(1090519039, 1, -1));
        k1Var.setOnClickListener(new t41(jt0Var, context, bitmap2, 2));
        k0Var.addView(k1Var, z5.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        x1 x1Var = new x1(context);
        this.l1 = x1Var;
        x1Var.setColorSwatch(this.K1);
        x1Var.setRenderView(this.W0);
        x1Var.setValueOverride(this.f45905m1);
        this.K1.f45068c = this.f45905m1.get();
        x1Var.setOnUpdate(new wg1(jt0Var, i10, 9));
        addView(x1Var, z5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f45890e1 = frameLayout3;
        addView(frameLayout3, z5.c(-1.0f, -1));
        this.J1.setStyle(style);
        this.J1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.K1, null);
        n((qg.m) qg.m.f44984a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Y(jt0 jt0Var, Integer num) {
        jt0Var.setNewColor(num.intValue());
        jt0Var.w0(false);
    }

    public static void Z(rg.m0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: rg.m0.Z(rg.m0):void");
    }

    public static void a0(m0 m0Var) {
        p2 p2Var;
        g0 g0Var = m0Var.Z0;
        j jVar = m0Var.S0;
        if (jVar != null) {
            PointF A0 = m0Var.A0(jVar);
            j jVar2 = m0Var.S0;
            if (jVar2 instanceof p2) {
                p2 p2Var2 = new p2(m0Var.getContext(), (p2) m0Var.S0, A0);
                p2Var2.setDelegate(m0Var);
                g0Var.addView(p2Var2);
                p2Var = p2Var2;
            } else if (jVar2 instanceof w2) {
                w2 w2Var = new w2(m0Var.getContext(), (w2) m0Var.S0, A0);
                w2Var.setDelegate(m0Var);
                w2Var.setMaxWidth((int) (m0Var.getPaintingSize().f27465a - 20.0f));
                g0Var.addView(w2Var, z5.c(-2.0f, -2));
                p2Var = w2Var;
            } else {
                p2Var = null;
            }
            m0Var.p0(p2Var);
            m0Var.r0(p2Var, true);
        }
        org.telegram.ui.ActionBar.m1 m1Var = m0Var.R1;
        if (m1Var != null && m1Var.isShowing()) {
            m0Var.R1.d(true);
        }
    }

    public static void b0(jt0 jt0Var, Integer num) {
        qg.u0 u0Var = jt0Var.V1;
        u0Var.h(num.intValue(), true);
        u0Var.g();
        jt0Var.setNewColor(num.intValue());
        j0 j0Var = jt0Var.G1;
        j0Var.setSelectedColorIndex(u0Var.d());
        j0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f45894g1 == 2) {
            return this.f45915u1;
        }
        return this.f45914t1;
    }

    private int getFrameRotation() {
        int i10 = this.f45909o1;
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

    private iw0 getPaintingSize() {
        int i10;
        iw0 iw0Var = this.R0;
        if (iw0Var != null) {
            return iw0Var;
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
        iw0 iw0Var2 = new iw0(width, height);
        float f7 = i10;
        iw0Var2.f27465a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        iw0Var2.f27466b = floor;
        if (floor > f7) {
            iw0Var2.f27466b = f7;
            iw0Var2.f27465a = (float) Math.floor((f7 * width) / height);
        }
        this.R0 = iw0Var2;
        return iw0Var2;
    }

    public void setNewColor(int i10) {
        qg.s1 s1Var = this.K1;
        int i11 = s1Var.f45066a;
        s1Var.f45066a = i10;
        s0(s1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new u4(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.U0 = i10;
        j jVar = this.S0;
        if (jVar instanceof w2) {
            ((w2) jVar).setType(i10);
        }
        qg.u0 e = qg.u0.e(this.P1);
        e.h = i10;
        e.f45091a.edit().putInt("text_type", i10).apply();
        this.f45915u1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        m5 m5Var = new m5(this, context);
        this.f45892f1 = m5Var;
        m5Var.setClipToPadding(false);
        this.f45892f1.setOrientation(0);
        this.f45886c1.addView(this.f45892f1, z5.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f45911q1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f45911q1;
        int i10 = k6.f21272i6;
        u uVar = this.Q1;
        r6.S(textView2, k6.g0(k6.w0(i10, uVar), 7, -1), null, r6.O(i10), uVar);
        this.f45911q1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f45911q1.setTextColor(-1);
        this.f45911q1.setTextSize(1, 14.0f);
        this.f45911q1.setGravity(1);
        this.f45911q1.setTypeface(AndroidUtilities.bold());
        this.f45911q1.setSingleLine();
        this.f45911q1.setOnClickListener(new k(this, 0));
        this.f45892f1.addView(this.f45911q1, z5.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f45912r1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        r6.S(this.f45912r1, k6.g0(k6.w0(i10, uVar), 7, -1), null, r6.O(i10), uVar);
        this.f45912r1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f45912r1.setOnClickListener(new k(this, 1));
        this.f45912r1.setTextColor(-1);
        this.f45912r1.setTextSize(1, 14.0f);
        this.f45912r1.setGravity(1);
        this.f45912r1.setTypeface(AndroidUtilities.bold());
        this.f45912r1.setAlpha(0.6f);
        this.f45912r1.setSingleLine();
        this.f45892f1.addView(this.f45912r1, z5.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f45913s1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        r6.S(this.f45913s1, k6.g0(k6.w0(i10, uVar), 7, -1), null, r6.O(i10), uVar);
        this.f45913s1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f45913s1.setTextColor(-1);
        this.f45913s1.setTextSize(1, 14.0f);
        this.f45913s1.setGravity(1);
        this.f45913s1.setTypeface(AndroidUtilities.bold());
        this.f45913s1.setAlpha(0.6f);
        this.f45913s1.setSingleLine();
        this.f45913s1.setOnClickListener(new k(this, 4));
        this.f45892f1.addView(this.f45913s1, z5.l(1.0f, 0, -2));
    }

    public static void u0(w2 w2Var, int i10) {
        int i11;
        w2Var.setAlign(i10);
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
        w2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        w2Var.getEditText().setTextAlignment(i12);
    }

    public final PointF A0(j jVar) {
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
        PointF f02 = f0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                g0 g0Var = this.Z0;
                if (i10 >= g0Var.getChildCount()) {
                    break;
                }
                View childAt = g0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - f02.y, 2.0d) + Math.pow(position2.x - f02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return f02;
            }
            f02 = new PointF(f02.x + f7, f02.y + f7);
        }
    }

    public final void B0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.f45894g1 != i10 && this.f45896h1 != i10) {
            ValueAnimator valueAnimator = this.f45900j1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f45894g1;
            ViewGroup viewGroup3 = this.f45915u1;
            ViewGroup viewGroup4 = this.f45914t1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f45896h1 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.P1;
            qg.u0 e = qg.u0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f45099l != z10) {
                e.f45099l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f45091a.getInt("brush", 0), false);
                }
            }
            int c10 = qg.u0.e(i12).c();
            qg.s1 s1Var = this.K1;
            s1Var.f45066a = c10;
            s0(s1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f45900j1 = duration;
            duration.setInterpolator(bs.f25133f);
            this.f45900j1.addUpdateListener(new n3(this, viewGroup, viewGroup2, 4));
            this.f45900j1.addListener(new n5(this, viewGroup, viewGroup2, i10, 2));
            this.f45900j1.start();
        }
    }

    @Override
    public final void C() {
        z0(true);
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            g0 g0Var = this.Z0;
            if (i10 < g0Var.getChildCount()) {
                View childAt = g0Var.getChildAt(i10);
                if (childAt != this.S0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f45820l0 && jVar.f45818j0 <= 0.0f) {
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
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f45897h2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f45904l2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f45904l2).commit();
            } else {
                this.f45903k2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f45903k2).commit();
            }
        }
        if (this.f45895g2) {
            if (z10) {
                i11 = this.f45904l2;
            } else {
                i11 = this.f45903k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f45893f2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f45893f2.setLayoutParams(layoutParams);
                this.f45901j2 = layoutParams.height;
                requestLayout();
                b4 b4Var = ((jt0) this).f38700o2.K1;
                if (b4Var != null) {
                    b4Var.a();
                }
                getHeight();
            }
        }
        if (this.f45906m2 == i10 && this.f45908n2 == z10) {
            getHeight();
            return;
        }
        this.f45906m2 = i10;
        this.f45908n2 = z10;
        boolean z13 = this.f45897h2;
        j jVar = this.S0;
        if (jVar instanceof w2) {
            if (((w2) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f45897h2 = z12;
        } else {
            this.f45897h2 = false;
        }
        if (this.f45897h2 && this.f45895g2) {
            x0(0);
        }
        if (this.f45901j2 != 0 && !(z11 = this.f45897h2) && z11 != z13 && !this.f45895g2) {
            this.f45901j2 = 0;
            requestLayout();
            b4 b4Var2 = ((jt0) this).f38700o2.K1;
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
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G8));
        hashSet.add(Integer.valueOf(k6.f21254h5));
        hashSet.add(Integer.valueOf(k6.f21289j5));
        hashSet.add(Integer.valueOf(k6.f21439r5));
        hashSet.add(Integer.valueOf(k6.He));
        hashSet.add(Integer.valueOf(k6.Ke));
        hashSet.add(Integer.valueOf(k6.Ne));
        hashSet.add(Integer.valueOf(k6.Re));
        hashSet.add(Integer.valueOf(k6.Me));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.Mh));
        hashSet.add(Integer.valueOf(k6.Fh));
        hashSet.add(Integer.valueOf(k6.Eh));
        hashSet.add(Integer.valueOf(k6.Gh));
        hashSet.add(Integer.valueOf(k6.Hh));
        hashSet.add(Integer.valueOf(k6.Je));
        hashSet.add(Integer.valueOf(k6.Ie));
        hashSet.add(Integer.valueOf(k6.f21125a7));
        hashSet.add(Integer.valueOf(k6.f21347m7));
        hashSet.add(Integer.valueOf(k6.f21328l7));
        hashSet.add(Integer.valueOf(k6.f21367n7));
        hashSet.add(Integer.valueOf(k6.f21183d6));
        hashSet.add(Integer.valueOf(k6.f21184d7));
    }

    @Override
    public final void c() {
        setTextType((this.U0 + 1) % 4);
    }

    @Override
    public final void d(int i10) {
        j jVar = this.S0;
        if (jVar instanceof w2) {
            u0((w2) jVar, i10);
            qg.u0 e = qg.u0.e(this.P1);
            e.f45095g = i10;
            e.f45091a.edit().putInt("text_alignment", i10).apply();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g0 g0Var;
        w2 w2Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (g0Var = this.Z0) != null) {
            for (int i12 = 0; i12 < g0Var.getChildCount(); i12++) {
                View childAt = g0Var.getChildAt(i12);
                if ((childAt instanceof w2) && (str = (w2Var = (w2) childAt).A0) != null) {
                    w2Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: rg.m0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new p2.b(12, this, (z1) view)).start();
    }

    public final PointF f0() {
        MediaController.CropState cropState;
        iw0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f27465a / 2.0f;
        float f10 = paintingSize.f27466b / 2.0f;
        if (this.H0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float f11 = (float) i2.o1.f(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f7 -= cos * paintingSize.f27465a;
            f10 -= f11 * paintingSize.f27466b;
        }
        return new PointF(f7, f10);
    }

    @Override
    public final void g(j jVar) {
        int[] j02 = j0(jVar);
        y0(new s(this, jVar, 1), this, 51, j02[0], j02[1] - AndroidUtilities.dp(32.0f));
    }

    public final z1 g0(String str, boolean z10) {
        float f7;
        iw0 iw0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f7 = 1.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        g0 g0Var = this.Z0;
        if (i10 > 0) {
            float floor = (float) Math.floor(g0Var.getMeasuredWidth() * 0.5d);
            iw0Var = new iw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(g0Var.getMeasuredHeight() * 0.5d);
            iw0Var = new iw0(f7 * floor2, floor2);
        }
        iw0 iw0Var2 = iw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = iw0Var2.f27465a;
            iw0Var2.f27465a = iw0Var2.f27466b;
            iw0Var2.f27466b = f10;
        }
        Context context = getContext();
        PointF f02 = f0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        z1 z1Var = new z1(context, f02, iw0Var2, str, intValue);
        z1Var.setDelegate(this);
        g0Var.addView(z1Var);
        if (z10) {
            p0(z1Var);
            r0(z1Var, true);
        }
        return z1Var;
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
        return this.f45910p1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        a6[] a6VarArr;
        g0 g0Var = this.Z0;
        int childCount = g0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = g0Var.getChildAt(i10);
            if (childAt instanceof p2) {
                TLRPC.Document sticker = ((p2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f20355id = sticker.f20349id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof w2) {
                CharSequence text = ((w2) childAt).getText();
                if ((text instanceof Spanned) && (a6VarArr = (a6[]) ((Spanned) text).getSpans(0, text.length(), a6.class)) != null) {
                    for (a6 a6Var : a6VarArr) {
                        if (a6Var != null) {
                            TLRPC.Document document = a6Var.document;
                            if (document == null) {
                                document = r5.f(this.P1, a6Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f20355id = document.f20349id;
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

    public qg.e1 getRenderView() {
        return this.W0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.S0;
        g0 g0Var = this.Z0;
        if (jVar == null) {
            return getY() + g0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (g0Var.getScaleY() * this.S0.getHeight()) + iArr[1];
    }

    public y11 getThanosEffect() {
        if (!y11.c()) {
            return null;
        }
        if (this.f45883a1 == null) {
            y11 y11Var = new y11(getContext(), new n(this, 0));
            this.f45883a1 = y11Var;
            addView(y11Var);
        }
        return this.f45883a1;
    }

    public final rg.z h0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: rg.m0.h0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):rg.z");
    }

    public final w2 i0(boolean z10) {
        ((jt0) this).f38700o2.f33597g0.isFocusable();
        iw0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        w2 w2Var = new w2(getContext(), A0, (int) (paintingSize.f27465a / 9.0f), "", this.K1, this.U0);
        float f7 = paintingSize.f27465a / 9.0f;
        n nVar = new n(this, 2);
        w2Var.f46117w0 = (int) (0.5f * f7);
        w2Var.f46118x0 = (int) (f7 * 2.0f);
        w2Var.f46119y0 = nVar;
        float f10 = A0.x;
        g0 g0Var = this.Z0;
        if (f10 == g0Var.getMeasuredWidth() / 2.0f) {
            w2Var.setStickyX(2);
        }
        if (A0.y == g0Var.getMeasuredHeight() / 2.0f) {
            w2Var.setStickyY(2);
        }
        w2Var.setDelegate(this);
        w2Var.setMaxWidth((int) (paintingSize.f27465a - 20.0f));
        int i10 = this.P1;
        w2Var.setTypeface(qg.u0.e(i10).f45097j);
        w2Var.setType(qg.u0.e(i10).h);
        g0Var.addView(w2Var, z5.c(-2.0f, -2));
        MediaController.CropState cropState = this.H0;
        if (cropState != null) {
            w2Var.j(1.0f / cropState.cropScale);
            w2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(w2Var);
            w2Var.q();
            r0(w2Var, false);
            w2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(w2Var.getFocusedView());
            this.T0 = true;
            int i11 = qg.u0.e(i10).f45095g;
            p1 p1Var = this.f45915u1;
            p1Var.d(i11, true);
            p1Var.setOutlineType(qg.u0.e(i10).h);
        }
        return w2Var;
    }

    public final int[] j0(j jVar) {
        float[] fArr = this.f45889d2;
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
        int[] iArr = this.f45891e2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f7 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f7;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) i2.o1.f(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean k(MotionEvent motionEvent) {
        if (this.S0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        c0 c0Var = this.W0;
        float translationX = ((x10 - c0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / c0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - c0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / c0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-c0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (c0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (c0Var.getMeasuredHeight() / 2.0f) + ((float) i2.o1.f(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int k0(boolean z10) {
        return this.f45901j2;
    }

    public final void l0(boolean z10) {
        if (this.f45895g2) {
            x0(0);
        }
        if (z10) {
            tz tzVar = this.f45893f2;
            if (tzVar != null && tzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f45893f2.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.f45899i2 = true;
                ofFloat.addListener(new a0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.f21717w);
                ofFloat.start();
                return;
            }
            m0();
        }
    }

    public final void m0() {
        tz tzVar;
        b4 b4Var;
        if (this.f45901j2 > 0 && (b4Var = ((jt0) this).f38700o2.K1) != null) {
            b4Var.a();
        }
        if (!this.f45895g2 && (tzVar = this.f45893f2) != null && tzVar.getVisibility() != 8) {
            this.f45893f2.setVisibility(8);
        }
        this.f45901j2 = 0;
    }

    @Override
    public final void n(qg.m mVar) {
        boolean z10 = mVar instanceof qg.b;
        x1 x1Var = this.l1;
        if (!z10 && !(mVar instanceof qg.d)) {
            x1Var.b(0.05f, 1.0f);
        } else {
            x1Var.b(0.4f, 1.75f);
        }
        x1Var.setDrawCenter(!(mVar instanceof qg.l));
        c0 c0Var = this.W0;
        if (c0Var.getCurrentBrush() instanceof qg.l) {
            this.f45902k1 = true;
        }
        c0Var.setBrush(mVar);
        qg.s1 s1Var = this.K1;
        int i10 = s1Var.f45066a;
        s1Var.f45066a = qg.u0.e(this.P1).c();
        s1Var.f45068c = this.f45905m1.get();
        s0(s1Var, Integer.valueOf(i10));
        this.X0.invalidate();
    }

    public final void n0(boolean z10) {
        int i10;
        int i11;
        if (this.f45894g1 == 0) {
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
            this.f45886c1.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.f45884b1.setLayerType(i12, null);
        }
    }

    public final boolean o0() {
        if (this.L1) {
            w0(false);
            return true;
        } else if (this.f45895g2) {
            l0(true);
            return true;
        } else if (!this.T0) {
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int Q;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        if (this.f45893f2 != null) {
            if (AndroidUtilities.isTablet()) {
                Q = i15 - this.f45893f2.getMeasuredHeight();
            } else {
                Q = (Q() + i15) - this.f45893f2.getMeasuredHeight();
            }
            tz tzVar = this.f45893f2;
            tzVar.layout(0, Q, tzVar.getMeasuredWidth(), this.f45893f2.getMeasuredHeight() + Q);
        }
        if (!this.V0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        c0 c0Var = this.W0;
        int ceil = (int) Math.ceil((i14 - c0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.v0.C(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - c0Var.getMeasuredHeight()) / 2, i16);
        c0Var.layout(ceil, additionalTop, c0Var.getMeasuredWidth() + ceil, c0Var.getMeasuredHeight() + additionalTop);
        e0 e0Var = this.X0;
        e0Var.layout(ceil, additionalTop, e0Var.getMeasuredWidth() + ceil, e0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = c0Var.getMeasuredWidth();
        g0 g0Var = this.Z0;
        int measuredWidth2 = ((measuredWidth - g0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((c0Var.getMeasuredHeight() - g0Var.getMeasuredHeight()) / 2) + additionalTop;
        g0Var.layout(measuredWidth2, measuredHeight, g0Var.getMeasuredWidth() + measuredWidth2, g0Var.getMeasuredHeight() + measuredHeight);
        y11 y11Var = this.f45883a1;
        if (y11Var != null) {
            y11Var.layout(measuredWidth2, measuredHeight, g0Var.getMeasuredWidth() + measuredWidth2, g0Var.getMeasuredHeight() + measuredHeight);
        }
        h0 h0Var = this.Y0;
        h0Var.layout(ceil, additionalTop, h0Var.getMeasuredWidth() + ceil, h0Var.getMeasuredHeight() + additionalTop);
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
        float f12 = f10 / this.R0.f27465a;
        this.Q0 = f12;
        g0 g0Var = this.Z0;
        g0Var.setScaleX(f12);
        g0Var.setScaleY(this.Q0);
        g0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f27465a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f27466b, 1073741824));
        y11 y11Var = this.f45883a1;
        if (y11Var != null) {
            y11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.R0.f27465a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.R0.f27466b, 1073741824));
            this.f45883a1.setScaleX(this.Q0);
            this.f45883a1.setScaleY(this.Q0);
        }
        C0();
        this.Y0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.f45886c1, i10, i11);
        measureChild(this.l1, i10, i11);
        measureChild(this.f45890e1, i10, i11);
        measureChild(this.f45888d1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f45901j2), 1073741824));
        FrameLayout frameLayout = this.f45884b1;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.P0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f45895g2 && !this.f45899i2) {
            this.P0 = true;
            m0();
            this.P0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        tz tzVar = this.f45893f2;
        if (tzVar != null) {
            measureChild(tzVar, i10, i11);
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.F0.b(jVar.getUUID(), new s(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return !this.T0;
    }

    public final void q0(j jVar) {
        j jVar2 = this.S0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.S0 = null;
            if (jVar instanceof w2) {
                ValueAnimator valueAnimator = this.f45900j1;
                if (valueAnimator != null && this.f45896h1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.Z0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            qg.v1 v1Var = this.F0;
            v1Var.f45106b.remove(uuid);
            v1Var.f45107c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(v1Var, 7));
        }
        x1 x1Var = this.l1;
        l2.f fVar = this.f45905m1;
        x1Var.setValueOverride(fVar);
        x1Var.setShowPreview(true);
        float f7 = fVar.get();
        qg.s1 s1Var = this.K1;
        s1Var.f45068c = f7;
        s0(s1Var, null);
    }

    public final boolean r0(j jVar, boolean z10) {
        m0 m0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof w2;
        int i11 = 2;
        if (z12 && (((i10 = this.f45896h1) == -1 && this.f45894g1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f45900j1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.L1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            w2 w2Var = (w2) jVar;
            int gravity = w2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            p1 p1Var = this.f45915u1;
            p1Var.setAlignment(i11);
            p1Var.setTypeface(w2Var.getTypeface().f44978a);
            p1Var.e(w2Var.getType(), true);
            this.f45888d1.invalidate();
        }
        j jVar2 = this.S0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.T0) {
                    int[] j02 = j0(jVar2);
                    y0(new s(this, jVar2, 1), this, 51, j02[0], j02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof w2) {
                    AndroidUtilities.showKeyboard(((w2) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            m0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = m0Var.S0;
            if (jVar3 instanceof w2) {
                w2 w2Var2 = (w2) jVar3;
                v2 v2Var = w2Var2.f46111q0;
                v2Var.clearFocus();
                v2Var.setEnabled(false);
                v2Var.setClickable(false);
                w2Var2.m();
                if (!z12) {
                    m0Var.T0 = false;
                    AndroidUtilities.hideKeyboard(((w2) m0Var.S0).getFocusedView());
                    l0(false);
                }
            }
            z11 = true;
        } else {
            m0Var = this;
            z11 = false;
        }
        j jVar4 = m0Var.S0;
        m0Var.S0 = jVar;
        if ((jVar4 instanceof w2) && TextUtils.isEmpty(((w2) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = m0Var.S0;
        l2.f fVar = m0Var.f45905m1;
        qg.s1 s1Var = m0Var.K1;
        x1 x1Var = m0Var.l1;
        if (jVar5 != null) {
            h0 h0Var = m0Var.Y0;
            jVar5.m0 = h0Var;
            jVar5.l(h0Var, true);
            m0Var.Z0.bringChildToFront(m0Var.S0);
            j jVar6 = m0Var.S0;
            if (jVar6 instanceof w2) {
                w2 w2Var3 = (w2) jVar6;
                w2Var3.f46120z0 = false;
                w2Var3.getSwatch().f45068c = s1Var.f45068c;
                s0(w2Var3.getSwatch(), null);
                x1Var.setValueOverride(new j5(w2Var3, (int) (m0Var.R0.f27465a / 9.0f), 1));
                x1Var.setShowPreview(false);
                return true;
            }
            x1Var.setValueOverride(fVar);
            x1Var.setShowPreview(true);
            s1Var.f45068c = fVar.get();
            s0(s1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = m0Var.f45900j1;
        if (valueAnimator2 != null && m0Var.f45896h1 != 0) {
            valueAnimator2.cancel();
        }
        if (m0Var.L1) {
            w0(false);
        }
        B0(0);
        x1Var.setValueOverride(fVar);
        x1Var.setShowPreview(true);
        s1Var.f45068c = fVar.get();
        s0(s1Var, null);
        return z11;
    }

    @Override
    public final void requestLayout() {
        if (this.P0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        b4 b4Var;
        if (!this.f45897h2 && !this.f45895g2) {
            i0(true);
            return;
        }
        boolean z10 = this.f45895g2;
        if (z10 && (b4Var = ((jt0) this).f38700o2.K1) != null) {
            b4Var.e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.S0;
            if (jVar instanceof w2) {
                AndroidUtilities.showKeyboard(((w2) jVar).getEditText());
            }
        }
    }

    public final void s0(qg.s1 s1Var, Integer num) {
        qg.s1 s1Var2 = this.K1;
        if (s1Var2 != s1Var) {
            s1Var2.f45066a = s1Var.f45066a;
            s1Var2.f45067b = s1Var.f45067b;
            s1Var2.f45068c = s1Var.f45068c;
            int i10 = this.P1;
            qg.u0.e(i10).h(s1Var.f45066a, true);
            qg.u0.e(i10).j(s1Var.f45068c);
        }
        int i11 = s1Var.f45066a;
        c0 c0Var = this.W0;
        c0Var.setColor(i11);
        c0Var.setBrushSize(s1Var.f45068c);
        int i12 = s1Var2.f45066a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new o4(this, num, i12, 2));
            duration.start();
        } else {
            k0 k0Var = this.f45886c1;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        }
        j jVar = this.S0;
        if (jVar instanceof w2) {
            ((w2) jVar).setSwatch(new qg.s1(s1Var.f45067b, s1Var.f45068c, s1Var.f45066a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(dh.d dVar) {
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f45887c2 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.W1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.f45894g1 == 0) {
            this.l1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.U1 = runnable;
    }

    @Override
    public final void t(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.Z0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) i2.o1.f(radians, d10, Math.sin(radians) * d));
    }

    public final void t0(float f7) {
        this.C0 = f7;
        this.f45884b1.setTranslationY(-f7);
        this.f45886c1.setTranslationY(f7);
    }

    @Override
    public final boolean u(j jVar) {
        return r0(jVar, true);
    }

    @Override
    public final void updateColors() {
        this.O1.setColor(-15132391);
    }

    @Override
    public final int[] v(j jVar) {
        return j0(jVar);
    }

    public final void v0(float f7, float f10, float f11, float f12, float f13) {
        View view;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        this.I0 = f7;
        this.N0 = f12;
        this.O0 = f13;
        this.J0 = f10;
        this.K0 = f11;
        this.L0 = f10;
        float f21 = f11 + 0.0f;
        this.M0 = f21;
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
                float f22 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i11 = cropState.transformRotation;
                    if (i11 == 90 || i11 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f12 / ((int) (cropState.cropPw * f19)), f13 / ((int) (cropState.cropPh * f20)));
                    f15 = f22 * max;
                    float C = k3.C(cropState.cropPx, measuredWidth, f7, max);
                    float f23 = cropState.cropScale;
                    f16 = (C * f23) + f10;
                    f14 = 1.0f;
                    f17 = (cropState.cropPy * measuredHeight * f7 * max * f23) + f21;
                    f18 = cropState.cropRotate + i11;
                } else {
                    return;
                }
            } else {
                f14 = 1.0f;
                if (i10 == 0) {
                    f15 = this.Q0 * 1.0f;
                } else {
                    f15 = 1.0f;
                }
                f16 = f10;
                f17 = f21;
                f18 = 0.0f;
            }
            float f24 = ((-this.f45901j2) / 2.0f) + f17;
            float f25 = f7 * f15;
            if (Float.isNaN(f25)) {
                f25 = f14;
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
    public final qg.u0 w() {
        return qg.u0.e(this.P1);
    }

    public final void w0(final boolean z10) {
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
            lVar.f17628i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f17622u = lVar;
            if (!this.f45897h2 && !this.f45895g2) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.f45886c1.getTranslationY();
            final ViewGroup barView = getBarView();
            this.M1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    int i10;
                    m0 m0Var = m0.this;
                    k0 k0Var = m0Var.f45886c1;
                    float f13 = f11 / 1000.0f;
                    m0Var.N1 = f13;
                    float f14 = ((1.0f - f13) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f14);
                    view.setScaleY(f14);
                    view.setTranslationY((Math.min(m0Var.N1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(m0Var.N1, 0.25f) / 0.25f));
                    j0 j0Var = m0Var.G1;
                    float f15 = m0Var.N1;
                    boolean z12 = z10;
                    j0Var.E1(f15, z12);
                    m0Var.B0.setProgress(m0Var.N1);
                    m0Var.A0.setProgress(m0Var.N1);
                    m0Var.f45892f1.setTranslationY(AndroidUtilities.dp(32.0f) * m0Var.N1);
                    if (zArr[0]) {
                        float f16 = m0Var.N1;
                        if (!z12) {
                            f16 = 1.0f - f16;
                        }
                        float dp = AndroidUtilities.dp(40.0f) * f16;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        k0Var.setTranslationY(translationY - (dp * i10));
                    }
                    k0Var.invalidate();
                    if (view == m0Var.f45915u1) {
                        m0Var.f45888d1.invalidate();
                    }
                }
            });
            this.M1.a(new r(this, z10, 1));
            this.M1.h();
            if (z10) {
                j0 j0Var = this.G1;
                j0Var.setVisibility(0);
                j0Var.setSelectedColorIndex(qg.u0.e(this.P1).d());
            }
        }
    }

    public final void x0(int i10) {
        boolean z10;
        int i11;
        p1 p1Var = this.f45915u1;
        if (i10 == 1) {
            tz tzVar = this.f45893f2;
            if (tzVar != null && tzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            tz tzVar2 = this.f45893f2;
            if (tzVar2 != null && tzVar2.f30966c1 != UserConfig.selectedAccount) {
                removeView(tzVar2);
                this.f45893f2 = null;
            }
            if (this.f45893f2 == null) {
                tz tzVar3 = new tz(null, true, false, false, getContext(), false, null, null, true, this.Q1, false, false);
                this.f45893f2 = tzVar3;
                tzVar3.U0 = true;
                tzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f45893f2.setForseMultiwindowLayout(true);
                }
                this.f45893f2.setDelegate(new b0(this));
                addView(this.f45893f2);
            }
            this.f45893f2.setVisibility(0);
            this.f45895g2 = true;
            tz tzVar4 = this.f45893f2;
            if (this.f45903k2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f45903k2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f45903k2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f45904l2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f45904l2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f45904l2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f45904l2;
            } else {
                i11 = this.f45903k2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tzVar4.getLayoutParams();
            layoutParams.height = i11;
            tzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.S0;
                if (jVar instanceof w2) {
                    AndroidUtilities.hideKeyboard(((w2) jVar).getEditText());
                }
            }
            this.f45901j2 = i11;
            requestLayout();
            b4 b4Var = ((jt0) this).f38700o2.K1;
            if (b4Var != null) {
                b4Var.a();
            }
            ah emojiButton = p1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            getHeight();
            if (!z10 && !this.f45897h2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45901j2, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new a0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        ah emojiButton2 = p1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(yg.e, true);
        }
        tz tzVar5 = this.f45893f2;
        if (tzVar5 != null) {
            this.f45895g2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                tzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f45901j2 = 0;
        }
        b4 b4Var2 = ((jt0) this).f38700o2.K1;
        if (b4Var2 != null) {
            b4Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, m0 m0Var, int i10, int i11, int i12) {
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
            this.S1.setOnTouchListener(new x4(this, 1));
            this.S1.setDispatchKeyEventListener(new q(this));
            this.S1.setShownFromBottom(true);
        }
        this.S1.d();
        runnable.run();
        if (this.R1 == null) {
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(this.S1, -2, -2);
            this.R1 = m1Var2;
            m1Var2.f21630b = true;
            m1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.R1.setOutsideTouchable(true);
            this.R1.setClippingEnabled(true);
            this.R1.setInputMethodMode(2);
            this.R1.setSoftInputMode(0);
            this.R1.getContentView().setFocusableInTouchMode(true);
            this.R1.setOnDismissListener(new z4(this, 1));
        }
        this.S1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.R1.setFocusable(true);
        this.R1.showAtLocation(m0Var, i10, i11 - (this.S1.getMeasuredWidth() / 2), i12 - this.S1.getMeasuredHeight());
        org.telegram.ui.ActionBar.m1.i(this.S1);
    }

    @Override
    public final void z() {
        y0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void z0(boolean z10) {
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
            lVar.f17628i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f17622u = lVar;
            if (z10) {
                u1 u1Var = this.f45916v1;
                u1Var.setAlpha(0.0f);
                u1Var.setVisibility(0);
            }
            this.F1.b(new k8(3, this));
            this.F1.a(new r(this, z10, 0));
            this.F1.h();
        }
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void B() {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public final void f(boolean z10) {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void i() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void l(boolean z10) {
    }

    @Override
    public final void x() {
    }
}
