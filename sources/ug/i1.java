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
import bi.y8;
import c8.ma;
import di.bc;
import di.l4;
import di.t9;
import hi.ia;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.x5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.d61;
import org.telegram.ui.js0;
import org.telegram.ui.ws0;
public class i1 extends sa implements fs {
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
    public k80[] K2;
    public k80 L2;
    public final ArrayList T1;
    public int U1;
    public final TLRPC.User V1;
    public final j W1;
    public final TL_stars.StarGift X1;
    public boolean Y1;
    public final js0 Z1;
    public int f58678a2;
    public int f58679b2;
    public int f58680c2;
    public int d2;
    public int f58681e2;
    public int f58682f2;
    public int f58683g2;
    public int f58684h2;
    public int f58685i2;
    public int f58686j2;
    public final uz f58687k2;
    public final b1 f58688l2;
    public ki.f f58689m2;
    public bc f58690n2;
    public d61 f58691o2;
    public final h2 f58692p2;
    public Integer f58693q2;
    public float f58694r2;
    public float f58695s2;
    public float f58696t2;
    public float f58697u2;
    public float f58698v2;
    public View f58699w2;
    public View f58700x2;
    public TLRPC.InputStickerSet f58701y2;
    public TLRPC.TL_emojiStatusCollectible f58702z2;

    public i1(h2 h2Var, int i7, TLRPC.User user, i6 i6Var) {
        this(h2Var, i7, user, null, null, i6Var);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        return new l4(this, 11);
    }

    @Override
    public final CharSequence P0() {
        return gd.M0(2131743996, null);
    }

