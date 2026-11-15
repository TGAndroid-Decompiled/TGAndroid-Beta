package ug;

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
import bi.t6;
import di.i4;
import di.q9;
import di.xb;
import hi.ha;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.z70;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fs0;
import org.telegram.ui.ss0;
import org.telegram.ui.z51;
import tg.h2;
public class g1 extends ja implements is {
    public boolean A2;
    public final int[] B2;
    public float C2;
    public boolean D2;
    public ValueAnimator E2;
    public boolean F2;
    public boolean G2;
    public FrameLayout H2;
    public final FrameLayout I2;
    public FrameLayout J2;
    public z70[] K2;
    public z70 L2;
    public final ArrayList T1;
    public int U1;
    public final TLRPC.User V1;
    public final j W1;
    public final TL_stars.StarGift X1;
    public boolean Y1;
    public final fs0 Z1;
    public int f58087a2;
    public int f58088b2;
    public int f58089c2;
    public int d2;
    public int f58090e2;
    public int f58091f2;
    public int f58092g2;
    public int f58093h2;
    public int f58094i2;
    public int f58095j2;
    public final nz f58096k2;
    public final z0 f58097l2;
    public ki.f f58098m2;
    public xb f58099n2;
    public z51 f58100o2;
    public final e2 f58101p2;
    public Integer f58102q2;
    public float f58103r2;
    public float f58104s2;
    public float f58105t2;
    public float f58106u2;
    public float f58107v2;
    public View f58108w2;
    public View f58109x2;
    public TLRPC.InputStickerSet f58110y2;
    public TLRPC.TL_emojiStatusCollectible f58111z2;

