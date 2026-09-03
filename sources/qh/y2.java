package qh;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.zd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.ri1;
public abstract class y2 extends rl0 {
    public boolean d;
    public String f46357f;
    public String h;
    public TLRPC.User f46358n;
    public boolean f46359r;
    public final z2 f46361w;
    public final ArrayList f46355c = new ArrayList();
    public int f46356e = -1;
    public final ColorDrawable f46360s = new ColorDrawable(285212671);
    public final org.telegram.ui.web.s0 v = new org.telegram.ui.web.s0(this, 20);

    public y2(z2 z2Var) {
        this.f46361w = z2Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f46361w.f46386a;
        if (!this.d) {
            this.d = true;
            F(true);
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str = messagesController.imageSearchBot;
            if (this.f46358n == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.f46358n = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f46358n;
            if (user == null && !this.f46359r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.f46356e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new ri1(2, this, messagesController));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f46358n);
                String str2 = this.f46357f;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                tL_messages_getInlineBotResults.query = str2;
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                String str4 = this.h;
                if (str4 != null) {
                    str3 = str4;
                }
                tL_messages_getInlineBotResults.offset = str3;
                this.f46356e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new zd(13, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z4);

    @Override
    public final int h() {
        return this.f46355c.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) m1Var.f5875a;
        TLObject tLObject = (TLObject) this.f46355c.get(i10);
        boolean z4 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f46360s;
        if (z4) {
            p9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            p9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                p9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                p9Var.b();
            }
        } else {
            p9Var.b();
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new mh.z4(this.f46361w.getContext(), 1));
    }
}