    @Override
    public final void T0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i11 < arrayList.size()) {
                js0 js0Var = this.Z1;
                js0Var.a((ws0) arrayList.get(i11), false);
                js0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                ((ws0) arrayList.get(i11)).f53472e = i12;
                i12 += js0Var.getMeasuredHeight();
                i11++;
            } else {
                this.f58678a2 = i12;
                this.f30193c.getLocationOnScreen(this.B2);
                return;
            }
        }
    }

    @Override
    public final void V0(au0 au0Var) {
        this.U1 = j10.f24770t0;
        s0 s0Var = new s0(getContext(), this.J0, false);
        s0Var.b(PremiumPreviewFragment.t0(this.U1, null), new sh.b(this, 4), false);
        this.H2 = new FrameLayout(getContext());
        View view = new View(getContext());
        u6.h(n6.f29395d7, view, this.J0);
        this.H2.addView(view, ma.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        org.telegram.messenger.g0.X3(view, true, 1.0f, true, false);
        if (!j10.i(this.U1).q() && !(this instanceof wg.j0)) {
            this.H2.addView(s0Var, ma.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            u6.h(n6.f29467h5, this.H2, this.J0);
            au0Var.addView(this.H2, ma.e(-1, 68, 80));
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        View view;
        Drawable drawable;
        int i7;
        View view2 = this.f58700x2;
        if (view2 != null) {
            if (this.D2) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            view2.setVisibility(i7);
        }
        if (this.f58699w2 != null && this.D2) {
            View view3 = this.f58700x2;
            if (view3 == null) {
                view = this.f58690n2;
            } else {
                view = view3;
            }
            if (view == view3) {
                view3.setVisibility(0);
            }
            canvas.save();
            float[] fArr = {this.f58694r2, this.f58695s2};
            this.f58699w2.getMatrix().mapPoints(fArr);
            View view4 = this.f58699w2;
            if (view4 instanceof n5) {
                drawable = ((n5) view4).getRightDrawable();
            } else if (view4 instanceof org.telegram.ui.Cells.r1) {
                drawable = ((org.telegram.ui.Cells.r1) view4).f31544qa;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                canvas.restore();
                return;
            }
            int[] iArr = this.B2;
            float f10 = (-iArr[0]) + this.f58696t2 + fArr[0];
            float f11 = (-iArr[1]) + this.f58697u2 + fArr[1];
            if (org.telegram.messenger.g0.Q1()) {
                ViewGroup view5 = this.f58692p2.getParentLayout().getView();
                f10 += view5.getX() + view5.getPaddingLeft();
                f11 += view5.getY() + view5.getPaddingTop();
            }
            float intrinsicWidth = this.f58698v2 * drawable.getIntrinsicWidth();
            float measuredHeight = view.getMeasuredHeight() * 0.8f;
            float f12 = measuredHeight / intrinsicWidth;
            float f13 = intrinsicWidth / measuredHeight;
            float measuredWidth = view.getMeasuredWidth() / 2.0f;
            for (View view6 = view; view6 != this.f30193c && view6 != null; view6 = (View) view6.getParent()) {
                measuredWidth += view6.getX();
            }
            float measuredHeight2 = (view.getMeasuredHeight() / 2.0f) + ((View) view.getParent().getParent()).getY() + ((View) view.getParent()).getY() + view.getY() + 0.0f;
            float T1 = org.telegram.messenger.g0.T1(f10, measuredWidth, lr.h.getInterpolation(this.C2));
            float T12 = org.telegram.messenger.g0.T1(f11, measuredHeight2, this.C2);
            float f14 = this.f58698v2;
            float f15 = this.C2;
            float f16 = (f12 * f15) + ((1.0f - f15) * f14);
            canvas.save();
            canvas.scale(f16, f16, T1, T12);
            int i10 = (int) T1;
            int i11 = (int) T12;
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, i10, drawable), org.telegram.ui.Cells.c0.A(2, i11, drawable), org.telegram.ui.Cells.c0.y(2, i10, drawable), org.telegram.ui.Cells.c0.j(2, i11, drawable));
            drawable.setAlpha((int) ((1.0f - Utilities.i(this.C2, 1.0f, 0.0f)) * 255.0f));
            drawable.draw(canvas);
            drawable.setAlpha(0);
            canvas.restore();
            float T13 = org.telegram.messenger.g0.T1(f13, 1.0f, this.C2);
            canvas.scale(T13, T13, T1, T12);
            n10.k(view.getMeasuredHeight(), 2.0f, T12, T1 - (view.getMeasuredWidth() / 2.0f), canvas);
            view.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i7 == ks.B0 && (inputStickerSet = this.f58701y2) != null && inputStickerSet.f28423id == ((Long) objArr[0]).longValue()) {
            k1(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ks.e().k(ks.f25140k1, 4);
        ValueAnimator valueAnimator = this.E2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        uz uzVar = this.f58687k2;
        if (uzVar.f40447c) {
            uzVar.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    public void f1(d61 d61Var) {
        d61Var.addView(this.f58700x2, ma.q(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int g1() {
        return 0;
    }

    public View i1(Context context, int i7) {
        return null;
    }

    public final SpannableStringBuilder j1(String str) {
        Integer num = this.f58693q2;
        if (num == null) {
            return org.telegram.messenger.g0.Q2(str, n6.f29710u6, this.J0, null, false);
        }
        return org.telegram.messenger.g0.O2(str, num.intValue(), null);
    }

    public void k1(boolean z10) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder2;
        k80[] k80VarArr = this.K2;
        if (k80VarArr != null && this.L2 != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f58702z2;
            TLRPC.User user = this.V1;
            if (tL_emojiStatusCollectible != null) {
                String str2 = tL_emojiStatusCollectible.title;
                int lastIndexOf = str2.lastIndexOf(32);
                if (lastIndexOf >= 0) {
                    str2 = str2.substring(0, lastIndexOf);
                }
                this.K2[0].setText(org.telegram.messenger.g0.T2(gd.a0(null, null, 2131743984, org.telegram.messenger.n5.u(user), str2), new d1(this, 0)));
                this.L2.setText(org.telegram.messenger.g0.W2(gd.M0(2131743982, null)));
            } else if (this.f58701y2 != null) {
                CharSequence j12 = j1(gd.a0(null, null, 2131743981, i5.m(0, user.first_name, user.last_name), "<STICKERSET>"));
                try {
                    j12 = j6.m(j12, this.K2[0].getPaint().getFontMetricsInt(), false, null, 0);
                } catch (Exception unused) {
                }
                if (j12 instanceof SpannableStringBuilder) {
                    spannableStringBuilder = (SpannableStringBuilder) j12;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(j12);
                }
                int indexOf = j12.toString().indexOf("<STICKERSET>");
                if (indexOf >= 0) {
                    TLRPC.TL_messages_stickerSet o02 = ri.d0(this.U1).o0(this.f58701y2, false);
                    if (o02 != null && !o02.documents.isEmpty()) {
                        document = o02.documents.get(0);
                        if (o02.set != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= o02.documents.size()) {
                                    break;
                                } else if (o02.documents.get(i7).f28409id == o02.set.thumb_document_id) {
                                    document = o02.documents.get(i7);
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
                        spannableStringBuilder2.setSpan(new x5(document, this.K2[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder2.length(), 33);
                        if (o02 != null && o02.set != null) {
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) o02.set.title);
                        }
                    } else {
                        spannableStringBuilder2 = new SpannableStringBuilder("xxxxxx");
                        spannableStringBuilder2.setSpan(new p80(org.telegram.messenger.g0.L(100.0f), this.K2[0]), 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder2);
                    spannableStringBuilder.setSpan(new ia(this, 11), indexOf, spannableStringBuilder2.length() + indexOf, 33);
                    this.K2[1].setOnLinkPressListener(new j80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            ArrayList arrayList = new ArrayList();
                            i1 i1Var = i1.this;
                            arrayList.add(i1Var.f58701y2);
                            y8 y8Var = new y8(i1Var, 12);
                            h2 h2Var = i1Var.f58692p2;
                            if (h2Var != null) {
                                y8Var.setParentFragment(h2Var);
                            }
                            new g1(i1Var, y8Var, i1Var.getContext(), i1Var.J0, arrayList).show();
                        }
                    });
                    if (document != null) {
                        k80[] k80VarArr2 = this.K2;
                        if (k80VarArr2 != null) {
                            k80VarArr2[1].setText(spannableStringBuilder);
                            if (this.K2[1].getVisibility() != 0) {
                                if (z10) {
                                    this.K2[1].setAlpha(0.0f);
                                    this.K2[1].setVisibility(0);
                                    ViewPropertyAnimator alpha = this.K2[1].animate().alpha(1.0f);
                                    lr lrVar = lr.f37208f;
                                    n10.o(alpha, lrVar, 200L);
                                    this.K2[0].animate().alpha(0.0f).setInterpolator(lrVar).setDuration(200L).withEndAction(new d1(this, 2)).start();
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new f1(this, 1));
                                    ofFloat.setInterpolator(lrVar);
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
                this.L2.setText(org.telegram.messenger.g0.W2(gd.M0(2131743982, null)));
            } else if (this.A2) {
                k80VarArr[0].setText(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743983, i5.m(0, user.first_name, user.last_name))));
                this.L2.setText(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743982, i5.m(0, user.first_name, user.last_name))));
            } else {
                j jVar = this.W1;
                if (jVar != null) {
                    if (this.Y1) {
                        k80 k80Var = k80VarArr[0];
                        String str3 = "";
                        if (user == null) {
                            str = "";
                        } else {
                            str = user.first_name;
                        }
                        k80Var.setText(j1(gd.a0(null, null, 2131743985, str, gd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        k80 k80Var2 = this.L2;
                        if (user != null) {
                            str3 = user.first_name;
                        }
                        k80Var2.setText(j1(gd.a0(null, null, 2131743986, str3)));
                    } else if (user != null && !TextUtils.isEmpty(user.first_name) && user.f28552id != 777000) {
                        this.K2[0].setText(j1(gd.a0(null, null, 2131743988, user.first_name, gd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.L2.setText(org.telegram.messenger.g0.W2(gd.M0(2131743989, null)));
                    } else {
                        this.K2[0].setText(j1(gd.a0(null, null, 2131743987, gd.G(jVar.d(), "GiftMonths", new Object[0]))));
                        this.L2.setText(org.telegram.messenger.g0.W2(gd.M0(2131743989, null)));
                    }
                } else {
                    TL_stars.StarGift starGift = this.X1;
                    if (starGift != null) {
                        k80VarArr[0].setText(gd.M0(2131750052, null));
                        this.K2[0].setTextSize(1, 20.0f);
                        if (starGift.limited_per_user) {
                            this.L2.setText(org.telegram.messenger.g0.W2(gd.H(',', "Gift2PremiumSubtitleMany", starGift.per_user_total)));
                        } else {
                            this.L2.setText(org.telegram.messenger.g0.W2(gd.M0(2131750056, null)));
                        }
                        this.L2.setTextSize(1, 14.0f);
                    } else if (user == null) {
                        k80VarArr[0].setText(gd.M0(2131743996, null));
                        this.L2.setText(org.telegram.messenger.g0.W2(gd.M0(2131743994, null)));
                    } else {
                        k80VarArr[0].setText(j1(gd.a0(null, null, 2131743990, i5.m(0, user.first_name, user.last_name))));
                        this.L2.setText(org.telegram.messenger.g0.W2(gd.M0(2131743991, null)));
                    }
                }
            }
            try {
                k80 k80Var3 = this.K2[0];
                k80Var3.setText(j6.m(k80Var3.getText(), this.K2[0].getPaint().getFontMetricsInt(), false, null, 0));
            } catch (Exception unused2) {
            }
        }
    }

    public void l1() {
        int i7 = this.f58679b2;
        int i10 = i7 + 1;
        this.f58679b2 = i10;
        this.f58680c2 = i7;
        this.f58682f2 = i10;
        int size = this.T1.size() + i10;
        this.f58683g2 = size;
        this.f58679b2 = size + 1;
        this.f58684h2 = size;
        if (!j10.i(this.U1).q() && this.W1 == null) {
            int i11 = this.f58679b2;
            this.f58679b2 = i11 + 1;
            this.f58685i2 = i11;
        }
    }

    @Override
    public final boolean m0() {
        Drawable drawable;
        if (this.f58699w2 == null) {
            return false;
        }
        this.E2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C2 = 0.0f;
        this.D2 = true;
        this.f58691o2.invalidate();
        View view = this.f58699w2;
        if (view instanceof n5) {
            drawable = ((n5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            m5 m5Var = r1Var.f31544qa;
            r1Var.q2();
            drawable = m5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.f58699w2;
        if (view2 instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) view2).q2();
        } else {
            view2.invalidate();
        }
        bc bcVar = this.f58690n2;
        if (bcVar != null) {
            bcVar.m(100L);
        }
        this.E2.addUpdateListener(new f1(this, 0));
        this.E2.addListener(new h60(22, this, drawable));
        this.E2.setDuration(600L);
        this.E2.setInterpolator(lr.h);
        this.E2.start();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(j10.f24770t0).c(this, ks.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(j10.f24770t0).n(this, ks.B0);
    }

    @Override
    public final void show() {
        super.show();
        ks.e().k(ks.f25135j1, 4);
        if (this.F2) {
            org.telegram.messenger.g0.h3(new d1(this, 1), 200L);
        }
    }

    @Override
    public final boolean t(Dialog dialog) {
        bc bcVar = this.f58690n2;
        if (bcVar != null) {
            bcVar.setDialogVisible(true);
        }
        this.f58689m2.setPaused(true);
        dialog.setOnDismissListener(new t9(this, 14));
        dialog.show();
        return true;
    }

    public i1(h2 h2Var, int i7, TLRPC.User user, j jVar, TL_stars.StarGift starGift, i6 i6Var) {
        super(h2Var, false, false, i6Var);
        ArrayList arrayList = new ArrayList();
        this.T1 = arrayList;
        this.B2 = new int[2];
        this.C2 = 0.0f;
        O();
        this.f58692p2 = h2Var;
        this.f39541v1 = 0.26f;
        this.V1 = user;
        this.U1 = i7;
        this.W1 = jVar;
        this.X1 = starGift;
        this.Z1 = new js0(getContext(), null);
        PremiumPreviewFragment.s0(i7, arrayList);
        if (jVar != null || j10.i(i7).q()) {
            this.H2.setVisibility(8);
        }
        b1 b1Var = new b1(n6.Ck, n6.Dk, n6.Ek, n6.Fk, null);
        this.f58688l2 = b1Var;
        b1Var.f58613m = true;
        b1Var.f58615o = 1.0f;
        b1Var.f58616p = 0.0f;
        b1Var.f58617q = 0.0f;
        b1Var.f58604b = 0.0f;
        b1Var.f58605c = 0.0f;
        l1();
        this.f39534o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        this.f39534o1.setOnItemClickListener(new ul0(this, i7, h2Var, 1));
        ri.d0(i7).r1();
        PremiumPreviewFragment.w0("profile");
        uz uzVar = new uz(getContext());
        this.f58687k2 = uzVar;
        this.f30193c.addView(uzVar, ma.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I2 = frameLayout;
        this.f30190b.addView(frameLayout, ma.e(-1, 140, 87));
    }

    public void h1(View view) {
    }

    public void e1(int i7, View view) {
    }
}
