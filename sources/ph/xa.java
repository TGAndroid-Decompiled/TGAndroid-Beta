package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll;
public final class xa implements Runnable {
    public final MessagesController f42568a;
    public final TLRPC.User[] f42569b;
    public final double f42570c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f42571f;
    public final ll h;
    public final String f42572n;

    public xa(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, ll llVar, String str) {
        this.f42568a = messagesController;
        this.f42569b = userArr;
        this.f42570c = d;
        this.d = d10;
        this.e = iArr;
        this.f42571f = connectionsManager;
        this.h = llVar;
        this.f42572n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f42568a.getInputUser(this.f42569b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f42570c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final ll llVar = this.h;
        final String str = this.f42572n;
        iArr[0] = this.f42571f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final ll llVar2 = llVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z4 = tLObject2 instanceof TLRPC.messages_BotResults;
                        ll llVar3 = llVar2;
                        if (z4) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f42673a = d11;
                                    tLObject3.f42674b = d12;
                                    tLObject3.f42675c = str3;
                                    tLObject3.d = parseFloat;
                                    ab.f41283a = str2;
                                    ab.f41284b = tLObject3;
                                    llVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    llVar3.run(null);
                                    return;
                                }
                            }
                        }
                        llVar3.run(null);
                    }
                });
            }
        });
    }
}
