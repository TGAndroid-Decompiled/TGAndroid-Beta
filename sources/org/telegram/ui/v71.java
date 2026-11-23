package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class v71 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.y5, org.telegram.messenger.fs {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public m71 B1;
    public org.telegram.ui.Components.j30 C0;
    public m71 C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public t4 E0;
    public Bitmap E1;
    public final int F;
    public s61 F0;
    public boolean F1;
    public final int G;
    public s61 G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public boolean H1;
    public final int I;
    public ImageView I0;
    public String I1;
    public final boolean J;
    public AnimatorSet J0;
    public int J1;
    public final long K;
    public AnimatorSet K0;
    public u71 K1;
    public final long L;
    public org.telegram.ui.Components.l71[] L0;
    public long L1;
    public final long M;
    public org.telegram.ui.Components.l71[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public org.telegram.ui.Components.nh0 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public org.telegram.ui.ActionBar.q0 Q1;
    public long R;
    public d61 R0;
    public ValueAnimator R1;
    public y70 S;
    public t71 S0;
    public di.n4 S1;
    public final org.telegram.ui.ActionBar.s5 T;
    public v4.c0 T0;
    public r61 T1;
    public final org.telegram.ui.ActionBar.s5 U;
    public org.telegram.ui.Cells.o4 U0;
    public final org.telegram.ui.Components.l10 U1;
    public final org.telegram.ui.ActionBar.s5 V;
    public org.telegram.ui.Cells.i0 V0;
    public boolean V1;
    public final org.telegram.ui.ActionBar.s5 W;
    public ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.jq X;
    public final HashMap X0;
    public TL_stories.TL_premium_boostsStatus X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public int Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final u61 f52845a;
    public final Runnable f52846a0;
    public TLRPC.TL_wallPaper f52847a1;
    public float f52848a2;
    public final int f52849b;
    public boolean f52850b0;
    public int f52851b1;
    public float f52852b2;
    public Scroller f52853c;
    public hi.w5 f52854c0;
    public int f52855c1;
    public boolean f52856c2;
    public final boolean d;
    public FrameLayout f52857d0;
    public int f52858d1;
    public int d2;
    public hi.d3 f52859e;
    public TextView f52860e0;
    public int f52861e1;
    public ValueAnimator f52862e2;
    public org.telegram.ui.ActionBar.q0 f52863f;
    public TextView f52864f0;
    public int f52865f1;
    public boolean f52866f2;
    public final org.telegram.ui.ActionBar.m6 f52867g0;
    public int f52868g1;
    public TextView f52869g2;
    public TextView h;
    public final boolean f52870h0;
    public int f52871h1;
    public WeakReference f52872h2;
    public final boolean f52873i0;
    public int f52874i1;
    public BitmapDrawable f52875i2;
    public final boolean f52876j0;
    public int f52877j1;
    public bc f52878j2;
    public ArrayList f52879k0;
    public int f52880k1;
    public float f52881k2;
    public c5.l f52882l0;
    public int l1;
    public ValueAnimator f52883l2;
    public w61 m0;
    public int f52884m1;
    public int f52885n;
    public UndoView f52886n0;
    public float n1;
    public FrameLayout f52887o0;
    public float f52888o1;
    public org.telegram.ui.Components.ek0 f52889p0;
    public float f52890p1;
    public l4 f52891q0;
    public float f52892q1;
    public Drawable f52893r;
    public org.telegram.ui.Components.a10 f52894r0;
    public n71 f52895r1;
    public int f52896s;
    public org.telegram.messenger.fj f52897s0;
    public org.telegram.ui.Components.kq f52898s1;
    public boolean f52899t0;
    public AnimatorSet f52900t1;
    public org.telegram.ui.ActionBar.k f52901u0;
    public final PorterDuff.Mode f52902u1;
    public ai.i0 f52903v0;
    public int f52904v1;
    public final org.telegram.ui.ActionBar.k6 f52905w;
    public p61 f52906w0;
    public org.telegram.ui.Components.j9 f52907w1;
    public boolean f52908x;
    public r71 f52909x0;
    public org.telegram.ui.Components.n71 f52910x1;
    public final int f52911y;
    public final l71[] f52912y0;
    public Bitmap f52913y1;
    public l71 f52914z0;
    public Bitmap f52915z1;

    public v71(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f52845a = new u61(this);
        this.d = true;
        this.f52885n = 1;
        org.telegram.ui.ActionBar.s5 s5Var = new org.telegram.ui.ActionBar.s5(this, 0, false);
        this.T = s5Var;
        org.telegram.ui.ActionBar.s5 s5Var2 = new org.telegram.ui.ActionBar.s5(this, 0, true);
        this.U = s5Var2;
        org.telegram.ui.ActionBar.s5 s5Var3 = new org.telegram.ui.ActionBar.s5(this, 1, false);
        this.V = s5Var3;
        org.telegram.ui.ActionBar.s5 s5Var4 = new org.telegram.ui.ActionBar.s5(this, 1, true);
        this.W = s5Var4;
        this.Z = -1;
        this.f52846a0 = new h61(this, 0);
        this.f52912y0 = new l71[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.f52890p1 = 0.0f;
        this.f52902u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new org.telegram.ui.Components.l10(getParentActivity(), new x61(this));
        this.V1 = false;
        this.W1 = false;
        this.f52849b = 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z10;
        if (obj instanceof pc1) {
            pc1 pc1Var = (pc1) obj;
            this.G1 = pc1Var.f50986j;
            TLRPC.TL_wallPaper tL_wallPaper = pc1Var.f50984g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = pc1Var.h;
                this.n1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.n6.I.q()) {
                    this.n1 *= -1.0f;
                }
            }
        }
        s5Var.v = true;
        s5Var3.v = true;
        s5Var2.v = true;
        s5Var4.v = true;
    }

    public static void Z(v71 v71Var, org.telegram.messenger.g3 g3Var) {
        if (v71Var.getParentActivity() == null) {
            return;
        }
        ug.k0 k0Var = new ug.k0(23, v71Var.currentAccount, v71Var.getParentActivity(), v71Var, v71Var.f52845a);
        k0Var.B1(g3Var);
        k0Var.A1(v71Var.X1, true);
        k0Var.C1(v71Var.L1);
        if (!v71Var.Z0()) {
            k0Var.M2 = new h61(v71Var, 1);
        }
        v71Var.showDialog(k0Var);
    }

    public static void a0(v71 v71Var) {
        org.telegram.ui.ActionBar.k6 k10;
        org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.n6.M;
        if (m6Var == null) {
            return;
        }
        int i7 = m6Var.f29321a0;
        if (i7 >= 0) {
            k10 = (org.telegram.ui.ActionBar.k6) m6Var.f29323b0.get(i7);
        } else {
            k10 = m6Var.k(false);
        }
        if (v71Var.f52905w != null) {
            v71Var.b1();
            org.telegram.ui.ActionBar.n6.z1(v71Var.f52867g0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.n6.M != null) {
                org.telegram.ui.ActionBar.n6.O = false;
                org.telegram.ui.ActionBar.n6.P = false;
                org.telegram.ui.ActionBar.n6.M = null;
            }
            org.telegram.ui.ActionBar.n6.u(v71Var.f52867g0, true, v71Var.f52870h0);
            ((ActionBarLayout) v71Var.parentLayout).X(false, false);
        } else {
            ((ActionBarLayout) v71Var.parentLayout).X(false, false);
            File file = new File(v71Var.f52867g0.f29322b);
            org.telegram.ui.ActionBar.m6 m6Var2 = v71Var.f52867g0;
            org.telegram.ui.ActionBar.n6.v(file, m6Var2.f29320a, m6Var2.G, false);
            org.telegram.messenger.mp.u1(v71Var.f52867g0.F).G4(v71Var.f52867g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", v71Var.f52867g0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) v71Var.getParentLayout().getFragmentStack().get(Math.max(0, v71Var.getParentLayout().getFragmentStack().size() - 2));
        v71Var.finishFragment();
        if (v71Var.f52849b == 0) {
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25288s4, m6Var, k10, Boolean.valueOf(v71Var.f52876j0));
        }
        org.telegram.ui.ActionBar.n6.M1(g2Var);
    }

    public static void b0(v71 v71Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = v71Var.X0;
        org.telegram.ui.ActionBar.k6 k6Var = v71Var.f52905w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            v71Var.W0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (tL_wallPapers.wallpapers.get(i7) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i7);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f28498id))) {
                            v71Var.W0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f28498id), tL_wallPaper2);
                        }
                        if (k6Var != null && (str = k6Var.f29236o) != null && str.equals(tL_wallPaper2.slug)) {
                            v71Var.Y0 = tL_wallPaper2;
                            v71Var.g1(false);
                            v71Var.o1();
                        } else if (k6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = v71Var.Y0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (tL_wallPaper = v71Var.Y0) != null) {
                v71Var.W0.add(0, tL_wallPaper);
            }
            t71 t71Var = v71Var.S0;
            if (t71Var != null) {
                t71Var.f();
            }
            org.telegram.messenger.tr.a0(v71Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (v71Var.Y0 == null && k6Var != null && !TextUtils.isEmpty(k6Var.f29236o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = k6Var.f29236o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(v71Var.currentAccount).bindRequestToGuid(v71Var.getConnectionsManager().sendRequest(getwallpaper, new n61(v71Var, 0)), v71Var.classGuid);
        }
    }

    @Override
    public final void C(boolean z10) {
        o1();
    }

    @Override
    public final void N(String str) {
        o1();
    }

    public final void Q0() {
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D0 = animatorSet2;
        if (this.G1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f52914z0, View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.f52914z0, View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f52914z0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f52914z0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f52914z0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f52914z0, View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(org.telegram.ui.Components.kr.f36859g);
        this.D0.addListener(new z61(this, 1));
        this.D0.start();
    }

    public final void R0(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v71.R0(boolean):void");
    }

    public final void S0(boolean z10) {
        int i7 = this.f52849b;
        if (i7 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n6.p();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.C4);
        org.telegram.ui.ActionBar.k6 k6Var = this.f52905w;
        if (i7 == 1) {
            if (this.f52873i0) {
                k6Var.f29226c = this.f52911y;
                k6Var.d = this.E;
                k6Var.f29227e = this.F;
                k6Var.f29228f = this.G;
                k6Var.f29229g = this.H;
                k6Var.h = this.I;
                k6Var.f29230i = this.J;
                k6Var.f29231j = this.K;
                k6Var.f29232k = this.L;
                k6Var.f29233l = this.M;
                k6Var.f29234m = this.N;
                k6Var.f29235n = this.Q;
                k6Var.f29236o = this.P;
                k6Var.f29237p = this.O;
            }
            org.telegram.ui.ActionBar.n6.z1(this.f52867g0, false, true, false, false, false);
        } else {
            if (k6Var != null) {
                org.telegram.ui.ActionBar.n6.z1(this.f52867g0, false, this.f52876j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).X(false, false);
            if (this.f52876j0) {
                org.telegram.ui.ActionBar.m6 m6Var = this.f52867g0;
                if (m6Var.f29322b != null && org.telegram.ui.ActionBar.n6.H.get(m6Var.m()) == null) {
                    new File(m6Var.f29322b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable T0(Drawable drawable) {
        WeakReference weakReference = this.f52872h2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f52875i2;
        }
        WeakReference weakReference2 = this.f52872h2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f52872h2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f52872h2 = new WeakReference(drawable);
            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, 24);
            ColorFilter colorFilter = drawable.getColorFilter();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.3f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.94f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.draw(new Canvas(createBitmap));
            drawable.setColorFilter(colorFilter);
            Utilities.blurBitmap(createBitmap, 3);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
            this.f52875i2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f52875i2;
        }
        this.f52875i2 = null;
        return null;
    }

    public final boolean U0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v71.U0(boolean):boolean");
    }

    public final void V0() {
        int themedColor;
        hi.d3 d3Var = this.f52859e;
        int i7 = 0;
        if (d3Var != null) {
            d3Var.I(getThemedColor(org.telegram.ui.ActionBar.n6.G8));
            this.f52859e.P(getThemedColor(org.telegram.ui.ActionBar.n6.E8), false);
        }
        if (this.f52893r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6)) != this.f52896s) {
            this.f52896s = themedColor;
            this.f52893r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        t4 t4Var = this.E0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
        if (this.f52895r1 != null) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && r4Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.n6.f29524h5));
                if (this.f52849b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29524h5));
            }
        }
        if (this.L0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.l71[] l71VarArr = this.L0;
                if (i10 >= l71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.l71 l71Var = l71VarArr[i10];
                if (l71Var != null) {
                    l71Var.invalidate();
                }
                i10++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                org.telegram.ui.Components.l71[] l71VarArr2 = this.M0;
                if (i7 >= l71VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.l71 l71Var2 = l71VarArr2[i7];
                if (l71Var2 != null) {
                    l71Var2.invalidate();
                }
                i7++;
            }
        }
        TextView textView = this.f52869g2;
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, this.f52845a);
        }
        org.telegram.ui.Components.jq jqVar = this.X;
        if (jqVar != null) {
            jqVar.invalidate();
        }
        org.telegram.ui.Components.a10 a10Var = this.f52894r0;
        if (a10Var != null) {
            a10Var.updateColors();
        }
    }

    public final int W0() {
        if (org.telegram.messenger.v3.U(this.currentAccount, -this.L1)) {
            return getMessagesController().f25900x5;
        }
        return getMessagesController().C5;
    }

    public final ArrayList X0() {
        g6 g6Var = new g6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52882l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29731s8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52901u0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52901u0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.E8));
        org.telegram.ui.Components.jq jqVar = this.X;
        if (jqVar != null) {
            org.telegram.ui.ActionBar.q0 q0Var = jqVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = jqVar.F;
            for (int i7 = 0; i7 < editTextBoldCursorArr.length; i7++) {
                arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursorArr[i7], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursorArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29580k6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursorArr[i7], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29598l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.w6(jqVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I5));
            if (q0Var != null) {
                org.telegram.ui.Components.w6 w6Var = new org.telegram.ui.Components.w6(jqVar, 2);
                arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.N0;
        if (frameLayoutArr != null) {
            for (int i10 = 0; i10 < frameLayoutArr.length; i10++) {
            }
            for (int i11 = 0; i11 < this.Q0.length; i11++) {
            }
            for (int i12 = 0; i12 < this.P0.length; i12++) {
            }
            for (int i13 = 0; i13 < this.O0.length; i13++) {
            }
            org.telegram.ui.ActionBar.s5 s5Var = this.T;
            org.telegram.ui.ActionBar.s5 s5Var2 = this.V;
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52906w0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29772ub));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52906w0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29791vb));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52906w0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29810wb));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52906w0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Nd));
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52906w0, 0, new Class[]{org.telegram.ui.Cells.r1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Tb));
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((org.telegram.ui.ActionBar.w6) arrayList.get(i14)).f30289n = this.f52845a;
        }
        return arrayList;
    }

    public final boolean Y0(int i7) {
        int E0;
        long j3;
        if (this.f52873i0) {
            return false;
        }
        org.telegram.ui.ActionBar.k6 k6Var = this.f52905w;
        if (i7 == 1 || i7 == 2) {
            long j10 = this.K;
            if (j10 != 0) {
                if (j10 != k6Var.f29231j) {
                    return true;
                }
            } else {
                int E02 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ee);
                int i10 = (int) k6Var.f29231j;
                if (i10 == 0) {
                    i10 = E02;
                }
                if (i10 != E02) {
                    return true;
                }
            }
            long j11 = this.L;
            int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            long j12 = this.N;
            long j13 = this.M;
            if (i11 == 0 && j13 == 0 && j12 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Fe);
                        j3 = k6Var.f29232k;
                    } else if (i12 == 1) {
                        E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                        j3 = k6Var.f29233l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.He);
                        j3 = k6Var.f29234m;
                    }
                    int i13 = (int) j3;
                    if (i13 == 0 && j3 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = E0;
                    }
                    if (i13 != E0) {
                        return true;
                    }
                }
            } else if (j11 != k6Var.f29232k || j13 != k6Var.f29233l || j12 != k6Var.f29234m) {
                return true;
            }
            if (k6Var.f29235n != this.Q) {
                return true;
            }
        }
        if (i7 == 1 || i7 == 3) {
            if (this.f52911y != k6Var.d) {
                return true;
            }
            int i14 = this.F;
            if (i14 != 0) {
                if (i14 != k6Var.f29227e) {
                    return true;
                }
            } else {
                int i15 = k6Var.f29227e;
                if (i15 != 0 && i15 != k6Var.f29226c) {
                    return true;
                }
            }
            int i16 = this.G;
            if (i16 != 0) {
                if (i16 != k6Var.f29228f) {
                    return true;
                }
            } else if (k6Var.f29228f != 0) {
                return true;
            }
            int i17 = this.H;
            if (i17 != 0) {
                if (i17 != k6Var.f29229g) {
                    return true;
                }
            } else if (k6Var.f29229g != 0) {
                return true;
            }
            int i18 = this.I;
            if (i18 != 0) {
                if (i18 != k6Var.h) {
                    return true;
                }
            } else if (k6Var.h != 0) {
                return true;
            }
            if (this.J != k6Var.f29230i) {
                return true;
            }
        }
        return false;
    }

    public boolean Z0() {
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && r4Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void a1() {
        float f10;
        di.n4 n4Var = this.S1;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.A0.getChildAt(i7).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                this.B0.getChildAt(i10).invalidate();
            }
        }
        if (this.L0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.l71[] l71VarArr = this.L0;
                if (i11 >= l71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.l71 l71Var = l71VarArr[i11];
                if (l71Var != null) {
                    if (this.O1) {
                        f10 = this.f52890p1 * this.f52892q1;
                    } else {
                        f10 = 0.0f;
                    }
                    l71Var.setDimAmount(f10);
                    this.L0[i11].invalidate();
                }
                i11++;
            }
        }
        if (this.f52889p0 != null) {
            for (int i12 = 0; i12 < this.f52889p0.getChildCount(); i12++) {
                View childAt = this.f52889p0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    i1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f52906w0 != null) {
            for (int i13 = 0; i13 < this.f52906w0.getChildCount(); i13++) {
                View childAt2 = this.f52906w0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    i1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        m71 m71Var = this.B1;
        if (m71Var != null) {
            m71Var.invalidate();
        }
        m71 m71Var2 = this.C1;
        if (m71Var2 != null) {
            m71Var2.invalidate();
        }
        t4 t4Var = this.E0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29542i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29524h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29475ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29566jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29477ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29567jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29752tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29715rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29751ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29714ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Kj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B8));
    }

    public final void b1() {
        org.telegram.ui.ActionBar.k6 k6Var = this.f52905w;
        if (k6Var != null && !TextUtils.isEmpty(k6Var.f29236o)) {
            try {
                File e10 = k6Var.e();
                Drawable background = this.f52914z0.getBackground();
                Bitmap n10 = this.f52914z0.getImageReceiver().n();
                if (background instanceof org.telegram.ui.Components.za0) {
                    FileOutputStream fileOutputStream = new FileOutputStream(e10);
                    n10.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(n10.getWidth(), n10.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                background.setBounds(0, 0, n10.getWidth(), n10.getHeight());
                background.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(this.l1, this.f52902u1));
                paint.setAlpha((int) (this.n1 * 255.0f));
                canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(e10);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
    }

    public final void c1() {
        d1(2, true);
    }

    @Override
    public final android.view.View createView(android.content.Context r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v71.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i7, boolean z10) {
        org.telegram.ui.ActionBar.k6 k6Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (getParentActivity() != null && this.f52885n != i7 && this.f52900t1 == null && (k6Var = this.f52905w) != null) {
            if (z10 && i7 == 2 && (org.telegram.ui.ActionBar.n6.c1() || k6Var.f29231j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131752538, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                if (org.telegram.ui.ActionBar.n6.c1() && (!org.telegram.ui.ActionBar.n6.c1() || org.telegram.ui.ActionBar.n6.I.f29334j0.d == 0)) {
                    t1Var.U = org.telegram.messenger.gd.N0(2131752517, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752540, null), new j61(this, 7));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                } else {
                    t1Var.U = org.telegram.messenger.gd.N0(2131752537, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745922, null), new j61(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751759, null), new j61(this, 6));
                }
                showDialog(t1Var);
                return;
            }
            int i17 = this.f52885n;
            this.f52885n = i7;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        this.h.setText(org.telegram.messenger.gd.N0(2131752002, null));
                        if (k6Var.f29228f != 0) {
                            if (k6Var.h != 0) {
                                i16 = 4;
                            } else if (k6Var.f29229g != 0) {
                                i16 = 3;
                            } else {
                                i16 = 2;
                            }
                        } else {
                            i16 = 1;
                        }
                        org.telegram.ui.Components.jq jqVar = this.X;
                        Y0(3);
                        jqVar.f(2, 4, i16, true);
                        this.X.e(k6Var.h, 3);
                        this.X.e(k6Var.f29229g, 2);
                        this.X.e(k6Var.f29228f, 1);
                        org.telegram.ui.Components.jq jqVar2 = this.X;
                        int i18 = k6Var.f29227e;
                        if (i18 == 0) {
                            i18 = k6Var.f29226c;
                        }
                        jqVar2.e(i18, 0);
                        this.M0[1].b(0, k6Var.f29227e);
                        this.M0[1].b(1, k6Var.f29228f);
                        this.M0[1].b(2, k6Var.f29229g);
                        this.M0[1].b(3, k6Var.h);
                        if (k6Var.f29229g != 0) {
                            if (i17 == 1) {
                                this.f52909x0.i(0);
                            } else {
                                this.f52909x0.g(0);
                            }
                        } else if (i17 == 2) {
                            this.f52909x0.s(0);
                        }
                        this.f52906w0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                        j1();
                    }
                    i10 = i17;
                } else {
                    this.h.setText(org.telegram.messenger.gd.N0(2131752004, null));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.Ee);
                    int i19 = org.telegram.ui.ActionBar.n6.Fe;
                    if (org.telegram.ui.ActionBar.n6.f1(i19)) {
                        i12 = getThemedColor(i19);
                    } else {
                        i12 = 0;
                    }
                    int i20 = org.telegram.ui.ActionBar.n6.Ge;
                    if (org.telegram.ui.ActionBar.n6.f1(i20)) {
                        i13 = getThemedColor(i20);
                    } else {
                        i13 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.n6.He;
                    if (org.telegram.ui.ActionBar.n6.f1(i21)) {
                        i14 = getThemedColor(i21);
                    } else {
                        i14 = 0;
                    }
                    long j3 = k6Var.f29232k;
                    int i22 = (int) j3;
                    if (i22 == 0 && j3 != 0) {
                        i12 = 0;
                    }
                    long j10 = k6Var.f29233l;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = k6Var.f29234m;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    int i25 = (int) k6Var.f29231j;
                    if (i22 == 0 && i12 == 0) {
                        i15 = 1;
                    } else if (i24 == 0 && i14 == 0) {
                        if (i23 == 0 && i13 == 0) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    } else {
                        i15 = 4;
                    }
                    org.telegram.ui.Components.jq jqVar3 = this.X;
                    Y0(2);
                    jqVar3.f(2, 4, i15, false);
                    org.telegram.ui.Components.jq jqVar4 = this.X;
                    if (i24 == 0) {
                        i24 = i14;
                    }
                    jqVar4.e(i24, 3);
                    org.telegram.ui.Components.jq jqVar5 = this.X;
                    if (i23 == 0) {
                        i23 = i13;
                    }
                    jqVar5.e(i23, 2);
                    org.telegram.ui.Components.jq jqVar6 = this.X;
                    if (i22 == 0) {
                        i22 = i12;
                    }
                    jqVar6.e(i22, 1);
                    org.telegram.ui.Components.jq jqVar7 = this.X;
                    if (i25 != 0) {
                        themedColor = i25;
                    }
                    jqVar7.e(themedColor, 0);
                    i10 = i17;
                    if (i10 != 1 && k6Var.f29229g != 0) {
                        this.f52909x0.g(0);
                    } else {
                        this.f52909x0.i(0);
                    }
                    this.f52906w0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                }
            } else {
                i10 = i17;
                this.h.setText(org.telegram.messenger.gd.N0(2131752003, null));
                if (k6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.jq jqVar8 = this.X;
                Y0(1);
                jqVar8.f(1, 2, i11, false);
                this.X.e(k6Var.f29226c, 0);
                int i26 = k6Var.d;
                if (i26 != 0) {
                    this.X.e(i26, 1);
                }
                if (i10 == 2 || (i10 == 3 && k6Var.f29229g != 0)) {
                    this.f52909x0.s(0);
                }
            }
            if (i7 != 1 && i7 != 3) {
                this.X.setMinBrightness(0.0f);
                this.X.setMaxBrightness(1.0f);
                return;
            }
            if (i10 == 2 && this.N0[1].getVisibility() == 0) {
                k1(0, true, true);
            }
            if (i7 == 1) {
                if (this.f52867g0.q()) {
                    this.X.setMinBrightness(0.2f);
                    return;
                }
                this.X.setMinBrightness(0.05f);
                this.X.setMaxBrightness(0.8f);
                return;
            }
            this.X.setMinBrightness(0.0f);
            this.X.setMaxBrightness(1.0f);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i7 == org.telegram.messenger.ks.f25280r3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
            }
        } else if (i7 == org.telegram.messenger.ks.f25247l4) {
            org.telegram.ui.Components.ek0 ek0Var = this.f52889p0;
            if (ek0Var != null) {
                int childCount = ek0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f52889p0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.u2) {
                        ((org.telegram.ui.Cells.u2) childAt).k0(0, true);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25252m4) {
            p61 p61Var = this.f52906w0;
            if (p61Var != null) {
                p61Var.g1();
            }
        } else if (i7 == org.telegram.messenger.ks.C4) {
            if (this.f52903v0 != null) {
                g1(true);
            }
        } else if (i7 == org.telegram.messenger.ks.f25231i4) {
            Object obj = this.D1;
            if (obj instanceof qc1) {
                qc1 qc1Var = (qc1) obj;
                if (qc1Var.f51439a == null) {
                    qc1Var.f51439a = (String) objArr[0];
                }
            }
        } else {
            long j3 = 0;
            if (i7 == org.telegram.messenger.ks.f25225h4) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.W0.clear();
                HashMap hashMap = this.X0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i12);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f28498id))) {
                            this.W0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f28498id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.k6 k6Var = this.f52905w;
                        if (k6Var != null && (str = k6Var.f29236o) != null && str.equals(wallPaper.slug)) {
                            this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                            g1(false);
                            o1();
                        } else if (k6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                            if (tL_wallPaper2 != null) {
                                String str2 = tL_wallPaper2.slug;
                                if (str2 != null) {
                                    if (!str2.equals(wallPaper.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
                if (!z10 && (tL_wallPaper = this.Y0) != null) {
                    this.W0.add(0, tL_wallPaper);
                }
                t71 t71Var = this.S0;
                if (t71Var != null) {
                    t71Var.f();
                }
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i13);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j3 = org.telegram.messenger.ri.r(j3, wallPaper2.f28646id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j3;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new n61(this, 1)), this.classGuid);
            } else if (i7 == org.telegram.messenger.ks.f25322x5 && this.L1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(int i7) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i7 >= 0 && i7 < this.W0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.W0.get(i7);
        } else {
            tL_wallPaper = this.f52847a1;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f52862e2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f52862e2.cancel();
        }
        l71[] l71VarArr = this.f52912y0;
        l71 l71Var = l71VarArr[0];
        l71 l71Var2 = l71VarArr[1];
        l71VarArr[0] = l71Var2;
        l71VarArr[1] = l71Var;
        this.f52903v0.removeView(l71Var2);
        this.f52903v0.addView(l71VarArr[0], this.f52903v0.indexOfChild(l71VarArr[1]) + 1);
        l71 l71Var3 = l71VarArr[0];
        this.f52914z0 = l71Var3;
        l71Var3.setBackground(l71VarArr[1].getBackground());
        p1();
        l71VarArr[1].setVisibility(0);
        l71VarArr[1].setAlpha(1.0f);
        this.f52914z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f52862e2 = ofFloat;
        ofFloat.addUpdateListener(new ji(2, this));
        this.f52862e2.addListener(new z61(this, 0));
        this.f52862e2.setInterpolator(org.telegram.ui.Components.kr.f36858f);
        this.f52862e2.setDuration(300L);
        this.f52862e2.start();
        this.f52914z0.getImageReceiver().f22761t1 = 300;
        this.f52914z0.getImageReceiver().s0(org.telegram.messenger.fc.b(tL_wallPaper2.document), this.I1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f52914z0.e();
        this.Y0 = tL_wallPaper2;
        this.G1 = this.L0[2].f37084s;
        o1();
    }

    public final void f1(int i7, int i10, boolean z10) {
        org.telegram.ui.Components.za0 za0Var;
        if (i10 == 0) {
            this.f52851b1 = i7;
        } else if (i10 == 1) {
            this.f52858d1 = i7;
        } else if (i10 == 2) {
            this.f52861e1 = i7;
        } else if (i10 == 3) {
            this.f52865f1 = i7;
        }
        r1(z10);
        if (this.L0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.l71[] l71VarArr = this.L0;
                if (i11 >= l71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.l71 l71Var = l71VarArr[i11];
                if (l71Var != null) {
                    l71Var.b(i10, i7);
                }
                i11++;
            }
        }
        if (this.f52861e1 != 0) {
            if (this.V0 != null && org.telegram.ui.ActionBar.n6.I.q()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.f52914z0.getBackground();
            if (background instanceof org.telegram.ui.Components.za0) {
                za0Var = (org.telegram.ui.Components.za0) background;
            } else {
                za0Var = new org.telegram.ui.Components.za0();
                za0Var.q(this.f52914z0);
                if (this.F1) {
                    za0Var.m(false);
                }
            }
            za0Var.n(this.f52851b1, this.f52858d1, this.f52861e1, this.f52865f1);
            this.f52914z0.setBackground(za0Var);
            this.l1 = za0Var.f();
            this.f52884m1 = 754974720;
        } else if (this.f52858d1 != 0) {
            this.f52914z0.setBackground(new GradientDrawable(org.telegram.ui.Components.o9.d(this.f52877j1), new int[]{this.f52851b1, this.f52858d1}));
            int V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(this.f52851b1, this.f52858d1), false);
            this.f52884m1 = V0;
            this.l1 = V0;
        } else {
            this.f52914z0.setBackgroundColor(this.f52851b1);
            int V02 = org.telegram.messenger.g0.V0(this.f52851b1, false);
            this.f52884m1 = V02;
            this.l1 = V02;
        }
        int i12 = org.telegram.ui.ActionBar.n6.f29440cd;
        boolean f12 = org.telegram.ui.ActionBar.n6.f1(i12);
        u61 u61Var = this.f52845a;
        if (f12 && !(this.f52914z0.getBackground() instanceof org.telegram.ui.Components.za0)) {
            if (org.telegram.ui.ActionBar.n6.t0() instanceof org.telegram.ui.Components.za0) {
                getThemedColor(i12);
                u61Var.a(this.f52914z0.getBackground(), this.f52914z0.getBackground(), Float.valueOf(this.n1));
            }
        } else {
            u61Var.a(this.f52914z0.getBackground(), this.f52914z0.getBackground(), Float.valueOf(this.n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Zc, u61Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.Zc, u61Var, PorterDuff.Mode.MULTIPLY);
        }
        l71 l71Var2 = this.f52914z0;
        if (l71Var2 != null) {
            l71Var2.getImageReceiver().f22751p1 = new PorterDuffColorFilter(this.l1, this.f52902u1);
            this.f52914z0.getImageReceiver().setAlpha(Math.abs(this.n1));
            this.f52914z0.invalidate();
            if (org.telegram.ui.ActionBar.n6.I.q() && (this.f52914z0.getBackground() instanceof org.telegram.ui.Components.za0)) {
                org.telegram.ui.Cells.i0 i0Var = this.V0;
                if (i0Var != null) {
                    i0Var.setTwoSided(true);
                }
                if (this.n1 < 0.0f) {
                    this.f52914z0.getImageReceiver().n0(((org.telegram.ui.Components.za0) this.f52914z0.getBackground()).f42795k);
                }
            } else {
                this.f52914z0.getImageReceiver().n0(null);
                org.telegram.ui.Cells.i0 i0Var2 = this.V0;
                if (i0Var2 != null) {
                    i0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.i0 i0Var3 = this.V0;
            if (i0Var3 != null) {
                i0Var3.setProgress(this.n1);
            }
        }
        p61 p61Var = this.f52906w0;
        if (p61Var != null) {
            p61Var.g1();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.A0.getChildAt(i13).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                this.B0.getChildAt(i14).invalidate();
            }
        }
    }

    public final void g1(boolean z10) {
        org.telegram.ui.Components.za0 za0Var;
        org.telegram.ui.Components.za0 za0Var2;
        int i7;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.k6 k6Var = this.f52905w;
        int i10 = this.f52849b;
        if (i10 == 0 && k6Var == null) {
            this.f52914z0.setBackground(org.telegram.ui.ActionBar.n6.s0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i10 == 2) {
                Object obj = this.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    if (z10) {
                        photoSize = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, 100, false, null, false);
                    } else {
                        photoSize = null;
                    }
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        bitmapDrawable = new BitmapDrawable(org.telegram.messenger.ec.F("b", photoSize.bytes));
                    }
                    l71 l71Var = this.f52914z0;
                    l71Var.f38429a.s0(org.telegram.messenger.fc.b(tL_wallPaper.document), this.I1, org.telegram.messenger.fc.c(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    l71Var.e();
                } else if (obj instanceof pc1) {
                    pc1 pc1Var = (pc1) obj;
                    int i11 = pc1Var.f50983f;
                    int i12 = pc1Var.f50982e;
                    int i13 = pc1Var.d;
                    int i14 = pc1Var.f50981c;
                    int i15 = pc1Var.f50980b;
                    this.f52877j1 = i11;
                    f1(i15, 0, false);
                    if (i14 != 0) {
                        f1(i14, 1, false);
                    }
                    f1(i13, 2, false);
                    f1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                    if (tL_wallPaper2 != null) {
                        l71 l71Var2 = this.f52914z0;
                        org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(tL_wallPaper2.document);
                        String str = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.Y0;
                        l71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(pc1Var.f50979a)) {
                        Point point = org.telegram.messenger.g0.f24226q;
                        int min = Math.min(point.x, point.y);
                        int max = Math.max(point.x, point.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.za0.g(i15, i14, i13, i12);
                        }
                        this.f52914z0.setImageBitmap(org.telegram.messenger.lz.d(2131623998, min, max, g10));
                    }
                } else if (obj instanceof qc1) {
                    Bitmap bitmap = this.E1;
                    if (bitmap != null) {
                        this.f52914z0.setImageBitmap(bitmap);
                    } else {
                        qc1 qc1Var = (qc1) obj;
                        File file = qc1Var.f51442e;
                        if (file != null) {
                            this.f52914z0.h(file.getAbsolutePath(), this.I1, null);
                        } else {
                            File file2 = qc1Var.d;
                            if (file2 != null) {
                                this.f52914z0.h(file2.getAbsolutePath(), this.I1, null);
                            } else if ("t".equals(qc1Var.f51439a)) {
                                l71 l71Var3 = this.f52914z0;
                                l71Var3.setImageDrawable(org.telegram.ui.ActionBar.n6.Z0(l71Var3, false));
                            } else {
                                int i16 = qc1Var.f51440b;
                                if (i16 != 0) {
                                    this.f52914z0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    TLRPC.Photo photo = hfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(hfVar.K.sizes, this.J1, true, null, false);
                        if (w11 != w10) {
                            photoSize2 = w11;
                        }
                        if (photoSize2 != null) {
                            i7 = photoSize2.size;
                        } else {
                            i7 = 0;
                        }
                        this.f52914z0.g(1, i7, hfVar, this.I1, "100_100_b", "jpg", org.telegram.messenger.fc.i(photoSize2, hfVar.K), org.telegram.messenger.fc.i(w10, hfVar.K));
                    } else {
                        l71 l71Var4 = this.f52914z0;
                        String str2 = hfVar.C;
                        String str3 = this.I1;
                        String str4 = hfVar.D;
                        l71Var4.getClass();
                        l71Var4.n(org.telegram.messenger.fc.g(str2), str3, org.telegram.messenger.fc.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (k6Var == null) {
                this.f52914z0.setBackground(org.telegram.ui.ActionBar.n6.s0());
            } else {
                org.telegram.ui.Components.j9 j9Var = this.f52907w1;
                if (j9Var != null) {
                    j9Var.dispose();
                    this.f52907w1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ee);
                int i17 = (int) k6Var.f29231j;
                if (i17 != 0) {
                    E0 = i17;
                }
                int E02 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Fe);
                long j3 = k6Var.f29232k;
                int i18 = (int) j3;
                if (i18 == 0 && j3 != 0) {
                    E02 = 0;
                } else if (i18 != 0) {
                    E02 = i18;
                }
                int E03 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                long j10 = k6Var.f29233l;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    E03 = 0;
                } else if (i19 != 0) {
                    E03 = i19;
                }
                int E04 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.He);
                long j11 = k6Var.f29234m;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    E04 = 0;
                } else if (i20 != 0) {
                    E04 = i20;
                }
                if (!TextUtils.isEmpty(k6Var.f29236o) && !org.telegram.ui.ActionBar.n6.c1()) {
                    if (E03 != 0) {
                        Drawable background = this.f52914z0.getBackground();
                        if (background instanceof org.telegram.ui.Components.za0) {
                            za0Var2 = (org.telegram.ui.Components.za0) background;
                        } else {
                            org.telegram.ui.Components.za0 za0Var3 = new org.telegram.ui.Components.za0();
                            za0Var3.q(this.f52914z0);
                            za0Var2 = za0Var3;
                            if (this.F1) {
                                za0Var3.m(false);
                                za0Var2 = za0Var3;
                            }
                        }
                        za0Var2.n(E0, E02, E03, E04);
                        za0Var = za0Var2;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(org.telegram.ui.Components.o9.d(k6Var.f29235n), new int[]{E0, E02});
                        this.f52907w1 = o9Var.f(org.telegram.ui.ActionBar.i5.M(0.5f, 3), new d71(this, 0), 100L);
                        za0Var = o9Var;
                    } else {
                        za0Var = new ColorDrawable(E0);
                    }
                    this.f52914z0.setBackground(za0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.Y0;
                    if (tL_wallPaper4 != null) {
                        l71 l71Var5 = this.f52914z0;
                        org.telegram.messenger.fc b11 = org.telegram.messenger.fc.b(tL_wallPaper4.document);
                        String str5 = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.Y0;
                        l71Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.n6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.za0) {
                            ((org.telegram.ui.Components.za0) t02).q(this.f52914z0);
                        }
                        this.f52914z0.setBackground(t02);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.g0.V0(E0, false);
                    this.f52884m1 = V0;
                    this.l1 = V0;
                } else if (E03 != 0) {
                    this.l1 = org.telegram.ui.Components.za0.g(E0, E02, E03, E04);
                    this.f52884m1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(E0, E02), false);
                    this.f52884m1 = V02;
                    this.l1 = V02;
                }
                l71 l71Var6 = this.f52914z0;
                if (l71Var6 != null) {
                    l71Var6.getImageReceiver().f22751p1 = new PorterDuffColorFilter(this.l1, this.f52902u1);
                    this.f52914z0.getImageReceiver().setAlpha(Math.abs(this.n1));
                    this.f52914z0.invalidate();
                    if (org.telegram.ui.ActionBar.n6.I.q() && (this.f52914z0.getBackground() instanceof org.telegram.ui.Components.za0)) {
                        org.telegram.ui.Cells.i0 i0Var = this.V0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                        if (this.n1 < 0.0f) {
                            this.f52914z0.getImageReceiver().n0(((org.telegram.ui.Components.za0) this.f52914z0.getBackground()).f42795k);
                        }
                    } else {
                        this.f52914z0.getImageReceiver().n0(null);
                        org.telegram.ui.Cells.i0 i0Var2 = this.V0;
                        if (i0Var2 != null) {
                            i0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.i0 i0Var3 = this.V0;
                    if (i0Var3 != null) {
                        i0Var3.setProgress(this.n1);
                    }
                }
                if (this.L0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.l71[] l71VarArr = this.L0;
                        if (i21 >= l71VarArr.length) {
                            break;
                        }
                        l71VarArr[i21].b(0, E0);
                        this.L0[i21].b(1, E02);
                        this.L0[i21].b(2, E03);
                        this.L0[i21].b(3, E04);
                        i21++;
                    }
                }
                ImageView imageView = this.H0;
                u61 u61Var = this.f52845a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Zc, u61Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.I0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.Zc, u61Var, PorterDuff.Mode.MULTIPLY);
                }
                a1();
            }
        }
        this.F1 = false;
    }

    @Override
    public final int getObserverTag() {
        return this.f52904v1;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f52845a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.N1) {
            return X0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(long j3) {
        boolean z10;
        this.L1 = j3;
        if (j3 != 0 && j3 != getUserConfig().e()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.M1 = z10;
    }

    public final void i1(org.telegram.ui.Cells.v0 v0Var) {
        u61 u61Var;
        float f10;
        if (this.f52914z0 == null) {
            return;
        }
        Bitmap bitmap = this.f52845a.f52560i;
        float f11 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.f52914z0.getMeasuredWidth() - (Math.max(this.f52914z0.getMeasuredWidth() / width, this.f52914z0.getMeasuredHeight() / u61Var.f52560i.getHeight()) * width)) / 2.0f) + this.Z1 + 0.0f;
        } else {
            f10 = this.Z1 + 0.0f;
        }
        float y10 = v0Var.getY() - ((-this.f52914z0.K) + 0.0f);
        int measuredHeight = this.f52914z0.getMeasuredHeight();
        if (this.O1) {
            f11 = this.f52890p1 * this.f52892q1;
        }
        v0Var.f32215x0 = true;
        v0Var.f32211w0 = measuredHeight;
        v0Var.f32204u0 = y10;
        v0Var.f32207v0 = f10;
        v0Var.f32167h2 = f11;
        v0Var.f32170i2.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f)));
        v0Var.invalidate();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f52849b == 2) {
            if (this.f52856c2 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        if (this.f52903v0 != null && this.M0 != null && this.f52905w.f29229g != 0) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("bganimationhint", false)) {
                if (this.C0 == null) {
                    org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(getParentActivity(), 8);
                    this.C0 = j30Var;
                    j30Var.setShowingDuration(5000L);
                    this.C0.setAlpha(0.0f);
                    this.C0.setVisibility(4);
                    this.C0.setText(org.telegram.messenger.gd.N0(2131753748, null));
                    this.C0.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                    this.m0.addView(this.C0, c8.na.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                org.telegram.messenger.g0.h3(new iy0(12, this, g12), 500L);
            }
        }
    }

    public final void k1(int i7, boolean z10, boolean z11) {
        boolean z12;
        char c10;
        char c11;
        FrameLayout frameLayout;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        FrameLayout frameLayout2;
        int i12;
        float f16;
        FrameLayout frameLayout3;
        float f17;
        float f18;
        float f19;
        int i13;
        int i14;
        int i15;
        char c12 = 0;
        if (z10 && i7 == 1 && this.Y0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i16 = this.f52849b;
        if (z10) {
            if (i7 == 0) {
                if (i16 == 2) {
                    this.f52855c1 = this.f52851b1;
                    int i17 = this.f52858d1;
                    this.f52868g1 = i17;
                    int i18 = this.f52861e1;
                    this.f52871h1 = i18;
                    int i19 = this.f52865f1;
                    this.f52874i1 = i19;
                    this.f52880k1 = this.Q;
                    if (i19 != 0) {
                        i15 = 4;
                    } else if (i18 != 0) {
                        i15 = 3;
                    } else if (i17 != 0) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    this.X.f(0, 4, i15, false);
                    this.X.e(this.f52865f1, 3);
                    this.X.e(this.f52861e1, 2);
                    this.X.e(this.f52858d1, 1);
                    this.X.e(this.f52851b1, 0);
                }
            } else {
                this.Z0 = this.Y0;
                this.f52888o1 = this.n1;
                this.S0.f();
                ArrayList arrayList = this.W0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
                    if (tL_wallPaper == null) {
                        i14 = 0;
                    } else {
                        int indexOf = arrayList.indexOf(tL_wallPaper);
                        if (i16 == 2) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        i14 = indexOf + i13;
                    }
                    this.T0.h1(i14, (this.R0.getMeasuredWidth() - org.telegram.messenger.g0.L(124.0f)) / 2);
                }
            }
        }
        if (i16 == 1 || i16 == 2) {
            org.telegram.ui.Components.l71[] l71VarArr = this.L0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            l71VarArr[c10].setVisibility(0);
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.i0 i0Var = this.V0;
            if (!i0Var.N) {
                float f20 = this.n1;
                if (f20 < 0.0f) {
                    float f21 = -f20;
                    this.n1 = f21;
                    i0Var.setProgress(f21);
                }
            }
        }
        int i20 = 58;
        float f22 = 1.0f;
        FrameLayout[] frameLayoutArr = this.N0;
        if (z11) {
            this.f52900t1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i7 == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (z10) {
                frameLayoutArr[i7].setVisibility(0);
                if (i16 == 1) {
                    p61 p61Var = this.f52906w0;
                    Property property = View.TRANSLATION_Y;
                    if (i7 == 1) {
                        f17 = -org.telegram.messenger.g0.L(21.0f);
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(p61Var, property, f17));
                    org.telegram.ui.Components.l71 l71Var = this.L0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(l71Var, property2, f18));
                    org.telegram.ui.Components.l71 l71Var2 = this.L0[0];
                    if (z12) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(l71Var2, property2, f19));
                    if (i7 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i7].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property2, 0.0f));
                    }
                    org.telegram.messenger.g0.v1(this.X.F[1]);
                } else if (i16 == 2) {
                    p61 p61Var2 = this.f52906w0;
                    Property property3 = View.TRANSLATION_Y;
                    int i21 = -frameLayoutArr[i7].getMeasuredHeight();
                    if (this.C1 == null) {
                        i20 = 0;
                    }
                    int L = org.telegram.messenger.g0.L(i20 + 72) + i21;
                    if (Z0()) {
                        i12 = org.telegram.messenger.g0.f24221n;
                    } else {
                        i12 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(p61Var2, property3, L + i12));
                    org.telegram.ui.Components.l71 l71Var3 = this.L0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(l71Var3, property4, f16));
                    org.telegram.ui.Components.l71 l71Var4 = this.L0[0];
                    if (z12) {
                        f22 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(l71Var4, property4, f22));
                    if (frameLayoutArr[i11].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property4, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property4, 0.0f, 1.0f));
                        frameLayoutArr[i7].setTranslationY(0.0f);
                    } else {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property3, frameLayout3.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i7 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], View.ALPHA, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i7].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], View.ALPHA, 0.0f));
                    }
                    org.telegram.messenger.g0.v1(this.X.F[1]);
                }
            } else {
                p61 p61Var3 = this.f52906w0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(p61Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.l71 l71Var5 = this.L0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(l71Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f52914z0, property6, 1.0f));
            }
            this.f52900t1.playTogether(arrayList2);
            this.f52900t1.addListener(new c71(this, z10, i11, i7, z12));
            this.f52900t1.setInterpolator(org.telegram.ui.Components.kr.f36859g);
            this.f52900t1.setDuration(200L);
            this.f52900t1.start();
            return;
        }
        if (i7 == 0) {
            c11 = 1;
        } else {
            c11 = 0;
        }
        if (z10) {
            frameLayoutArr[i7].setVisibility(0);
            if (i16 == 1) {
                p61 p61Var4 = this.f52906w0;
                if (i7 == 1) {
                    f13 = -org.telegram.messenger.g0.L(21.0f);
                } else {
                    f13 = 0.0f;
                }
                p61Var4.setTranslationY(f13);
                org.telegram.ui.Components.l71 l71Var6 = this.L0[2];
                if (z12) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                l71Var6.setAlpha(f14);
                org.telegram.ui.Components.l71 l71Var7 = this.L0[0];
                if (z12) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                l71Var7.setAlpha(f15);
                if (i7 == 1) {
                    frameLayoutArr[i7].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i7].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                org.telegram.messenger.g0.v1(this.X.F[1]);
            } else if (i16 == 2) {
                p61 p61Var5 = this.f52906w0;
                if (i7 == 0) {
                    f10 = 343.0f;
                } else {
                    f10 = 316.0f;
                }
                int i22 = -org.telegram.messenger.g0.L(f10);
                if (this.C1 == null) {
                    i20 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(i20 + 72) + i22;
                if (Z0()) {
                    i10 = org.telegram.messenger.g0.f24221n;
                } else {
                    i10 = 0;
                }
                p61Var5.setTranslationY(L2 + i10);
                org.telegram.ui.Components.l71 l71Var8 = this.L0[2];
                if (z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                l71Var8.setAlpha(f11);
                org.telegram.ui.Components.l71 l71Var9 = this.L0[0];
                if (z12) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                l71Var9.setAlpha(f12);
                if (frameLayoutArr[c11].getVisibility() == 0) {
                    frameLayoutArr[c11].setAlpha(0.0f);
                    frameLayoutArr[i7].setAlpha(1.0f);
                    frameLayoutArr[i7].setTranslationY(0.0f);
                } else {
                    frameLayoutArr[i7].setTranslationY(0.0f);
                }
            } else {
                if (i7 == 1) {
                    frameLayoutArr[i7].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i7].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                org.telegram.messenger.g0.v1(this.X.F[1]);
            }
        } else {
            this.f52906w0.setTranslationY(0.0f);
            frameLayoutArr[i7].setTranslationY(frameLayout.getMeasuredHeight());
            this.L0[0].setAlpha(1.0f);
            this.L0[2].setAlpha(1.0f);
            this.f52914z0.setAlpha(1.0f);
        }
        if (z10 && frameLayoutArr[c11].getVisibility() == 0) {
            frameLayoutArr[c11].setAlpha(1.0f);
            frameLayoutArr[c11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i7].setVisibility(4);
        }
        if (i16 != 1 && i16 != 2) {
            if (i7 == 1) {
                frameLayoutArr[c11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.l71[] l71VarArr2 = this.L0;
        if (!z12) {
            c12 = 2;
        }
        l71VarArr2[c12].setVisibility(4);
    }

    public final void l1() {
        Window window;
        if (this.f52878j2 != null) {
            return;
        }
        if (Z0()) {
            window = this.parentLayout.getBottomSheet().getWindow();
        } else {
            window = getParentActivity().getWindow();
        }
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.Q1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.Q1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.Q1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f24221n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        bc bcVar = new bc(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f10, (this.Q1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.f52878j2 = bcVar;
        bcVar.setOnTouchListener(new gi.a(2));
        this.f52881k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f52883l2 = ofFloat;
        ofFloat.addUpdateListener(new hi.wa(this, 3));
        this.f52883l2.addListener(new z61(this, 4));
        this.f52883l2.setDuration(400L);
        this.f52883l2.setInterpolator(org.telegram.ui.Components.ws.f41716e);
        this.f52883l2.start();
        frameLayout.addView(this.f52878j2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.g3(new h61(this, 2));
    }

    public final void m1(boolean z10) {
        int i7 = (this.L1 > 0L ? 1 : (this.L1 == 0L ? 0 : -1));
        if (i7 > 0) {
            this.B1.d(org.telegram.messenger.gd.N0(2131754209, null));
        } else if (i7 < 0) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-this.L1));
            if (O0 != null) {
                this.B1.d(org.telegram.messenger.gd.a0(null, null, 2131754210, O0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f52898s1 == null) {
                        org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(2131231980, 0);
                        this.f52898s1 = kqVar;
                        kqVar.f36852n = 1;
                    }
                    spannableStringBuilder.setSpan(this.f52898s1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.gd.G(W0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.B1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.L1 < 0 && !this.V1 && !this.W1 && tL_premium_boostsStatus2 == null) {
                        this.V1 = true;
                        getMessagesController().I0().a(this.L1, new k61(this, 1));
                        return;
                    }
                    return;
                }
                this.B1.c(null, z10);
                return;
            }
            this.B1.d(org.telegram.messenger.gd.a0(null, null, 2131754210, org.telegram.messenger.gd.N0(2131754904, null).toLowerCase()));
        } else {
            this.B1.d(org.telegram.messenger.gd.N0(2131754211, null));
        }
    }

    public final void n1() {
        if (this.H1 && this.f52913y1 == null) {
            Bitmap bitmap = this.E1;
            if (bitmap != null) {
                this.f52915z1 = bitmap;
                this.f52913y1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f52914z0.getImageReceiver();
                if (imageReceiver.M() || imageReceiver.f22747n0 != null) {
                    this.f52915z1 = imageReceiver.n();
                    this.f52913y1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (this.H1) {
            Bitmap bitmap2 = this.f52913y1;
            if (bitmap2 != null) {
                this.f52914z0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        g1(false);
    }

    public final void o1() {
        File A;
        String name;
        int i7;
        long j3;
        File file;
        String str;
        float f10;
        FrameLayout frameLayout;
        float f11;
        Object obj = this.Y0;
        if (obj == null) {
            obj = this.D1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof org.telegram.messenger.hf)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    org.telegram.messenger.w7.G(this.currentAccount);
                    file = org.telegram.messenger.w7.J(tL_wallPaper.document, null, true, true);
                    j3 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                TLRPC.Photo photo = hfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.J1, true, null, false);
                    org.telegram.messenger.w7.G(this.currentAccount);
                    A = org.telegram.messenger.w7.J(w10, null, true, true);
                    name = org.telegram.messenger.w7.r(null, w10);
                    i7 = w10.size;
                } else {
                    A = org.telegram.messenger.ec.A(hfVar.C);
                    name = A.getName();
                    i7 = hfVar.G;
                }
                j3 = i7;
                String str2 = name;
                file = A;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i10 = this.f52849b;
            if (exists) {
                org.telegram.messenger.a6.q(this.currentAccount).v(this);
                this.f52914z0.invalidate();
                if (i10 == 2) {
                    if (j3 != 0 && this.L1 == 0) {
                        this.f52901u0.setSubtitle(org.telegram.messenger.g0.i0(j3, false, false));
                    } else {
                        this.f52901u0.setSubtitle(null);
                    }
                }
            } else {
                org.telegram.messenger.a6.q(this.currentAccount).a(str, null, this);
                if (i10 == 2 && this.L1 == 0) {
                    this.f52901u0.setSubtitle(org.telegram.messenger.gd.N0(2131748585, null));
                }
                this.f52914z0.invalidate();
            }
            float f12 = 0.5f;
            if (this.Y0 == null && (frameLayout = this.A0) != null) {
                if (exists) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                frameLayout.setAlpha(f11);
            }
            if (i10 == 0) {
                this.f52860e0.setEnabled(exists);
                TextView textView = this.f52860e0;
                if (exists) {
                    f12 = 1.0f;
                }
                textView.setAlpha(f12);
            } else if (i10 == 2) {
                this.E0.setEnabled(exists);
                m71 m71Var = this.B1;
                if (m71Var != null) {
                    if (exists) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    m71Var.setAlpha(f10);
                }
                m71 m71Var2 = this.C1;
                if (m71Var2 != null) {
                    if (exists) {
                        f12 = 1.0f;
                    }
                    m71Var2.setAlpha(f12);
                }
            } else {
                this.f52863f.setEnabled(exists);
                org.telegram.ui.ActionBar.q0 q0Var = this.f52863f;
                if (exists) {
                    f12 = 1.0f;
                }
                q0Var.setAlpha(f12);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!U0(z10)) {
            return false;
        }
        S0(true);
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && r4Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.n6.f29524h5));
            if (this.f52849b == 2 && this.L1 != 0) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25280r3);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25252m4);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25322x5);
        int i7 = this.f52849b;
        if (i7 == 1 || i7 == 0) {
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.C4);
        }
        if (i7 == 2 || i7 == 1) {
            org.telegram.ui.ActionBar.n6.N = true;
        }
        if (i7 == 0 && this.f52905w == null) {
            this.G1 = org.telegram.ui.ActionBar.n6.f29537i0;
        } else {
            Point point = org.telegram.messenger.g0.f24226q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.f24225p));
            sb2.append("_");
            this.I1 = a8.p0.n((int) (max / org.telegram.messenger.g0.f24225p), "_f", sb2);
            this.J1 = Math.max(point.x, point.y);
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25231i4);
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25225h4);
            this.f52904v1 = org.telegram.messenger.a6.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                org.telegram.messenger.tr.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25280r3);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25252m4);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25322x5);
        w61 w61Var = this.m0;
        if (w61Var != null && this.S != null) {
            w61Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        int i7 = this.f52849b;
        if ((i7 == 2 || i7 == 1) && this.f52895r1 == null) {
            org.telegram.messenger.g0.g3(new cd0(6));
        }
        int i10 = org.telegram.messenger.ks.C4;
        if (i7 == 2) {
            Bitmap bitmap = this.f52913y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f52913y1 = null;
            }
            this.f52845a.a(null, null, null);
            org.telegram.messenger.ks.e().k(i10, new Object[0]);
        } else if (i7 == 1 || i7 == 0) {
            org.telegram.messenger.ks.e().n(this, i10);
        }
        if (i7 != 0 || this.f52905w != null) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25231i4);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25225h4);
        }
        super.onFragmentDestroy();
        T0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.G1) {
            this.f52910x1.c(false);
        }
        org.telegram.ui.ActionBar.n6.f29407b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f52891q0;
        if (l4Var != null) {
            l4Var.f();
        }
        r71 r71Var = this.f52909x0;
        if (r71Var != null) {
            r71Var.f();
        }
        if (this.G1) {
            this.f52910x1.c(true);
        }
        org.telegram.ui.ActionBar.n6.f29407b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V0();
            try {
                c5.l lVar = this.f52882l0;
                if (lVar != null) {
                    org.telegram.messenger.g0.A3(lVar, getThemedColor(org.telegram.ui.ActionBar.n6.f29731s8));
                }
                org.telegram.ui.Cells.i0 i0Var = this.V0;
                if (i0Var != null) {
                    i0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.n6.Mj));
                    this.V0.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f52849b == 2) {
            this.f52845a.a(null, null, null);
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.C4, new Object[0]);
        }
    }

    public final void p1() {
        this.f52914z0.getImageReceiver().setAlpha(Math.abs(this.n1));
        this.f52914z0.invalidate();
        this.R0.g1();
        if (this.n1 >= 0.0f) {
            this.f52914z0.getImageReceiver().n0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f52914z0.getImageReceiver().a0(null);
            }
            if (this.f52914z0.getBackground() instanceof org.telegram.ui.Components.za0) {
                this.f52914z0.getImageReceiver().n0(((org.telegram.ui.Components.za0) this.f52914z0.getBackground()).f42795k);
            }
        }
        this.f52845a.a(this.f52914z0.getBackground(), this.f52914z0.getBackground(), Float.valueOf(this.n1));
        a1();
    }

    public final void q1() {
        char c10;
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        float f12 = 1.0f;
        float f13 = 0.0f;
        int i7 = this.f52849b;
        if (i7 != 1 && i7 != 2) {
            boolean isEnabled = this.L0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
            if (tL_wallPaper != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEnabled == z10) {
                return;
            }
            if (tL_wallPaper == null) {
                this.L0[0].a(false, true);
            }
            org.telegram.ui.Components.l71 l71Var = this.L0[0];
            if (this.Y0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            l71Var.setEnabled(z11);
            if (this.Y0 != null) {
                this.L0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (org.telegram.messenger.g0.L(9.0f) + ((FrameLayout.LayoutParams) this.L0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.l71 l71Var2 = this.L0[0];
            Property property = View.ALPHA;
            if (this.Y0 == null) {
                f12 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(l71Var2, property, f12));
            org.telegram.ui.Components.l71 l71Var3 = this.L0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.Y0 != null) {
                f11 = 0.0f;
            } else {
                f11 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(l71Var3, property2, f11));
            org.telegram.ui.Components.l71 l71Var4 = this.L0[1];
            if (this.Y0 == null) {
                f13 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(l71Var4, property2, f13));
            animatorSet.setInterpolator(org.telegram.ui.Components.kr.f36859g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new b71(this));
            animatorSet.start();
            return;
        }
        if (this.Y0 == null && (this.D1 instanceof pc1)) {
            this.L0[2].a(false, true);
        }
        org.telegram.ui.Components.l71[] l71VarArr = this.L0;
        if (this.Y0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        l71VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.l71 l71Var5 = this.L0[2];
        Property property3 = View.ALPHA;
        if (this.Y0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l71Var5, property3, f10);
        org.telegram.ui.Components.l71 l71Var6 = this.L0[0];
        if (this.Y0 != null) {
            f12 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(l71Var6, property3, f12));
        animatorSet2.addListener(new a71(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.kr.f36859g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void r1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v71.r1(boolean):void");
    }

    public final void s1() {
        int childCount = this.R0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.R0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.j5) {
                ((org.telegram.ui.Cells.j5) childAt).w(true);
            }
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f52845a.f52554a = i6Var;
    }

    public v71(org.telegram.ui.ActionBar.m6 m6Var, boolean z10, int i7, boolean z11, boolean z12) {
        super(null);
        this.f52845a = new u61(this);
        this.d = true;
        this.f52885n = 1;
        org.telegram.ui.ActionBar.s5 s5Var = new org.telegram.ui.ActionBar.s5(this, 0, false);
        this.T = s5Var;
        org.telegram.ui.ActionBar.s5 s5Var2 = new org.telegram.ui.ActionBar.s5(this, 0, true);
        this.U = s5Var2;
        org.telegram.ui.ActionBar.s5 s5Var3 = new org.telegram.ui.ActionBar.s5(this, 1, false);
        this.V = s5Var3;
        org.telegram.ui.ActionBar.s5 s5Var4 = new org.telegram.ui.ActionBar.s5(this, 1, true);
        this.W = s5Var4;
        this.Z = -1;
        this.f52846a0 = new h61(this, 0);
        this.f52912y0 = new l71[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.f52890p1 = 0.0f;
        this.f52902u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new org.telegram.ui.Components.l10(getParentActivity(), new x61(this));
        this.V1 = false;
        this.W1 = false;
        this.f52849b = i7;
        this.f52870h0 = z12;
        this.f52867g0 = m6Var;
        this.f52876j0 = z10;
        this.f52873i0 = z11;
        if (i7 == 1) {
            org.telegram.ui.ActionBar.k6 k10 = m6Var.k(!z11);
            this.f52905w = k10;
            if (k10 != null) {
                this.d = false;
                this.f52911y = k10.f29226c;
                this.E = k10.d;
                this.F = k10.f29227e;
                this.G = k10.f29228f;
                this.H = k10.f29229g;
                this.I = k10.h;
                this.J = k10.f29230i;
                this.K = k10.f29231j;
                this.L = k10.f29232k;
                this.M = k10.f29233l;
                this.N = k10.f29234m;
                this.O = k10.f29237p;
                this.P = k10.f29236o;
                this.Q = k10.f29235n;
            }
        } else {
            if (i7 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.k6 k11 = m6Var.k(false);
            this.f52905w = k11;
            if (k11 != null) {
                this.Y0 = k11.f29240s;
            }
        }
        org.telegram.ui.ActionBar.k6 k6Var = this.f52905w;
        if (k6Var != null) {
            this.G1 = k6Var.f29238q;
            if (!TextUtils.isEmpty(k6Var.f29236o)) {
                this.n1 = this.f52905w.f29237p;
            }
            org.telegram.ui.ActionBar.n6.M = org.telegram.ui.ActionBar.n6.D0();
            org.telegram.ui.ActionBar.n6.O = true;
            org.telegram.ui.ActionBar.n6.P = true;
            org.telegram.ui.ActionBar.n6.u(m6Var, false, false);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25321x4, new Object[0]);
        s5Var.v = true;
        s5Var3.v = true;
        s5Var2.v = true;
        s5Var4.v = true;
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }

    public v71(org.telegram.ui.ActionBar.m6 m6Var) {
        this(m6Var, false, 0, false, false);
    }
}
