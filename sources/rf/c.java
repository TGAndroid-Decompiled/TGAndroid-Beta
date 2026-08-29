package rf;

import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qe1;
public abstract class c extends zf.b {
    public a A;
    public int B;
    public long D;
    public boolean E;
    public boolean F;
    public final boolean d;
    public final boolean f47176e;
    public boolean h;
    public boolean f47178n;
    public Location v;
    public String f47181w;
    public String f47182x;
    public b f47183y;
    public boolean f47177f = false;
    public final ArrayList f47179r = new ArrayList();
    public final ArrayList f47180s = new ArrayList();
    public final int C = UserConfig.selectedAccount;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.f47176e = z11;
    }

    public final void F() {
        if (this.B != 0) {
            ConnectionsManager.getInstance(this.C).cancelRequest(this.B, true);
            this.B = 0;
        }
    }

    public final void G(String str, Location location) {
        if (str != null && str.length() != 0) {
            if (this.A != null) {
                Utilities.searchQueue.cancelRunnable(this.A);
                this.A = null;
            }
            this.F = true;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            a aVar = new a((j0) this, str, location, 0);
            this.A = aVar;
            dispatchQueue.postRunnable(aVar, 400L);
            return;
        }
        this.f47180s.clear();
        this.f47179r.clear();
        this.F = false;
        l();
    }

    public final void H(String str, Location location, boolean z10) {
        Location location2;
        Location location3;
        String str2;
        String str3;
        c cVar;
        String str4;
        Location location4;
        Locale locale;
        String str5;
        if ((location != null || this.d) && ((location2 = this.v) == null || location == null || location.distanceTo(location2) >= 200.0f)) {
            Locale locale2 = null;
            if (location == null) {
                location3 = null;
            } else {
                location3 = new Location(location);
            }
            this.v = location3;
            this.f47181w = str;
            if (this.h) {
                this.h = false;
                if (this.B != 0) {
                    ConnectionsManager.getInstance(this.C).cancelRequest(this.B, true);
                    this.B = 0;
                }
            }
            h();
            this.h = true;
            this.f47177f = true;
            MessagesController messagesController = MessagesController.getInstance(this.C);
            if (this.d) {
                str2 = MessagesController.getInstance(this.C).storyVenueSearchBot;
            } else {
                str2 = MessagesController.getInstance(this.C).venueSearchBot;
            }
            TLObject userOrChat = messagesController.getUserOrChat(str2);
            if (!(userOrChat instanceof TLRPC.User)) {
                if (z10) {
                    int i10 = this.C;
                    if (!this.E) {
                        this.E = true;
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        if (this.d) {
                            str5 = MessagesController.getInstance(i10).storyVenueSearchBot;
                        } else {
                            str5 = MessagesController.getInstance(i10).venueSearchBot;
                        }
                        tL_contacts_resolveUsername.username = str5;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new ef.a(this, 20));
                    }
                }
            } else {
                TLRPC.User user = (TLRPC.User) userOrChat;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                tL_messages_getInlineBotResults.query = str3;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.C).getInputUser(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (DialogObject.isEncryptedDialog(this.D)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.C).getInputPeer(this.D);
                }
                if (TextUtils.isEmpty(str) || (!this.d && !this.f47176e)) {
                    cVar = this;
                    str4 = str;
                    location4 = location;
                    cVar.f47178n = false;
                } else {
                    this.f47178n = true;
                    Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
                    if (this.d) {
                        if (currentLocale.getLanguage().contains("en")) {
                            locale = currentLocale;
                            cVar = this;
                            str4 = str;
                            location4 = location;
                            Utilities.globalQueue.postRunnable(new ih.f1(cVar, currentLocale, str4, locale, location4, str, 21));
                        } else {
                            locale2 = Locale.US;
                        }
                    }
                    locale = locale2;
                    cVar = this;
                    str4 = str;
                    location4 = location;
                    Utilities.globalQueue.postRunnable(new ih.f1(cVar, currentLocale, str4, locale, location4, str, 21));
                }
                if (location4 == null) {
                    return;
                }
                cVar.B = ConnectionsManager.getInstance(cVar.C).sendRequest(tL_messages_getInlineBotResults, new qe1(6, this, str4));
                l();
            }
        }
    }
}
