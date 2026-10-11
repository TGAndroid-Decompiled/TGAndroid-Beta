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
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.rm0;
import rg.x1;
public final class l0 extends rm0 {
    public final r0 f48417c;

    public l0(r0 r0Var) {
        this.f48417c = r0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f48417c.Y.size() + 3;
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
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
        r0 r0Var = this.f48417c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) r0Var.Y.get(i10 - 3);
            xg.l lVar = (xg.l) view;
            lVar.setBoost(tL_myBoost);
            lVar.c(r0Var.X.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            m4 m4Var = (m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            q0 q0Var = (q0) view;
            r0Var.f48472b0 = q0Var;
            TLRPC.Chat chat = r0Var.Z;
            fa0 fa0Var = q0Var.f48469e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), h6.gc, 2, new x1(r0Var, 12));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                fa0Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                fa0Var.post(new org.telegram.ui.Wallet.j(q0Var, indexOf, 8));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        d6 d6Var;
        Context context = viewGroup.getContext();
        r0 r0Var = this.f48417c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        d6Var = ((e3) r0Var).resourcesProvider;
                        view = new xg.l(context, true, false, d6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new m4(context, 22);
                }
            } else {
                view = new b7(context, h6.x0(null, h6.f20730a7, false), 0);
            }
        } else {
            q0 q0Var = new q0(context);
            q0Var.a(r0Var.X, r0Var.Z);
            view = q0Var;
        }
        return e2.k(view, view, -1, -2);
    }
}
