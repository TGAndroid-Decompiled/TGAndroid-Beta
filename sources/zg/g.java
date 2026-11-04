package zg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import b8.mf;
import ei.e4;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
public final class g extends c implements z5 {
    public int E;
    public final ImageView f60494s;
    public f f60495w;
    public TLRPC.Chat f60496x;
    public boolean f60497y;

    public g(Context context, e6 e6Var) {
        super(context, e6Var);
        int i3;
        float f10;
        float f11;
        float f12;
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f60494s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = k6.x0(null, k6.Ji, false);
        this.E = x02;
        imageView.setBackground(k6.h0(x02, 1, -1));
        imageView.setImageResource(2131232559);
        r6.t(imageView, k6.f28043m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(bd.M0(2131751599, null));
        boolean z10 = bd.f21784a0;
        if (z10) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        int i10 = i3 | 17;
        if (z10) {
            f10 = 3.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 3.0f;
        }
        addView(imageView, mf.d(48, 50.0f, i10, f10, 0.0f, f11, 0.0f));
        e4 e4Var = this.d;
        if (bd.f21784a0) {
            f12 = 24.0f;
        } else {
            f12 = 0.0f;
        }
        e4Var.setPadding(g0.L(f12), 0, g0.L(bd.f21784a0 ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i3, boolean z10, int i10) {
        String str;
        int i11;
        String M0;
        String str2;
        this.f60497y = z10;
        this.f60496x = chat;
        u8 u8Var = this.f60473b;
        u8Var.q(chat);
        int L = g0.L(20.0f);
        k9 k9Var = this.f60474c;
        k9Var.setRoundRadius(L);
        k9Var.e(chat, u8Var);
        String str3 = chat.title;
        e4 e4Var = this.d;
        e4Var.k(i6.m(str3, e4Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = t3.V(chat);
        if (z10) {
            if (i10 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                M0 = bd.G(i10, str2, new Object[0]);
            } else {
                if (V) {
                    i11 = 2131751391;
                } else {
                    i11 = 2131754876;
                }
                M0 = bd.M0(i11, null);
            }
            setSubtitle(M0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(bd.G(i3, str, new Object[0]));
        }
        r6.Y(this.f60475e, k6.r5, this.f60472a);
        setDivider(true);
        ImageView imageView = this.f60494s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new org.telegram.ui.web.d(9, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f60496x;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f60494s.measure(View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.f60495w = fVar;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = k6.x0(null, k6.Ji, false);
            ImageView imageView = this.f60494s;
            if (imageView != null && x02 != this.E) {
                this.E = x02;
                k6.H1(imageView.getBackground(), x02, true);
                imageView.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
