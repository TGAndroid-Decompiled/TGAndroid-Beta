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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.vl0;
import rg.q1;
public final class m0 extends vl0 {
    public final s0 f43421c;

    public m0(s0 s0Var) {
        this.f43421c = s0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42949f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f43421c.Y.size() + 3;
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
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        int i11 = c1Var.f42949f;
        View view = c1Var.f42946a;
        s0 s0Var = this.f43421c;
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
            s0Var.f43472b0 = r0Var;
            TLRPC.Chat chat = s0Var.Z;
            n90 n90Var = r0Var.e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), h6.gc, 2, new q1(s0Var, 9));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                n90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                n90Var.post(new qg.v(r0Var, indexOf, 2));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        d6 d6Var;
        Context context = viewGroup.getContext();
        s0 s0Var = this.f43421c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        d6Var = ((e3) s0Var).resourcesProvider;
                        view = new xg.l(context, true, false, d6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new m4(context, 22);
                }
            } else {
                view = new b7(context, h6.w0(null, h6.f18989a7, false), 0);
            }
        } else {
            r0 r0Var = new r0(context);
            r0Var.a(s0Var.X, s0Var.Z);
            view = r0Var;
        }
        return e2.k(view, view, -1, -2);
    }
}
