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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.wg1;
public final class k0 extends lm0 {
    public final q0 f48141c;

    public k0(q0 q0Var) {
        this.f48141c = q0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f48141c.Y.size() + 3;
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
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        q0 q0Var = this.f48141c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) q0Var.Y.get(i10 - 3);
            yg.k kVar = (yg.k) view;
            kVar.setBoost(tL_myBoost);
            kVar.c(q0Var.X.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            l4 l4Var = (l4) view;
            l4Var.setTextSize(15.0f);
            l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            l4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            p0 p0Var = (p0) view;
            q0Var.f48194b0 = p0Var;
            TLRPC.Chat chat = q0Var.Z;
            y90 y90Var = p0Var.e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), k6.f21242gc, 2, new tg.p(q0Var, 8));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                y90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                y90Var.post(new wg1(p0Var, indexOf, 11));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        g6 g6Var;
        Context context = viewGroup.getContext();
        q0 q0Var = this.f48141c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        g6Var = ((h3) q0Var).resourcesProvider;
                        view = new yg.k(context, true, false, g6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new l4(context, 22);
                }
            } else {
                int i11 = k6.f21125a7;
                view = new b7(context, k6.x0(null, i11, false), 0);
                r6.i(i11, view, null);
            }
        } else {
            p0 p0Var = new p0(context);
            p0Var.a(q0Var.X, q0Var.Z);
            view = p0Var;
        }
        return k3.l(view, view, -1, -2);
    }
}
