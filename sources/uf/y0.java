package uf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import oh.f6;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.v9;
public final class y0 extends sl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f48742c;
    public final xn f48744f;
    public int h;
    public int f48745n;
    public final g6 f48747s;
    public final int v;
    public final boolean f48748w;
    public String f48749x;
    public f6 f48750y;
    public final HashSet d = new HashSet();
    public final ArrayList f48743e = new ArrayList();
    public final int f48746r = UserConfig.selectedAccount;
    public final v9 B = new v9(this, 17);

    public y0(Context context, xn xnVar, g6 g6Var, int i10, boolean z4) {
        this.f48747s = g6Var;
        this.f48742c = context;
        this.f48744f = xnVar;
        this.v = i10;
        this.f48748w = z4;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f48743e;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f48750y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f48743e.size() + this.f48745n;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.f48743e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ArrayList<MessageObject> messages;
        int h = h();
        ArrayList arrayList = this.f48743e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f48746r;
        int i11 = this.v;
        if (i11 == 0) {
            messages = MediaDataController.getInstance(i10).getFoundMessageObjects();
        } else {
            messages = HashtagSearchController.getInstance(i10).getMessages(i11);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < messages.size(); i13++) {
            MessageObject messageObject = messages.get(i13);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                arrayList.add(messageObject);
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i14 = this.f48745n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f48745n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f48745n = i12;
        }
        int h9 = h();
        if (h < h9) {
            if (i14 > 0) {
                q(h - i14, i14);
            }
            s(h, h9 - h);
            return;
        }
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i13 == 0) {
            r2 r2Var = (r2) view;
            r2Var.f23486p2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f48748w) {
                r2Var.f23479o0 = true;
                long savedDialogId = messageObject.getSavedDialogId();
                TLRPC.Message message = messageObject.messageOwner;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i11 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i11 == 0) {
                        i12 = messageFwdHeader.saved_date;
                    } else {
                        dialogId = savedDialogId;
                        z4 = false;
                    }
                } else {
                    i12 = message.date;
                }
                dialogId = savedDialogId;
                i11 = i12;
                z4 = false;
            } else {
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f48746r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                i11 = i14;
                z4 = true;
            }
            r2Var.W(dialogId, messageObject, i11, z4, false);
            r2Var.setDialogCellDelegate(new v0(this));
        } else if (i13 == 2) {
            ((x0) view).a(this.f48750y);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View r2Var;
        u00 u00Var;
        if (i10 != 0) {
            g6 g6Var = this.f48747s;
            Context context = this.f48742c;
            if (i10 != 1) {
                if (i10 != 2) {
                    r2Var = null;
                } else {
                    u00Var = new x0(context, g6Var);
                }
            } else {
                u00 u00Var2 = new u00(context, g6Var);
                u00Var2.setIsSingleCell(true);
                u00Var2.setViewType(7);
                u00Var = u00Var2;
            }
            r2Var = u00Var;
        } else {
            r2Var = new r2(null, this.f48742c, true, this.f48746r, this.f48747s);
        }
        return yh.o(r2Var, r2Var, -1, -2);
    }
}
