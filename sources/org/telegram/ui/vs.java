package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
public final class vs extends org.telegram.ui.Components.ma {
    public final FrameLayout S1;
    public final fi.d T1;
    public final fi.d U1;
    public final ArrayList V1;
    public final HashSet W1;
    public boolean X1;
    public org.telegram.ui.Components.m41 Y1;

    public vs(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new di.b());
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.W1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        P(org.telegram.ui.ActionBar.m6.f27963h5);
        this.f28703s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.S1 = frameLayout;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        frameLayout.addView(e10, c8.ha.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131231269);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        c8.ka.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final vs f50559b;

            {
                this.f50559b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f50559b.dismiss();
                        return;
                    case 1:
                        this.f50559b.d1(false);
                        return;
                    default:
                        this.f50559b.d1(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i7, this.I0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, L2, M, null, h6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131231091);
        frameLayout2.addView(imageView2, c8.ha.e(56, 56, 17));
        e10.addView(frameLayout2, c8.ha.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.Components.w70 a10 = c8.qa.a(activity, 20.0f, i10, true, this.I0);
        a10.setText(org.telegram.messenger.id.M0(2131749483, null));
        a10.setGravity(17);
        e10.addView(a10, c8.ha.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.w70 a11 = c8.qa.a(activity, 14.0f, i10, false, this.I0);
        a11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749484, null)));
        a11.setGravity(17);
        a11.setMaxWidth(fi.m3.a(a11.getText(), a11.getPaint()));
        e10.addView(a11, c8.ha.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.m41 m41Var = this.Y1;
        if (m41Var != null) {
            m41Var.O(false);
        }
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        this.n1.setOnItemClickListener(new zr(this, 1));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout e11 = org.telegram.messenger.k5.e(activity, 0);
        e11.setPadding(org.telegram.messenger.g0.L(14.0f) + this.f28705t0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + this.f28705t0, org.telegram.messenger.g0.L(14.0f));
        frameLayout3.addView(e11, c8.ha.e(-1, -2, 87));
        fi.d dVar = new fi.d(activity, this.I0, true);
        this.T1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232622, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131749481, null));
        dVar.i(spannableStringBuilder, false, true);
        e11.addView(dVar, c8.ha.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final vs f50559b;

            {
                this.f50559b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f50559b.dismiss();
                        return;
                    case 1:
                        this.f50559b.d1(false);
                        return;
                    default:
                        this.f50559b.d1(true);
                        return;
                }
            }
        });
        fi.d dVar2 = new fi.d(activity, this.I0, true);
        this.U1 = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(2131232624, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131749482, null));
        dVar2.i(spannableStringBuilder2, false, true);
        e11.addView(dVar2, c8.ha.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final vs f50559b;

            {
                this.f50559b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f50559b.dismiss();
                        return;
                    case 1:
                        this.f50559b.d1(false);
                        return;
                    default:
                        this.f50559b.d1(true);
                        return;
                }
            }
        });
        this.f28672b.addView(frameLayout3, c8.ha.e(-1, -2, 87));
        org.telegram.ui.Components.pj0 pj0Var = this.n1;
        int i11 = this.f28705t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(76.0f));
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(pj0Var, getContext(), this.f28669a, 0, true, new a5(this, 10), this.I0);
        this.Y1 = m41Var;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131749483, null);
    }

    public final void d1(boolean z9) {
        fi.d dVar;
        if (this.X1) {
            return;
        }
        this.X1 = true;
        if (z9) {
            dVar = this.U1;
        } else {
            dVar = this.T1;
        }
        fi.d dVar2 = dVar;
        dVar2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.W1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.f21339b.nextInt();
        ConnectionsManager.getInstance(this.f28669a).sendRequest(createconferencecall, new bi.d4(this, dVar2, z9, hashSet, 7));
    }
}
