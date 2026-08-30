package tf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import ph.ga;
public final class y0 extends rl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f44883c;
    public final xn f44884f;
    public int h;
    public int f44885n;
    public final f6 f44887s;
    public final int v;
    public final boolean f44888w;
    public String f44889x;
    public nh.f6 f44890y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int f44886r = UserConfig.selectedAccount;
    public final ga B = new ga(this, 15);

    public y0(Context context, xn xnVar, f6 f6Var, int i10, boolean z4) {
        this.f44887s = f6Var;
        this.f44883c = context;
        this.f44884f = xnVar;
        this.v = i10;
        this.f44888w = z4;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f44890y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.e.size() + this.f44885n;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ArrayList<MessageObject> messages;
        int h = h();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f44886r;
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
        int i14 = this.f44885n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f44885n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f44885n = i12;
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
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        int i12;
        int i13 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i13 == 0) {
            r2 r2Var = (r2) view;
            r2Var.f21695p2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f44888w) {
                r2Var.f21688o0 = true;
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
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f44886r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                i11 = i14;
                z4 = true;
            }
            r2Var.W(dialogId, messageObject, i11, z4, false);
            r2Var.setDialogCellDelegate(new v0(this));
        } else if (i13 == 2) {
            ((x0) view).a(this.f44890y);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View r2Var;
        t00 t00Var;
        if (i10 != 0) {
            f6 f6Var = this.f44887s;
            Context context = this.f44883c;
            if (i10 != 1) {
                if (i10 != 2) {
                    r2Var = null;
                } else {
                    t00Var = new x0(context, f6Var);
                }
            } else {
                t00 t00Var2 = new t00(context, f6Var);
                t00Var2.setIsSingleCell(true);
                t00Var2.setViewType(7);
                t00Var = t00Var2;
            }
            r2Var = t00Var;
        } else {
            r2Var = new r2(null, this.f44883c, true, this.f44886r, this.f44887s);
        }
        return yh.o(r2Var, r2Var, -1, -2);
    }
}
