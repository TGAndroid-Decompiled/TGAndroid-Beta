package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ml;
public final class ua implements Runnable {
    public final MessagesController f46181a;
    public final TLRPC.User[] f46182b;
    public final double f46183c;
    public final double d;
    public final int[] f46184e;
    public final ConnectionsManager f46185f;
    public final ml h;
    public final String f46186n;

    public ua(MessagesController messagesController, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, ml mlVar, String str) {
        this.f46181a = messagesController;
        this.f46182b = userArr;
        this.f46183c = d;
        this.d = d10;
        this.f46184e = iArr;
        this.f46185f = connectionsManager;
        this.h = mlVar;
        this.f46186n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f46181a.getInputUser(this.f46182b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f46183c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.f46184e;
        final ml mlVar = this.h;
        final String str = this.f46186n;
        iArr[0] = this.f46185f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final ml mlVar2 = mlVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z4 = tLObject2 instanceof TLRPC.messages_BotResults;
                        ml mlVar3 = mlVar2;
                        if (z4) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f46281a = d11;
                                    tLObject3.f46282b = d12;
                                    tLObject3.f46283c = str3;
                                    tLObject3.d = parseFloat;
                                    xa.f46319a = str2;
                                    xa.f46320b = tLObject3;
                                    mlVar3.run(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    mlVar3.run(null);
                                    return;
                                }
                            }
                        }
                        mlVar3.run(null);
                    }
                });
            }
        });
    }
}
