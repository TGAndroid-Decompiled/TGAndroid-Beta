package rf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import java.util.HashSet;
import lh.e6;
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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.web.t1;
public final class z0 extends il0 implements NotificationCenter.NotificationCenterDelegate {
    public final Context f47411c;
    public final tn f47413f;
    public int h;
    public int f47414n;
    public final c6 f47416s;
    public final int v;
    public final boolean f47417w;
    public String f47418x;
    public e6 f47419y;
    public final HashSet d = new HashSet();
    public final ArrayList f47412e = new ArrayList();
    public final int f47415r = UserConfig.selectedAccount;
    public final t1 A = new t1(this, 13);

    public z0(Context context, tn tnVar, c6 c6Var, int i10, boolean z10) {
        this.f47416s = c6Var;
        this.f47411c = context;
        this.f47413f = tnVar;
        this.v = i10;
        this.f47417w = z10;
    }

    @Override
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f47412e;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesListUpdated && objArr[0] == this.f47419y) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f47412e.size() + this.f47414n;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.f47412e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ArrayList<MessageObject> messages;
        int h = h();
        ArrayList arrayList = this.f47412e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f47415r;
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
        int i14 = this.f47414n;
        this.h = arrayList.size();
        if (i11 != 0) {
            if (!HashtagSearchController.getInstance(i10).isEndReached(i11) && this.h != 0) {
                i12 = Utilities.clamp(HashtagSearchController.getInstance(i10).getCount(i11) - this.h, 3, 0);
            }
            this.f47414n = i12;
        } else {
            if (!MediaDataController.getInstance(i10).searchEndReached() && this.h != 0) {
                i12 = Utilities.clamp(MediaDataController.getInstance(i10).getSearchCount() - this.h, 3, 0);
            }
            this.f47414n = i12;
        }
        int h10 = h();
        if (h < h10) {
            if (i14 > 0) {
                q(h - i14, i14);
            }
            s(h, h10 - h);
            return;
        }
        super.l();
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i13 == 0) {
            p2 p2Var = (p2) view;
            p2Var.f24898o2 = true;
            MessageObject messageObject = (MessageObject) E(i10);
            long dialogId = messageObject.getDialogId();
            int i14 = messageObject.messageOwner.date;
            if (this.f47417w) {
                p2Var.f24891n0 = true;
                long savedDialogId = messageObject.getSavedDialogId();
                TLRPC.Message message = messageObject.messageOwner;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i11 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i11 == 0) {
                        i12 = messageFwdHeader.saved_date;
                    } else {
                        dialogId = savedDialogId;
                        z10 = false;
                    }
                } else {
                    i12 = message.date;
                }
                dialogId = savedDialogId;
                i11 = i12;
                z10 = false;
            } else {
                if (messageObject.isOutOwner() || ChatObject.isMonoForum(this.f47415r, dialogId)) {
                    dialogId = messageObject.getFromChatId();
                }
                i11 = i14;
                z10 = true;
            }
            p2Var.W(dialogId, messageObject, i11, z10, false);
            p2Var.setDialogCellDelegate(new w0(this));
        } else if (i13 == 2) {
            ((y0) view).a(this.f47419y);
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        View p2Var;
        p00 p00Var;
        if (i10 != 0) {
            c6 c6Var = this.f47416s;
            Context context = this.f47411c;
            if (i10 != 1) {
                if (i10 != 2) {
                    p2Var = null;
                } else {
                    p00Var = new y0(context, c6Var);
                }
            } else {
                p00 p00Var2 = new p00(context, c6Var);
                p00Var2.setIsSingleCell(true);
                p00Var2.setViewType(7);
                p00Var = p00Var2;
            }
            p2Var = p00Var;
        } else {
            p2Var = new p2(null, this.f47411c, true, this.f47415r, this.f47416s);
        }
        return th.m(p2Var, p2Var, -1, -2);
    }
}
