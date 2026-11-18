package v3;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f59037a;
    public final long f59038b;
    public final List f59039c;

    public d(long j3, long j10, List list) {
        this.f59037a = j3;
        this.f59038b = j10;
        this.f59039c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f59037a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return p0.r(sb2, this.f59038b, " }");
    }
}
