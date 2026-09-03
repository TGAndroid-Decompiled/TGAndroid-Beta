package uf;

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
import org.telegram.ui.ri1;
public abstract class c extends cg.c {
    public a B;
    public int C;
    public long E;
    public boolean F;
    public boolean G;
    public final boolean d;
    public final boolean f48544e;
    public boolean h;
    public boolean f48546n;
    public Location v;
    public String f48549w;
    public String f48550x;
    public b f48551y;
    public boolean f48545f = false;
    public final ArrayList f48547r = new ArrayList();
    public final ArrayList f48548s = new ArrayList();
    public final int D = UserConfig.selectedAccount;

    public c(boolean z4, boolean z10) {
        this.d = z4;
        this.f48544e = z10;
    }

    public final void F() {
        if (this.C != 0) {
            ConnectionsManager.getInstance(this.D).cancelRequest(this.C, true);
            this.C = 0;
        }
    }

    public final void G(String str, Location location) {
        if (str != null && str.length() != 0) {
            if (this.B != null) {
                Utilities.searchQueue.cancelRunnable(this.B);
                this.B = null;
            }
            this.G = true;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            a aVar = new a((i0) this, str, location, 0);
            this.B = aVar;
            dispatchQueue.postRunnable(aVar, 400L);
            return;
        }
        this.f48548s.clear();
        this.f48547r.clear();
        this.G = false;
        l();
    }

    public final void H(String str, Location location, boolean z4) {
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
            this.f48549w = str;
            if (this.h) {
                this.h = false;
                if (this.C != 0) {
                    ConnectionsManager.getInstance(this.D).cancelRequest(this.C, true);
                    this.C = 0;
                }
            }
            h();
            this.h = true;
            this.f48545f = true;
            MessagesController messagesController = MessagesController.getInstance(this.D);
            if (this.d) {
                str2 = MessagesController.getInstance(this.D).storyVenueSearchBot;
            } else {
                str2 = MessagesController.getInstance(this.D).venueSearchBot;
            }
            TLObject userOrChat = messagesController.getUserOrChat(str2);
            if (!(userOrChat instanceof TLRPC.User)) {
                if (z4) {
                    int i10 = this.D;
                    if (!this.F) {
                        this.F = true;
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        if (this.d) {
                            str5 = MessagesController.getInstance(i10).storyVenueSearchBot;
                        } else {
                            str5 = MessagesController.getInstance(i10).venueSearchBot;
                        }
                        tL_contacts_resolveUsername.username = str5;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new gf.a(this, 20));
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
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.D).getInputUser(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (DialogObject.isEncryptedDialog(this.E)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.D).getInputPeer(this.E);
                }
                if (TextUtils.isEmpty(str) || (!this.d && !this.f48544e)) {
                    cVar = this;
                    str4 = str;
                    location4 = location;
                    cVar.f48546n = false;
                } else {
                    this.f48546n = true;
                    Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
                    if (this.d) {
                        if (currentLocale.getLanguage().contains("en")) {
                            locale = currentLocale;
                            cVar = this;
                            str4 = str;
                            location4 = location;
                            Utilities.globalQueue.postRunnable(new lh.e1(cVar, currentLocale, str4, locale, location4, str, 21));
                        } else {
                            locale2 = Locale.US;
                        }
                    }
                    locale = locale2;
                    cVar = this;
                    str4 = str;
                    location4 = location;
                    Utilities.globalQueue.postRunnable(new lh.e1(cVar, currentLocale, str4, locale, location4, str, 21));
                }
                if (location4 == null) {
                    return;
                }
                cVar.C = ConnectionsManager.getInstance(cVar.D).sendRequest(tL_messages_getInlineBotResults, new ri1(6, this, str4));
                l();
            }
        }
    }
}
