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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.li1;
public final class m0 extends lm0 {
    public final s0 f46339c;

    public m0(s0 s0Var) {
        this.f46339c = s0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f46339c.Y.size() + 3;
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
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        s0 s0Var = this.f46339c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) s0Var.Y.get(i10 - 3);
            yg.l lVar = (yg.l) view;
            lVar.setBoost(tL_myBoost);
            lVar.c(s0Var.X.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            m4 m4Var = (m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            r0 r0Var = (r0) view;
            s0Var.f46389b0 = r0Var;
            TLRPC.Chat chat = s0Var.Z;
            da0 da0Var = r0Var.e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), g6.f19960gc, 2, new rh.j(s0Var, 18));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                da0Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                da0Var.post(new li1(r0Var, indexOf, 10));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        c6 c6Var;
        Context context = viewGroup.getContext();
        s0 s0Var = this.f46339c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        c6Var = ((e3) s0Var).resourcesProvider;
                        view = new yg.l(context, true, false, c6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new m4(context, 22);
                }
            } else {
                view = new b7(context, g6.x0(null, g6.f19843a7, false), 0);
            }
        } else {
            r0 r0Var = new r0(context);
            r0Var.a(s0Var.X, s0Var.Z);
            view = r0Var;
        }
        return k3.l(view, view, -1, -2);
    }
}
