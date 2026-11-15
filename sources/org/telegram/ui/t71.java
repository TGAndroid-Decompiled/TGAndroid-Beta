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
public class t71 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.x5, org.telegram.messenger.is {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public k71 B1;
    public org.telegram.ui.Components.b30 C0;
    public k71 C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public t4 E0;
    public Bitmap E1;
    public final int F;
    public q61 F0;
    public boolean F1;
    public final int G;
    public q61 G0;
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
    public s71 K1;
    public final long L;
    public org.telegram.ui.Components.x61[] L0;
    public long L1;
    public final long M;
    public org.telegram.ui.Components.x61[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public org.telegram.ui.Components.ch0 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public org.telegram.ui.ActionBar.q0 Q1;
    public long R;
    public b61 R0;
    public ValueAnimator R1;
    public x70 S;
    public r71 S0;
    public di.k4 S1;
    public final org.telegram.ui.ActionBar.p5 T;
    public v4.b0 T0;
    public p61 T1;
    public final org.telegram.ui.ActionBar.p5 U;
    public org.telegram.ui.Cells.n4 U0;
    public final org.telegram.ui.Components.d10 U1;
    public final org.telegram.ui.ActionBar.p5 V;
    public org.telegram.ui.Cells.h0 V0;
    public boolean V1;
    public final org.telegram.ui.ActionBar.p5 W;
    public ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.dq X;
    public final HashMap X0;
    public TL_stories.TL_premium_boostsStatus X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public int Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final s61 f51408a;
    public final Runnable f51409a0;
    public TLRPC.TL_wallPaper f51410a1;
    public float f51411a2;
    public final int f51412b;
    public boolean f51413b0;
    public int f51414b1;
    public float f51415b2;
    public Scroller f51416c;
    public hi.n5 f51417c0;
    public int f51418c1;
    public boolean f51419c2;
    public final boolean d;
    public FrameLayout f51420d0;
    public int f51421d1;
    public int d2;
    public hi.u2 f51422e;
    public TextView f51423e0;
    public int f51424e1;
    public ValueAnimator f51425e2;
    public org.telegram.ui.ActionBar.q0 f51426f;
    public TextView f51427f0;
    public int f51428f1;
    public boolean f51429f2;
    public final org.telegram.ui.ActionBar.i6 f51430g0;
    public int f51431g1;
    public TextView f51432g2;
    public TextView h;
    public final boolean f51433h0;
    public int f51434h1;
    public WeakReference f51435h2;
    public final boolean f51436i0;
    public int f51437i1;
    public BitmapDrawable f51438i2;
    public final boolean f51439j0;
    public int f51440j1;
    public bc f51441j2;
    public ArrayList f51442k0;
    public int f51443k1;
    public float f51444k2;
    public c5.l f51445l0;
    public int l1;
    public ValueAnimator f51446l2;
    public w61 m0;
    public int f51447m1;
    public int f51448n;
    public UndoView f51449n0;
    public float n1;
    public FrameLayout f51450o0;
    public float f51451o1;
    public org.telegram.ui.Components.uj0 f51452p0;
    public float f51453p1;
    public l4 f51454q0;
    public float f51455q1;
    public Drawable f51456r;
    public org.telegram.ui.Components.t00 f51457r0;
    public l71 f51458r1;
    public int f51459s;
    public org.telegram.messenger.gj f51460s0;
    public org.telegram.ui.Components.eq f51461s1;
    public boolean f51462t0;
    public AnimatorSet f51463t1;
    public org.telegram.ui.ActionBar.k f51464u0;
    public final PorterDuff.Mode f51465u1;
    public ai.k0 f51466v0;
    public int f51467v1;
    public final org.telegram.ui.ActionBar.g6 f51468w;
    public n61 f51469w0;
    public org.telegram.ui.Components.c9 f51470w1;
    public boolean f51471x;
    public p71 f51472x0;
    public org.telegram.ui.Components.z61 f51473x1;
    public final int f51474y;
    public final j71[] f51475y0;
    public Bitmap f51476y1;
    public j71 f51477z0;
    public Bitmap f51478z1;

    public t71(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f51408a = new s61(this);
        this.d = true;
        this.f51448n = 1;
        org.telegram.ui.ActionBar.p5 p5Var = new org.telegram.ui.ActionBar.p5(this, 0, false);
        this.T = p5Var;
        org.telegram.ui.ActionBar.p5 p5Var2 = new org.telegram.ui.ActionBar.p5(this, 0, true);
        this.U = p5Var2;
        org.telegram.ui.ActionBar.p5 p5Var3 = new org.telegram.ui.ActionBar.p5(this, 1, false);
        this.V = p5Var3;
        org.telegram.ui.ActionBar.p5 p5Var4 = new org.telegram.ui.ActionBar.p5(this, 1, true);
        this.W = p5Var4;
        this.Z = -1;
        this.f51409a0 = new f61(this, 0);
        this.f51475y0 = new j71[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.f51453p1 = 0.0f;
        this.f51465u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new org.telegram.ui.Components.d10(getParentActivity(), new u61(this));
        this.V1 = false;
        this.W1 = false;
        this.f51412b = 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z10;
        if (obj instanceof oc1) {
            oc1 oc1Var = (oc1) obj;
            this.G1 = oc1Var.f49934j;
            TLRPC.TL_wallPaper tL_wallPaper = oc1Var.f49932g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = oc1Var.h;
                this.n1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.j6.I.q()) {
                    this.n1 *= -1.0f;
                }
            }
        }
        p5Var.v = true;
        p5Var3.v = true;
        p5Var2.v = true;
        p5Var4.v = true;
    }

    public static void Z(t71 t71Var, org.telegram.messenger.e3 e3Var) {
        if (t71Var.getParentActivity() == null) {
            return;
        }
        ug.j0 j0Var = new ug.j0(23, t71Var.currentAccount, t71Var.getParentActivity(), t71Var, t71Var.f51408a);
        j0Var.A1(e3Var);
        j0Var.z1(t71Var.X1, true);
        j0Var.B1(t71Var.L1);
        if (!t71Var.Z0()) {
            j0Var.M2 = new f61(t71Var, 1);
        }
        t71Var.showDialog(j0Var);
    }

