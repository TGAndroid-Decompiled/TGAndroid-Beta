package vg;

import ai.c7;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import ci.ba;
import ci.ic;
import ci.r4;
import gi.ka;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ls0;
import org.telegram.ui.s51;
import org.telegram.ui.yr0;
public class h1 extends ma implements cs {
    public boolean A2;
    public ValueAnimator B2;
    public boolean C2;
    public boolean D2;
    public FrameLayout E2;
    public final FrameLayout F2;
    public FrameLayout G2;
    public s70[] H2;
    public s70 I2;
    public final ArrayList Q1;
    public int R1;
    public final TLRPC.User S1;
    public final j T1;
    public final TL_stars.StarGift U1;
    public boolean V1;
    public final yr0 W1;
    public int X1;
    public int Y1;
    public int Z1;
    public int f56624a2;
    public int f56625b2;
    public int c2;
    public int f56626d2;
    public int f56627e2;
    public int f56628f2;
    public int f56629g2;
    public final gz f56630h2;
    public final x0 f56631i2;
    public ii.f f56632j2;
    public ic f56633k2;
    public s51 f56634l2;
    public final d2 f56635m2;
    public Integer f56636n2;
    public float f56637o2;
    public float f56638p2;
    public float f56639q2;
    public float f56640r2;
    public float f56641s2;
    public View f56642t2;
    public View f56643u2;
    public TLRPC.InputStickerSet f56644v2;
    public TLRPC.TL_emojiStatusCollectible f56645w2;
    public boolean f56646x2;
    public final int[] f56647y2;
    public float f56648z2;