    public g1(e2 e2Var, int i7, TLRPC.User user, e6 e6Var) {
        this(e2Var, i7, user, null, null, e6Var);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        return new i4(this, 11);
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131744231, null);
    }

    @Override
    public final void S0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i11 < arrayList.size()) {
                fs0 fs0Var = this.Z1;
                fs0Var.a((ss0) arrayList.get(i11), false);
                fs0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((ss0) arrayList.get(i11)).f51272e = i12;
                i12 += fs0Var.getMeasuredHeight();
                i11++;
            } else {
                this.f58087a2 = i12;
                this.f29685c.getLocationOnScreen(this.B2);
                return;
            }
        }
    }

    @Override
    public final void U0(st0 st0Var) {
        this.U1 = m10.f24940t0;
        q0 q0Var = new q0(getContext(), this.J0, false);
        q0Var.b(PremiumPreviewFragment.t0(this.U1, null), new h2(this, 2), false);
        this.H2 = new FrameLayout(getContext());
        View view = new View(getContext());
        q6.h(j6.f28850d7, view, this.J0);
        this.H2.addView(view, c8.ja.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.Y3(view, true, 1.0f, true, false);
        if (!m10.i(this.U1).q() && !(this instanceof wg.h0)) {
            this.H2.addView(q0Var, c8.ja.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            q6.h(j6.f28922h5, this.H2, this.J0);
            st0Var.addView(this.H2, c8.ja.e(-1, 68, 80));
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        View view;
        Drawable drawable;
        int i7;
        View view2 = this.f58109x2;
        if (view2 != null) {
            if (this.D2) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            view2.setVisibility(i7);
        }
        if (this.f58108w2 != null && this.D2) {
            View view3 = this.f58109x2;
            if (view3 == null) {
                view = this.f58099n2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f58103r2, this.f58104s2};
            this.f58108w2.getMatrix().mapPoints(fArr);
            View view4 = this.f58108w2;
            if (view4 instanceof j5) {
                drawable = ((j5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.q1) {
                drawable = ((org.telegram.ui.Cells.q1) view4).f31122qa;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.B2;
            float f10 = (-iArr[0]) + this.f58105t2 + fArr[0];
            float f11 = (-iArr[1]) + this.f58106u2 + fArr[1];
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view5 = this.f58101p2.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f58107v2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.f29685c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, er.h.getInterpolation(this.C2));
            float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.C2);
            float f14 = this.f58107v2;
            float f15 = this.C2;
            float f16 = (f12 * f15) + ((1.0f - f15) * f14);
            canvas.save();
            canvas.scale(f16, f16, T1, T12);
            int i10 = (int) T1;
            int i11 = (int) T12;
            drawable.setBounds(org.telegram.ui.Cells.y0.A(2, i10, drawable), org.telegram.ui.Cells.y0.y(2, i11, drawable), org.telegram.ui.Cells.y0.w(2, i10, drawable), org.telegram.ui.Cells.y0.h(2, i11, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.C2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.C2);
            canvas.scale(T13, T13, T1, T12);
            i20.j(view.getMeasuredHeight(), 2.0f, T12, T1 - (view.getMeasuredWidth() / 2.0f), canvas);
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == ns.B0 && (inputStickerSet = this.f58110y2) != null && inputStickerSet.f28071id == ((Long) objArr[0]).longValue()) {
            j1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ns.e().k(ns.f25523k1, 4);
        ValueAnimator valueAnimator = this.E2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        nz nzVar = this.f58096k2;
        if (nzVar.f37752c) {
            nzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void e1(z51 z51Var) {
        z51Var.addView(this.f58109x2, c8.ja.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int f1() {
        return 0;
    }

    public View h1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder i1(String str) {
        Integer num = this.f58102q2;
        if (num == null) {
            return org.telegram.messenger.g0.Q2(str, j6.f29165u6, this.J0, null, false);
        }
        return org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void j1(boolean z10) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        z70[] z70VarArr = this.K2;
        if (z70VarArr != null && this.L2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f58111z2;
            TLRPC.User user = this.V1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.K2[0].setText(org.telegram.messenger.g0.U2(hd.a0(null, null, 2131744219, m5.u(user), str2), new b1(this, 0)));
                this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744217, null)));
            } else if (this.f58110y2 != null) {
                CharSequence i12 = i1(hd.a0(null, null, 2131744216, g5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    i12 = org.telegram.messenger.j6.m(i12, this.K2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (i12 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) i12;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(i12);
                }
                int indexOf = i12.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet m0 = si.b0(this.U1).m0(this.f58110y2, false);
                    if (m0 != null && !m0.documents.isEmpty()) {
                        document = m0.documents.get(0);
                        if (m0.set != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= m0.documents.size()) {
                                    break;
                                } else if (m0.documents.get(i7).f28057id == m0.set.thumb_document_id) {
                                    document = m0.documents.get(i7);
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    } else {
                        document = null;
                    }
                    if (document != null) {
                        spannableStringBuilder2 = new SpannableStringBuilder("x");
                        spannableStringBuilder2.setSpan(new p5(document, this.K2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (m0 != null && m0.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) m0.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new e80(org.telegram.messenger.g0.L(100.0f), this.K2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new ha(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.K2[1].setOnLinkPressListener(new y70() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            ArrayList arrayList = new ArrayList();
                            g1 g1Var = g1.this;
                            arrayList.add(g1Var.f58110y2);
                            t6 t6Var = new t6(g1Var, 12);
                            e2 e2Var = g1Var.f58101p2;
                            if (e2Var != null) {
                                t6Var.setParentFragment(e2Var);
                            }
                            new e1(g1Var, t6Var, g1Var.getContext(), g1Var.J0, arrayList).show();
                        }
                    });
                    if (document != null) {
                        z70[] z70VarArr2 = this.K2;
                        if (z70VarArr2 != null) {
                            z70VarArr2[1].setText(spannableStringBuilder);
                            if (this.K2[1].getVisibility() != 0) {
                                if (z10) {
                                    this.K2[1].setAlpha(0.0f);
                                    this.K2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.K2[1].animate().alpha(1.0f);
                                    er erVar = er.f34419f;
                                    i20.n(alpha, erVar, 200L);
                                    this.K2[0].animate().alpha(0.0f).setInterpolator(erVar).setDuration(200L).withEndAction(new b1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new d1(this, 1));
                                    ofFloat.setInterpolator(erVar);
                                    ofFloat.setDuration(200L);
                                    ofFloat.start();
                                } else {
                                    this.K2[1].setAlpha(1.0f);
                                    this.K2[1].setVisibility(0);
                                    this.K2[0].setAlpha(0.0f);
                                    this.K2[0].setVisibility(8);
                                }
                            }
                        }
                    } else {
                        this.K2[0].setText(spannableStringBuilder, (TextView.BufferType) null);
                    }
                }
                this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744217, null)));
            } else if (this.A2) {
                z70VarArr[0].setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744218, g5.m(0, user.first_name, user.last_name))));
                this.L2.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744217, g5.m(0, user.first_name, user.last_name))));
            } else {
                j jVar = this.W1;
                if (jVar != null) {
                    if (this.Y1) {
                        z70 z70Var = z70VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        z70Var.setText(i1(hd.a0(null, null, 2131744220, str, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        z70 z70Var2 = this.L2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        z70Var2.setText(i1(hd.a0(null, null, 2131744221, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f28200id != 777000) {
                        this.K2[0].setText(i1(hd.a0(null, null, 2131744223, user.first_name, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744224, null)));
                    } else {
                        this.K2[0].setText(i1(hd.a0(null, null, 2131744222, hd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744224, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.X1;
                    if (starGift != null) {
                        z70VarArr[0].setText(hd.M0(2131750068, null));
                        this.K2[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.L2.setText(org.telegram.messenger.g0.X2(hd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131750072, null)));
                        }
                        this.L2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        z70VarArr[0].setText(hd.M0(2131744231, null));
                        this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744229, null)));
                    } else {
                        z70VarArr[0].setText(i1(hd.a0(null, null, 2131744225, g5.m(0, user.first_name, user.last_name))));
                        this.L2.setText(org.telegram.messenger.g0.X2(hd.M0(2131744226, null)));
                    }
                }
            }
            try {
                z70 z70Var3 = this.K2[0];
                z70Var3.setText(org.telegram.messenger.j6.m(z70Var3.getText(), this.K2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void k1() {
        int i7 = this.f58088b2;
        int i10 = i7 + 1;
        this.f58088b2 = i10;
        this.f58089c2 = i7;
        this.f58091f2 = i10;
        int size = this.T1.size() + i10;
        this.f58092g2 = size;
        this.f58088b2 = size + 1;
        this.f58093h2 = size;
        if (!m10.i(this.U1).q() && this.W1 == null) {
            int i11 = this.f58088b2;
            this.f58088b2 = i11 + 1;
            this.f58094i2 = i11;
        }
    }

    @Override
    public final boolean m0() {
        Drawable drawable;
        if (this.f58108w2 == null) {
            return false;
        }
        this.E2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C2 = 0.0f;
        this.D2 = true;
        this.f58100o2.invalidate();
        View view = this.f58108w2;
        if (view instanceof j5) {
            drawable = ((j5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            e5 e5Var = q1Var.f31122qa;
            q1Var.q2();
            drawable = e5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f58108w2;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view2).q2();
        } else {
            view2.invalidate();
        }
        xb xbVar = this.f58099n2;
        if (xbVar != null) {
            xbVar.m(100L);
        }
        this.E2.addUpdateListener(new d1(this, 0));
        this.E2.addListener(new y50(22, this, drawable));
        this.E2.setDuration(600L);
        this.E2.setInterpolator(er.h);
        this.E2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(m10.f24940t0).c(this, ns.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(m10.f24940t0).n(this, ns.B0);
    }

    @Override
    public final void show() {
        super.show();
        ns.e().k(ns.f25518j1, 4);
        if (this.F2) {
            org.telegram.messenger.g0.i3(new b1(this, 1), 200L);
        }
    }

    @Override
    public final boolean t(Dialog dialog) {
        xb xbVar = this.f58099n2;
        if (xbVar != null) {
            xbVar.setDialogVisible(true);
        }
        this.f58098m2.setPaused(true);
        dialog.setOnDismissListener(new q9(this, 14));
        dialog.show();
        return true;
    }

    public g1(e2 e2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, e6 e6Var) {
        super(e2Var, false, false, e6Var);
        ArrayList arrayList = new ArrayList();
        this.T1 = arrayList;
        this.B2 = new int[2];
        this.C2 = 0.0f;
        O();
        this.f58101p2 = e2Var;
        this.f35938v1 = 0.26f;
        this.V1 = user;
        this.U1 = i7;
        this.W1 = jVar;
        this.X1 = starGift;
        this.Z1 = new fs0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || m10.i(i7).q()) {
            this.H2.setVisibility(8);
        }
        z0 z0Var = new z0(j6.Ck, j6.Dk, j6.Ek, j6.Fk, null);
        this.f58097l2 = z0Var;
        z0Var.f58398m = true;
        z0Var.f58400o = 1.0f;
        z0Var.f58401p = 0.0f;
        z0Var.f58402q = 0.0f;
        z0Var.f58389b = 0.0f;
        z0Var.f58390c = 0.0f;
        k1();
        this.f35931o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f35931o1.setOnItemClickListener(new ml0(this, i7, e2Var, 1));
        si.b0(i7).o1();
        PremiumPreviewFragment.w0("profile");
        nz nzVar = new nz(getContext());
        this.f58096k2 = nzVar;
        this.f29685c.addView(nzVar, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I2 = frameLayout;
        this.f29682b.addView(frameLayout, c8.ja.e(-1, 140, 87));
    }

    public void g1(View view) {
    }

    public void d1(int i7, View view) {
    }
}
