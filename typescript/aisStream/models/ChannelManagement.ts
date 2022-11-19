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

import { ChannelManagementArea } from './ChannelManagementArea';
import { ChannelManagementUnicast } from './ChannelManagementUnicast';
import { HttpFile } from '../http/http';

export class ChannelManagement {
    'messageID': number;
    'repeatIndicator': number;
    'userID': number;
    'valid': boolean;
    'spare1': number;
    'channelA': number;
    'channelB': number;
    'txRxMode': number;
    'lowPower': boolean;
    'area': ChannelManagementArea;
    'unicast': ChannelManagementUnicast;
    'isAddressed': boolean;
    'bwA': boolean;
    'bwB': boolean;
    'transitionalZoneSize': number;
    'spare4': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "messageID",
            "baseName": "MessageID",
            "type": "number",
            "format": ""
        },
        {
            "name": "repeatIndicator",
            "baseName": "RepeatIndicator",
            "type": "number",
            "format": ""
        },
        {
            "name": "userID",
            "baseName": "UserID",
            "type": "number",
            "format": ""
        },
        {
            "name": "valid",
            "baseName": "Valid",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "spare1",
            "baseName": "Spare1",
            "type": "number",
            "format": ""
        },
        {
            "name": "channelA",
            "baseName": "ChannelA",
            "type": "number",
            "format": ""
        },
        {
            "name": "channelB",
            "baseName": "ChannelB",
            "type": "number",
            "format": ""
        },
        {
            "name": "txRxMode",
            "baseName": "TxRxMode",
            "type": "number",
            "format": ""
        },
        {
            "name": "lowPower",
            "baseName": "LowPower",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "area",
            "baseName": "Area",
            "type": "ChannelManagementArea",
            "format": ""
        },
        {
            "name": "unicast",
            "baseName": "Unicast",
            "type": "ChannelManagementUnicast",
            "format": ""
        },
        {
            "name": "isAddressed",
            "baseName": "IsAddressed",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "bwA",
            "baseName": "BwA",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "bwB",
            "baseName": "BwB",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "transitionalZoneSize",
            "baseName": "TransitionalZoneSize",
            "type": "number",
            "format": ""
        },
        {
            "name": "spare4",
            "baseName": "Spare4",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChannelManagement.attributeTypeMap;
    }

    public constructor() {
    }
}