    public h1(d2 d2Var, int i3, TLRPC.User user, e6 e6Var) {
        this(d2Var, i3, user, null, null, e6Var);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        return new r4(this, 10);
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131744241, null);
    }

    @Override
    public final void S0(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.Q1;
            if (i11 < arrayList.size()) {
                yr0 yr0Var = this.W1;
                yr0Var.a((ls0) arrayList.get(i11), false);
                yr0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((ls0) arrayList.get(i11)).f47433e = i12;
                i12 += yr0Var.getMeasuredHeight();
                i11++;
            } else {
                this.X1 = i12;
                this.f28589c.getLocationOnScreen(this.f56647y2);
                return;
            }
        }
    }

    @Override
    public final void U0(qt0 qt0Var) {
        this.R1 = h10.f22829t0;
        o0 o0Var = new o0(getContext(), this.J0, false);
        o0Var.b(PremiumPreviewFragment.t0(this.R1, null), new b1(this, 0), false);
        this.E2 = new FrameLayout(getContext());
        View view = new View(getContext());
        r6.i(k6.f27879d7, view, this.J0);
        this.E2.addView(view, mf.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.Z3(view, true, 1.0f, true, false);
        if (!h10.i(this.R1).q() && !(this instanceof xg.j0)) {
            this.E2.addView(o0Var, mf.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            r6.i(k6.f27954h5, this.E2, this.J0);
            qt0Var.addView(this.E2, mf.e(-1, 68, 80));
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        View view;
        Drawable drawable;
        int i3;
        View view2 = this.f56643u2;
        if (view2 != null) {
            if (this.A2) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            view2.setVisibility(i3);
        }
        if (this.f56642t2 != null && this.A2) {
            View view3 = this.f56643u2;
            if (view3 == null) {
                view = this.f56633k2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f56637o2, this.f56638p2};
            this.f56642t2.getMatrix().mapPoints(fArr);
            View view4 = this.f56642t2;
            if (view4 instanceof k5) {
                drawable = ((k5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.q1) {
                drawable = ((org.telegram.ui.Cells.q1) view4).f30041pa;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.f56647y2;
            float f10 = (-iArr[0]) + this.f56639q2 + fArr[0];
            float f11 = (-iArr[1]) + this.f56640r2 + fArr[1];
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view5 = this.f56635m2.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f56641s2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.f28589c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, xq.h.getInterpolation(this.f56648z2));
            float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.f56648z2);
            float f14 = this.f56641s2;
            float f15 = this.f56648z2;
            float f16 = (f12 * f15) + ((1.0f - f15) * f14);
            canvas.save();
            canvas.scale(f16, f16, T1, T12);
            int i10 = (int) T1;
            int i11 = (int) T12;
            drawable.setBounds(org.telegram.ui.Cells.f1.C(2, i10, drawable), org.telegram.ui.Cells.f1.B(2, i11, drawable), org.telegram.ui.Cells.f1.z(2, i10, drawable), org.telegram.ui.Cells.f1.i(2, i11, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.f56648z2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.f56648z2);
            canvas.scale(T13, T13, T1, T12);
            canvas.translate(T1 - (view.getMeasuredWidth() / 2.0f), T12 - (view.getMeasuredHeight() / 2.0f));
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i3 == hs.B0 && (inputStickerSet = this.f56644v2) != null && inputStickerSet.f27021id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        hs.e().k(hs.k1, 4);
        ValueAnimator valueAnimator = this.B2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gz gzVar = this.f56630h2;
        if (gzVar.f34239c) {
            gzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(s51 s51Var) {
        s51Var.addView(this.f56643u2, mf.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i3) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.f56636n2;
        if (num == null) {
            return org.telegram.messenger.g0.Q2(str, k6.f28196u6, this.J0, null, false);
        }
        return org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void j1(boolean z10) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        s70[] s70VarArr = this.H2;
        if (s70VarArr != null && this.I2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f56645w2;
            TLRPC.User user = this.S1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.H2[0].setText(org.telegram.messenger.g0.U2(bd.a0(null, null, 2131744229, m5.u(user), str2), new z0(this, 0)));
                this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744227, null)));
            } else if (this.f56644v2 != null) {
                CharSequence i12 = i1(bd.a0(null, null, 2131744226, g5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    i12 = i6.m(i12, this.H2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (i12 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) i12;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(i12);
                }
                int indexOf = i12.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet m0 = li.b0(this.R1).m0(this.f56644v2, false);
                    if (m0 != null && !m0.documents.isEmpty()) {
                        document = m0.documents.get(0);
                        if (m0.set != null) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= m0.documents.size()) {
                                    break;
                                } else if (m0.documents.get(i3).f27007id == m0.set.thumb_document_id) {
                                    document = m0.documents.get(i3);
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new p5(document, this.H2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (m0 != null && m0.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) m0.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new x70(org.telegram.messenger.g0.L(100.0f), this.H2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new ka(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.H2[1].setOnLinkPressListener(new r70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            ArrayList arrayList = new ArrayList();
                            h1 h1Var = h1.this;
                            arrayList.add(h1Var.f56644v2);
                            c7 c7Var = new c7(h1Var, 12);
                            d2 d2Var = h1Var.f56635m2;
                            if (d2Var != null) {
                                c7Var.setParentFragment(d2Var);
                            }
                            new d1(h1Var, c7Var, h1Var.getContext(), h1Var.J0, arrayList).show();
                        }
                    });
                    if (document != null) {
                        s70[] s70VarArr2 = this.H2;
                        if (s70VarArr2 != null) {
                            s70VarArr2[1].setText(spannableStringBuilder);
                            if (this.H2[1].getVisibility() != 0) {
                                if (z10) {
                                    this.H2[1].setAlpha(0.0f);
                                    this.H2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.H2[1].animate().alpha(1.0f);
                                    xq xqVar = xq.f40452f;
                                    org.telegram.messenger.camera.q.l(alpha, xqVar, 200L);
                                    this.H2[0].animate().alpha(0.0f).setInterpolator(xqVar).setDuration(200L).withEndAction(new z0(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new c1(this, 1));
                                    ofFloat.setInterpolator(xqVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.H2[1].setAlpha(1.0f);
                                    this.H2[1].setVisibility(0);
                                    this.H2[0].setAlpha(0.0f);
                                    this.H2[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.H2[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744227, null)));
            } else if (this.f56646x2) {
                s70VarArr[0].setText(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744228, g5.m(0, user.first_name, user.last_name))));
                this.I2.setText(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744227, g5.m(0, user.first_name, user.last_name))));
            } else {
                j jVar = this.T1;
                if (jVar != null) {
                    if (this.V1) {
                        s70 s70Var = s70VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        s70Var.setText(i1(bd.a0(null, null, 2131744230, str, bd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        s70 s70Var2 = this.I2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        s70Var2.setText(i1(bd.a0(null, null, 2131744231, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f27150id != 777000) {
                        this.H2[0].setText(i1(bd.a0(null, null, 2131744233, user.first_name, bd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744234, null)));
                    } else {
                        this.H2[0].setText(i1(bd.a0(null, null, 2131744232, bd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744234, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.U1;
                    if (starGift != null) {
                        s70VarArr[0].setText(bd.M0(2131750076, null));
                        this.H2[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.I2.setText(org.telegram.messenger.g0.X2(bd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131750080, null)));
                        }
                        this.I2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        s70VarArr[0].setText(bd.M0(2131744241, null));
                        this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744239, null)));
                    } else {
                        s70VarArr[0].setText(i1(bd.a0(null, null, 2131744235, g5.m(0, user.first_name, user.last_name))));
                        this.I2.setText(org.telegram.messenger.g0.X2(bd.M0(2131744236, null)));
                    }
                }
            }
            try {
                s70 s70Var3 = this.H2[0];
                s70Var3.setText(i6.m(s70Var3.getText(), this.H2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void k1() {
        int i3 = this.Y1;
        int i10 = i3 + 1;
        this.Y1 = i10;
        this.Z1 = i3;
        this.c2 = i10;
        int size = this.Q1.size() + i10;
        this.f56626d2 = size;
        this.Y1 = size + 1;
        this.f56627e2 = size;
        if (!h10.i(this.R1).q() && this.T1 == null) {
            int i11 = this.Y1;
            this.Y1 = i11 + 1;
            this.f56628f2 = i11;
        }
    }

    @Override
    public final boolean m0() {
        Drawable drawable;
        if (this.f56642t2 == null) {
            return false;
        }
        this.B2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f56648z2 = 0.0f;
        this.A2 = true;
        this.f56634l2.invalidate();
        View view = this.f56642t2;
        if (view instanceof k5) {
            drawable = ((k5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            e5 e5Var = q1Var.f30041pa;
            q1Var.p2();
            drawable = e5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f56642t2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).p2();
        } else {
            view2.invalidate();
        }
        ic icVar = this.f56633k2;
        if (icVar != null) {
            icVar.m(100L);
        }
        this.B2.addUpdateListener(new c1(this, 0));
        this.B2.addListener(new ri0(22, this, drawable));
        this.B2.setDuration(600L);
        this.B2.setInterpolator(xq.h);
        this.B2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(h10.f22829t0).c(this, hs.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(h10.f22829t0).n(this, hs.B0);
    }

    @Override
    public final void show() {
        super.show();
        hs.e().k(hs.f23249j1, 4);
        if (this.C2) {
            org.telegram.messenger.g0.i3(new z0(this, 1), 200L);
        }
    }

    @Override
    public final boolean t(Dialog dialog) {
        ic icVar = this.f56633k2;
        if (icVar != null) {
            icVar.setDialogVisible(true);
        }
        this.f56632j2.setPaused(true);
        dialog.setOnDismissListener(new ba(this, 14));
        dialog.show();
        return true;
    }

    public h1(d2 d2Var, int i3, TLRPC.User user, j jVar, TL_stars.StarGift starGift, e6 e6Var) {
        super(d2Var, false, false, e6Var);
        ArrayList arrayList = new ArrayList();
        this.Q1 = arrayList;
        this.f56647y2 = new int[2];
        this.f56648z2 = 0.0f;
        N();
        this.f56635m2 = d2Var;
        this.f36108s1 = 0.26f;
        this.S1 = user;
        this.R1 = i3;
        this.T1 = jVar;
        this.U1 = starGift;
        this.W1 = new yr0(getContext(), null);
        PremiumPreviewFragment.s0(i3, arrayList);
        if (jVar != null || h10.i(i3).q()) {
            this.E2.setVisibility(8);
        }
        x0 x0Var = new x0(k6.zk, k6.Ak, k6.Bk, k6.Ck, null);
        this.f56631i2 = x0Var;
        x0Var.f56917m = true;
        x0Var.f56919o = 1.0f;
        x0Var.f56920p = 0.0f;
        x0Var.f56921q = 0.0f;
        x0Var.f56908b = 0.0f;
        x0Var.f56909c = 0.0f;
        k1();
        this.f36102l1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f36102l1.setOnItemClickListener(new ll0(this, i3, d2Var, 1));
        li.b0(i3).o1();
        PremiumPreviewFragment.w0("profile");
        gz gzVar = new gz(getContext());
        this.f56630h2 = gzVar;
        this.f28589c.addView(gzVar, mf.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.F2 = frameLayout;
        this.f28586b.addView(frameLayout, mf.e(-1, 140, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i3, View view) {
    }
}
