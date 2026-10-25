package sg;

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
import di.i8;
import di.n3;
import fi.i5;
import fi.l5;
import fi.m5;
import fi.n4;
import fi.t4;
import fi.w4;
import fi.y4;
import fi.z3;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import li.h5;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.yg;
import org.telegram.ui.d3;
import org.telegram.ui.nt0;
import org.telegram.ui.wg1;
import org.telegram.ui.xq0;
public abstract class n0 extends ww0 implements s1, h, o1, uw0, NotificationCenter.NotificationCenterDelegate {
    public float A0;
    public boolean A1;
    public float B0;
    public o1.j B1;
    public float C0;
    public float C1;
    public float D0;
    public final Paint D1;
    public boolean E0;
    public final int E1;
    public float F0;
    public final v F1;
    public qw0 G0;
    public org.telegram.ui.ActionBar.o1 G1;
    public j H0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout H1;
    public boolean I0;
    public Rect I1;
    public int J0;
    public Runnable J1;
    public final boolean K0;
    public final rg.s0 K1;
    public final d0 L0;
    public boolean L1;
    public final f0 M0;
    public float M1;
    public final i0 N0;
    public boolean N1;
    public final h0 O0;
    public final h6 O1;
    public g21 P0;
    public final Paint P1;
    public final FrameLayout Q0;
    public final Paint Q1;
    public final l0 R0;
    public eh.d R1;
    public final j0 S0;
    public final float[] S1;
    public final FrameLayout T0;
    public final int[] T1;
    public l5 U0;
    public sz U1;
    public int V0;
    public boolean V1;
    public int W0;
    public boolean W1;
    public float X0;
    public boolean X1;
    public ValueAnimator Y0;
    public int Y1;
    public boolean Z0;
    public int Z1;
    public final y1 f48329a1;
    public int a2;
    public final h5 f48330b1;
    public int f48331b2;
    public ArrayList f48332c1;
    public boolean f48333c2;
    public final int f48334d1;
    public BigInteger f48335e1;
    public TextView f48336f1;
    public TextView f48337g1;
    public TextView f48338h1;
    public final t1 f48339i1;
    public final q1 f48340j1;
    public final v1 f48341k1;
    public final ImageView l1;
    public final LinearLayout f48342m1;
    public final TextView f48343n1;
    public final TextView f48344o1;
    public final h1 f48345p0;
    public final TextView f48346p1;
    public final l1 f48347q0;
    public final Paint f48348q1;
    public float f48349r0;
    public final Paint f48350r1;
    public final Bitmap f48351s0;
    public float f48352s1;
    public final Bitmap f48353t0;
    public boolean f48354t1;
    public final rg.t1 f48355u0;
    public o1.j f48356u1;
    public final DispatchQueue f48357v0;
    public final k0 f48358v1;
    public final MediaController.CropState f48359w0;
    public final Paint f48360w1;
    public float f48361x0;
    public final Paint f48362x1;
    public float f48363y0;
    public final Paint f48364y1;
    public float f48365z0;
    public final rg.q1 f48366z1;

