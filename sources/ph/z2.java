package ph;

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
import org.telegram.ui.ii1;
public abstract class z2 extends rl0 {
    public boolean d;
    public String f42647f;
    public String h;
    public TLRPC.User f42648n;
    public boolean f42649r;
    public final a3 f42651w;
    public final ArrayList f42646c = new ArrayList();
    public int e = -1;
    public final ColorDrawable f42650s = new ColorDrawable(285212671);
    public final org.telegram.ui.web.o0 v = new org.telegram.ui.web.o0(this, 19);

    public z2(a3 a3Var) {
        this.f42651w = a3Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f42651w.f41254a;
        if (!this.d) {
            this.d = true;
            F(true);
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str = messagesController.imageSearchBot;
            if (this.f42648n == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.f42648n = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f42648n;
            if (user == null && !this.f42649r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new ii1(2, this, messagesController));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.f42648n);
                String str2 = this.f42647f;
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
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new zd(13, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z4);

    @Override
    public final int h() {
        return this.f42646c.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) l1Var.f5785a;
        TLObject tLObject = (TLObject) this.f42646c.get(i10);
        boolean z4 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f42650s;
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
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new lh.z4(this.f42651w.getContext(), 1));
    }
}
