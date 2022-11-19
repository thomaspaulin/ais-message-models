/**
 * Ais-Stream WebsocketObjects
 * A sample API to illustrate OpenAPI concepts
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class DataLinkManagementMessageData0 {
    'valid': boolean;
    'offset': number;
    'integerOfSlots': number;
    'timeOut': number;
    'increment': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "valid",
            "baseName": "Valid",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "offset",
            "baseName": "Offset",
            "type": "number",
            "format": ""
        },
        {
            "name": "integerOfSlots",
            "baseName": "integerOfSlots",
            "type": "number",
            "format": ""
        },
        {
            "name": "timeOut",
            "baseName": "TimeOut",
            "type": "number",
            "format": ""
        },
        {
            "name": "increment",
            "baseName": "Increment",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DataLinkManagementMessageData0.attributeTypeMap;
    }

    public constructor() {
    }
}
