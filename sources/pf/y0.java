package pf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import f2.o1;
import java.util.ArrayList;
import java.util.HashSet;
import jh.d6;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.rn;

public final class y0 extends yk0 implements NotificationCenter.NotificationCenterDelegate {

    public final Context f45970c;

    public final rn f45972f;
    public int h;

    public int f45973n;

    public final c6 f45975s;
    public final int v;

    public final boolean f45976w;

    public String f45977x;

    public d6 f45978y;
    public final HashSet d = new HashSet();

    public final ArrayList f45971e = new ArrayList();

    public final int f45974r = UserConfig.selectedAccount;
    public final nh.f0 A = new nh.f0(this, 29);

    public y0(Context context, rn rnVar, c6 c6Var, int i10, boolean z10) {
        this.f45975s = c6Var;
        this.f45970c = context;
        this.f45972f = rnVar;
        this.v = i10;
        this.f45976w = z10;
    }

    @Override
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 0 || i10 == 2;
    }

    public final Object E(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f45971e;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f45978y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f45971e.size() + this.f45973n;
    }

    @Override
    public final int j(int i10) {
        return i10 < this.f45971e.size() ? 0 : 1;
    }

    @Override
    public final void l() {
        int iH = h();
        ArrayList arrayList = this.f45971e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f45974r;
        int i11 = this.v;
        ArrayList<MessageObject> foundMessageObjects = i11 == 0 ? MediaDataController.getInstance(i10).getFoundMessageObjects() : HashtagSearchController.getInstance(i10).getMessages(i11);
        int iClamp = 0;
        for (int i12 = 0; i12 < foundMessageObjects.size(); i12++) {
            MessageObject messageObject = foundMessageObjects.get(i12);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                arrayList.add(messageObject);
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i13 = this.f45973n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                iClamp = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f45973n = iClamp;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                iClamp = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f45973n = iClamp;
        }
        int iH2 = h();
        if (iH >= iH2) {
            super.l();
            return;
        }
        if (i13 > 0) {
            q(iH - i13, i13);
        }
        s(iH, iH2 - iH);
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i13 != 0) {
            if (i13 == 2) {
                ((x0) view).a(this.f45978y);
                return;
            }
            return;
        }
        p2 p2Var = (p2) view;
        p2Var.f24907o2 = true;
        MessageObject messageObject = (MessageObject) E(i10);
        long dialogId = messageObject.getDialogId();
        int i14 = messageObject.messageOwner.date;
        if (this.f45976w) {
            p2Var.f24900n0 = true;
            dialogId = messageObject.getSavedDialogId();
            TLRPC.Message message = messageObject.messageOwner;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i11 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i12 = message.date;
            } else {
                if (i11 == 0) {
                    i12 = messageFwdHeader.saved_date;
                }
                z10 = false;
            }
            i11 = i12;
            z10 = false;
        } else {
            if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f45974r, dialogId)) {
                dialogId = messageObject.getFromChatId();
            }
            i11 = i14;
            z10 = true;
        }
        p2Var.W(dialogId, messageObject, i11, z10, false);
        p2Var.setDialogCellDelegate(new v0(this));
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View p2Var;
        View x0Var;
        if (i10 != 0) {
            c6 c6Var = this.f45975s;
            Context context = this.f45970c;
            if (i10 == 1) {
                h00 h00Var = new h00(context, c6Var);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(7);
                x0Var = h00Var;
            } else if (i10 != 2) {
                p2Var = null;
            } else {
                x0Var = new x0(context, c6Var);
            }
            p2Var = x0Var;
        } else {
            p2Var = new p2(null, this.f45970c, true, this.f45974r, this.f45975s);
        }
        return pa.l(p2Var, p2Var, -1, -2);
    }
}