    public static void a0(t71 t71Var) {
        org.telegram.ui.ActionBar.g6 k10;
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.M;
        if (i6Var == null) {
            return;
        }
        int i7 = i6Var.f28699a0;
        if (i7 >= 0) {
            k10 = (org.telegram.ui.ActionBar.g6) i6Var.f28701b0.get(i7);
        } else {
            k10 = i6Var.k(false);
        }
        if (t71Var.f51468w != null) {
            t71Var.b1();
            org.telegram.ui.ActionBar.j6.z1(t71Var.f51430g0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.j6.M != null) {
                org.telegram.ui.ActionBar.j6.O = false;
                org.telegram.ui.ActionBar.j6.P = false;
                org.telegram.ui.ActionBar.j6.M = null;
            }
            org.telegram.ui.ActionBar.j6.u(t71Var.f51430g0, true, t71Var.f51433h0);
            ((ActionBarLayout) t71Var.parentLayout).X(false, false);
        } else {
            ((ActionBarLayout) t71Var.parentLayout).X(false, false);
            File file = new File(t71Var.f51430g0.f28700b);
            org.telegram.ui.ActionBar.i6 i6Var2 = t71Var.f51430g0;
            org.telegram.ui.ActionBar.j6.v(file, i6Var2.f28698a, i6Var2.G, false);
            org.telegram.messenger.np.s1(t71Var.f51430g0.F).x4(t71Var.f51430g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", t71Var.f51430g0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) t71Var.getParentLayout().getFragmentStack().get(Math.max(0, t71Var.getParentLayout().getFragmentStack().size() - 2));
        t71Var.finishFragment();
        if (t71Var.f51412b == 0) {
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25551p4, i6Var, k10, Boolean.valueOf(t71Var.f51439j0));
        }
        org.telegram.ui.ActionBar.j6.M1(e2Var);
    }

    public static void b0(t71 t71Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = t71Var.X0;
        org.telegram.ui.ActionBar.g6 g6Var = t71Var.f51468w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            t71Var.W0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (tL_wallPapers.wallpapers.get(i7) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i7);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f28057id))) {
                            t71Var.W0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f28057id), tL_wallPaper2);
                        }
                        if (g6Var != null && (str = g6Var.f28614o) != null && str.equals(tL_wallPaper2.slug)) {
                            t71Var.Y0 = tL_wallPaper2;
                            t71Var.g1(false);
                            t71Var.o1();
                        } else if (g6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = t71Var.Y0;
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
            if (!z10 && (tL_wallPaper = t71Var.Y0) != null) {
                t71Var.W0.add(0, tL_wallPaper);
            }
            r71 r71Var = t71Var.S0;
            if (r71Var != null) {
                r71Var.f();
            }
            org.telegram.messenger.vr.a0(t71Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (t71Var.Y0 == null && g6Var != null && !TextUtils.isEmpty(g6Var.f28614o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = g6Var.f28614o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(t71Var.currentAccount).bindRequestToGuid(t71Var.getConnectionsManager().sendRequest(getwallpaper, new l61(t71Var, 0)), t71Var.classGuid);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f51477z0, View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.f51477z0, View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f51477z0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f51477z0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f51477z0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f51477z0, View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(org.telegram.ui.Components.er.f34421g);
        this.D0.addListener(new x61(this, 1));
        this.D0.start();
    }

    public final void R0(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t71.R0(boolean):void");
    }

    public final void S0(boolean z10) {
        int i7 = this.f51412b;
        if (i7 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.j6.p();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25618z4);
        org.telegram.ui.ActionBar.g6 g6Var = this.f51468w;
        if (i7 == 1) {
            if (this.f51436i0) {
                g6Var.f28604c = this.f51474y;
                g6Var.d = this.E;
                g6Var.f28605e = this.F;
                g6Var.f28606f = this.G;
                g6Var.f28607g = this.H;
                g6Var.h = this.I;
                g6Var.f28608i = this.J;
                g6Var.f28609j = this.K;
                g6Var.f28610k = this.L;
                g6Var.f28611l = this.M;
                g6Var.f28612m = this.N;
                g6Var.f28613n = this.Q;
                g6Var.f28614o = this.P;
                g6Var.f28615p = this.O;
            }
            org.telegram.ui.ActionBar.j6.z1(this.f51430g0, false, true, false, false, false);
        } else {
            if (g6Var != null) {
                org.telegram.ui.ActionBar.j6.z1(this.f51430g0, false, this.f51439j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).X(false, false);
            if (this.f51439j0) {
                org.telegram.ui.ActionBar.i6 i6Var = this.f51430g0;
                if (i6Var.f28700b != null && org.telegram.ui.ActionBar.j6.H.get(i6Var.m()) == null) {
                    new File(i6Var.f28700b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable T0(Drawable drawable) {
        WeakReference weakReference = this.f51435h2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f51438i2;
        }
        WeakReference weakReference2 = this.f51435h2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f51435h2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f51435h2 = new WeakReference(drawable);
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
            this.f51438i2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f51438i2;
        }
        this.f51438i2 = null;
        return null;
    }

    public final boolean U0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t71.U0(boolean):boolean");
    }

    public final void V0() {
        int themedColor;
        hi.u2 u2Var = this.f51422e;
        int i7 = 0;
        if (u2Var != null) {
            u2Var.I(getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            this.f51422e.P(getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
        }
        if (this.f51456r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)) != this.f51459s) {
            this.f51459s = themedColor;
            this.f51456r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        t4 t4Var = this.E0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
        if (this.f51458r1 != null) {
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            if (o4Var != null && o4Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5));
                if (this.f51412b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5));
            }
        }
        if (this.L0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr = this.L0;
                if (i10 >= x61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x61 x61Var = x61VarArr[i10];
                if (x61Var != null) {
                    x61Var.invalidate();
                }
                i10++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr2 = this.M0;
                if (i7 >= x61VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.x61 x61Var2 = x61VarArr2[i7];
                if (x61Var2 != null) {
                    x61Var2.invalidate();
                }
                i7++;
            }
        }
        TextView textView = this.f51432g2;
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, this.f51408a);
        }
        org.telegram.ui.Components.dq dqVar = this.X;
        if (dqVar != null) {
            dqVar.invalidate();
        }
        org.telegram.ui.Components.t00 t00Var = this.f51457r0;
        if (t00Var != null) {
            t00Var.updateColors();
        }
    }

    public final int W0() {
        if (org.telegram.messenger.t3.U(this.currentAccount, -this.L1)) {
            return getMessagesController().f25416v5;
        }
        return getMessagesController().A5;
    }

    public final ArrayList X0() {
        g6 g6Var = new g6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51445l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29129s8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51464u0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51464u0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.E8));
        org.telegram.ui.Components.dq dqVar = this.X;
        if (dqVar != null) {
            org.telegram.ui.ActionBar.q0 q0Var = dqVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = dqVar.F;
            for (int i7 = 0; i7 < editTextBoldCursorArr.length; i7++) {
                arrayList.add(new org.telegram.ui.ActionBar.s6(editTextBoldCursorArr[i7], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.s6(editTextBoldCursorArr[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28978k6));
                arrayList.add(new org.telegram.ui.ActionBar.s6(editTextBoldCursorArr[i7], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28996l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.s6(dqVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.I5));
            if (q0Var != null) {
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(dqVar, 2);
                arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.G8));
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
            org.telegram.ui.ActionBar.p5 p5Var = this.T;
            org.telegram.ui.ActionBar.p5 p5Var2 = this.V;
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51469w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29170ub));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51469w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29189vb));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51469w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29208wb));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51469w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nd));
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51469w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Tb));
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((org.telegram.ui.ActionBar.s6) arrayList.get(i14)).f29608n = this.f51408a;
        }
        return arrayList;
    }

    public final boolean Y0(int i7) {
        int E0;
        long j3;
        if (this.f51436i0) {
            return false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f51468w;
        if (i7 == 1 || i7 == 2) {
            long j10 = this.K;
            if (j10 != 0) {
                if (j10 != g6Var.f28609j) {
                    return true;
                }
            } else {
                int E02 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ee);
                int i10 = (int) g6Var.f28609j;
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
                        E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Fe);
                        j3 = g6Var.f28610k;
                    } else if (i12 == 1) {
                        E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ge);
                        j3 = g6Var.f28611l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.He);
                        j3 = g6Var.f28612m;
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
            } else if (j11 != g6Var.f28610k || j13 != g6Var.f28611l || j12 != g6Var.f28612m) {
                return true;
            }
            if (g6Var.f28613n != this.Q) {
                return true;
            }
        }
        if (i7 == 1 || i7 == 3) {
            if (this.f51474y != g6Var.d) {
                return true;
            }
            int i14 = this.F;
            if (i14 != 0) {
                if (i14 != g6Var.f28605e) {
                    return true;
                }
            } else {
                int i15 = g6Var.f28605e;
                if (i15 != 0 && i15 != g6Var.f28604c) {
                    return true;
                }
            }
            int i16 = this.G;
            if (i16 != 0) {
                if (i16 != g6Var.f28606f) {
                    return true;
                }
            } else if (g6Var.f28606f != 0) {
                return true;
            }
            int i17 = this.H;
            if (i17 != 0) {
                if (i17 != g6Var.f28607g) {
                    return true;
                }
            } else if (g6Var.f28607g != 0) {
                return true;
            }
            int i18 = this.I;
            if (i18 != 0) {
                if (i18 != g6Var.h) {
                    return true;
                }
            } else if (g6Var.h != 0) {
                return true;
            }
            if (this.J != g6Var.f28608i) {
                return true;
            }
        }
        return false;
    }

    public boolean Z0() {
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && o4Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void a1() {
        float f10;
        di.k4 k4Var = this.S1;
        if (k4Var != null) {
            k4Var.invalidate();
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
                org.telegram.ui.Components.x61[] x61VarArr = this.L0;
                if (i11 >= x61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x61 x61Var = x61VarArr[i11];
                if (x61Var != null) {
                    if (this.O1) {
                        f10 = this.f51453p1 * this.f51455q1;
                    } else {
                        f10 = 0.0f;
                    }
                    x61Var.setDimAmount(f10);
                    this.L0[i11].invalidate();
                }
                i11++;
            }
        }
        if (this.f51452p0 != null) {
            for (int i12 = 0; i12 < this.f51452p0.getChildCount(); i12++) {
                View childAt = this.f51452p0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f51469w0 != null) {
            for (int i13 = 0; i13 < this.f51469w0.getChildCount(); i13++) {
                View childAt2 = this.f51469w0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        k71 k71Var = this.B1;
        if (k71Var != null) {
            k71Var.invalidate();
        }
        k71 k71Var2 = this.C1;
        if (k71Var2 != null) {
            k71Var2.invalidate();
        }
        t4 t4Var = this.E0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28940i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28922h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28873ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28964jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28875ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28965jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29150tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29131sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29113rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29149ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Kj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
    }

    public final void b1() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f51468w;
        if (g6Var != null && !TextUtils.isEmpty(g6Var.f28614o)) {
            try {
                File e10 = g6Var.e();
                Drawable background = this.f51477z0.getBackground();
                Bitmap n10 = this.f51477z0.getImageReceiver().n();
                if (background instanceof org.telegram.ui.Components.ra0) {
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
                paint.setColorFilter(new PorterDuffColorFilter(this.l1, this.f51465u1));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t71.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i7, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (getParentActivity() != null && this.f51448n != i7 && this.f51463t1 == null && (g6Var = this.f51468w) != null) {
            if (z10 && i7 == 2 && (org.telegram.ui.ActionBar.j6.c1() || g6Var.f28609j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131752550, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                if (org.telegram.ui.ActionBar.j6.c1() && (!org.telegram.ui.ActionBar.j6.c1() || org.telegram.ui.ActionBar.j6.I.f28712j0.d == 0)) {
                    t1Var.U = org.telegram.messenger.hd.M0(2131752529, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752552, null), new h61(this, 7));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                } else {
                    t1Var.U = org.telegram.messenger.hd.M0(2131752549, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new h61(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751771, null), new h61(this, 6));
                }
                showDialog(t1Var);
                return;
            }
            int i17 = this.f51448n;
            this.f51448n = i7;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        this.h.setText(org.telegram.messenger.hd.M0(2131752014, null));
                        if (g6Var.f28606f != 0) {
                            if (g6Var.h != 0) {
                                i16 = 4;
                            } else if (g6Var.f28607g != 0) {
                                i16 = 3;
                            } else {
                                i16 = 2;
                            }
                        } else {
                            i16 = 1;
                        }
                        org.telegram.ui.Components.dq dqVar = this.X;
                        Y0(3);
                        dqVar.f(2, 4, i16, true);
                        this.X.e(g6Var.h, 3);
                        this.X.e(g6Var.f28607g, 2);
                        this.X.e(g6Var.f28606f, 1);
                        org.telegram.ui.Components.dq dqVar2 = this.X;
                        int i18 = g6Var.f28605e;
                        if (i18 == 0) {
                            i18 = g6Var.f28604c;
                        }
                        dqVar2.e(i18, 0);
                        this.M0[1].b(0, g6Var.f28605e);
                        this.M0[1].b(1, g6Var.f28606f);
                        this.M0[1].b(2, g6Var.f28607g);
                        this.M0[1].b(3, g6Var.h);
                        if (g6Var.f28607g != 0) {
                            if (i17 == 1) {
                                this.f51472x0.i(0);
                            } else {
                                this.f51472x0.g(0);
                            }
                        } else if (i17 == 2) {
                            this.f51472x0.s(0);
                        }
                        this.f51469w0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                        j1();
                    }
                    i10 = i17;
                } else {
                    this.h.setText(org.telegram.messenger.hd.M0(2131752016, null));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Ee);
                    int i19 = org.telegram.ui.ActionBar.j6.Fe;
                    if (org.telegram.ui.ActionBar.j6.f1(i19)) {
                        i12 = getThemedColor(i19);
                    } else {
                        i12 = 0;
                    }
                    int i20 = org.telegram.ui.ActionBar.j6.Ge;
                    if (org.telegram.ui.ActionBar.j6.f1(i20)) {
                        i13 = getThemedColor(i20);
                    } else {
                        i13 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.j6.He;
                    if (org.telegram.ui.ActionBar.j6.f1(i21)) {
                        i14 = getThemedColor(i21);
                    } else {
                        i14 = 0;
                    }
                    long j3 = g6Var.f28610k;
                    int i22 = (int) j3;
                    if (i22 == 0 && j3 != 0) {
                        i12 = 0;
                    }
                    long j10 = g6Var.f28611l;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = g6Var.f28612m;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    int i25 = (int) g6Var.f28609j;
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
                    org.telegram.ui.Components.dq dqVar3 = this.X;
                    Y0(2);
                    dqVar3.f(2, 4, i15, false);
                    org.telegram.ui.Components.dq dqVar4 = this.X;
                    if (i24 == 0) {
                        i24 = i14;
                    }
                    dqVar4.e(i24, 3);
                    org.telegram.ui.Components.dq dqVar5 = this.X;
                    if (i23 == 0) {
                        i23 = i13;
                    }
                    dqVar5.e(i23, 2);
                    org.telegram.ui.Components.dq dqVar6 = this.X;
                    if (i22 == 0) {
                        i22 = i12;
                    }
                    dqVar6.e(i22, 1);
                    org.telegram.ui.Components.dq dqVar7 = this.X;
                    if (i25 != 0) {
                        themedColor = i25;
                    }
                    dqVar7.e(themedColor, 0);
                    i10 = i17;
                    if (i10 != 1 && g6Var.f28607g != 0) {
                        this.f51472x0.g(0);
                    } else {
                        this.f51472x0.i(0);
                    }
                    this.f51469w0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                }
            } else {
                i10 = i17;
                this.h.setText(org.telegram.messenger.hd.M0(2131752015, null));
                if (g6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.dq dqVar8 = this.X;
                Y0(1);
                dqVar8.f(1, 2, i11, false);
                this.X.e(g6Var.f28604c, 0);
                int i26 = g6Var.d;
                if (i26 != 0) {
                    this.X.e(i26, 1);
                }
                if (i10 == 2 || (i10 == 3 && g6Var.f28607g != 0)) {
                    this.f51472x0.s(0);
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
                if (this.f51430g0.q()) {
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
        if (i7 == org.telegram.messenger.ns.f25550p3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
            }
        } else if (i7 == org.telegram.messenger.ns.f25514i4) {
            org.telegram.ui.Components.uj0 uj0Var = this.f51452p0;
            if (uj0Var != null) {
                int childCount = uj0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f51452p0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) childAt).k0(0, true);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25519j4) {
            n61 n61Var = this.f51469w0;
            if (n61Var != null) {
                n61Var.g1();
            }
        } else if (i7 == org.telegram.messenger.ns.f25618z4) {
            if (this.f51466v0 != null) {
                g1(true);
            }
        } else if (i7 == org.telegram.messenger.ns.f25496f4) {
            Object obj = this.D1;
            if (obj instanceof pc1) {
                pc1 pc1Var = (pc1) obj;
                if (pc1Var.f50252a == null) {
                    pc1Var.f50252a = (String) objArr[0];
                }
            }
        } else {
            long j3 = 0;
            if (i7 == org.telegram.messenger.ns.f25490e4) {
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
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f28057id))) {
                            this.W0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f28057id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.g6 g6Var = this.f51468w;
                        if (g6Var != null && (str = g6Var.f28614o) != null && str.equals(wallPaper.slug)) {
                            this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                            g1(false);
                            o1();
                        } else if (g6Var == null) {
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
                r71 r71Var = this.S0;
                if (r71Var != null) {
                    r71Var.f();
                }
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i13);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j3 = org.telegram.messenger.si.p(j3, wallPaper2.f28205id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j3;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new l61(this, 1)), this.classGuid);
            } else if (i7 == org.telegram.messenger.ns.f25585u5 && this.L1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(int i7) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i7 >= 0 && i7 < this.W0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.W0.get(i7);
        } else {
            tL_wallPaper = this.f51410a1;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f51425e2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f51425e2.cancel();
        }
        j71[] j71VarArr = this.f51475y0;
        j71 j71Var = j71VarArr[0];
        j71 j71Var2 = j71VarArr[1];
        j71VarArr[0] = j71Var2;
        j71VarArr[1] = j71Var;
        this.f51466v0.removeView(j71Var2);
        this.f51466v0.addView(j71VarArr[0], this.f51466v0.indexOfChild(j71VarArr[1]) + 1);
        j71 j71Var3 = j71VarArr[0];
        this.f51477z0 = j71Var3;
        j71Var3.setBackground(j71VarArr[1].getBackground());
        p1();
        j71VarArr[1].setVisibility(0);
        j71VarArr[1].setAlpha(1.0f);
        this.f51477z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f51425e2 = ofFloat;
        ofFloat.addUpdateListener(new ii(2, this));
        this.f51425e2.addListener(new x61(this, 0));
        this.f51425e2.setInterpolator(org.telegram.ui.Components.er.f34420f);
        this.f51425e2.setDuration(300L);
        this.f51425e2.start();
        this.f51477z0.getImageReceiver().f22300t1 = 300;
        this.f51477z0.getImageReceiver().r0(org.telegram.messenger.gc.b(tL_wallPaper2.document), this.I1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f51477z0.e();
        this.Y0 = tL_wallPaper2;
        this.G1 = this.L0[2].f41604s;
        o1();
    }

    public final void f1(int i7, int i10, boolean z10) {
        org.telegram.ui.Components.ra0 ra0Var;
        if (i10 == 0) {
            this.f51414b1 = i7;
        } else if (i10 == 1) {
            this.f51421d1 = i7;
        } else if (i10 == 2) {
            this.f51424e1 = i7;
        } else if (i10 == 3) {
            this.f51428f1 = i7;
        }
        r1(z10);
        if (this.L0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.x61[] x61VarArr = this.L0;
                if (i11 >= x61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x61 x61Var = x61VarArr[i11];
                if (x61Var != null) {
                    x61Var.b(i10, i7);
                }
                i11++;
            }
        }
        if (this.f51424e1 != 0) {
            if (this.V0 != null && org.telegram.ui.ActionBar.j6.I.q()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.f51477z0.getBackground();
            if (background instanceof org.telegram.ui.Components.ra0) {
                ra0Var = (org.telegram.ui.Components.ra0) background;
            } else {
                ra0Var = new org.telegram.ui.Components.ra0();
                ra0Var.q(this.f51477z0);
                if (this.F1) {
                    ra0Var.m(false);
                }
            }
            ra0Var.n(this.f51414b1, this.f51421d1, this.f51424e1, this.f51428f1);
            this.f51477z0.setBackground(ra0Var);
            this.l1 = ra0Var.f();
            this.f51447m1 = 754974720;
        } else if (this.f51421d1 != 0) {
            this.f51477z0.setBackground(new GradientDrawable(org.telegram.ui.Components.h9.d(this.f51440j1), new int[]{this.f51414b1, this.f51421d1}));
            int V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(this.f51414b1, this.f51421d1), false);
            this.f51447m1 = V0;
            this.l1 = V0;
        } else {
            this.f51477z0.setBackgroundColor(this.f51414b1);
            int V02 = org.telegram.messenger.g0.V0(this.f51414b1, false);
            this.f51447m1 = V02;
            this.l1 = V02;
        }
        int i12 = org.telegram.ui.ActionBar.j6.f28838cd;
        boolean f12 = org.telegram.ui.ActionBar.j6.f1(i12);
        s61 s61Var = this.f51408a;
        if (f12 && !(this.f51477z0.getBackground() instanceof org.telegram.ui.Components.ra0)) {
            if (org.telegram.ui.ActionBar.j6.t0() instanceof org.telegram.ui.Components.ra0) {
                getThemedColor(i12);
                s61Var.k(this.f51477z0.getBackground(), this.f51477z0.getBackground(), Float.valueOf(this.n1));
            }
        } else {
            s61Var.k(this.f51477z0.getBackground(), this.f51477z0.getBackground(), Float.valueOf(this.n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Zc, s61Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.Zc, s61Var, PorterDuff.Mode.MULTIPLY);
        }
        j71 j71Var = this.f51477z0;
        if (j71Var != null) {
            j71Var.getImageReceiver().f22290p1 = new PorterDuffColorFilter(this.l1, this.f51465u1);
            this.f51477z0.getImageReceiver().setAlpha(Math.abs(this.n1));
            this.f51477z0.invalidate();
            if (org.telegram.ui.ActionBar.j6.I.q() && (this.f51477z0.getBackground() instanceof org.telegram.ui.Components.ra0)) {
                org.telegram.ui.Cells.h0 h0Var = this.V0;
                if (h0Var != null) {
                    h0Var.setTwoSided(true);
                }
                if (this.n1 < 0.0f) {
                    this.f51477z0.getImageReceiver().m0(((org.telegram.ui.Components.ra0) this.f51477z0.getBackground()).f38926k);
                }
            } else {
                this.f51477z0.getImageReceiver().m0(null);
                org.telegram.ui.Cells.h0 h0Var2 = this.V0;
                if (h0Var2 != null) {
                    h0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.h0 h0Var3 = this.V0;
            if (h0Var3 != null) {
                h0Var3.setProgress(this.n1);
            }
        }
        n61 n61Var = this.f51469w0;
        if (n61Var != null) {
            n61Var.g1();
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
        org.telegram.ui.Components.ra0 ra0Var;
        org.telegram.ui.Components.ra0 ra0Var2;
        int i7;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.g6 g6Var = this.f51468w;
        int i10 = this.f51412b;
        if (i10 == 0 && g6Var == null) {
            this.f51477z0.setBackground(org.telegram.ui.ActionBar.j6.s0());
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
                        bitmapDrawable = new BitmapDrawable(org.telegram.messenger.fc.F("b", photoSize.bytes));
                    }
                    j71 j71Var = this.f51477z0;
                    j71Var.f35508a.r0(org.telegram.messenger.gc.b(tL_wallPaper.document), this.I1, org.telegram.messenger.gc.c(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    j71Var.e();
                } else if (obj instanceof oc1) {
                    oc1 oc1Var = (oc1) obj;
                    int i11 = oc1Var.f49931f;
                    int i12 = oc1Var.f49930e;
                    int i13 = oc1Var.d;
                    int i14 = oc1Var.f49929c;
                    int i15 = oc1Var.f49928b;
                    this.f51440j1 = i11;
                    f1(i15, 0, false);
                    if (i14 != 0) {
                        f1(i14, 1, false);
                    }
                    f1(i13, 2, false);
                    f1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                    if (tL_wallPaper2 != null) {
                        j71 j71Var2 = this.f51477z0;
                        org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(tL_wallPaper2.document);
                        String str = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.Y0;
                        j71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(oc1Var.f49927a)) {
                        Point point = org.telegram.messenger.g0.f23609q;
                        int min = Math.min(point.x, point.y);
                        int max = Math.max(point.x, point.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.ra0.g(i15, i14, i13, i12);
                        }
                        this.f51477z0.setImageBitmap(org.telegram.messenger.qz.d(2131623998, min, max, g10));
                    }
                } else if (obj instanceof pc1) {
                    Bitmap bitmap = this.E1;
                    if (bitmap != null) {
                        this.f51477z0.setImageBitmap(bitmap);
                    } else {
                        pc1 pc1Var = (pc1) obj;
                        File file = pc1Var.f50255e;
                        if (file != null) {
                            this.f51477z0.h(file.getAbsolutePath(), this.I1, null);
                        } else {
                            File file2 = pc1Var.d;
                            if (file2 != null) {
                                this.f51477z0.h(file2.getAbsolutePath(), this.I1, null);
                            } else if ("t".equals(pc1Var.f50252a)) {
                                j71 j71Var3 = this.f51477z0;
                                j71Var3.setImageDrawable(org.telegram.ui.ActionBar.j6.Z0(j71Var3, false));
                            } else {
                                int i16 = pc1Var.f50253b;
                                if (i16 != 0) {
                                    this.f51477z0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    TLRPC.Photo photo = jfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(jfVar.K.sizes, this.J1, true, null, false);
                        if (w11 != w10) {
                            photoSize2 = w11;
                        }
                        if (photoSize2 != null) {
                            i7 = photoSize2.size;
                        } else {
                            i7 = 0;
                        }
                        this.f51477z0.g(1, i7, jfVar, this.I1, "100_100_b", "jpg", org.telegram.messenger.gc.i(photoSize2, jfVar.K), org.telegram.messenger.gc.i(w10, jfVar.K));
                    } else {
                        j71 j71Var4 = this.f51477z0;
                        String str2 = jfVar.C;
                        String str3 = this.I1;
                        String str4 = jfVar.D;
                        j71Var4.getClass();
                        j71Var4.n(org.telegram.messenger.gc.g(str2), str3, org.telegram.messenger.gc.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (g6Var == null) {
                this.f51477z0.setBackground(org.telegram.ui.ActionBar.j6.s0());
            } else {
                org.telegram.ui.Components.c9 c9Var = this.f51470w1;
                if (c9Var != null) {
                    c9Var.dispose();
                    this.f51470w1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ee);
                int i17 = (int) g6Var.f28609j;
                if (i17 != 0) {
                    E0 = i17;
                }
                int E02 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Fe);
                long j3 = g6Var.f28610k;
                int i18 = (int) j3;
                if (i18 == 0 && j3 != 0) {
                    E02 = 0;
                } else if (i18 != 0) {
                    E02 = i18;
                }
                int E03 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ge);
                long j10 = g6Var.f28611l;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    E03 = 0;
                } else if (i19 != 0) {
                    E03 = i19;
                }
                int E04 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.He);
                long j11 = g6Var.f28612m;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    E04 = 0;
                } else if (i20 != 0) {
                    E04 = i20;
                }
                if (!TextUtils.isEmpty(g6Var.f28614o) && !org.telegram.ui.ActionBar.j6.c1()) {
                    if (E03 != 0) {
                        Drawable background = this.f51477z0.getBackground();
                        if (background instanceof org.telegram.ui.Components.ra0) {
                            ra0Var2 = (org.telegram.ui.Components.ra0) background;
                        } else {
                            org.telegram.ui.Components.ra0 ra0Var3 = new org.telegram.ui.Components.ra0();
                            ra0Var3.q(this.f51477z0);
                            ra0Var2 = ra0Var3;
                            if (this.F1) {
                                ra0Var3.m(false);
                                ra0Var2 = ra0Var3;
                            }
                        }
                        ra0Var2.n(E0, E02, E03, E04);
                        ra0Var = ra0Var2;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(org.telegram.ui.Components.h9.d(g6Var.f28613n), new int[]{E0, E02});
                        this.f51470w1 = h9Var.f(ia.d.H(0.5f, 3), new b71(this, 0), 100L);
                        ra0Var = h9Var;
                    } else {
                        ra0Var = new ColorDrawable(E0);
                    }
                    this.f51477z0.setBackground(ra0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.Y0;
                    if (tL_wallPaper4 != null) {
                        j71 j71Var5 = this.f51477z0;
                        org.telegram.messenger.gc b11 = org.telegram.messenger.gc.b(tL_wallPaper4.document);
                        String str5 = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.Y0;
                        j71Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.j6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.ra0) {
                            ((org.telegram.ui.Components.ra0) t02).q(this.f51477z0);
                        }
                        this.f51477z0.setBackground(t02);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.g0.V0(E0, false);
                    this.f51447m1 = V0;
                    this.l1 = V0;
                } else if (E03 != 0) {
                    this.l1 = org.telegram.ui.Components.ra0.g(E0, E02, E03, E04);
                    this.f51447m1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(E0, E02), false);
                    this.f51447m1 = V02;
                    this.l1 = V02;
                }
                j71 j71Var6 = this.f51477z0;
                if (j71Var6 != null) {
                    j71Var6.getImageReceiver().f22290p1 = new PorterDuffColorFilter(this.l1, this.f51465u1);
                    this.f51477z0.getImageReceiver().setAlpha(Math.abs(this.n1));
                    this.f51477z0.invalidate();
                    if (org.telegram.ui.ActionBar.j6.I.q() && (this.f51477z0.getBackground() instanceof org.telegram.ui.Components.ra0)) {
                        org.telegram.ui.Cells.h0 h0Var = this.V0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                        if (this.n1 < 0.0f) {
                            this.f51477z0.getImageReceiver().m0(((org.telegram.ui.Components.ra0) this.f51477z0.getBackground()).f38926k);
                        }
                    } else {
                        this.f51477z0.getImageReceiver().m0(null);
                        org.telegram.ui.Cells.h0 h0Var2 = this.V0;
                        if (h0Var2 != null) {
                            h0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.h0 h0Var3 = this.V0;
                    if (h0Var3 != null) {
                        h0Var3.setProgress(this.n1);
                    }
                }
                if (this.L0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.x61[] x61VarArr = this.L0;
                        if (i21 >= x61VarArr.length) {
                            break;
                        }
                        x61VarArr[i21].b(0, E0);
                        this.L0[i21].b(1, E02);
                        this.L0[i21].b(2, E03);
                        this.L0[i21].b(3, E04);
                        i21++;
                    }
                }
                ImageView imageView = this.H0;
                s61 s61Var = this.f51408a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Zc, s61Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.I0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.Zc, s61Var, PorterDuff.Mode.MULTIPLY);
                }
                a1();
            }
        }
        this.F1 = false;
    }

    @Override
    public final int getObserverTag() {
        return this.f51467v1;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f51408a;
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

    public final void i1(org.telegram.ui.Cells.t0 t0Var) {
        s61 s61Var;
        float f10;
        if (this.f51477z0 == null) {
            return;
        }
        Bitmap bitmap = this.f51408a.f51129i;
        float f11 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.f51477z0.getMeasuredWidth() - (Math.max(this.f51477z0.getMeasuredWidth() / width, this.f51477z0.getMeasuredHeight() / s61Var.f51129i.getHeight()) * width)) / 2.0f) + this.Z1 + 0.0f;
        } else {
            f10 = this.Z1 + 0.0f;
        }
        float y10 = t0Var.getY() - ((-this.f51477z0.K) + 0.0f);
        int measuredHeight = this.f51477z0.getMeasuredHeight();
        if (this.O1) {
            f11 = this.f51453p1 * this.f51455q1;
        }
        t0Var.f31513x0 = true;
        t0Var.f31510w0 = measuredHeight;
        t0Var.f31505u0 = y10;
        t0Var.f31507v0 = f10;
        t0Var.f31454c2 = f11;
        t0Var.d2.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f)));
        t0Var.invalidate();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f51412b == 2) {
            if (this.f51419c2 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23603m) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        if (this.f51466v0 != null && this.M0 != null && this.f51468w.f28607g != 0) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (!e12.getBoolean("bganimationhint", false)) {
                if (this.C0 == null) {
                    org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(getParentActivity(), 8);
                    this.C0 = b30Var;
                    b30Var.setShowingDuration(5000L);
                    this.C0.setAlpha(0.0f);
                    this.C0.setVisibility(4);
                    this.C0.setText(org.telegram.messenger.hd.M0(2131753751, null));
                    this.C0.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                    this.m0.addView(this.C0, c8.ja.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                org.telegram.messenger.g0.i3(new fy0(11, this, e12), 500L);
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
        int i16 = this.f51412b;
        if (z10) {
            if (i7 == 0) {
                if (i16 == 2) {
                    this.f51418c1 = this.f51414b1;
                    int i17 = this.f51421d1;
                    this.f51431g1 = i17;
                    int i18 = this.f51424e1;
                    this.f51434h1 = i18;
                    int i19 = this.f51428f1;
                    this.f51437i1 = i19;
                    this.f51443k1 = this.Q;
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
                    this.X.e(this.f51428f1, 3);
                    this.X.e(this.f51424e1, 2);
                    this.X.e(this.f51421d1, 1);
                    this.X.e(this.f51414b1, 0);
                }
            } else {
                this.Z0 = this.Y0;
                this.f51451o1 = this.n1;
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
            org.telegram.ui.Components.x61[] x61VarArr = this.L0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            x61VarArr[c10].setVisibility(0);
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.h0 h0Var = this.V0;
            if (!h0Var.N) {
                float f20 = this.n1;
                if (f20 < 0.0f) {
                    float f21 = -f20;
                    this.n1 = f21;
                    h0Var.setProgress(f21);
                }
            }
        }
        int i20 = 58;
        float f22 = 1.0f;
        FrameLayout[] frameLayoutArr = this.N0;
        if (z11) {
            this.f51463t1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i7 == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (z10) {
                frameLayoutArr[i7].setVisibility(0);
                if (i16 == 1) {
                    n61 n61Var = this.f51469w0;
                    Property property = View.TRANSLATION_Y;
                    if (i7 == 1) {
                        f17 = -org.telegram.messenger.g0.L(21.0f);
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(n61Var, property, f17));
                    org.telegram.ui.Components.x61 x61Var = this.L0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x61Var, property2, f18));
                    org.telegram.ui.Components.x61 x61Var2 = this.L0[0];
                    if (z12) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x61Var2, property2, f19));
                    if (i7 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i7].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property2, 0.0f));
                    }
                    org.telegram.messenger.g0.v1(this.X.F[1]);
                } else if (i16 == 2) {
                    n61 n61Var2 = this.f51469w0;
                    Property property3 = View.TRANSLATION_Y;
                    int i21 = -frameLayoutArr[i7].getMeasuredHeight();
                    if (this.C1 == null) {
                        i20 = 0;
                    }
                    int L = org.telegram.messenger.g0.L(i20 + 72) + i21;
                    if (Z0()) {
                        i12 = org.telegram.messenger.g0.f23604n;
                    } else {
                        i12 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(n61Var2, property3, L + i12));
                    org.telegram.ui.Components.x61 x61Var3 = this.L0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x61Var3, property4, f16));
                    org.telegram.ui.Components.x61 x61Var4 = this.L0[0];
                    if (z12) {
                        f22 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x61Var4, property4, f22));
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
                n61 n61Var3 = this.f51469w0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(n61Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.x61 x61Var5 = this.L0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(x61Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f51477z0, property6, 1.0f));
            }
            this.f51463t1.playTogether(arrayList2);
            this.f51463t1.addListener(new a71(this, z10, i11, i7, z12));
            this.f51463t1.setInterpolator(org.telegram.ui.Components.er.f34421g);
            this.f51463t1.setDuration(200L);
            this.f51463t1.start();
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
                n61 n61Var4 = this.f51469w0;
                if (i7 == 1) {
                    f13 = -org.telegram.messenger.g0.L(21.0f);
                } else {
                    f13 = 0.0f;
                }
                n61Var4.setTranslationY(f13);
                org.telegram.ui.Components.x61 x61Var6 = this.L0[2];
                if (z12) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                x61Var6.setAlpha(f14);
                org.telegram.ui.Components.x61 x61Var7 = this.L0[0];
                if (z12) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                x61Var7.setAlpha(f15);
                if (i7 == 1) {
                    frameLayoutArr[i7].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i7].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                org.telegram.messenger.g0.v1(this.X.F[1]);
            } else if (i16 == 2) {
                n61 n61Var5 = this.f51469w0;
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
                    i10 = org.telegram.messenger.g0.f23604n;
                } else {
                    i10 = 0;
                }
                n61Var5.setTranslationY(L2 + i10);
                org.telegram.ui.Components.x61 x61Var8 = this.L0[2];
                if (z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                x61Var8.setAlpha(f11);
                org.telegram.ui.Components.x61 x61Var9 = this.L0[0];
                if (z12) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                x61Var9.setAlpha(f12);
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
            this.f51469w0.setTranslationY(0.0f);
            frameLayoutArr[i7].setTranslationY(frameLayout.getMeasuredHeight());
            this.L0[0].setAlpha(1.0f);
            this.L0[2].setAlpha(1.0f);
            this.f51477z0.setAlpha(1.0f);
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
        org.telegram.ui.Components.x61[] x61VarArr2 = this.L0;
        if (!z12) {
            c12 = 2;
        }
        x61VarArr2[c12].setVisibility(4);
    }

    public final void l1() {
        Window window;
        if (this.f51441j2 != null) {
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
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f23604n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        bc bcVar = new bc(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f10, (this.Q1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.f51441j2 = bcVar;
        bcVar.setOnTouchListener(new gi.a(2));
        this.f51444k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f51446l2 = ofFloat;
        ofFloat.addUpdateListener(new hi.ba(this, 3));
        this.f51446l2.addListener(new x61(this, 4));
        this.f51446l2.setDuration(400L);
        this.f51446l2.setInterpolator(org.telegram.ui.Components.qs.f38759e);
        this.f51446l2.start();
        frameLayout.addView(this.f51441j2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.h3(new f61(this, 2));
    }

    public final void m1(boolean z10) {
        int i7 = (this.L1 > 0L ? 1 : (this.L1 == 0L ? 0 : -1));
        if (i7 > 0) {
            this.B1.d(org.telegram.messenger.hd.M0(2131754212, null));
        } else if (i7 < 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L1));
            if (M0 != null) {
                this.B1.d(org.telegram.messenger.hd.a0(null, null, 2131754213, M0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f51461s1 == null) {
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131231976, 0);
                        this.f51461s1 = eqVar;
                        eqVar.f34414n = 1;
                    }
                    spannableStringBuilder.setSpan(this.f51461s1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.hd.G(W0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.B1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.L1 < 0 && !this.V1 && !this.W1 && tL_premium_boostsStatus2 == null) {
                        this.V1 = true;
                        getMessagesController().G0().a(this.L1, new i61(this, 1));
                        return;
                    }
                    return;
                }
                this.B1.c(null, z10);
                return;
            }
            this.B1.d(org.telegram.messenger.hd.a0(null, null, 2131754213, org.telegram.messenger.hd.M0(2131754904, null).toLowerCase()));
        } else {
            this.B1.d(org.telegram.messenger.hd.M0(2131754214, null));
        }
    }

    public final void n1() {
        if (this.H1 && this.f51476y1 == null) {
            Bitmap bitmap = this.E1;
            if (bitmap != null) {
                this.f51478z1 = bitmap;
                this.f51476y1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f51477z0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.f22286n0 != null) {
                    this.f51478z1 = imageReceiver.n();
                    this.f51476y1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (this.H1) {
            Bitmap bitmap2 = this.f51476y1;
            if (bitmap2 != null) {
                this.f51477z0.setImageBitmap(bitmap2);
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
        if (z10 || (obj instanceof org.telegram.messenger.jf)) {
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
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                TLRPC.Photo photo = jfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.J1, true, null, false);
                    org.telegram.messenger.w7.G(this.currentAccount);
                    A = org.telegram.messenger.w7.J(w10, null, true, true);
                    name = org.telegram.messenger.w7.r(null, w10);
                    i7 = w10.size;
                } else {
                    A = org.telegram.messenger.fc.A(jfVar.C);
                    name = A.getName();
                    i7 = jfVar.G;
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
            int i10 = this.f51412b;
            if (exists) {
                org.telegram.messenger.z5.q(this.currentAccount).v(this);
                this.f51477z0.invalidate();
                if (i10 == 2) {
                    if (j3 != 0 && this.L1 == 0) {
                        this.f51464u0.setSubtitle(org.telegram.messenger.g0.i0(j3, false, false));
                    } else {
                        this.f51464u0.setSubtitle(null);
                    }
                }
            } else {
                org.telegram.messenger.z5.q(this.currentAccount).a(str, null, this);
                if (i10 == 2 && this.L1 == 0) {
                    this.f51464u0.setSubtitle(org.telegram.messenger.hd.M0(2131748778, null));
                }
                this.f51477z0.invalidate();
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
                this.f51423e0.setEnabled(exists);
                TextView textView = this.f51423e0;
                if (exists) {
                    f12 = 1.0f;
                }
                textView.setAlpha(f12);
            } else if (i10 == 2) {
                this.E0.setEnabled(exists);
                k71 k71Var = this.B1;
                if (k71Var != null) {
                    if (exists) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    k71Var.setAlpha(f10);
                }
                k71 k71Var2 = this.C1;
                if (k71Var2 != null) {
                    if (exists) {
                        f12 = 1.0f;
                    }
                    k71Var2.setAlpha(f12);
                }
            } else {
                this.f51426f.setEnabled(exists);
                org.telegram.ui.ActionBar.q0 q0Var = this.f51426f;
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
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && o4Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.j6.f28922h5));
            if (this.f51412b == 2 && this.L1 != 0) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25550p3);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25519j4);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25585u5);
        int i7 = this.f51412b;
        if (i7 == 1 || i7 == 0) {
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25618z4);
        }
        if (i7 == 2 || i7 == 1) {
            org.telegram.ui.ActionBar.j6.N = true;
        }
        if (i7 == 0 && this.f51468w == null) {
            this.G1 = org.telegram.ui.ActionBar.j6.f28935i0;
        } else {
            Point point = org.telegram.messenger.g0.f23609q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.f23608p));
            sb2.append("_");
            this.I1 = a8.p0.n((int) (max / org.telegram.messenger.g0.f23608p), "_f", sb2);
            this.J1 = Math.max(point.x, point.y);
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25496f4);
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25490e4);
            this.f51467v1 = org.telegram.messenger.z5.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                org.telegram.messenger.vr.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25550p3);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25519j4);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25585u5);
        w61 w61Var = this.m0;
        if (w61Var != null && this.S != null) {
            w61Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        int i7 = this.f51412b;
        if ((i7 == 2 || i7 == 1) && this.f51458r1 == null) {
            org.telegram.messenger.g0.h3(new ah0(4));
        }
        int i10 = org.telegram.messenger.ns.f25618z4;
        if (i7 == 2) {
            Bitmap bitmap = this.f51476y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f51476y1 = null;
            }
            this.f51408a.k(null, null, null);
            org.telegram.messenger.ns.e().k(i10, new Object[0]);
        } else if (i7 == 1 || i7 == 0) {
            org.telegram.messenger.ns.e().n(this, i10);
        }
        if (i7 != 0 || this.f51468w != null) {
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25496f4);
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25490e4);
        }
        super.onFragmentDestroy();
        T0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.G1) {
            this.f51473x1.c(false);
        }
        org.telegram.ui.ActionBar.j6.f28805b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f51454q0;
        if (l4Var != null) {
            l4Var.f();
        }
        p71 p71Var = this.f51472x0;
        if (p71Var != null) {
            p71Var.f();
        }
        if (this.G1) {
            this.f51473x1.c(true);
        }
        org.telegram.ui.ActionBar.j6.f28805b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V0();
            try {
                c5.l lVar = this.f51445l0;
                if (lVar != null) {
                    org.telegram.messenger.g0.B3(lVar, getThemedColor(org.telegram.ui.ActionBar.j6.f29129s8));
                }
                org.telegram.ui.Cells.h0 h0Var = this.V0;
                if (h0Var != null) {
                    h0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.j6.Mj));
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
        if (!z10 && this.f51412b == 2) {
            this.f51408a.k(null, null, null);
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25618z4, new Object[0]);
        }
    }

    public final void p1() {
        this.f51477z0.getImageReceiver().setAlpha(Math.abs(this.n1));
        this.f51477z0.invalidate();
        this.R0.g1();
        if (this.n1 >= 0.0f) {
            this.f51477z0.getImageReceiver().m0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f51477z0.getImageReceiver().Z(null);
            }
            if (this.f51477z0.getBackground() instanceof org.telegram.ui.Components.ra0) {
                this.f51477z0.getImageReceiver().m0(((org.telegram.ui.Components.ra0) this.f51477z0.getBackground()).f38926k);
            }
        }
        this.f51408a.k(this.f51477z0.getBackground(), this.f51477z0.getBackground(), Float.valueOf(this.n1));
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
        int i7 = this.f51412b;
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
            org.telegram.ui.Components.x61 x61Var = this.L0[0];
            if (this.Y0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            x61Var.setEnabled(z11);
            if (this.Y0 != null) {
                this.L0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (org.telegram.messenger.g0.L(9.0f) + ((FrameLayout.LayoutParams) this.L0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.x61 x61Var2 = this.L0[0];
            Property property = View.ALPHA;
            if (this.Y0 == null) {
                f12 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x61Var2, property, f12));
            org.telegram.ui.Components.x61 x61Var3 = this.L0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.Y0 != null) {
                f11 = 0.0f;
            } else {
                f11 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x61Var3, property2, f11));
            org.telegram.ui.Components.x61 x61Var4 = this.L0[1];
            if (this.Y0 == null) {
                f13 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x61Var4, property2, f13));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.f34421g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new z61(this));
            animatorSet.start();
            return;
        }
        if (this.Y0 == null && (this.D1 instanceof oc1)) {
            this.L0[2].a(false, true);
        }
        org.telegram.ui.Components.x61[] x61VarArr = this.L0;
        if (this.Y0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        x61VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.x61 x61Var5 = this.L0[2];
        Property property3 = View.ALPHA;
        if (this.Y0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x61Var5, property3, f10);
        org.telegram.ui.Components.x61 x61Var6 = this.L0[0];
        if (this.Y0 != null) {
            f12 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(x61Var6, property3, f12));
        animatorSet2.addListener(new y61(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.er.f34421g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void r1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t71.r1(boolean):void");
    }

    public final void s1() {
        int childCount = this.R0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.R0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i5) {
                ((org.telegram.ui.Cells.i5) childAt).w(true);
            }
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f51408a.f51123a = e6Var;
    }

    public t71(org.telegram.ui.ActionBar.i6 i6Var, boolean z10, int i7, boolean z11, boolean z12) {
        super(null);
        this.f51408a = new s61(this);
        this.d = true;
        this.f51448n = 1;
        org.telegram.ui.ActionBar.p5 p5Var = new org.telegram.ui.ActionBar.p5(this, 0, false);
        this.T = p5Var;
        org.telegram.ui.ActionBar.p5 p5Var2 = new org.telegram.ui.ActionBar.p5(this, 0, true);
        this.U = p5Var2;
        org.telegram.ui.ActionBar.p5 p5Var3 = new org.telegram.ui.ActionBar.p5(this, 1, false);
        this.V = p5Var3;
        org.telegram.ui.ActionBar.p5 p5Var4 = new org.telegram.ui.ActionBar.p5(this, 1, true);
        this.W = p5Var4;
        this.Z = -1;
        this.f51409a0 = new f61(this, 0);
        this.f51475y0 = new j71[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.f51453p1 = 0.0f;
        this.f51465u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new org.telegram.ui.Components.d10(getParentActivity(), new u61(this));
        this.V1 = false;
        this.W1 = false;
        this.f51412b = i7;
        this.f51433h0 = z12;
        this.f51430g0 = i6Var;
        this.f51439j0 = z10;
        this.f51436i0 = z11;
        if (i7 == 1) {
            org.telegram.ui.ActionBar.g6 k10 = i6Var.k(!z11);
            this.f51468w = k10;
            if (k10 != null) {
                this.d = false;
                this.f51474y = k10.f28604c;
                this.E = k10.d;
                this.F = k10.f28605e;
                this.G = k10.f28606f;
                this.H = k10.f28607g;
                this.I = k10.h;
                this.J = k10.f28608i;
                this.K = k10.f28609j;
                this.L = k10.f28610k;
                this.M = k10.f28611l;
                this.N = k10.f28612m;
                this.O = k10.f28615p;
                this.P = k10.f28614o;
                this.Q = k10.f28613n;
            }
        } else {
            if (i7 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.g6 k11 = i6Var.k(false);
            this.f51468w = k11;
            if (k11 != null) {
                this.Y0 = k11.f28618s;
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f51468w;
        if (g6Var != null) {
            this.G1 = g6Var.f28616q;
            if (!TextUtils.isEmpty(g6Var.f28614o)) {
                this.n1 = this.f51468w.f28615p;
            }
            org.telegram.ui.ActionBar.j6.M = org.telegram.ui.ActionBar.j6.D0();
            org.telegram.ui.ActionBar.j6.O = true;
            org.telegram.ui.ActionBar.j6.P = true;
            org.telegram.ui.ActionBar.j6.u(i6Var, false, false);
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25584u4, new Object[0]);
        p5Var.v = true;
        p5Var3.v = true;
        p5Var2.v = true;
        p5Var4.v = true;
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }

    public t71(org.telegram.ui.ActionBar.i6 i6Var) {
        this(i6Var, false, 0, false, false);
    }
}
