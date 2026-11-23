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
public final class vs extends org.telegram.ui.Components.ra {
    public final FrameLayout T1;
    public final hi.e U1;
    public final hi.e V1;
    public final ArrayList W1;
    public final HashSet X1;
    public boolean Y1;
    public org.telegram.ui.Components.b51 Z1;

    public vs(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new fi.b());
        ArrayList arrayList = new ArrayList();
        this.W1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.X1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        Q(org.telegram.ui.ActionBar.n6.f29524h5);
        this.f30258s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.T1 = frameLayout;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        frameLayout.addView(f10, c8.na.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131231272);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, c8.na.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        c8.sa.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final vs f52719b;

            {
                this.f52719b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52719b.dismiss();
                        return;
                    case 1:
                        this.f52719b.e1(false);
                        return;
                    default:
                        this.f52719b.e1(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, i6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131231093);
        frameLayout2.addView(imageView2, c8.na.e(56, 56, 17));
        f10.addView(frameLayout2, c8.na.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.Components.j80 a10 = c8.wa.a(activity, 20.0f, i10, true, this.J0);
        a10.setText(org.telegram.messenger.gd.N0(2131749290, null));
        a10.setGravity(17);
        f10.addView(a10, c8.na.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.j80 a11 = c8.wa.a(activity, 14.0f, i10, false, this.J0);
        a11.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131749291, null)));
        a11.setGravity(17);
        a11.setMaxWidth(hi.u3.a(a11.getText(), a11.getPaint()));
        f10.addView(a11, c8.na.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.b51 b51Var = this.Z1;
        if (b51Var != null) {
            b51Var.O(false);
        }
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.n(350L);
        this.f39246o1.setItemAnimator(lVar);
        this.f39246o1.setOnItemClickListener(new zr(this, 1));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f11 = org.telegram.messenger.f3.f(activity, 0);
        f11.setPadding(org.telegram.messenger.g0.L(14.0f) + this.f30261u0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + this.f30261u0, org.telegram.messenger.g0.L(14.0f));
        frameLayout3.addView(f11, c8.na.e(-1, -2, 87));
        hi.e eVar = new hi.e(activity, this.J0, true);
        this.U1 = eVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(2131232627, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131749288, null));
        eVar.i(spannableStringBuilder, false, true);
        f11.addView(eVar, c8.na.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        eVar.setOnClickListener(new View.OnClickListener(this) {
            public final vs f52719b;

            {
                this.f52719b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52719b.dismiss();
                        return;
                    case 1:
                        this.f52719b.e1(false);
                        return;
                    default:
                        this.f52719b.e1(true);
                        return;
                }
            }
        });
        hi.e eVar2 = new hi.e(activity, this.J0, true);
        this.V1 = eVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.kq(2131232629, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.N0(2131749289, null));
        eVar2.i(spannableStringBuilder2, false, true);
        f11.addView(eVar2, c8.na.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        eVar2.setOnClickListener(new View.OnClickListener(this) {
            public final vs f52719b;

            {
                this.f52719b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52719b.dismiss();
                        return;
                    case 1:
                        this.f52719b.e1(false);
                        return;
                    default:
                        this.f52719b.e1(true);
                        return;
                }
            }
        });
        this.f30226b.addView(frameLayout3, c8.na.e(-1, -2, 87));
        org.telegram.ui.Components.ek0 ek0Var = this.f39246o1;
        int i11 = this.f30261u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(76.0f));
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(ek0Var, getContext(), this.f30223a, 0, true, new a5(this, 10), this.J0);
        this.Z1 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131749290, null);
    }

    public final void e1(boolean z10) {
        hi.e eVar;
        if (this.Y1) {
            return;
        }
        this.Y1 = true;
        if (z10) {
            eVar = this.V1;
        } else {
            eVar = this.U1;
        }
        hi.e eVar2 = eVar;
        eVar2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.X1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.f22875b.nextInt();
        ConnectionsManager.getInstance(this.f30223a).sendRequest(createconferencecall, new di.j3(this, eVar2, z10, hashSet, 7));
    }
}
