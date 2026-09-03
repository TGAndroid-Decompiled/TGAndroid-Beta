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
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.ai;
import org.telegram.ui.zn;
import ph.ga;
public final class y0 extends ql0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f44945c;
    public final zn f44946f;
    public int h;
    public int f44947n;
    public final f6 f44949s;
    public final int v;
    public final boolean f44950w;
    public String f44951x;
    public nh.f6 f44952y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int f44948r = UserConfig.selectedAccount;
    public final ga B = new ga(this, 16);

    public y0(Context context, zn znVar, f6 f6Var, int i10, boolean z4) {
        this.f44949s = f6Var;
        this.f44945c = context;
        this.f44946f = znVar;
        this.v = i10;
        this.f44950w = z4;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
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
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f44952y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.e.size() + this.f44947n;
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
        int i10 = this.f44948r;
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
        int i14 = this.f44947n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f44947n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f44947n = i12;
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
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i13 == 0) {
            q2 q2Var = (q2) view;
            q2Var.f21628p2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f44950w) {
                q2Var.f21621o0 = true;
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
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f44948r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                i11 = i14;
                z4 = true;
            }
            q2Var.W(dialogId, messageObject, i11, z4, false);
            q2Var.setDialogCellDelegate(new v0(this));
        } else if (i13 == 2) {
            ((x0) view).a(this.f44952y);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View q2Var;
        u00 u00Var;
        if (i10 != 0) {
            f6 f6Var = this.f44949s;
            Context context = this.f44945c;
            if (i10 != 1) {
                if (i10 != 2) {
                    q2Var = null;
                } else {
                    u00Var = new x0(context, f6Var);
                }
            } else {
                u00 u00Var2 = new u00(context, f6Var);
                u00Var2.setIsSingleCell(true);
                u00Var2.setViewType(7);
                u00Var = u00Var2;
            }
            q2Var = u00Var;
        } else {
            q2Var = new q2(null, this.f44945c, true, this.f44948r, this.f44949s);
        }
        return ai.n(q2Var, q2Var, -1, -2);
    }
}
