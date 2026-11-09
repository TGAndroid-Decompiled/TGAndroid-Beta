package v3;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f57000a;
    public final long f57001b;
    public final List f57002c;

    public d(long j3, long j10, List list) {
        this.f57000a = j3;
        this.f57001b = j10;
        this.f57002c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f57000a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return p0.r(sb2, this.f57001b, " }");
    }
}