    public n0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, xq0 xq0Var, final u6 u6Var) {
        super(context, activity);
        boolean z10;
        float f7;
        int i12;
        int i13;
        Emoji.EmojiSpan[] emojiSpanArr;
        z1 z1Var;
        boolean z11 = false;
        this.V0 = 0;
        this.W0 = -1;
        final nt0 nt0Var = (nt0) this;
        this.f48330b1 = new h5(nt0Var);
        this.f48348q1 = new Paint(1);
        this.f48350r1 = new Paint(1);
        this.f48360w1 = new Paint(1);
        this.f48362x1 = new Paint(1);
        this.f48364y1 = new Paint(1);
        rg.q1 q1Var = new rg.q1(1.0f, 0.016773745f, -1);
        this.f48366z1 = q1Var;
        this.D1 = new Paint(1);
        this.N1 = false;
        this.O1 = new h6((View) this, 350L, ds.h);
        this.P1 = new Paint(1);
        Paint paint = new Paint(1);
        this.Q1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.S1 = new float[2];
        this.T1 = new int[2];
        new cy0(nt0Var, 12);
        setDelegate(this);
        this.E1 = i10;
        this.F1 = new u6() {
            @Override
            public final boolean a() {
                return y6.I.q();
            }

            @Override
            public final void b(float f10, float f11, int i14, int i15) {
                y6.q(f10, f11, i14, i15);
            }

            @Override
            public final ColorFilter c() {
                return y6.f23687v3;
            }

            @Override
            public final Paint d(String str) {
                return y6.U0(str);
            }

            @Override
            public final int e(int i14) {
                return g(i14);
            }

            @Override
            public final boolean f() {
                return false;
            }

            @Override
            public final int g(int i14) {
                if (i14 == y6.G8) {
                    return -14145495;
                }
                if (i14 != y6.E8) {
                    if (i14 == y6.f23425h5) {
                        return -14737633;
                    }
                    if (i14 == y6.f23462j5) {
                        return -592138;
                    }
                    if (i14 == y6.f23612r5) {
                        return -8553091;
                    }
                    if (i14 != y6.He) {
                        if (i14 == y6.Ke) {
                            return -1610612736;
                        }
                        if (i14 == y6.Ne || i14 == y6.Re || i14 == y6.Me) {
                            return -9539985;
                        }
                        if (i14 != y6.G6) {
                            int i15 = y6.Mh;
                            if (i14 == i15) {
                                return -11754001;
                            }
                            if (i14 == y6.f23446i6) {
                                return 536870911;
                            }
                            if (i14 != y6.Fh && i14 != y6.Eh && i14 != y6.Gh) {
                                if (i14 == y6.Hh) {
                                    return 352321535;
                                }
                                if (i14 != y6.Je && i14 != i15) {
                                    if (i14 == y6.Ie) {
                                        return 780633991;
                                    }
                                    if (i14 == y6.f23297a7) {
                                        return -15921907;
                                    }
                                    if (i14 == y6.f23519m7) {
                                        return -12500671;
                                    }
                                    if (i14 == y6.f23501l7) {
                                        return -13133079;
                                    }
                                    if (i14 == y6.f23539n7) {
                                        return -1;
                                    }
                                    if (i14 == y6.f23354d6) {
                                        return -15198183;
                                    }
                                    if (i14 == y6.f23355d7) {
                                        return -16777216;
                                    }
                                    u6 u6Var2 = u6.this;
                                    if (u6Var2 != null) {
                                        return u6Var2.g(i14);
                                    }
                                    return y6.x0(null, i14, false);
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
            public final int i(int i14) {
                return g(i14);
            }

            @Override
            public final void h(int i14, int i15) {
            }
        };
        this.f48359w0 = cropState;
        this.K0 = context instanceof BubbleActivity;
        rg.s0 e = rg.s0.e(i10);
        this.K1 = e;
        e.i(0, true);
        q1Var.f47522a = e.c();
        q1Var.f47524c = e.f47545i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.f48357v0 = dispatchQueue;
        this.f48351s0 = bitmap;
        this.f48353t0 = bitmap2;
        this.f48334d1 = i11;
        rg.t1 t1Var = new rg.t1();
        this.f48355u0 = t1Var;
        t1Var.f47559a = new org.telegram.ui.Components.voip.j1(nt0Var, 11);
        byte b10 = 2;
        d0 d0Var = new d0(nt0Var, context, new rg.q0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.L0 = d0Var;
        d0Var.setDelegate(new e0(nt0Var, xq0Var));
        d0Var.setUndoStore(t1Var);
        d0Var.setQueue(dispatchQueue);
        d0Var.setVisibility(4);
        addView(d0Var, gb1.i(-1, -1, 51));
        f0 f0Var = new f0(nt0Var, context);
        this.M0 = f0Var;
        f0Var.setVisibility(4);
        addView(f0Var, gb1.i(-1, -1, 51));
        h0 h0Var = new h0(nt0Var, context, new g0(nt0Var));
        this.O0 = h0Var;
        addView(h0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i14);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    f7 = 2.0f;
                    ?? g02 = g0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & 2) != 0) {
                        g02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    i13 = i14;
                    z1Var = g02;
                } else {
                    f7 = 2.0f;
                    if (b11 == 1) {
                        ?? h02 = h0(z11);
                        h02.setType(mediaEntity.subType);
                        h02.setTypeface(mediaEntity.textTypeface);
                        h02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        for (int i15 = z11; i15 < size2; i15++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i15);
                            int i16 = size2;
                            c6 c6Var = new c6(emojiEntity.document_id, h02.getFontMetricsInt());
                            int i17 = emojiEntity.offset;
                            spannableString.setSpan(c6Var, i17, emojiEntity.length + i17, 33);
                            size = size;
                            i14 = i14;
                            size2 = i16;
                        }
                        i12 = size;
                        i13 = i14;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, h02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        h02.setText(replaceEmoji);
                        t0(h02, mediaEntity.textAlign);
                        rg.q1 swatch = h02.getSwatch();
                        swatch.f47522a = mediaEntity.color;
                        h02.setSwatch(swatch);
                        z1Var = h02;
                    } else {
                        i12 = size;
                        i13 = i14;
                        byte b12 = b10;
                        if (b11 == b12) {
                            z1 f02 = f0(mediaEntity.text, false);
                            f02.B0 = false;
                            if ((mediaEntity.subType & b12) != 0) {
                                f02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                f02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            z1Var = f02;
                        } else {
                            i14 = i13 + 1;
                            size = i12;
                            z11 = false;
                            b10 = 2;
                        }
                    }
                }
                z1Var.setX((mediaEntity.f19572x * this.G0.f32052a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f7));
                z1Var.setY((mediaEntity.f19573y * this.G0.f32053b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f7));
                z1Var.setPosition(new PointF((mediaEntity.viewWidth / f7) + z1Var.getX(), (mediaEntity.viewHeight / f7) + z1Var.getY()));
                z1Var.setScale(mediaEntity.scale);
                z1Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i14 = i13 + 1;
                size = i12;
                z11 = false;
                b10 = 2;
            }
        }
        this.O0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.N0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.Q0 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, gb1.i(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.l1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(y6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nt0 nt0Var2 = nt0Var;
                        d0 d0Var2 = nt0Var2.L0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof rg.l)) {
                            d0Var2.b();
                            nt0Var2.f48339i1.setSelectedIndex(1);
                            nt0Var2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        nt0Var2.f48355u0.c();
                        return;
                    case 1:
                        nt0 nt0Var3 = nt0Var;
                        d0 d0Var3 = nt0Var3.L0;
                        rg.t1 t1Var2 = nt0Var3.f48355u0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof rg.l)) {
                                d0Var3.b();
                                nt0Var3.f48339i1.setSelectedIndex(1);
                                nt0Var3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f47561c.clear();
                            t1Var2.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            nt0Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nt0 nt0Var4 = nt0Var;
                        j jVar = nt0Var4.H0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (nt0Var4.V1) {
                            nt0Var4.k0(false);
                        }
                        nt0Var4.p0(nt0Var4.H0);
                        nt0Var4.q0(null, true);
                        return;
                    default:
                        nt0Var.q0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, gb1.h(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48342m1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(y6.g0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        vh.j(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, gb1.x(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, gb1.u(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bh.f(25));
        frameLayout2.addView(linearLayout, gb1.i(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f48343n1 = textView2;
        textView2.setBackground(y6.g0(822083583, 7, -1));
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
                        nt0 nt0Var2 = nt0Var;
                        d0 d0Var2 = nt0Var2.L0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof rg.l)) {
                            d0Var2.b();
                            nt0Var2.f48339i1.setSelectedIndex(1);
                            nt0Var2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        nt0Var2.f48355u0.c();
                        return;
                    case 1:
                        nt0 nt0Var3 = nt0Var;
                        d0 d0Var3 = nt0Var3.L0;
                        rg.t1 t1Var2 = nt0Var3.f48355u0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof rg.l)) {
                                d0Var3.b();
                                nt0Var3.f48339i1.setSelectedIndex(1);
                                nt0Var3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f47561c.clear();
                            t1Var2.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            nt0Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nt0 nt0Var4 = nt0Var;
                        j jVar = nt0Var4.H0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (nt0Var4.V1) {
                            nt0Var4.k0(false);
                        }
                        nt0Var4.p0(nt0Var4.H0);
                        nt0Var4.q0(null, true);
                        return;
                    default:
                        nt0Var.q0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView k10 = d3.k(frameLayout2, textView2, gb1.h(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f48344o1 = k10;
        k10.setBackground(y6.g0(822083583, 7, -1));
        k10.setPadding(d3.h(8.0f, R.string.Clear, k10), 0, AndroidUtilities.dp(8.0f), 0);
        k10.setGravity(16);
        k10.setTextColor(-1);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setTextSize(1, 16.0f);
        k10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nt0 nt0Var2 = nt0Var;
                        d0 d0Var2 = nt0Var2.L0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof rg.l)) {
                            d0Var2.b();
                            nt0Var2.f48339i1.setSelectedIndex(1);
                            nt0Var2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        nt0Var2.f48355u0.c();
                        return;
                    case 1:
                        nt0 nt0Var3 = nt0Var;
                        d0 d0Var3 = nt0Var3.L0;
                        rg.t1 t1Var2 = nt0Var3.f48355u0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof rg.l)) {
                                d0Var3.b();
                                nt0Var3.f48339i1.setSelectedIndex(1);
                                nt0Var3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f47561c.clear();
                            t1Var2.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            nt0Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nt0 nt0Var4 = nt0Var;
                        j jVar = nt0Var4.H0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (nt0Var4.V1) {
                            nt0Var4.k0(false);
                        }
                        nt0Var4.p0(nt0Var4.H0);
                        nt0Var4.q0(null, true);
                        return;
                    default:
                        nt0Var.q0(null, true);
                        return;
                }
            }
        });
        k10.setAlpha(0.0f);
        k10.setVisibility(8);
        TextView k11 = d3.k(frameLayout2, k10, gb1.h(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f48346p1 = k11;
        k11.setBackground(y6.g0(822083583, 7, -1));
        k11.setPadding(d3.h(8.0f, R.string.Done, k11), 0, AndroidUtilities.dp(8.0f), 0);
        k11.setGravity(16);
        k11.setTextColor(-1);
        k11.setTypeface(AndroidUtilities.bold());
        k11.setTextSize(1, 16.0f);
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nt0 nt0Var2 = nt0Var;
                        d0 d0Var2 = nt0Var2.L0;
                        if (d0Var2 != null && (d0Var2.getCurrentBrush() instanceof rg.l)) {
                            d0Var2.b();
                            nt0Var2.f48339i1.setSelectedIndex(1);
                            nt0Var2.i((rg.m) rg.m.f47462a.get(0));
                            return;
                        }
                        nt0Var2.f48355u0.c();
                        return;
                    case 1:
                        nt0 nt0Var3 = nt0Var;
                        d0 d0Var3 = nt0Var3.L0;
                        rg.t1 t1Var2 = nt0Var3.f48355u0;
                        if (t1Var2.a()) {
                            if (d0Var3 != null && (d0Var3.getCurrentBrush() instanceof rg.l)) {
                                d0Var3.b();
                                nt0Var3.f48339i1.setSelectedIndex(1);
                                nt0Var3.i((rg.m) rg.m.f47462a.get(0));
                            }
                            d0Var3.a();
                            t1Var2.f47561c.clear();
                            t1Var2.f47560b.clear();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var2, 12));
                            nt0Var3.O0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        nt0 nt0Var4 = nt0Var;
                        j jVar = nt0Var4.H0;
                        if (jVar instanceof x2) {
                            AndroidUtilities.hideKeyboard(((x2) jVar).getFocusedView());
                        }
                        if (nt0Var4.V1) {
                            nt0Var4.k0(false);
                        }
                        nt0Var4.p0(nt0Var4.H0);
                        nt0Var4.q0(null, true);
                        return;
                    default:
                        nt0Var.q0(null, true);
                        return;
                }
            }
        });
        k11.setAlpha(0.0f);
        k11.setVisibility(8);
        frameLayout2.addView(k11, gb1.h(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        l0 l0Var = new l0(nt0Var, context);
        this.R0 = l0Var;
        l0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        l0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(l0Var, gb1.i(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t1 t1Var2 = new t1(context, z10);
        this.f48339i1 = t1Var2;
        t1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        t1Var2.setDelegate(this);
        t1Var2.setSelectedIndex(1);
        l0Var.addView(t1Var2, gb1.g(48.0f, -1));
        q1 q1Var2 = new q1(context);
        this.f48340j1 = q1Var2;
        q1Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        q1Var2.setVisibility(8);
        q1Var2.setDelegate(this);
        q1Var2.setAlignment(rg.s0.e(i10).f47544g);
        l0Var.addView(q1Var2, gb1.g(48.0f, -1));
        j0 j0Var = new j0(nt0Var, context);
        this.S0 = j0Var;
        addView(j0Var, gb1.g(-1.0f, -1));
        v1 v1Var = new v1(context);
        this.f48341k1 = v1Var;
        v1Var.setVisibility(8);
        v1Var.setOnItemClickListener(new ai.k(nt0Var, 19));
        q1Var2.setTypefaceListView(v1Var);
        j0Var.addView(v1Var, gb1.h(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f48348q1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f48348q1.setColor(1728053247);
        this.f48348q1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.f48350r1.setColor(y6.w0(y6.G8, this.F1));
        k0 k0Var = new k0(nt0Var, context);
        this.f48358v1 = k0Var;
        k0Var.setVisibility(8);
        k0Var.setColorPalette(rg.s0.e(i10));
        k0Var.setColorListener(new m(nt0Var, 0));
        l0Var.addView(k0Var, gb1.h(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        h1 h1Var = new h1(context);
        this.f48345p0 = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        h1Var.setBackground(y6.g0(1090519039, 1, -1));
        l0Var.addView(h1Var, gb1.h(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        l1 l1Var = new l1(context);
        this.f48347q0 = l1Var;
        l1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        l1Var.setBackground(y6.g0(1090519039, 1, -1));
        l1Var.setOnClickListener(new a51(nt0Var, context, bitmap2, 2));
        l0Var.addView(l1Var, gb1.h(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        y1 y1Var = new y1(context);
        this.f48329a1 = y1Var;
        y1Var.setColorSwatch(this.f48366z1);
        y1Var.setRenderView(this.L0);
        y1Var.setValueOverride(this.f48330b1);
        this.f48366z1.f47524c = this.f48330b1.get();
        y1Var.setOnUpdate(new wg1(nt0Var, i10, 10));
        addView(y1Var, gb1.g(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.T0 = frameLayout3;
        addView(frameLayout3, gb1.g(-1.0f, -1));
        this.f48364y1.setStyle(style);
        this.f48364y1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        r0(this.f48366z1, null);
        i((rg.m) rg.m.f47462a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void X(nt0 nt0Var, Integer num) {
        nt0Var.setNewColor(num.intValue());
        nt0Var.v0(false);
    }

    public static void Y(sg.n0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: sg.n0.Y(sg.n0):void");
    }

    public static void Z(n0 n0Var) {
        q2 q2Var;
        h0 h0Var = n0Var.O0;
        j jVar = n0Var.H0;
        if (jVar != null) {
            PointF z02 = n0Var.z0(jVar);
            j jVar2 = n0Var.H0;
            if (jVar2 instanceof q2) {
                q2 q2Var2 = new q2(n0Var.getContext(), (q2) n0Var.H0, z02);
                q2Var2.setDelegate(n0Var);
                h0Var.addView(q2Var2);
                q2Var = q2Var2;
            } else if (jVar2 instanceof x2) {
                x2 x2Var = new x2(n0Var.getContext(), (x2) n0Var.H0, z02);
                x2Var.setDelegate(n0Var);
                x2Var.setMaxWidth((int) (n0Var.getPaintingSize().f32052a - 20.0f));
                h0Var.addView(x2Var, gb1.g(-2.0f, -2));
                q2Var = x2Var;
            } else {
                q2Var = null;
            }
            n0Var.o0(q2Var);
            n0Var.q0(q2Var, true);
        }
        org.telegram.ui.ActionBar.o1 o1Var = n0Var.G1;
        if (o1Var != null && o1Var.isShowing()) {
            n0Var.G1.d(true);
        }
    }

    public static void a0(nt0 nt0Var, Integer num) {
        rg.s0 s0Var = nt0Var.K1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        nt0Var.setNewColor(num.intValue());
        k0 k0Var = nt0Var.f48358v1;
        k0Var.setSelectedColorIndex(s0Var.d());
        k0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.V0 == 2) {
            return this.f48340j1;
        }
        return this.f48339i1;
    }

    private int getFrameRotation() {
        int i10 = this.f48334d1;
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

    private qw0 getPaintingSize() {
        int i10;
        qw0 qw0Var = this.G0;
        if (qw0Var != null) {
            return qw0Var;
        }
        Bitmap bitmap = this.f48351s0;
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
        qw0 qw0Var2 = new qw0(width, height);
        float f7 = i10;
        qw0Var2.f32052a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        qw0Var2.f32053b = floor;
        if (floor > f7) {
            qw0Var2.f32053b = f7;
            qw0Var2.f32052a = (float) Math.floor((f7 * width) / height);
        }
        this.G0 = qw0Var2;
        return qw0Var2;
    }

    public void setNewColor(int i10) {
        rg.q1 q1Var = this.f48366z1;
        int i11 = q1Var.f47522a;
        q1Var.f47522a = i10;
        r0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new t4(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.J0 = i10;
        j jVar = this.H0;
        if (jVar instanceof x2) {
            ((x2) jVar).setType(i10);
        }
        rg.s0 e = rg.s0.e(this.E1);
        e.h = i10;
        e.f47540a.edit().putInt("text_type", i10).apply();
        this.f48340j1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        l5 l5Var = new l5(this, context);
        this.U0 = l5Var;
        l5Var.setClipToPadding(false);
        this.U0.setOrientation(0);
        this.R0.addView(this.U0, gb1.h(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f48336f1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f48336f1;
        int i10 = y6.f23446i6;
        v vVar = this.F1;
        f7.R(textView2, y6.g0(y6.w0(i10, vVar), 7, -1), null, f7.N(i10), vVar);
        this.f48336f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f48336f1.setTextColor(-1);
        this.f48336f1.setTextSize(1, 14.0f);
        this.f48336f1.setGravity(1);
        this.f48336f1.setTypeface(AndroidUtilities.bold());
        this.f48336f1.setSingleLine();
        this.f48336f1.setOnClickListener(new k(this, 0));
        this.U0.addView(this.f48336f1, gb1.p(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f48337g1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        f7.R(this.f48337g1, y6.g0(y6.w0(i10, vVar), 7, -1), null, f7.N(i10), vVar);
        this.f48337g1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f48337g1.setOnClickListener(new k(this, 1));
        this.f48337g1.setTextColor(-1);
        this.f48337g1.setTextSize(1, 14.0f);
        this.f48337g1.setGravity(1);
        this.f48337g1.setTypeface(AndroidUtilities.bold());
        this.f48337g1.setAlpha(0.6f);
        this.f48337g1.setSingleLine();
        this.U0.addView(this.f48337g1, gb1.p(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f48338h1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        f7.R(this.f48338h1, y6.g0(y6.w0(i10, vVar), 7, -1), null, f7.N(i10), vVar);
        this.f48338h1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f48338h1.setTextColor(-1);
        this.f48338h1.setTextSize(1, 14.0f);
        this.f48338h1.setGravity(1);
        this.f48338h1.setTypeface(AndroidUtilities.bold());
        this.f48338h1.setAlpha(0.6f);
        this.f48338h1.setSingleLine();
        this.f48338h1.setOnClickListener(new k(this, 4));
        this.U0.addView(this.f48338h1, gb1.p(1.0f, 0, -2));
    }

    public static void t0(x2 x2Var, int i10) {
        int i11;
        x2Var.setAlign(i10);
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
        x2Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        x2Var.getEditText().setTextAlignment(i12);
    }

    public final void A0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.V0 != i10 && this.W0 != i10) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.V0;
            ViewGroup viewGroup3 = this.f48340j1;
            ViewGroup viewGroup4 = this.f48339i1;
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
            int i12 = this.E1;
            rg.s0 e = rg.s0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f47548l != z10) {
                e.f47548l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f47540a.getInt("brush", 0), false);
                }
            }
            int c10 = rg.s0.e(i12).c();
            rg.q1 q1Var = this.f48366z1;
            q1Var.f47522a = c10;
            r0(q1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.Y0 = duration;
            duration.setInterpolator(ds.f27584f);
            this.Y0.addUpdateListener(new n3(this, viewGroup, viewGroup2, 4));
            this.Y0.addListener(new m5(this, viewGroup, viewGroup2, i10, 2));
            this.Y0.start();
        }
    }

    public final void B0() {
        int i10 = 0;
        while (true) {
            h0 h0Var = this.O0;
            if (i10 < h0Var.getChildCount()) {
                View childAt = h0Var.getChildAt(i10);
                if (childAt != this.H0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f48255l0 && jVar.f48253j0 <= 0.0f) {
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
    public final void C() {
        y0(true);
    }

    @Override
    public final boolean D(j jVar) {
        return q0(jVar, true);
    }

    @Override
    public final void I(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.W1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.a2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.a2).commit();
            } else {
                this.Z1 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Z1).commit();
            }
        }
        if (this.V1) {
            if (z10) {
                i11 = this.a2;
            } else {
                i11 = this.Z1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U1.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.U1.setLayoutParams(layoutParams);
                this.Y1 = layoutParams.height;
                requestLayout();
                z3 z3Var = ((nt0) this).f41996d2.K1;
                if (z3Var != null) {
                    z3Var.a();
                }
                getHeight();
            }
        }
        if (this.f48331b2 == i10 && this.f48333c2 == z10) {
            getHeight();
            return;
        }
        this.f48331b2 = i10;
        this.f48333c2 = z10;
        boolean z13 = this.W1;
        j jVar = this.H0;
        if (jVar instanceof x2) {
            if (((x2) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.W1 = z12;
        } else {
            this.W1 = false;
        }
        if (this.W1 && this.V1) {
            w0(0);
        }
        if (this.Y1 != 0 && !(z11 = this.W1) && z11 != z13 && !this.V1) {
            this.Y1 = 0;
            requestLayout();
            z3 z3Var2 = ((nt0) this).f41996d2.K1;
            if (z3Var2 != null) {
                z3Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        v0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G8));
        hashSet.add(Integer.valueOf(y6.f23425h5));
        hashSet.add(Integer.valueOf(y6.f23462j5));
        hashSet.add(Integer.valueOf(y6.f23612r5));
        hashSet.add(Integer.valueOf(y6.He));
        hashSet.add(Integer.valueOf(y6.Ke));
        hashSet.add(Integer.valueOf(y6.Ne));
        hashSet.add(Integer.valueOf(y6.Re));
        hashSet.add(Integer.valueOf(y6.Me));
        hashSet.add(Integer.valueOf(y6.G6));
        hashSet.add(Integer.valueOf(y6.Mh));
        hashSet.add(Integer.valueOf(y6.Fh));
        hashSet.add(Integer.valueOf(y6.Eh));
        hashSet.add(Integer.valueOf(y6.Gh));
        hashSet.add(Integer.valueOf(y6.Hh));
        hashSet.add(Integer.valueOf(y6.Je));
        hashSet.add(Integer.valueOf(y6.Ie));
        hashSet.add(Integer.valueOf(y6.f23297a7));
        hashSet.add(Integer.valueOf(y6.f23519m7));
        hashSet.add(Integer.valueOf(y6.f23501l7));
        hashSet.add(Integer.valueOf(y6.f23539n7));
        hashSet.add(Integer.valueOf(y6.f23354d6));
        hashSet.add(Integer.valueOf(y6.f23355d7));
    }

    @Override
    public final int[] b(j jVar) {
        return i0(jVar);
    }

    @Override
    public final void c() {
        setTextType((this.J0 + 1) % 4);
    }

    @Override
    public final void d(int i10) {
        j jVar = this.H0;
        if (jVar instanceof x2) {
            t0((x2) jVar, i10);
            rg.s0 e = rg.s0.e(this.E1);
            e.f47544g = i10;
            e.f47540a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new u(0, this, (z1) view)).start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h0 h0Var;
        x2 x2Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (h0Var = this.O0) != null) {
            for (int i12 = 0; i12 < h0Var.getChildCount(); i12++) {
                View childAt = h0Var.getChildAt(i12);
                if ((childAt instanceof x2) && (str = (x2Var = (x2) childAt).A0) != null) {
                    x2Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: sg.n0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final PointF e0() {
        MediaController.CropState cropState;
        qw0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f32052a / 2.0f;
        float f10 = paintingSize.f32053b / 2.0f;
        if (this.f48359w0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float a2 = (float) org.telegram.messenger.t.a(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f7 -= cos * paintingSize.f32052a;
            f10 -= a2 * paintingSize.f32053b;
        }
        return new PointF(f7, f10);
    }

    public final z1 f0(String str, boolean z10) {
        float f7;
        qw0 qw0Var;
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
        h0 h0Var = this.O0;
        if (i10 > 0) {
            float floor = (float) Math.floor(h0Var.getMeasuredWidth() * 0.5d);
            qw0Var = new qw0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(h0Var.getMeasuredHeight() * 0.5d);
            qw0Var = new qw0(f7 * floor2, floor2);
        }
        qw0 qw0Var2 = qw0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = qw0Var2.f32052a;
            qw0Var2.f32052a = qw0Var2.f32053b;
            qw0Var2.f32053b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        z1 z1Var = new z1(context, e02, qw0Var2, str, intValue);
        z1Var.setDelegate(this);
        h0Var.addView(z1Var);
        if (z10) {
            o0(z1Var);
            q0(z1Var, true);
        }
        return z1Var;
    }

    public final sg.a0 g0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: sg.n0.g0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):sg.a0");
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.f48345p0;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.f48359w0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f48347q0;
    }

    public long getLcm() {
        return this.f48335e1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        c6[] c6VarArr;
        h0 h0Var = this.O0;
        int childCount = h0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = h0Var.getChildAt(i10);
            if (childAt instanceof q2) {
                TLRPC.Document sticker = ((q2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f22039id = sticker.f22033id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof x2) {
                CharSequence text = ((x2) childAt).getText();
                if ((text instanceof Spanned) && (c6VarArr = (c6[]) ((Spanned) text).getSpans(0, text.length(), c6.class)) != null) {
                    for (c6 c6Var : c6VarArr) {
                        if (c6Var != null) {
                            TLRPC.Document document = c6Var.document;
                            if (document == null) {
                                document = t5.f(this.E1, c6Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22039id = document.f22033id;
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
        return this.f48349r0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public rg.c1 getRenderView() {
        return this.L0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.H0;
        h0 h0Var = this.O0;
        if (jVar == null) {
            return getY() + h0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (h0Var.getScaleY() * this.H0.getHeight()) + iArr[1];
    }

    public g21 getThanosEffect() {
        if (!g21.c()) {
            return null;
        }
        if (this.P0 == null) {
            g21 g21Var = new g21(getContext(), new n(this, 0));
            this.P0 = g21Var;
            addView(g21Var);
        }
        return this.P0;
    }

    public final x2 h0(boolean z10) {
        ((nt0) this).f41996d2.f35661g0.isFocusable();
        qw0 paintingSize = getPaintingSize();
        PointF z02 = z0(null);
        x2 x2Var = new x2(getContext(), z02, (int) (paintingSize.f32052a / 9.0f), "", this.f48366z1, this.J0);
        float f7 = paintingSize.f32052a / 9.0f;
        n nVar = new n(this, 2);
        x2Var.f48566w0 = (int) (0.5f * f7);
        x2Var.f48567x0 = (int) (f7 * 2.0f);
        x2Var.f48568y0 = nVar;
        float f10 = z02.x;
        h0 h0Var = this.O0;
        if (f10 == h0Var.getMeasuredWidth() / 2.0f) {
            x2Var.setStickyX(2);
        }
        if (z02.y == h0Var.getMeasuredHeight() / 2.0f) {
            x2Var.setStickyY(2);
        }
        x2Var.setDelegate(this);
        x2Var.setMaxWidth((int) (paintingSize.f32052a - 20.0f));
        int i10 = this.E1;
        x2Var.setTypeface(rg.s0.e(i10).f47546j);
        x2Var.setType(rg.s0.e(i10).h);
        h0Var.addView(x2Var, gb1.g(-2.0f, -2));
        MediaController.CropState cropState = this.f48359w0;
        if (cropState != null) {
            x2Var.j(1.0f / cropState.cropScale);
            x2Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            o0(x2Var);
            x2Var.q();
            q0(x2Var, false);
            x2Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(x2Var.getFocusedView());
            this.I0 = true;
            int i11 = rg.s0.e(i10).f47544g;
            q1 q1Var = this.f48340j1;
            q1Var.d(i11, true);
            q1Var.setOutlineType(rg.s0.e(i10).h);
        }
        return x2Var;
    }

    @Override
    public final void i(rg.m mVar) {
        boolean z10 = mVar instanceof rg.b;
        y1 y1Var = this.f48329a1;
        if (!z10 && !(mVar instanceof rg.d)) {
            y1Var.b(0.05f, 1.0f);
        } else {
            y1Var.b(0.4f, 1.75f);
        }
        y1Var.setDrawCenter(!(mVar instanceof rg.l));
        d0 d0Var = this.L0;
        if (d0Var.getCurrentBrush() instanceof rg.l) {
            this.Z0 = true;
        }
        d0Var.setBrush(mVar);
        rg.q1 q1Var = this.f48366z1;
        int i10 = q1Var.f47522a;
        q1Var.f47522a = rg.s0.e(this.E1).c();
        q1Var.f47524c = this.f48330b1.get();
        r0(q1Var, Integer.valueOf(i10));
        this.M0.invalidate();
    }

    public final int[] i0(j jVar) {
        float[] fArr = this.S1;
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
        int[] iArr = this.T1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f7 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.O0.getRotation());
        double d10 = f7;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) org.telegram.messenger.t.a(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (this.H0 != null) {
            q0(null, true);
        }
        float x9 = motionEvent.getX();
        d0 d0Var = this.L0;
        float translationX = ((x9 - d0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / d0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - d0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / d0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-d0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (d0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (d0Var.getMeasuredHeight() / 2.0f) + ((float) org.telegram.messenger.t.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        d0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int j0(boolean z10) {
        return this.Y1;
    }

    @Override
    public final void k(j jVar) {
        int[] i02 = i0(jVar);
        x0(new s(this, jVar, 1), this, 51, i02[0], i02[1] - AndroidUtilities.dp(32.0f));
    }

    public final void k0(boolean z10) {
        if (this.V1) {
            w0(0);
        }
        if (z10) {
            sz szVar = this.U1;
            if (szVar != null && szVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.U1.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.X1 = true;
                ofFloat.addListener(new b0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f22961w);
                ofFloat.start();
                return;
            }
            l0();
        }
    }

    public final void l0() {
        sz szVar;
        z3 z3Var;
        if (this.Y1 > 0 && (z3Var = ((nt0) this).f41996d2.K1) != null) {
            z3Var.a();
        }
        if (!this.V1 && (szVar = this.U1) != null && szVar.getVisibility() != 8) {
            this.U1.setVisibility(8);
        }
        this.Y1 = 0;
    }

    public final void m0(boolean z10) {
        int i10;
        int i11;
        if (this.V0 == 0) {
            int i12 = 0;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.f48329a1.setLayerType(i10, null);
            if (z10) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.R0.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.Q0.setLayerType(i12, null);
        }
    }

    public final boolean n0() {
        if (this.A1) {
            v0(false);
            return true;
        } else if (this.V1) {
            k0(true);
            return true;
        } else if (!this.I0) {
            return false;
        } else {
            q0(null, true);
            return true;
        }
    }

    public final void o0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.f48355u0.b(jVar.getUUID(), new s(this, jVar, 0));
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
        if (this.U1 != null) {
            if (AndroidUtilities.isTablet()) {
                Q = i15 - this.U1.getMeasuredHeight();
            } else {
                Q = (Q() + i15) - this.U1.getMeasuredHeight();
            }
            sz szVar = this.U1;
            szVar.layout(0, Q, szVar.getMeasuredWidth(), this.U1.getMeasuredHeight() + Q);
        }
        if (!this.K0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        d0 d0Var = this.L0;
        int ceil = (int) Math.ceil((i14 - d0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.t.D(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - d0Var.getMeasuredHeight()) / 2, i16);
        d0Var.layout(ceil, additionalTop, d0Var.getMeasuredWidth() + ceil, d0Var.getMeasuredHeight() + additionalTop);
        f0 f0Var = this.M0;
        f0Var.layout(ceil, additionalTop, f0Var.getMeasuredWidth() + ceil, f0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = d0Var.getMeasuredWidth();
        h0 h0Var = this.O0;
        int measuredWidth2 = ((measuredWidth - h0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((d0Var.getMeasuredHeight() - h0Var.getMeasuredHeight()) / 2) + additionalTop;
        h0Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        g21 g21Var = this.P0;
        if (g21Var != null) {
            g21Var.layout(measuredWidth2, measuredHeight, h0Var.getMeasuredWidth() + measuredWidth2, h0Var.getMeasuredHeight() + measuredHeight);
        }
        i0 i0Var = this.N0;
        i0Var.layout(ceil, additionalTop, i0Var.getMeasuredWidth() + ceil, i0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.E0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f48351s0;
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
        this.L0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        this.M0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        float f12 = f10 / this.G0.f32052a;
        this.F0 = f12;
        h0 h0Var = this.O0;
        h0Var.setScaleX(f12);
        h0Var.setScaleY(this.F0);
        h0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.G0.f32052a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.G0.f32053b, 1073741824));
        g21 g21Var = this.P0;
        if (g21Var != null) {
            g21Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.G0.f32052a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.G0.f32053b, 1073741824));
            this.P0.setScaleX(this.F0);
            this.P0.setScaleY(this.F0);
        }
        B0();
        this.N0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.R0, i10, i11);
        measureChild(this.f48329a1, i10, i11);
        measureChild(this.T0, i10, i11);
        measureChild(this.S0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.Y1), 1073741824));
        FrameLayout frameLayout = this.Q0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.E0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.V1 && !this.X1) {
            this.E0 = true;
            l0();
            this.E0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            l0();
        }
        sz szVar = this.U1;
        if (szVar != null) {
            measureChild(szVar, i10, i11);
        }
    }

    public final void p0(j jVar) {
        j jVar2 = this.H0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.H0 = null;
            if (jVar instanceof x2) {
                ValueAnimator valueAnimator = this.Y0;
                if (valueAnimator != null && this.W0 != 0) {
                    valueAnimator.cancel();
                }
                A0(0);
            }
        }
        this.O0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            rg.t1 t1Var = this.f48355u0;
            t1Var.f47560b.remove(uuid);
            t1Var.f47561c.remove(uuid);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(t1Var, 12));
        }
        y1 y1Var = this.f48329a1;
        h5 h5Var = this.f48330b1;
        y1Var.setValueOverride(h5Var);
        y1Var.setShowPreview(true);
        float f7 = h5Var.get();
        rg.q1 q1Var = this.f48366z1;
        q1Var.f47524c = f7;
        r0(q1Var, null);
    }

    @Override
    public final boolean q() {
        return true;
    }

    public final boolean q0(j jVar, boolean z10) {
        n0 n0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof x2;
        int i11 = 2;
        if (z12 && (((i10 = this.W0) == -1 && this.V0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.A1) {
                v0(false);
            }
            A0(2);
        }
        if (z12 && z10) {
            x2 x2Var = (x2) jVar;
            int gravity = x2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            q1 q1Var = this.f48340j1;
            q1Var.setAlignment(i11);
            q1Var.setTypeface(x2Var.getTypeface().f47437a);
            q1Var.e(x2Var.getType(), true);
            this.S0.invalidate();
        }
        j jVar2 = this.H0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.I0) {
                    int[] i02 = i0(jVar2);
                    x0(new s(this, jVar2, 1), this, 51, i02[0], i02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof x2) {
                    AndroidUtilities.showKeyboard(((x2) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            n0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = n0Var.H0;
            if (jVar3 instanceof x2) {
                x2 x2Var2 = (x2) jVar3;
                w2 w2Var = x2Var2.f48560q0;
                w2Var.clearFocus();
                w2Var.setEnabled(false);
                w2Var.setClickable(false);
                x2Var2.m();
                if (!z12) {
                    n0Var.I0 = false;
                    AndroidUtilities.hideKeyboard(((x2) n0Var.H0).getFocusedView());
                    k0(false);
                }
            }
            z11 = true;
        } else {
            n0Var = this;
            z11 = false;
        }
        j jVar4 = n0Var.H0;
        n0Var.H0 = jVar;
        if ((jVar4 instanceof x2) && TextUtils.isEmpty(((x2) jVar4).getText())) {
            p0(jVar4);
        }
        j jVar5 = n0Var.H0;
        h5 h5Var = n0Var.f48330b1;
        rg.q1 q1Var2 = n0Var.f48366z1;
        y1 y1Var = n0Var.f48329a1;
        if (jVar5 != null) {
            i0 i0Var = n0Var.N0;
            jVar5.m0 = i0Var;
            jVar5.l(i0Var, true);
            n0Var.O0.bringChildToFront(n0Var.H0);
            j jVar6 = n0Var.H0;
            if (jVar6 instanceof x2) {
                x2 x2Var3 = (x2) jVar6;
                x2Var3.f48569z0 = false;
                x2Var3.getSwatch().f47524c = q1Var2.f47524c;
                r0(x2Var3.getSwatch(), null);
                y1Var.setValueOverride(new i5(x2Var3, (int) (n0Var.G0.f32052a / 9.0f), 1));
                y1Var.setShowPreview(false);
                return true;
            }
            y1Var.setValueOverride(h5Var);
            y1Var.setShowPreview(true);
            q1Var2.f47524c = h5Var.get();
            r0(q1Var2, null);
            return true;
        }
        ValueAnimator valueAnimator2 = n0Var.Y0;
        if (valueAnimator2 != null && n0Var.W0 != 0) {
            valueAnimator2.cancel();
        }
        if (n0Var.A1) {
            v0(false);
        }
        A0(0);
        y1Var.setValueOverride(h5Var);
        y1Var.setShowPreview(true);
        q1Var2.f47524c = h5Var.get();
        r0(q1Var2, null);
        return z11;
    }

    @Override
    public final boolean r() {
        return !this.I0;
    }

    public final void r0(rg.q1 q1Var, Integer num) {
        rg.q1 q1Var2 = this.f48366z1;
        if (q1Var2 != q1Var) {
            q1Var2.f47522a = q1Var.f47522a;
            q1Var2.f47523b = q1Var.f47523b;
            q1Var2.f47524c = q1Var.f47524c;
            int i10 = this.E1;
            rg.s0.e(i10).h(q1Var.f47522a, true);
            rg.s0.e(i10).j(q1Var.f47524c);
        }
        int i11 = q1Var.f47522a;
        d0 d0Var = this.L0;
        d0Var.setColor(i11);
        d0Var.setBrushSize(q1Var.f47524c);
        int i12 = q1Var2.f47522a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new n4(this, num, i12, 2));
            duration.start();
        } else {
            l0 l0Var = this.R0;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        }
        j jVar = this.H0;
        if (jVar instanceof x2) {
            ((x2) jVar).setSwatch(new rg.q1(q1Var.f47523b, q1Var.f47524c, q1Var.f47522a));
        }
    }

    @Override
    public final void requestLayout() {
        if (this.E0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(float f7) {
        this.f48349r0 = f7;
        this.Q0.setTranslationY(-f7);
        this.R0.setTranslationY(f7);
    }

    public void setBlurredBackgroundDrawableForTools(eh.d dVar) {
        dVar.w(AndroidUtilities.dp(4.0f));
        this.R1 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.L1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.V0 == 0) {
            this.f48329a1.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.J1 = runnable;
    }

    @Override
    public final void u() {
        z3 z3Var;
        if (!this.W1 && !this.V1) {
            h0(true);
            return;
        }
        boolean z10 = this.V1;
        if (z10 && (z3Var = ((nt0) this).f41996d2.K1) != null) {
            z3Var.e = true;
        }
        w0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.H0;
            if (jVar instanceof x2) {
                AndroidUtilities.showKeyboard(((x2) jVar).getEditText());
            }
        }
    }

    public final void u0(float f7, float f10, float f11, float f12, float f13) {
        View view;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        this.f48361x0 = f7;
        this.C0 = f12;
        this.D0 = f13;
        this.f48363y0 = f10;
        this.f48365z0 = f11;
        this.A0 = f10;
        float f21 = f11 + 0.0f;
        this.B0 = f21;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                view = this.O0;
            } else if (i10 == 1) {
                view = this.N0;
            } else if (i10 == 2) {
                view = this.L0;
            } else {
                view = this.M0;
            }
            MediaController.CropState cropState = this.f48359w0;
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
                    float E = c3.h0.E(cropState.cropPx, measuredWidth, f7, max);
                    float f23 = cropState.cropScale;
                    f16 = (E * f23) + f10;
                    f14 = 1.0f;
                    f17 = (cropState.cropPy * measuredHeight * f7 * max * f23) + f21;
                    f18 = cropState.cropRotate + i11;
                } else {
                    return;
                }
            } else {
                f14 = 1.0f;
                if (i10 == 0) {
                    f15 = this.F0 * 1.0f;
                } else {
                    f15 = 1.0f;
                }
                f16 = f10;
                f17 = f21;
                f18 = 0.0f;
            }
            float f24 = ((-this.Y1) / 2.0f) + f17;
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
        B0();
        invalidate();
    }

    @Override
    public final void updateColors() {
        this.D1.setColor(-15132391);
    }

    @Override
    public final void v(float f7, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.O0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) org.telegram.messenger.t.a(radians, d10, Math.sin(radians) * d));
    }

    public final void v0(final boolean z10) {
        float f7;
        boolean z11;
        if (this.A1 != z10) {
            this.A1 = z10;
            o1.j jVar = this.B1;
            if (jVar != null) {
                jVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new ac.a(f7));
            this.B1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f18975i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18969u = kVar;
            if (!this.W1 && !this.V1) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.R0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.B1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f11, float f12) {
                    int i10;
                    n0 n0Var = n0.this;
                    l0 l0Var = n0Var.R0;
                    float f13 = f11 / 1000.0f;
                    n0Var.C1 = f13;
                    float f14 = ((1.0f - f13) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f14);
                    view.setScaleY(f14);
                    view.setTranslationY((Math.min(n0Var.C1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(n0Var.C1, 0.25f) / 0.25f));
                    k0 k0Var = n0Var.f48358v1;
                    float f15 = n0Var.C1;
                    boolean z12 = z10;
                    k0Var.E1(f15, z12);
                    n0Var.f48347q0.setProgress(n0Var.C1);
                    n0Var.f48345p0.setProgress(n0Var.C1);
                    n0Var.U0.setTranslationY(AndroidUtilities.dp(32.0f) * n0Var.C1);
                    if (zArr[0]) {
                        float f16 = n0Var.C1;
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
                    if (view == n0Var.f48340j1) {
                        n0Var.S0.invalidate();
                    }
                }
            });
            this.B1.a(new r(this, z10, 1));
            this.B1.h();
            if (z10) {
                k0 k0Var = this.f48358v1;
                k0Var.setVisibility(0);
                k0Var.setSelectedColorIndex(rg.s0.e(this.E1).d());
            }
        }
    }

    @Override
    public final rg.s0 w() {
        return rg.s0.e(this.E1);
    }

    public final void w0(int i10) {
        boolean z10;
        int i11;
        q1 q1Var = this.f48340j1;
        if (i10 == 1) {
            sz szVar = this.U1;
            if (szVar != null && szVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sz szVar2 = this.U1;
            if (szVar2 != null && szVar2.f32716c1 != UserConfig.selectedAccount) {
                removeView(szVar2);
                this.U1 = null;
            }
            if (this.U1 == null) {
                sz szVar3 = new sz(null, true, false, false, getContext(), false, null, null, true, this.F1, false, false);
                this.U1 = szVar3;
                szVar3.U0 = true;
                szVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.U1.setForseMultiwindowLayout(true);
                }
                this.U1.setDelegate(new c0(this));
                addView(this.U1);
            }
            this.U1.setVisibility(0);
            this.V1 = true;
            sz szVar4 = this.U1;
            if (this.Z1 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.Z1 = AndroidUtilities.dp(150.0f);
                } else {
                    this.Z1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.a2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.a2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.a2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.a2;
            } else {
                i11 = this.Z1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) szVar4.getLayoutParams();
            layoutParams.height = i11;
            szVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.H0;
                if (jVar instanceof x2) {
                    AndroidUtilities.hideKeyboard(((x2) jVar).getEditText());
                }
            }
            this.Y1 = i11;
            requestLayout();
            z3 z3Var = ((nt0) this).f41996d2.K1;
            if (z3Var != null) {
                z3Var.a();
            }
            ah emojiButton = q1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            getHeight();
            if (!z10 && !this.W1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y1, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new b0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        ah emojiButton2 = q1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(yg.e, true);
        }
        sz szVar5 = this.U1;
        if (szVar5 != null) {
            this.V1 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                szVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.Y1 = 0;
        }
        z3 z3Var2 = ((nt0) this).f41996d2.K1;
        if (z3Var2 != null) {
            z3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void x0(Runnable runnable, n0 n0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.o1 o1Var = this.G1;
        if (o1Var != null && o1Var.isShowing()) {
            this.G1.d(true);
            return;
        }
        if (this.H1 == null) {
            this.I1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.F1);
            this.H1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.H1.setBackgroundColor(-14145495);
            this.H1.setOnTouchListener(new w4(this, 1));
            this.H1.setDispatchKeyEventListener(new q(this));
            this.H1.setShownFromBottom(true);
        }
        this.H1.d();
        runnable.run();
        if (this.G1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.H1, -2, -2);
            this.G1 = o1Var2;
            o1Var2.f22906b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.G1.setOutsideTouchable(true);
            this.G1.setClippingEnabled(true);
            this.G1.setInputMethodMode(2);
            this.G1.setSoftInputMode(0);
            this.G1.getContentView().setFocusableInTouchMode(true);
            this.G1.setOnDismissListener(new y4(this, 1));
        }
        this.H1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.G1.setFocusable(true);
        this.G1.showAtLocation(n0Var, i10, i11 - (this.H1.getMeasuredWidth() / 2), i12 - this.H1.getMeasuredHeight());
        org.telegram.ui.ActionBar.o1.i(this.H1);
    }

    public final void y0(boolean z10) {
        float f7;
        if (this.f48354t1 != z10) {
            this.f48354t1 = z10;
            o1.j jVar = this.f48356u1;
            if (jVar != null) {
                jVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new ac.a(f7));
            this.f48356u1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f18975i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f18969u = kVar;
            if (z10) {
                v1 v1Var = this.f48341k1;
                v1Var.setAlpha(0.0f);
                v1Var.setVisibility(0);
            }
            this.f48356u1.b(new i8(3, this));
            this.f48356u1.a(new r(this, z10, 0));
            this.f48356u1.h();
        }
    }

    @Override
    public final void z() {
        x0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final PointF z0(j jVar) {
        float f7 = 200.0f;
        MediaController.CropState cropState = this.f48359w0;
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
        PointF e02 = e0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                h0 h0Var = this.O0;
                if (i10 >= h0Var.getChildCount()) {
                    break;
                }
                View childAt = h0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return e02;
            }
            e02 = new PointF(e02.x + f7, e02.y + f7);
        }
    }

    @Override
    public final void B() {
    }

    @Override
    public final void g() {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void A(boolean z10) {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public final void f(boolean z10) {
    }

    @Override
    public final void l(boolean z10) {
    }
}
