package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.x90;
public final class l0 extends im0 {
    public final r0 f47704c;

    public l0(r0 r0Var) {
        this.f47704c = r0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45920f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f47704c.Y.size() + 3;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    return 3;
                }
            }
            return i11;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11 = b1Var.f45920f;
        View view = b1Var.f45917a;
        r0 r0Var = this.f47704c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) r0Var.Y.get(i10 - 3);
            yg.k kVar = (yg.k) view;
            kVar.setBoost(tL_myBoost);
            kVar.c(r0Var.X.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            l4 l4Var = (l4) view;
            l4Var.setTextSize(15.0f);
            l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            l4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            q0 q0Var = (q0) view;
            r0Var.f47757b0 = q0Var;
            TLRPC.Chat chat = r0Var.Z;
            x90 x90Var = q0Var.e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), h6.f21049gc, 2, new tg.p(r0Var, 8));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                x90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                x90Var.post(new org.telegram.ui.Wallet.j(q0Var, indexOf, 10));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        d6 d6Var;
        Context context = viewGroup.getContext();
        r0 r0Var = this.f47704c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        d6Var = ((f3) r0Var).resourcesProvider;
                        view = new yg.k(context, true, false, d6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new l4(context, 22);
                }
            } else {
                view = new z6(context, h6.x0(null, h6.f20932a7, false), 0);
            }
        } else {
            q0 q0Var = new q0(context);
            q0Var.a(r0Var.X, r0Var.Z);
            view = q0Var;
        }
        return k3.l(view, view, -1, -2);
    }
}
