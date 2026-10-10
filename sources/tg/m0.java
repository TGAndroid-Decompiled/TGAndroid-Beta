package tg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.qm0;
import rg.x1;
public final class m0 extends qm0 {
    public final s0 f48398c;

    public m0(s0 s0Var) {
        this.f48398c = s0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47706f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f48398c.Y.size() + 3;
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
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        int i11 = d1Var.f47706f;
        View view = d1Var.f47702a;
        s0 s0Var = this.f48398c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) s0Var.Y.get(i10 - 3);
            xg.l lVar = (xg.l) view;
            lVar.setBoost(tL_myBoost);
            lVar.c(s0Var.X.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            m4 m4Var = (m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            r0 r0Var = (r0) view;
            s0Var.f48452b0 = r0Var;
            TLRPC.Chat chat = s0Var.Z;
            fa0 fa0Var = r0Var.f48449e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), i6.gc, 2, new x1(s0Var, 12));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                fa0Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                fa0Var.post(new org.telegram.ui.Wallet.i(r0Var, indexOf, 8));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        e6 e6Var;
        Context context = viewGroup.getContext();
        s0 s0Var = this.f48398c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        e6Var = ((f3) s0Var).resourcesProvider;
                        view = new xg.l(context, true, false, e6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new m4(context, 22);
                }
            } else {
                view = new b7(context, i6.x0(null, i6.f20745a7, false), 0);
            }
        } else {
            r0 r0Var = new r0(context);
            r0Var.a(s0Var.X, s0Var.Z);
            view = r0Var;
        }
        return e2.k(view, view, -1, -2);
    }
}
