package vh;

import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll;
public final class h9 implements Runnable {
    public final wp f51277a;
    public final TLRPC.User[] f51278b;
    public final double f51279c;
    public final double d;
    public final int[] e;
    public final ConnectionsManager f51280f;
    public final ll h;
    public final String f51281n;

    public h9(wp wpVar, TLRPC.User[] userArr, double d, double d10, int[] iArr, ConnectionsManager connectionsManager, ll llVar, String str) {
        this.f51277a = wpVar;
        this.f51278b = userArr;
        this.f51279c = d;
        this.d = d10;
        this.e = iArr;
        this.f51280f = connectionsManager;
        this.h = llVar;
        this.f51281n = str;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = this.f51277a.p1(this.f51278b[0]);
        tL_messages_getInlineBotResults.query = "";
        tL_messages_getInlineBotResults.offset = "";
        tL_messages_getInlineBotResults.flags |= 1;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
        final double d = this.f51279c;
        tL_inputGeoPoint.lat = d;
        final double d10 = this.d;
        tL_inputGeoPoint._long = d10;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        final int[] iArr = this.e;
        final ll llVar = this.h;
        final String str = this.f51281n;
        iArr[0] = this.f51280f.sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final int[] iArr2 = iArr;
                final ll llVar2 = llVar;
                final double d11 = d;
                final double d12 = d10;
                final String str2 = str;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        iArr2[0] = 0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.messages_BotResults;
                        ll llVar3 = llVar2;
                        if (z10) {
                            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                            if (!messages_botresults.results.isEmpty()) {
                                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(0);
                                String str3 = botInlineResult.title;
                                try {
                                    float parseFloat = Float.parseFloat(botInlineResult.description);
                                    ?? tLObject3 = new TLObject();
                                    tLObject3.f51453a = d11;
                                    tLObject3.f51454b = d12;
                                    tLObject3.f51455c = str3;
                                    tLObject3.d = parseFloat;
                                    l9.f51474a = str2;
                                    l9.f51475b = tLObject3;
                                    llVar3.a(tLObject3);
                                    return;
                                } catch (Exception unused) {
                                    llVar3.a(null);
                                    return;
                                }
                            }
                        }
                        llVar3.a(null);
                    }
                });
            }
        });
    }
}
